package di;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class v7 extends ImageReceiver {
    public final Runnable[] f9267a;
    public final x7 f9268b;

    public v7(Runnable[] runnableArr, x7 x7Var) {
        this.f9267a = runnableArr;
        this.f9268b = x7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f9267a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((b4) this.f9268b.d).run();
        }
        AndroidUtilities.runOnUIThread(new bi.u6(this, 27));
        return imageBitmapByKey;
    }
}
