package org.telegram.messenger;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;

public final class AndroidUtilities$$ExternalSyntheticLambda55 implements PixelCopy.OnPixelCopyFinishedListener {
    public final int $r8$classId;
    public final Object f$0;

    public AndroidUtilities$$ExternalSyntheticLambda55(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i) {
        switch (this.$r8$classId) {
            case 0:
                ((CountDownLatch) this.f$0).countDown();
                break;
            case 1:
                ((CountDownLatch) this.f$0).countDown();
                break;
            default:
                ((Runnable) this.f$0).run();
                break;
        }
    }
}
