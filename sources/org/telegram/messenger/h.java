package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f16514a;
    public final Object f16515b;

    public h(Object obj, int i10) {
        this.f16514a = i10;
        this.f16515b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f16514a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f16515b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f16515b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f16515b);
                return;
        }
    }
}
