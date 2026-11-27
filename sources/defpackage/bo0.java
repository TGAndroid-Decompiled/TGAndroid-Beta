package defpackage;

import java.util.concurrent.CountDownLatch;
public final class bo0 implements Runnable {
    public final byte a;
    public final lo0 b;

    public bo0(lo0 lo0Var, byte b) {
        this.a = b;
        this.b = lo0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lo0 lo0Var = this.b;
        switch (b) {
            case 0:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                lo0Var.F0(countDownLatch, null);
                lo0Var.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                jn7.f(lo0Var.T).d(new bo0(lo0Var, (byte) 4));
                return;
            case 2:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                return;
            case 3:
                lo0Var.h0 = false;
                lo0Var.J0(true);
                return;
            default:
                hl.c3(new bo0(lo0Var, (byte) 0));
                return;
        }
    }
}
