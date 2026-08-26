package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.JobKt;
import org.telegram.ui.CastSync;

public final class TaskImpl extends Task {
    public final Runnable block;

    public TaskImpl(Runnable runnable, long j, CastSync.AnonymousClass1 anonymousClass1) {
        super(j, anonymousClass1);
        this.block = runnable;
    }

    @Override
    public final void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.block;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(JobKt.getHexAddress(runnable));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        sb.append(this.taskContext);
        sb.append(']');
        return sb.toString();
    }
}
