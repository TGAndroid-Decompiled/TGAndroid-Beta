package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18482a;
    public final Object f18483b;

    public h(Object obj, int i10) {
        this.f18482a = i10;
        this.f18483b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18482a) {
            case 0:
                ((CountDownLatch) this.f18483b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18483b).countDown();
                return;
            default:
                ((Runnable) this.f18483b).run();
                return;
        }
    }
}
