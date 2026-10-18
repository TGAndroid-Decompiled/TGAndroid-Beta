package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18486a;
    public final Object f18487b;

    public h(Object obj, int i10) {
        this.f18486a = i10;
        this.f18487b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18486a) {
            case 0:
                ((CountDownLatch) this.f18487b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18487b).countDown();
                return;
            default:
                ((Runnable) this.f18487b).run();
                return;
        }
    }
}
