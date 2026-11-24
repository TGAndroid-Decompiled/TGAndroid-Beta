package defpackage;

import java.util.concurrent.CountDownLatch;
public final class ph1 implements Runnable {
    public final byte a;
    public final sh1 b;

    public ph1(sh1 sh1Var, byte b) {
        this.a = b;
        this.b = sh1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sh1 sh1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                sh1Var.a(countDownLatch, null);
                sh1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                gm.c3(new ph1(sh1Var, (byte) 3));
                return;
            case 1:
                sh1Var.H = false;
                sh1Var.d(true);
                return;
            case 2:
                sh1Var.H = false;
                sh1Var.d(true);
                return;
            default:
                sh1Var.H = false;
                sh1Var.d(true);
                return;
        }
    }
}
