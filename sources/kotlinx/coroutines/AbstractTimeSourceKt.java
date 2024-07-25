package kotlinx.coroutines;
public final class AbstractTimeSourceKt {
    private static AbstractTimeSource timeSource;

    public static final AbstractTimeSource getTimeSource() {
        return timeSource;
    }
}
