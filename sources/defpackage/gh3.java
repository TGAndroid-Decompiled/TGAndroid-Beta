package defpackage;

import android.view.View;
public final class gh3 extends qn {
    public final byte b;
    public final cj3 c;

    public gh3(cj3 cj3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = cj3Var;
                super("viewPagerTranslation", (byte) 0);
                return;
            default:
                this.c = cj3Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((cj3) obj).S4(f);
                return;
            default:
                cj3 cj3Var = this.c;
                cj3Var.J0 = f;
                ((View) obj).setTranslationY(cj3Var.K0 + f);
                cj3Var.Z2();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        cj3 cj3Var = this.c;
        switch (b) {
            case 0:
                cj3 cj3Var2 = (cj3) obj;
                return Float.valueOf(cj3Var.O);
            default:
                View view = (View) obj;
                return Float.valueOf(cj3Var.J0);
        }
    }
}
