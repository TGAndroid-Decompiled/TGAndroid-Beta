package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18033a;
    public final Object f18034b;

    public h(Object obj, int i10) {
        this.f18033a = i10;
        this.f18034b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18033a) {
            case 0:
                ((CountDownLatch) this.f18034b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18034b).countDown();
                return;
            default:
                ((Runnable) this.f18034b).run();
                return;
        }
    }
}
