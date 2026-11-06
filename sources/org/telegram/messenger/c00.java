package org.telegram.messenger;
public final class c00 implements Runnable {
    public final int f21725a;
    public final k00 f21726b;
    public final long f21727c;

    public c00(k00 k00Var, long j3, int i7) {
        this.f21725a = i7;
        this.f21726b = k00Var;
        this.f21727c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f21725a;
        long j3 = this.f21727c;
        k00 k00Var = this.f21726b;
        switch (i7) {
            case 0:
                k00Var.f23632c.put(j3, 0);
                k00Var.getNotificationCenter().k(319, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                k00Var.n(0, j3, false);
                return;
        }
    }
}
