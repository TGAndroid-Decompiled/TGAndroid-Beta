package kotlinx.coroutines.scheduling;

public interface TaskContext {
    void afterTask();

    int getTaskMode();
}
