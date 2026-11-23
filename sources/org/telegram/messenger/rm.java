package org.telegram.messenger;
public final class rm implements Runnable {
    public final int f26764a;
    public final mp f26765b;
    public final long f26766c;
    public final Runnable d;

    public rm(mp mpVar, long j3, Runnable runnable, int i7) {
        this.f26764a = i7;
        this.f26765b = mpVar;
        this.f26766c = j3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f26764a;
        Runnable runnable = this.d;
        long j3 = this.f26766c;
        mp mpVar = this.f26765b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    mpVar.getClass();
                    runnable.run();
                }
                mpVar.getNotificationCenter().k(303, Long.valueOf(j3), 0L);
                return;
            case 1:
                mpVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                mpVar.b3(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public rm(mp mpVar, Runnable runnable, long j3) {
        this.f26764a = 0;
        this.f26765b = mpVar;
        this.d = runnable;
        this.f26766c = j3;
    }
}
