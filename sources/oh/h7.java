package oh;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class h7 extends ImageReceiver {
    public final Runnable[] f17194a;
    public final j7 f17195b;

    public h7(Runnable[] runnableArr, j7 j7Var) {
        this.f17194a = runnableArr;
        this.f17195b = j7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z4, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z4, i11);
        Runnable runnable = this.f17194a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f17195b.f17342c.run();
        }
        AndroidUtilities.runOnUIThread(new t3(this, 8));
        return imageBitmapByKey;
    }
}
