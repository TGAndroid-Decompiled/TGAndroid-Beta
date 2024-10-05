package kotlinx.coroutines.scheduling;

final class TaskContextImpl implements TaskContext {
    private final int taskMode;

    public TaskContextImpl(int i) {
        this.taskMode = i;
    }

    @Override
    public void afterTask() {
    }

    @Override
    public int getTaskMode() {
        return this.taskMode;
    }
}
