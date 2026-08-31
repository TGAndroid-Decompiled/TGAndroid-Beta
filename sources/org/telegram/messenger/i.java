package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class i implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18901a;
    public final Object f18902b;

    public i(Object obj, int i10) {
        this.f18901a = i10;
        this.f18902b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18901a) {
            case 0:
                ((CountDownLatch) this.f18902b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18902b).countDown();
                return;
            default:
                ((Runnable) this.f18902b).run();
                return;
        }
    }
}
