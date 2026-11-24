package defpackage;

import java.util.concurrent.CountDownLatch;
public final class bp0 implements Runnable {
    public final byte a;
    public final lp0 b;

    public bp0(lp0 lp0Var, byte b) {
        this.a = b;
        this.b = lp0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lp0 lp0Var = this.b;
        switch (b) {
            case 0:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                return;
            case 1:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                lp0Var.F0(countDownLatch, null);
                lp0Var.G0(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                nm7.f(lp0Var.T).d(new bp0(lp0Var, (byte) 4));
                return;
            case 2:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                return;
            case 3:
                lp0Var.h0 = false;
                lp0Var.J0(true);
                return;
            default:
                gm.c3(new bp0(lp0Var, (byte) 0));
                return;
        }
    }
}
