package org.telegram.messenger;
public final class xm implements Runnable {
    public final int f26499a;
    public final qp f26500b;
    public final long f26501c;
    public final Runnable d;

    public xm(qp qpVar, long j3, Runnable runnable, int i7) {
        this.f26499a = i7;
        this.f26500b = qpVar;
        this.f26501c = j3;
        this.d = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f26499a;
        Runnable runnable = this.d;
        long j3 = this.f26501c;
        qp qpVar = this.f26500b;
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
        this.f26499a = 0;
        this.f26500b = qpVar;
        this.d = runnable;
        this.f26501c = j3;
    }
}
