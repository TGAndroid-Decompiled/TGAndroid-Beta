package nh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class h7 extends ImageReceiver {
    public final Runnable[] f15391a;
    public final j7 f15392b;

    public h7(Runnable[] runnableArr, j7 j7Var) {
        this.f15391a = runnableArr;
        this.f15392b = j7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
        Runnable runnable = this.f15391a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f15392b.f15524c.run();
        }
        AndroidUtilities.runOnUIThread(new n5(this, 5));
        return imageBitmapByKey;
    }
}
