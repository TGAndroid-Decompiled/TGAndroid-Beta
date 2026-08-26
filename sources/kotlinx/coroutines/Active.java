package kotlinx.coroutines;

public final class Active implements NotCompleted {
    public static final Active INSTANCE = new Active();

    public final String toString() {
        return "Active";
    }
}
