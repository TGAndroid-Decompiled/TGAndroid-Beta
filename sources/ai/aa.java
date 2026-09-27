package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class aa extends ImageReceiver {
    public final Runnable[] f538a;
    public final da f539b;

    public aa(Runnable[] runnableArr, da daVar) {
        this.f538a = runnableArr;
        this.f539b = daVar;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f538a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((a1.e) this.f539b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 16));
        return imageBitmapByKey;
    }
}
