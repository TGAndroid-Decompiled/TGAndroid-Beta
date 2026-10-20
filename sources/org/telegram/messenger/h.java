package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18497a;
    public final Object f18498b;

    public h(Object obj, int i10) {
        this.f18497a = i10;
        this.f18498b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18497a) {
            case 0:
                ((CountDownLatch) this.f18498b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18498b).countDown();
                return;
            default:
                ((Runnable) this.f18498b).run();
                return;
        }
    }
}
