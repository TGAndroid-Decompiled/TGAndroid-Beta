package org.telegram.messenger;
public final class c00 implements Runnable {
    public final int f21772a;
    public final k00 f21773b;
    public final long f21774c;

    public c00(k00 k00Var, long j3, int i7) {
        this.f21772a = i7;
        this.f21773b = k00Var;
        this.f21774c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f21772a;
        long j3 = this.f21774c;
        k00 k00Var = this.f21773b;
        switch (i7) {
            case 0:
                k00Var.f23646c.put(j3, 0);
                k00Var.getNotificationCenter().k(319, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                k00Var.n(0, j3, false);
                return;
        }
    }
}
