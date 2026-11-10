package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f24431a;
    public final Object f24432b;

    public p(Object obj, int i7) {
        this.f24431a = i7;
        this.f24432b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f24431a) {
            case 0:
                ((CountDownLatch) this.f24432b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f24432b).countDown();
                return;
            default:
                ((Runnable) this.f24432b).run();
                return;
        }
    }
}
