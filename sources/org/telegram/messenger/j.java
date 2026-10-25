package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f20378a;
    public final Object f20379b;

    public j(Object obj, int i10) {
        this.f20378a = i10;
        this.f20379b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f20378a) {
            case 0:
                ((CountDownLatch) this.f20379b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f20379b).countDown();
                return;
            default:
                ((Runnable) this.f20379b).run();
                return;
        }
    }
}
