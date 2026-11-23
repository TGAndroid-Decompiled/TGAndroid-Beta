package org.telegram.messenger;
public final class uz implements Runnable {
    public final int f27403a;
    public final d00 f27404b;
    public final long f27405c;

    public uz(d00 d00Var, long j3, int i7) {
        this.f27403a = i7;
        this.f27404b = d00Var;
        this.f27405c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27403a;
        long j3 = this.f27405c;
        d00 d00Var = this.f27404b;
        switch (i7) {
            case 0:
                d00Var.f23572c.put(j3, 0);
                d00Var.getNotificationCenter().k(322, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                d00Var.n(0, j3, false);
                return;
        }
    }
}
