package kotlinx.coroutines.sync;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

public final class MutexImpl extends SemaphoreImpl implements Mutex {
    public static final AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public final class CancellableContinuationWithOwner implements CancellableContinuation, Waiter {
        public final CancellableContinuationImpl cont;

        public CancellableContinuationWithOwner(CancellableContinuationImpl cancellableContinuationImpl) {
            this.cont = cancellableContinuationImpl;
        }

        @Override
        public final void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override
        public final CoroutineContext getContext() {
            return this.cont.context;
        }

        @Override
        public final void invokeOnCancellation(Segment segment, int i) {
            this.cont.invokeOnCancellation(segment, i);
        }

        @Override
        public final void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override
        public final Symbol tryResume(Function1 function1, Object obj) {
            MutexImpl mutexImpl = MutexImpl.this;
            MutexImpl$CancellableContinuationWithOwner$resume$2 mutexImpl$CancellableContinuationWithOwner$resume$2 = new MutexImpl$CancellableContinuationWithOwner$resume$2(mutexImpl, this, 1);
            Symbol symbolTryResumeImpl = this.cont.tryResumeImpl(mutexImpl$CancellableContinuationWithOwner$resume$2, (Unit) obj);
            if (symbolTryResumeImpl != null) {
                MutexImpl.owner$volatile$FU.set(mutexImpl, null);
            }
            return symbolTryResumeImpl;
        }
    }

    public MutexImpl(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.NO_OWNER;
    }

    public final boolean isLocked() {
        return Math.max(SemaphoreImpl._availablePermits$volatile$FU.get(this), 0) == 0;
    }

    public final Object lock(ContinuationImpl continuationImpl) {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = SemaphoreImpl._availablePermits$volatile$FU;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    owner$volatile$FU.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            CancellableContinuationImpl orCreateCancellableContinuation = JobKt.getOrCreateCancellableContinuation(zzjj.intercepted(continuationImpl));
            try {
                acquire(new CancellableContinuationWithOwner(orCreateCancellableContinuation));
                Object result = orCreateCancellableContinuation.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (result != coroutineSingletons) {
                    result = unit;
                }
                if (result == coroutineSingletons) {
                    return result;
                }
            } catch (Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }
        return unit;
    }

    public final String toString() {
        return "Mutex@" + JobKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + ']';
    }

    public final void unlock(Object obj) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$volatile$FU;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = MutexKt.NO_OWNER;
            if (obj2 != symbol) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        release();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
