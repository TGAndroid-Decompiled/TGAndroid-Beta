package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26131a;
    public final Object f26132b;

    public p(Object obj, int i7) {
        this.f26131a = i7;
        this.f26132b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26131a) {
            case 0:
                ((CountDownLatch) this.f26132b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26132b).countDown();
                return;
            default:
                ((Runnable) this.f26132b).run();
                return;
        }
    }
}
