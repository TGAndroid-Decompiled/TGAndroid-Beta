package di;

import android.graphics.drawable.Drawable;
import bi.ab;
import org.telegram.messenger.ImageReceiver;
public final class n7 extends ImageReceiver {
    public final Runnable[] J1;
    public final p7 K1;

    public n7(Runnable[] runnableArr, p7 p7Var) {
        super(null);
        this.J1 = runnableArr;
        this.K1 = p7Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z9, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z9, i10);
        Runnable runnable = this.J1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((z0) this.K1.d).run();
        }
        org.telegram.messenger.g0.h3(new ab(this, 28));
        return x02;
    }
}
