package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class t2b extends ImageReceiver {
    public final Runnable[] K1;
    public final ev0 L1;

    public t2b(Runnable[] runnableArr, ev0 ev0Var) {
        super(null);
        this.K1 = runnableArr;
        this.L1 = ev0Var;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        boolean h0 = super.h0(drawable, str, i, z, i2);
        Runnable runnable = this.K1[0];
        if (runnable != null) {
            gl.r(runnable);
            ((iya) this.L1.d).run();
        }
        gl.d3(new kya(this, (byte) 8));
        return h0;
    }
}
