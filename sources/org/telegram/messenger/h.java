package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f18006a;
    public final Object f18007b;

    public h(Object obj, int i10) {
        this.f18006a = i10;
        this.f18007b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f18006a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f18007b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f18007b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f18007b);
                return;
        }
    }
}
