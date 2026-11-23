package org.telegram.messenger;
public final class wz implements Runnable {
    public final int f27824a;
    public final f00 f27825b;
    public final long f27826c;

    public wz(f00 f00Var, long j3, int i7) {
        this.f27824a = i7;
        this.f27825b = f00Var;
        this.f27826c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f27824a;
        long j3 = this.f27826c;
        f00 f00Var = this.f27825b;
        switch (i7) {
            case 0:
                f00Var.f23809c.put(j3, 0);
                f00Var.getNotificationCenter().k(322, Long.valueOf(j3), Boolean.FALSE);
                return;
            default:
                f00Var.n(0, j3, false);
                return;
        }
    }
}
