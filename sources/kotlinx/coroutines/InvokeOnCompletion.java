package kotlinx.coroutines;

import kotlin.ResultKt;
import kotlin.Unit;

public final class InvokeOnCompletion extends JobNode {
    public final int $r8$classId;
    public final Object handler;

    public InvokeOnCompletion(Object obj, int i) {
        this.$r8$classId = i;
        this.handler = obj;
    }

    @Override
    public final void invoke(Throwable th) {
        switch (this.$r8$classId) {
            case 0:
                ((InternalCompletionHandler) this.handler).invoke(th);
                break;
            case 1:
                ((DisposableHandle) this.handler).dispose();
                break;
            case 2:
                Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
                boolean z = state$kotlinx_coroutines_core instanceof CompletedExceptionally;
                JobSupport.AwaitContinuation awaitContinuation = (JobSupport.AwaitContinuation) this.handler;
                if (!z) {
                    awaitContinuation.resumeWith(JobKt.unboxState(state$kotlinx_coroutines_core));
                } else {
                    awaitContinuation.resumeWith(ResultKt.createFailure(((CompletedExceptionally) state$kotlinx_coroutines_core).cause));
                }
                break;
            default:
                ((CancellableContinuationImpl) this.handler).resumeWith(Unit.INSTANCE);
                break;
        }
    }
}
