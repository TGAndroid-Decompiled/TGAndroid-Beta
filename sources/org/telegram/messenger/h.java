package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18473a;
    public final Object f18474b;

    public h(Object obj, int i10) {
        this.f18473a = i10;
        this.f18474b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18473a) {
            case 0:
                ((CountDownLatch) this.f18474b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18474b).countDown();
                return;
            default:
                ((Runnable) this.f18474b).run();
                return;
        }
    }
}
