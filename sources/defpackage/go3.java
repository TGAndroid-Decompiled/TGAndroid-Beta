package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
public final class go3 implements Runnable {
    public final byte a;
    public final CountDownLatch b;

    public go3(CountDownLatch countDownLatch, byte b) {
        this.a = b;
        this.b = countDownLatch;
    }

    @Override
    public final void run() {
        byte b = this.a;
        CountDownLatch countDownLatch = this.b;
        switch (b) {
            case 0:
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            default:
                countDownLatch.countDown();
                return;
        }
    }
}
