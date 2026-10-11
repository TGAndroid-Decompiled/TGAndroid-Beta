package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f17997a;
    public final Object f17998b;

    public h(Object obj, int i10) {
        this.f17997a = i10;
        this.f17998b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f17997a) {
            case 0:
                ((CountDownLatch) this.f17998b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f17998b).countDown();
                return;
            default:
                ((Runnable) this.f17998b).run();
                return;
        }
    }
}
