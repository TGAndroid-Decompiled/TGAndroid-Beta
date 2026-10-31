package org.telegram.messenger;
public final class o00 implements Runnable {
    public final int f17207a;
    public final x00 f17208b;
    public final long f17209c;

    public o00(x00 x00Var, long j10, int i10) {
        this.f17207a = i10;
        this.f17208b = x00Var;
        this.f17209c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17207a;
        long j10 = this.f17209c;
        x00 x00Var = this.f17208b;
        switch (i10) {
            case 0:
                x00Var.f19173c.put(j10, 0);
                x00Var.getNotificationCenter().k(319, Long.valueOf(j10), Boolean.FALSE);
                return;
            default:
                x00Var.n(0, j10, false);
                return;
        }
    }
}
