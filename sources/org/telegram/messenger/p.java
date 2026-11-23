package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26209a;
    public final Object f26210b;

    public p(Object obj, int i7) {
        this.f26209a = i7;
        this.f26210b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26209a) {
            case 0:
                ((CountDownLatch) this.f26210b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26210b).countDown();
                return;
            default:
                ((Runnable) this.f26210b).run();
                return;
        }
    }
}
