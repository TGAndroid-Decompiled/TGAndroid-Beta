package ei;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class n7 extends ImageReceiver {
    public final Runnable[] K1;
    public final p7 L1;

    public n7(Runnable[] runnableArr, p7 p7Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = p7Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i3, boolean z10, int i10) {
        boolean x02 = super.x0(drawable, str, i3, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((b0) this.L1.d).run();
        }
        org.telegram.messenger.g0.h3(new z5(this, 4));
        return x02;
    }
}
