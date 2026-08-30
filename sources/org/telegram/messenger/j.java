package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17530a;
    public final Object f17531b;

    public j(Object obj, int i10) {
        this.f17530a = i10;
        this.f17531b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17530a) {
            case 0:
                ((CountDownLatch) this.f17531b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17531b).countDown();
                return;
            default:
                ((Runnable) this.f17531b).run();
                return;
        }
    }
}
