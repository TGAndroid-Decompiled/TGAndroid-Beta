package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17413a;
    public final Object f17414b;

    public i(Object obj, int i10) {
        this.f17413a = i10;
        this.f17414b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17413a) {
            case 0:
                ((CountDownLatch) this.f17414b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17414b).countDown();
                return;
            default:
                ((Runnable) this.f17414b).run();
                return;
        }
    }
}
