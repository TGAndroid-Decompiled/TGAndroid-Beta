package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class f1 implements Runnable {
    public final int f1194a;
    public final CountDownLatch f1195b;

    public f1(CountDownLatch countDownLatch, int i7) {
        this.f1194a = i7;
        this.f1195b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1194a) {
            case 0:
                try {
                    this.f1195b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1195b.countDown();
                return;
        }
    }
}
