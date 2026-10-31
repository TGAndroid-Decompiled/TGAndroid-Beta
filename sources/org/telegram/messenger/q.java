package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class q implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17535a;
    public final Object f17536b;

    public q(Object obj, int i10) {
        this.f17535a = i10;
        this.f17536b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17535a) {
            case 0:
                ((CountDownLatch) this.f17536b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17536b).countDown();
                return;
            default:
                ((Runnable) this.f17536b).run();
                return;
        }
    }
}
