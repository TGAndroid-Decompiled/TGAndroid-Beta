package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.xj0;
public final class oc implements ImageReceiver.ImageReceiverDelegate {
    public final boolean[] f1962a;

    public oc(boolean[] zArr) {
        this.f1962a = zArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xj0 lottieAnimation;
        if (z10 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
            boolean[] zArr = this.f1962a;
            if (!zArr[0]) {
                lottieAnimation.N(0, false, false);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q0(lottieAnimation, 0));
                zArr[0] = true;
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }
}
