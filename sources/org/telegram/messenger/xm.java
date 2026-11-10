package org.telegram.messenger;
public final class xm implements Runnable {
    public final int f26503a;
    public final qp f26504b;
    public final long f26505c;
    public final Runnable d;

    public xm(qp qpVar, long j3, Runnable runnable, int i7) {
        this.f26503a = i7;
        this.f26504b = qpVar;
        this.f26505c = j3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f26503a;
        Runnable runnable = this.d;
        long j3 = this.f26505c;
        qp qpVar = this.f26504b;
        switch (i7) {
            case 0:
                if (runnable != null) {
                    qpVar.getClass();
                    runnable.run();
                }
                qpVar.getNotificationCenter().k(300, Long.valueOf(j3), 0L);
                return;
            case 1:
                qpVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qpVar.V2(0, j3, true);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public xm(qp qpVar, Runnable runnable, long j3) {
        this.f26503a = 0;
        this.f26504b = qpVar;
        this.d = runnable;
        this.f26505c = j3;
    }
}
