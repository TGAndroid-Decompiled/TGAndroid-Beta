package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f16447a;
    public final Object f16448b;

    public h(Object obj, int i10) {
        this.f16447a = i10;
        this.f16448b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f16447a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f16448b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f16448b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f16448b);
                return;
        }
    }
}
