package defpackage;

import android.view.PixelCopy;
import java.util.concurrent.CountDownLatch;
public final class gk implements PixelCopy.OnPixelCopyFinishedListener {
    public final byte a;
    public final Object b;

    public gk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onPixelCopyFinished(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CountDownLatch) obj).countDown();
                return;
            case 1:
                ((CountDownLatch) obj).countDown();
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
