package ci;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class x7 extends ImageReceiver {
    public final Runnable[] f6170a;
    public final z7 f6171b;

    public x7(Runnable[] runnableArr, z7 z7Var) {
        this.f6170a = runnableArr;
        this.f6171b = z7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f6170a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((v7) this.f6171b.d).run();
        }
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 20));
        return imageBitmapByKey;
    }
}
