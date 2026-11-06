package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f24423a;
    public final Object f24424b;

    public p(Object obj, int i7) {
        this.f24423a = i7;
        this.f24424b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f24423a) {
            case 0:
                ((CountDownLatch) this.f24424b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f24424b).countDown();
                return;
            default:
                ((Runnable) this.f24424b).run();
                return;
        }
    }
}
