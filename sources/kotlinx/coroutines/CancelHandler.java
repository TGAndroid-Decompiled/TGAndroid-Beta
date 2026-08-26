package kotlinx.coroutines;

public interface CancelHandler extends NotCompleted {
    void invoke(Throwable th);
}
