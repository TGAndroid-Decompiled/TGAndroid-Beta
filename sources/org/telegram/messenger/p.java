package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class p implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f24416a;
    public final Object f24417b;

    public p(Object obj, int i7) {
        this.f24416a = i7;
        this.f24417b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i7) {
        switch (this.f24416a) {
            case 0:
                ((CountDownLatch) this.f24417b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f24417b).countDown();
                return;
            default:
                ((Runnable) this.f24417b).run();
                return;
        }
    }
}
