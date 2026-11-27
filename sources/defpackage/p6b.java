package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class p6b extends ImageReceiver {
    public final Runnable[] K1;
    public final pv0 L1;

    public p6b(Runnable[] runnableArr, pv0 pv0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = pv0Var;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            hl.r(runnable);
            ((z3b) this.L1.d).run();
        }
        hl.c3(new uoa(this, (byte) 25));
        return h0;
    }
}
