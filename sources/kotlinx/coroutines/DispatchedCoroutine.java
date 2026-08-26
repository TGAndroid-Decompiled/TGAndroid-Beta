package kotlinx.coroutines;

import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

public final class DispatchedCoroutine extends ScopeCoroutine {
    public static final AtomicIntegerFieldUpdater _decision$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override
    public final void afterResume(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = _decision$volatile$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicKt.resumeCancellableWith(JobKt.recoverResult(obj), zzjf.intercepted(this.uCont));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
