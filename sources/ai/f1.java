package ai;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class f1 implements Runnable {
    public final int f1202a;
    public final CountDownLatch f1203b;

    public f1(CountDownLatch countDownLatch, int i7) {
        this.f1202a = i7;
        this.f1203b = countDownLatch;
    }

    @Override
    public final void run() {
        switch (this.f1202a) {
            case 0:
                try {
                    this.f1203b.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                this.f1203b.countDown();
                return;
        }
    }
}
