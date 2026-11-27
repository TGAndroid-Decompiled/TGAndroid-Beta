package defpackage;

import android.view.View;
public final class ai3 extends rn {
    public final byte b;
    public final uj3 c;

    public ai3(uj3 uj3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = uj3Var;
                super("viewPagerTranslation", (byte) 0);
                return;
            default:
                this.c = uj3Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((uj3) obj).W4(f);
                return;
            default:
                uj3 uj3Var = this.c;
                uj3Var.J0 = f;
                ((View) obj).setTranslationY(uj3Var.K0 + f);
                uj3Var.b3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        uj3 uj3Var = this.c;
        switch (b) {
            case 0:
                uj3 uj3Var2 = (uj3) obj;
                return Float.valueOf(uj3Var.O);
            default:
                View view = (View) obj;
                return Float.valueOf(uj3Var.J0);
        }
    }
}
