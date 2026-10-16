package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17054a;
    public final Object f17055b;

    public h(Object obj, int i10) {
        this.f17054a = i10;
        this.f17055b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17054a) {
            case 0:
                ((CountDownLatch) this.f17055b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17055b).countDown();
                return;
            default:
                ((Runnable) this.f17055b).run();
                return;
        }
    }
}
