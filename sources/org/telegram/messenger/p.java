package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f25835a;
    public final Object f25836b;

    public p(Object obj, int i7) {
        this.f25835a = i7;
        this.f25836b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f25835a) {
            case 0:
                ((CountDownLatch) this.f25836b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f25836b).countDown();
                return;
            default:
                ((Runnable) this.f25836b).run();
                return;
        }
    }
}
