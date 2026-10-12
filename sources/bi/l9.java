package bi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class l9 extends ImageReceiver {
    public final Runnable[] f3283a;
    public final n9 f3284b;

    public l9(Runnable[] runnableArr, n9 n9Var) {
        this.f3283a = runnableArr;
        this.f3284b = n9Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f3283a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((u8) this.f3284b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 27));
        return imageBitmapByKey;
    }
}
