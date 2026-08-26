package kotlinx.coroutines.scheduling;

import org.telegram.ui.CastSync;

public abstract class Task implements Runnable {
    public long submissionTime;
    public CastSync.AnonymousClass1 taskContext;

    public Task(long j, CastSync.AnonymousClass1 anonymousClass1) {
        this.submissionTime = j;
        this.taskContext = anonymousClass1;
    }
}
