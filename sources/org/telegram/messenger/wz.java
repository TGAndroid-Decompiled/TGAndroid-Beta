package org.telegram.messenger;
public final class wz implements Runnable {
    public final int f27788a;
    public final f00 f27789b;
    public final long f27790c;

    public wz(f00 f00Var, long j3, int i7) {
        this.f27788a = i7;
        this.f27789b = f00Var;
        this.f27790c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27788a;
        long j3 = this.f27790c;
        f00 f00Var = this.f27789b;
        switch (i7) {
            case 0:
                f00Var.f23773c.put(j3, 0);
                f00Var.getNotificationCenter().k(322, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                f00Var.n(0, j3, false);
                return;
        }
    }
}
