package kotlinx.coroutines.scheduling;
public final class NanoTimeSource extends SchedulerTimeSource {
    public static final NanoTimeSource INSTANCE = new NanoTimeSource();

    private NanoTimeSource() {
    }

    @Override
    public long nanoTime() {
        return System.nanoTime();
    }
}
