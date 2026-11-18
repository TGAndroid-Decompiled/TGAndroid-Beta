package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26129a;
    public final Object f26130b;

    public p(Object obj, int i7) {
        this.f26129a = i7;
        this.f26130b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26129a) {
            case 0:
                ((CountDownLatch) this.f26130b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26130b).countDown();
                return;
            default:
                ((Runnable) this.f26130b).run();
                return;
        }
    }
}
