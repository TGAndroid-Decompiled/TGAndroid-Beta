package kotlinx.coroutines;

public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {
    public final ChildJob childJob;

    public ChildHandleNode(ChildJob childJob) {
        this.childJob = childJob;
    }

    @Override
    public final boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }

    @Override
    public final void invoke(Throwable th) {
        ((JobSupport) this.childJob).cancelImpl$kotlinx_coroutines_core(getJob());
    }
}
