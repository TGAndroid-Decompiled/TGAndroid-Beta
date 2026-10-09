package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17995a;
    public final Object f17996b;

    public h(Object obj, int i10) {
        this.f17995a = i10;
        this.f17996b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17995a) {
            case 0:
                ((CountDownLatch) this.f17996b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17996b).countDown();
                return;
            default:
                ((Runnable) this.f17996b).run();
                return;
        }
    }
}
