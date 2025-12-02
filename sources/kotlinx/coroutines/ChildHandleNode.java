package kotlinx.coroutines;

public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {
    public final ChildJob childJob;

    public ChildHandleNode(ChildJob childJob) {
        this.childJob = childJob;
    }

    @Override
    public Job getParent() {
        return getJob();
    }

    @Override
    public void invoke(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }

    @Override
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }
}
