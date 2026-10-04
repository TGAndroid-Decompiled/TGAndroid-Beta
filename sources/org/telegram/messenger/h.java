package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18000a;
    public final Object f18001b;

    public h(Object obj, int i10) {
        this.f18000a = i10;
        this.f18001b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18000a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f18001b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f18001b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f18001b);
                return;
        }
    }
}
