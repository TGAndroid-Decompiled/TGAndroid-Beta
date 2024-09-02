package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.DebugStringsKt;

public final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j, TaskContext taskContext) {
        super(j, taskContext);
        this.block = runnable;
    }

    @Override
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.afterTask();
        }
    }

    public String toString() {
        return "Task[" + DebugStringsKt.getClassSimpleName(this.block) + '@' + DebugStringsKt.getHexAddress(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
