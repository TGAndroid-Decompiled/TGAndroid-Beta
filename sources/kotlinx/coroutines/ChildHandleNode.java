package kotlinx.coroutines;

import kotlin.Unit;

public final class ChildHandleNode extends JobCancellingNode implements ChildHandle {
    public final ChildJob childJob;

    @Override
    public Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    @Override
    public void invoke2(Throwable th) {
        this.childJob.parentCancelled(getJob());
    }

    @Override
    public boolean childCancelled(Throwable th) {
        return getJob().childCancelled(th);
    }
}
