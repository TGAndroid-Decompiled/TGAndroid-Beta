package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17933a;
    public final Object f17934b;

    public i(Object obj, int i10) {
        this.f17933a = i10;
        this.f17934b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17933a) {
            case 0:
                ((CountDownLatch) this.f17934b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17934b).countDown();
                return;
            default:
                ((Runnable) this.f17934b).run();
                return;
        }
    }
}
