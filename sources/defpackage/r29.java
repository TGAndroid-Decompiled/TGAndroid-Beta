package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r29 extends ImageReceiver {
    public final byte K1;

    public r29(View view, byte b) {
        super(view);
        this.K1 = b;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof p09) {
                    ((p09) drawable).I(0, false, true);
                }
                return super.h0(drawable, str, i, z, i2);
            default:
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (h0 && (drawable instanceof p09)) {
                    p09 p09Var = (p09) drawable;
                    p09Var.I(0, false, true);
                    p09Var.stop();
                }
                return h0;
        }
    }
}
