package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18492a;
    public final Object f18493b;

    public h(Object obj, int i10) {
        this.f18492a = i10;
        this.f18493b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18492a) {
            case 0:
                ((CountDownLatch) this.f18493b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18493b).countDown();
                return;
            default:
                ((Runnable) this.f18493b).run();
                return;
        }
    }
}
