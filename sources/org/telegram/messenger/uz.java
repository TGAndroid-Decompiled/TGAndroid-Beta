package org.telegram.messenger;
public final class uz implements Runnable {
    public final int f25806a;
    public final c00 f25807b;
    public final long f25808c;

    public uz(c00 c00Var, long j10, int i3) {
        this.f25806a = i3;
        this.f25807b = c00Var;
        this.f25808c = j10;
    }

    @Override
    public final void run() {
        int i3 = this.f25806a;
        long j10 = this.f25808c;
        c00 c00Var = this.f25807b;
        switch (i3) {
            case 0:
                c00Var.f21924c.put(j10, 0);
                c00Var.getNotificationCenter().k(319, Long.valueOf(j10), Boolean.FALSE);
                return;
            default:
                c00Var.n(0, j10, false);
                return;
        }
    }
}
