package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class b1 implements Runnable {
    public final int f1134a;
    public final CountDownLatch f1135b;

    public b1(CountDownLatch countDownLatch, int i7) {
        this.f1134a = i7;
        this.f1135b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1134a) {
            case 0:
                try {
                    this.f1135b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1135b.countDown();
                return;
        }
    }
}
