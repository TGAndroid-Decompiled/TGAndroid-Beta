package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18487a;
    public final Object f18488b;

    public h(Object obj, int i10) {
        this.f18487a = i10;
        this.f18488b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18487a) {
            case 0:
                ((CountDownLatch) this.f18488b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18488b).countDown();
                return;
            default:
                ((Runnable) this.f18488b).run();
                return;
        }
    }
}
