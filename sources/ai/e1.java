package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class e1 implements Runnable {
    public final int f1192a;
    public final CountDownLatch f1193b;

    public e1(CountDownLatch countDownLatch, int i7) {
        this.f1192a = i7;
        this.f1193b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1192a) {
            case 0:
                try {
                    this.f1193b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1193b.countDown();
                return;
        }
    }
}
