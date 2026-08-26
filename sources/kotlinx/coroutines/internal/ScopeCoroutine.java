package kotlinx.coroutines.internal;

import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobKt;

public class ScopeCoroutine extends AbstractCoroutine implements CoroutineStackFrame {
    public final Continuation uCont;

    public ScopeCoroutine(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.uCont = continuation;
    }

    @Override
    public void afterCompletion(Object obj) {
        AtomicKt.resumeCancellableWith(JobKt.recoverResult(obj), zzjj.intercepted(this.uCont));
    }

    @Override
    public void afterResume(Object obj) {
        this.uCont.resumeWith(JobKt.recoverResult(obj));
    }

    @Override
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override
    public final boolean isScopedCoroutine() {
        return true;
    }
}
