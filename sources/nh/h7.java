package nh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class h7 extends ImageReceiver {
    public final Runnable[] f15371a;
    public final j7 f15372b;

    public h7(Runnable[] runnableArr, j7 j7Var) {
        this.f15371a = runnableArr;
        this.f15372b = j7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
        Runnable runnable = this.f15371a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((n4) this.f15372b.d).run();
        }
        AndroidUtilities.runOnUIThread(new n5(this, 5));
        return imageBitmapByKey;
    }
}
