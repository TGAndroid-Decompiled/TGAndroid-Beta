package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18483a;
    public final Object f18484b;

    public h(Object obj, int i10) {
        this.f18483a = i10;
        this.f18484b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18483a) {
            case 0:
                ((CountDownLatch) this.f18484b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18484b).countDown();
                return;
            default:
                ((Runnable) this.f18484b).run();
                return;
        }
    }
}
