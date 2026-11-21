package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f26157a;
    public final Object f26158b;

    public p(Object obj, int i7) {
        this.f26157a = i7;
        this.f26158b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f26157a) {
            case 0:
                ((CountDownLatch) this.f26158b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f26158b).countDown();
                return;
            default:
                ((Runnable) this.f26158b).run();
                return;
        }
    }
}
