package org.telegram.messenger;
public final class vz implements Runnable {
    public final int f27648a;
    public final e00 f27649b;
    public final long f27650c;

    public vz(e00 e00Var, long j3, int i7) {
        this.f27648a = i7;
        this.f27649b = e00Var;
        this.f27650c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27648a;
        long j3 = this.f27650c;
        e00 e00Var = this.f27649b;
        switch (i7) {
            case 0:
                e00Var.f23650c.put(j3, 0);
                e00Var.getNotificationCenter().k(322, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                e00Var.n(0, j3, false);
                return;
        }
    }
}
