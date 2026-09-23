package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f16244a;
    public final Object f16245b;

    public h(Object obj, int i10) {
        this.f16244a = i10;
        this.f16245b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f16244a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f16245b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f16245b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f16245b);
                return;
        }
    }
}
