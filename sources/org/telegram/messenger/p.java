package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f24427a;
    public final Object f24428b;

    public p(Object obj, int i7) {
        this.f24427a = i7;
        this.f24428b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f24427a) {
            case 0:
                ((CountDownLatch) this.f24428b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f24428b).countDown();
                return;
            default:
                ((Runnable) this.f24428b).run();
                return;
        }
    }
}
