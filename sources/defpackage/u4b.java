package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class u4b extends ImageReceiver {
    public final Runnable[] K1;
    public final ow0 L1;

    public u4b(Runnable[] runnableArr, ow0 ow0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = ow0Var;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            gm.r(runnable);
            ((uva) this.L1.d).run();
        }
        gm.c3(new nsa(this, (byte) 16));
        return h0;
    }
}
