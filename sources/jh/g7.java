package jh;

import android.graphics.drawable.Drawable;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class g7 extends ImageReceiver {

    public final Runnable[] f13368a;

    public final i7 f13369b;

    public g7(Runnable[] runnableArr, i7 i7Var) {
        this.f13368a = runnableArr;
        this.f13369b = i7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f13368a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f13369b.f13455c.run();
        }
        AndroidUtilities.runOnUIThread(new y9(this, 21));
        return imageBitmapByKey;
    }
}
