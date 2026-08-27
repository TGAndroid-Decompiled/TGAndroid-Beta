package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

public final class j implements PixelCopy.OnPixelCopyFinishedListener {

    public final int f20618a;

    public final Object f20619b;

    public j(Object obj, int i10) {
        this.f20618a = i10;
        this.f20619b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f20618a) {
            case 0:
                ((CountDownLatch) this.f20619b).countDown();
                break;
            case 1:
                ((CountDownLatch) this.f20619b).countDown();
                break;
            default:
                ((Runnable) this.f20619b).run();
                break;
        }
    }
}
