package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f24643a;
    public final Object f24644b;

    public p(Object obj, int i3) {
        this.f24643a = i3;
        this.f24644b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i3) {
        switch (this.f24643a) {
            case 0:
                ((CountDownLatch) this.f24644b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f24644b).countDown();
                return;
            default:
                ((Runnable) this.f24644b).run();
                return;
        }
    }
}
