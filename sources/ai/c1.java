package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class c1 implements Runnable {
    public final int f1148a;
    public final CountDownLatch f1149b;

    public c1(CountDownLatch countDownLatch, int i7) {
        this.f1148a = i7;
        this.f1149b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1148a) {
            case 0:
                try {
                    this.f1149b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1149b.countDown();
                return;
        }
    }
}
