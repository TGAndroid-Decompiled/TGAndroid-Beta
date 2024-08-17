package kotlinx.coroutines.scheduling;

final class TaskContextImpl implements TaskContext {
    private final int taskMode;

    @Override
    public void afterTask() {
    }

    public TaskContextImpl(int i) {
        this.taskMode = i;
    }

    @Override
    public int getTaskMode() {
        return this.taskMode;
    }
}
