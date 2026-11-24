package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class n68 implements jac {
    public final byte a;
    public final lm6 b;

    public n68(lm6 lm6Var, byte b) {
        this.a = b;
        this.b = lm6Var;
    }

    @Override
    public final void a(td4 td4Var) {
        byte b = this.a;
        lm6 lm6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                td4Var.c(new z24(lm6Var, (byte) 1));
                return;
        }
    }
}
