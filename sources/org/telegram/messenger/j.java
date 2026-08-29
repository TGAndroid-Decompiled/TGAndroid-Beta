package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f20613a;
    public final Object f20614b;

    public j(Object obj, int i10) {
        this.f20613a = i10;
        this.f20614b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f20613a) {
            case 0:
                ((CountDownLatch) this.f20614b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f20614b).countDown();
                return;
            default:
                ((Runnable) this.f20614b).run();
                return;
        }
    }
}
