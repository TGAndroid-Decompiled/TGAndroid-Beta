package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;

public abstract class JobNode extends CompletionHandlerBase implements DisposableHandle, Incomplete {
    public JobSupport job;

    @Override
    public NodeList getList() {
        return null;
    }

    @Override
    public boolean isActive() {
        return true;
    }

    public final JobSupport getJob() {
        JobSupport jobSupport = this.job;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void setJob(JobSupport jobSupport) {
        this.job = jobSupport;
    }

    @Override
    public void dispose() {
        getJob().removeNode$kotlinx_coroutines_core(this);
    }

    @Override
    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this) + "[job@" + DebugStringsKt.getHexAddress(getJob()) + ']';
    }
}
