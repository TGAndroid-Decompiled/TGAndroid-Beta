package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17918a;
    public final Object f17919b;

    public i(Object obj, int i10) {
        this.f17918a = i10;
        this.f17919b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17918a) {
            case 0:
                ((CountDownLatch) this.f17919b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17919b).countDown();
                return;
            default:
                ((Runnable) this.f17919b).run();
                return;
        }
    }
}
