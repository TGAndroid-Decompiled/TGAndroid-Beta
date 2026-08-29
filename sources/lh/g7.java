package lh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class g7 extends ImageReceiver {
    public final Runnable[] f15642a;
    public final i7 f15643b;

    public g7(Runnable[] runnableArr, i7 i7Var) {
        this.f15642a = runnableArr;
        this.f15643b = i7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f15642a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f15643b.f15733c.run();
        }
        AndroidUtilities.runOnUIThread(new m5(this, 5));
        return imageBitmapByKey;
    }
}
