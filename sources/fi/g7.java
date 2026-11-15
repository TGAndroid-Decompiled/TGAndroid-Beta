package fi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class g7 extends ImageReceiver {
    public final Runnable[] K1;
    public final i7 L1;

    public g7(Runnable[] runnableArr, i7 i7Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = i7Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((f6) this.L1.d).run();
        }
        org.telegram.messenger.g0.h3(new c1(this, 12));
        return x02;
    }
}
