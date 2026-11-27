package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class ja8 implements jec {
    public final byte a;
    public final po6 b;

    public ja8(po6 po6Var, byte b) {
        this.a = b;
        this.b = po6Var;
    }

    @Override
    public final void a(rf4 rf4Var) {
        byte b = this.a;
        po6 po6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                rf4Var.c(new ri6(po6Var, (byte) 29));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                rf4Var.c(new ri6(po6Var, (byte) 29));
                return;
        }
    }
}
