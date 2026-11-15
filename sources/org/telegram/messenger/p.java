package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f25833a;
    public final Object f25834b;

    public p(Object obj, int i7) {
        this.f25833a = i7;
        this.f25834b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f25833a) {
            case 0:
                ((CountDownLatch) this.f25834b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f25834b).countDown();
                return;
            default:
                ((Runnable) this.f25834b).run();
                return;
        }
    }
}
