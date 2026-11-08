package org.telegram.messenger;
public final class c00 implements Runnable {
    public final int f21767a;
    public final k00 f21768b;
    public final long f21769c;

    public c00(k00 k00Var, long j3, int i7) {
        this.f21767a = i7;
        this.f21768b = k00Var;
        this.f21769c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f21767a;
        long j3 = this.f21769c;
        k00 k00Var = this.f21768b;
        switch (i7) {
            case 0:
                k00Var.f23642c.put(j3, 0);
                k00Var.getNotificationCenter().k(319, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                k00Var.n(0, j3, false);
                return;
        }
    }
}
