package defpackage;

import android.view.View;
public final class si3 extends ro {
    public final byte b;
    public final nk3 c;

    public si3(nk3 nk3Var, byte b) {
        super("animationValue", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = nk3Var;
                super("viewPagerTranslation", (byte) 0);
                return;
            default:
                this.c = nk3Var;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f) {
        switch (this.b) {
            case 0:
                ((nk3) obj).W4(f);
                return;
            default:
                nk3 nk3Var = this.c;
                nk3Var.J0 = f;
                ((View) obj).setTranslationY(nk3Var.K0 + f);
                nk3Var.b3();
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        byte b = this.b;
        nk3 nk3Var = this.c;
        switch (b) {
            case 0:
                nk3 nk3Var2 = (nk3) obj;
                return Float.valueOf(nk3Var.O);
            default:
                View view = (View) obj;
                return Float.valueOf(nk3Var.J0);
        }
    }
}
