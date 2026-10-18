package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18479a;
    public final Object f18480b;

    public h(Object obj, int i10) {
        this.f18479a = i10;
        this.f18480b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18479a) {
            case 0:
                ((CountDownLatch) this.f18480b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18480b).countDown();
                return;
            default:
                ((Runnable) this.f18480b).run();
                return;
        }
    }
}
