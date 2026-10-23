package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18559a;
    public final Object f18560b;

    public h(Object obj, int i10) {
        this.f18559a = i10;
        this.f18560b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18559a) {
            case 0:
                ((CountDownLatch) this.f18560b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18560b).countDown();
                return;
            default:
                ((Runnable) this.f18560b).run();
                return;
        }
    }
}
