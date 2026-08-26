package kotlinx.coroutines;

public final class SupervisorJobImpl extends JobImpl {
    @Override
    public final boolean childCancelled(Throwable th) {
        return false;
    }
}
