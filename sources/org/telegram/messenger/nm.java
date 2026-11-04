package org.telegram.messenger;
public final class nm implements Runnable {
    public final int f24399a;
    public final hp f24400b;
    public final long f24401c;
    public final Runnable d;

    public nm(hp hpVar, long j10, Runnable runnable, int i3) {
        this.f24399a = i3;
        this.f24400b = hpVar;
        this.f24401c = j10;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i3 = this.f24399a;
        Runnable runnable = this.d;
        long j10 = this.f24401c;
        hp hpVar = this.f24400b;
        switch (i3) {
            case 0:
                if (runnable != null) {
                    hpVar.getClass();
                    runnable.run();
                }
                hpVar.getNotificationCenter().k(300, Long.valueOf(j10), 0L);
                return;
            case 1:
                hpVar.V2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                hpVar.V2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public nm(hp hpVar, Runnable runnable, long j10) {
        this.f24399a = 0;
        this.f24400b = hpVar;
        this.d = runnable;
        this.f24401c = j10;
    }
}
