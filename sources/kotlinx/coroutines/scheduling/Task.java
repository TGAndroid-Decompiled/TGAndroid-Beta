package kotlinx.coroutines.scheduling;

import com.google.android.gms.dynamite.zzn;

public abstract class Task implements Runnable {
    public long submissionTime;
    public zzn taskContext;

    public Task(long j, zzn zznVar) {
        this.submissionTime = j;
        this.taskContext = zznVar;
    }
}
