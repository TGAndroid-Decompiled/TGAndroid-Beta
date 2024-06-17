package kotlinx.coroutines.scheduling;

public abstract class SchedulerTimeSource {
    public abstract long nanoTime();
}
