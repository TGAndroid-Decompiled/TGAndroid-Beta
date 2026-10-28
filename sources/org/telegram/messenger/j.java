package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f20390a;
    public final Object f20391b;

    public j(Object obj, int i10) {
        this.f20390a = i10;
        this.f20391b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f20390a) {
            case 0:
                ((CountDownLatch) this.f20391b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f20391b).countDown();
                return;
            default:
                ((Runnable) this.f20391b).run();
                return;
        }
    }
}
