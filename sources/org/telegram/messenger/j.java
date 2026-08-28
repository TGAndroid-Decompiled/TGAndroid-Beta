package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f20632a;
    public final Object f20633b;

    public j(Object obj, int i9) {
        this.f20632a = i9;
        this.f20633b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i9) {
        switch (this.f20632a) {
            case 0:
                ((CountDownLatch) this.f20633b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f20633b).countDown();
                return;
            default:
                ((Runnable) this.f20633b).run();
                return;
        }
    }
}
