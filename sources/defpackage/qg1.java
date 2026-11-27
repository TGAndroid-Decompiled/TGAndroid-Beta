package defpackage;

import java.util.concurrent.CountDownLatch;
public final class qg1 implements Runnable {
    public final byte a;
    public final tg1 b;

    public qg1(tg1 tg1Var, byte b) {
        this.a = b;
        this.b = tg1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tg1 tg1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                tg1Var.a(countDownLatch, null);
                tg1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                hl.c3(new qg1(tg1Var, (byte) 3));
                return;
            case 1:
                tg1Var.H = false;
                tg1Var.d(true);
                return;
            case 2:
                tg1Var.H = false;
                tg1Var.d(true);
                return;
            default:
                tg1Var.H = false;
                tg1Var.d(true);
                return;
        }
    }
}
