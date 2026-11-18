package org.telegram.messenger;
public final class vz implements Runnable {
    public final int f27622a;
    public final e00 f27623b;
    public final long f27624c;

    public vz(e00 e00Var, long j3, int i7) {
        this.f27622a = i7;
        this.f27623b = e00Var;
        this.f27624c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27622a;
        long j3 = this.f27624c;
        e00 e00Var = this.f27623b;
        switch (i7) {
            case 0:
                e00Var.f23625c.put(j3, 0);
                e00Var.getNotificationCenter().k(321, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                e00Var.n(0, j3, false);
                return;
        }
    }
}
