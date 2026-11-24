package defpackage;

import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class p88 implements mcc {
    public final byte a;
    public final lo6 b;

    public p88(lo6 lo6Var, byte b) {
        this.a = b;
        this.b = lo6Var;
    }

    @Override
    public final void a(uf4 uf4Var) {
        byte b = this.a;
        lo6 lo6Var = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                uf4Var.c(new ni6(lo6Var, (byte) 29));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                uf4Var.c(new ni6(lo6Var, (byte) 29));
                return;
        }
    }
}
