package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17999a;
    public final Object f18000b;

    public h(Object obj, int i10) {
        this.f17999a = i10;
        this.f18000b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17999a) {
            case 0:
                ((CountDownLatch) this.f18000b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18000b).countDown();
                return;
            default:
                ((Runnable) this.f18000b).run();
                return;
        }
    }
}
