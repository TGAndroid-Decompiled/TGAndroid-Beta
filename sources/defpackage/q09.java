package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class q09 extends ImageReceiver {
    public final s09 K1;

    public q09(s09 s09Var) {
        super(null);
        this.K1 = s09Var;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
