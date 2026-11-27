package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class e49 extends ImageReceiver {
    public final byte K1;

    public e49(View view, byte b) {
        super(view);
        this.K1 = b;
    }

    @Override
    public final boolean h0(Drawable drawable, String str, int i, boolean z, int i2) {
        switch (this.K1) {
            case 0:
                if (drawable instanceof b29) {
                    ((b29) drawable).I(0, false, true);
                }
                return super.h0(drawable, str, i, z, i2);
            default:
                boolean h0 = super.h0(drawable, str, i, z, i2);
                if (h0 && (drawable instanceof b29)) {
                    b29 b29Var = (b29) drawable;
                    b29Var.I(0, false, true);
                    b29Var.stop();
                }
                return h0;
        }
    }
}
