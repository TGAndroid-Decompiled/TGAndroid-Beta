package ih;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class k7 extends ImageReceiver {
    public final Runnable[] f11685a;
    public final m7 f11686b;

    public k7(Runnable[] runnableArr, m7 m7Var) {
        this.f11685a = runnableArr;
        this.f11686b = m7Var;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i9, boolean z10, int i10) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i9, z10, i10);
        Runnable runnable = this.f11685a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.f11686b.f11774c.run();
        }
        AndroidUtilities.runOnUIThread(new g(this, 14));
        return imageBitmapByKey;
    }
}
