package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class py8 extends ImageReceiver {
    public final ry8 K1;

    public py8(ry8 ry8Var) {
        super(null);
        this.K1 = ry8Var;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        if (drawable != null) {
            this.K1.c();
        }
        return super.h0(drawable, str, i, z, i2);
    }
}
