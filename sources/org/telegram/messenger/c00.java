package org.telegram.messenger;
public final class c00 implements Runnable {
    public final int f21731a;
    public final k00 f21732b;
    public final long f21733c;

    public c00(k00 k00Var, long j3, int i7) {
        this.f21731a = i7;
        this.f21732b = k00Var;
        this.f21733c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f21731a;
        long j3 = this.f21733c;
        k00 k00Var = this.f21732b;
        switch (i7) {
            case 0:
                k00Var.f23639c.put(j3, 0);
                k00Var.getNotificationCenter().k(319, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                k00Var.n(0, j3, false);
                return;
        }
    }
}
