package hh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.oi0;

public final class p9 implements ImageReceiver.ImageReceiverDelegate {

    public final boolean[] f9883a;

    public p9(boolean[] zArr) {
        this.f9883a = zArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi0 lottieAnimation;
        if (!z10 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        boolean[] zArr = this.f9883a;
        if (zArr[0]) {
            return;
        }
        lottieAnimation.L(0, false, false);
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(lottieAnimation, 0));
        zArr[0] = true;
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
