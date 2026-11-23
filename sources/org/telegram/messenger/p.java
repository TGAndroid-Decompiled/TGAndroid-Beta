package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26173a;
    public final Object f26174b;

    public p(Object obj, int i7) {
        this.f26173a = i7;
        this.f26174b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26173a) {
            case 0:
                ((CountDownLatch) this.f26174b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26174b).countDown();
                return;
            default:
                ((Runnable) this.f26174b).run();
                return;
        }
    }
}
