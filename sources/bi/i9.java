package bi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class i9 extends ImageReceiver {
    public final Runnable[] f3134a;
    public final k9 f3135b;

    public i9(Runnable[] runnableArr, k9 k9Var) {
        this.f3134a = runnableArr;
        this.f3135b = k9Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f3134a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((s8) this.f3135b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 26));
        return imageBitmapByKey;
    }
}
