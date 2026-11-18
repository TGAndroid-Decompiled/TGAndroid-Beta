package org.telegram.messenger;
public final class vz implements Runnable {
    public final int f27620a;
    public final e00 f27621b;
    public final long f27622c;

    public vz(e00 e00Var, long j3, int i7) {
        this.f27620a = i7;
        this.f27621b = e00Var;
        this.f27622c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27620a;
        long j3 = this.f27622c;
        e00 e00Var = this.f27621b;
        switch (i7) {
            case 0:
                e00Var.f23622c.put(j3, 0);
                e00Var.getNotificationCenter().k(322, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                e00Var.n(0, j3, false);
                return;
        }
    }
}
