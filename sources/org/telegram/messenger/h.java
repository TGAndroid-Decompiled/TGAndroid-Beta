package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18539a;
    public final Object f18540b;

    public h(Object obj, int i10) {
        this.f18539a = i10;
        this.f18540b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18539a) {
            case 0:
                ((CountDownLatch) this.f18540b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18540b).countDown();
                return;
            default:
                ((Runnable) this.f18540b).run();
                return;
        }
    }
}
