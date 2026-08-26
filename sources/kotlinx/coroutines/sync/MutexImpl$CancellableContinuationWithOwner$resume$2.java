package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class MutexImpl$CancellableContinuationWithOwner$resume$2 extends Lambda implements Function1 {
    public final int $r8$classId;
    public final MutexImpl this$0;
    public final MutexImpl.CancellableContinuationWithOwner this$1;

    public MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = mutexImpl;
        this.this$1 = cancellableContinuationWithOwner;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.this$1.getClass();
                this.this$0.unlock(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.owner$volatile$FU;
                this.this$1.getClass();
                MutexImpl mutexImpl = this.this$0;
                atomicReferenceFieldUpdater.set(mutexImpl, null);
                mutexImpl.unlock(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
