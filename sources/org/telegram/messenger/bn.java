package org.telegram.messenger;
public final class bn implements Runnable {
    public final int f14800a;
    public final vp f14801b;
    public final Runnable f14802c;
    public final long d;

    public bn(vp vpVar, long j10, Runnable runnable, int i10) {
        this.f14800a = i10;
        this.f14801b = vpVar;
        this.d = j10;
        this.f14802c = runnable;
    }

    @Override
    public final void run() {
        int i10 = this.f14800a;
        Runnable runnable = this.f14802c;
        long j10 = this.d;
        vp vpVar = this.f14801b;
        switch (i10) {
            case 0:
                vpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                if (runnable != null) {
                    vpVar.getClass();
                    runnable.run();
                }
                vpVar.getNotificationCenter().k(300, Long.valueOf(j10), 0L);
                return;
            default:
                vpVar.T2(0, j10, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public bn(vp vpVar, Runnable runnable, long j10) {
        this.f14800a = 1;
        this.f14801b = vpVar;
        this.f14802c = runnable;
        this.d = j10;
    }
}
