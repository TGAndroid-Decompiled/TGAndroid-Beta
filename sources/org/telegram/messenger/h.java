package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class h implements PixelCopy.OnPixelCopyFinishedListener {
    public final int f15317a;
    public final Object f15318b;

    public h(Object obj, int i10) {
        this.f15317a = i10;
        this.f15318b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i10) {
        switch (this.f15317a) {
            case 0:
                AndroidUtilities.z((CountDownLatch) this.f15318b, i10);
                return;
            case 1:
                AndroidUtilities.w((CountDownLatch) this.f15318b, i10);
                return;
            default:
                AndroidUtilities.l(i10, (Runnable) this.f15318b);
                return;
        }
    }
}
