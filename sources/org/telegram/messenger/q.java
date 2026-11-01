package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class q implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17721a;
    public final Object f17722b;

    public q(Object obj, int i10) {
        this.f17721a = i10;
        this.f17722b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17721a) {
            case 0:
                ((CountDownLatch) this.f17722b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17722b).countDown();
                return;
            default:
                ((Runnable) this.f17722b).run();
                return;
        }
    }
}
