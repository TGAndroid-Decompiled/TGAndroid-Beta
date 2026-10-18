package ci;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class w7 extends ImageReceiver {
    public final Runnable[] f6058a;
    public final y7 f6059b;

    public w7(Runnable[] runnableArr, y7 y7Var) {
        this.f6058a = runnableArr;
        this.f6059b = y7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f6058a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((u7) this.f6059b.d).run();
        }
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 20));
        return imageBitmapByKey;
    }
}
