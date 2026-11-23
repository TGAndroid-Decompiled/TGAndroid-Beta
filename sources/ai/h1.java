package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class h1 implements Runnable {
    public final int f1223a;
    public final CountDownLatch f1224b;

    public h1(CountDownLatch countDownLatch, int i7) {
        this.f1223a = i7;
        this.f1224b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1223a) {
            case 0:
                try {
                    this.f1224b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1224b.countDown();
                return;
        }
    }
}
