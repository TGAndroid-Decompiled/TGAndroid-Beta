package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18490a;
    public final Object f18491b;

    public h(Object obj, int i10) {
        this.f18490a = i10;
        this.f18491b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18490a) {
            case 0:
                ((CountDownLatch) this.f18491b).countDown();
                return;
            case 1:
                ((CountDownLatch) this.f18491b).countDown();
                return;
            default:
                ((Runnable) this.f18491b).run();
                return;
        }
    }
}
