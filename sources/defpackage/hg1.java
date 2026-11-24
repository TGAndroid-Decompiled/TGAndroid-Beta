package defpackage;

import java.util.concurrent.CountDownLatch;
public final class hg1 implements Runnable {
    public final byte a;
    public final kg1 b;

    public hg1(kg1 kg1Var, byte b) {
        this.a = b;
        this.b = kg1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kg1 kg1Var = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(2);
                kg1Var.a(countDownLatch, null);
                kg1Var.b(countDownLatch, null);
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
                gl.d3(new hg1(kg1Var, (byte) 3));
                return;
            case 1:
                kg1Var.H = false;
                kg1Var.d(true);
                return;
            case 2:
                kg1Var.H = false;
                kg1Var.d(true);
                return;
            default:
                kg1Var.H = false;
                kg1Var.d(true);
                return;
        }
    }
}
