package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18903a;
    public final Object f18904b;

    public i(Object obj, int i10) {
        this.f18903a = i10;
        this.f18904b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18903a) {
            case 0:
                ((CountDownLatch) this.f18904b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18904b).countDown();
                return;
            default:
                ((Runnable) this.f18904b).run();
                return;
        }
    }
}
