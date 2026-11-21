package fi;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class d7 extends ImageReceiver {
    public final Runnable[] K1;
    public final f7 L1;

    public d7(Runnable[] runnableArr, f7 f7Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = f7Var;
    }

    @Override
    public final boolean x0(Drawable drawable, String str, int i7, boolean z10, int i10) {
        boolean x02 = super.x0(drawable, str, i7, z10, i10);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            ((l4) this.L1.d).run();
        }
        org.telegram.messenger.g0.g3(new f2.a(this, 16));
        return x02;
    }
}
