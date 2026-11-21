package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class h1 implements Runnable {
    public final int f1217a;
    public final CountDownLatch f1218b;

    public h1(CountDownLatch countDownLatch, int i7) {
        this.f1217a = i7;
        this.f1218b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1217a) {
            case 0:
                try {
                    this.f1218b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1218b.countDown();
                return;
        }
    }
}
