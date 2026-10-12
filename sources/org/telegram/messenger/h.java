package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17357a;
    public final Object f17358b;

    public h(Object obj, int i10) {
        this.f17357a = i10;
        this.f17358b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17357a) {
            case 0:
                ((CountDownLatch) this.f17358b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17358b).countDown();
                return;
            default:
                ((Runnable) this.f17358b).run();
                return;
        }
    }
}
