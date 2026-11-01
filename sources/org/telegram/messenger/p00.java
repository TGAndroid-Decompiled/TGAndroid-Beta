package org.telegram.messenger;
public final class p00 implements Runnable {
    public final int f17546a;
    public final y00 f17547b;
    public final long f17548c;

    public p00(y00 y00Var, long j10, int i10) {
        this.f17546a = i10;
        this.f17547b = y00Var;
        this.f17548c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f17546a;
        long j10 = this.f17548c;
        y00 y00Var = this.f17547b;
        switch (i10) {
            case 0:
                y00Var.f19513c.put(j10, 0);
                y00Var.getNotificationCenter().k(319, Long.valueOf(j10), Boolean.FALSE);
                return;
            default:
                y00Var.n(0, j10, false);
                return;
        }
    }
}
