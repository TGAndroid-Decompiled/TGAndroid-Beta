package org.telegram.messenger;
public final class cn implements Runnable {
    public final int f15183a;
    public final wp f15184b;
    public final Runnable f15185c;
    public final long d;

    public cn(wp wpVar, long j10, Runnable runnable, int i10) {
        this.f15183a = i10;
        this.f15184b = wpVar;
        this.d = j10;
        this.f15185c = runnable;
    }

    @Override
    public final void run() {
        int i10 = this.f15183a;
        Runnable runnable = this.f15185c;
        long j10 = this.d;
        wp wpVar = this.f15184b;
        switch (i10) {
            case 0:
                wpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (runnable != null) {
                    wpVar.getClass();
                    runnable.run();
                }
                wpVar.getNotificationCenter().k(300, Long.valueOf(j10), 0L);
                return;
            default:
                wpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public cn(wp wpVar, Runnable runnable, long j10) {
        this.f15183a = 1;
        this.f15184b = wpVar;
        this.f15185c = runnable;
        this.d = j10;
    }
}
