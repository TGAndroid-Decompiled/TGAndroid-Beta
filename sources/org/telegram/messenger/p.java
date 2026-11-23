package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26224a;
    public final Object f26225b;

    public p(Object obj, int i7) {
        this.f26224a = i7;
        this.f26225b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26224a) {
            case 0:
                ((CountDownLatch) this.f26225b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26225b).countDown();
                return;
            default:
                ((Runnable) this.f26225b).run();
                return;
        }
    }
}
