package ai;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class ba extends ImageReceiver {
    public final Runnable[] f727a;
    public final ea f728b;

    public ba(Runnable[] runnableArr, ea eaVar) {
        this.f727a = runnableArr;
        this.f728b = eaVar;
    }

    @Override
    public final boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i10, z10, i11);
        Runnable runnable = this.f727a[0];
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            ((a1.f) this.f728b.d).run();
        }
        AndroidUtilities.runOnUIThread(new a3.d(this, 16));
        return imageBitmapByKey;
    }
}
