package defpackage;
public final class lbb extends nbb {
    public final byte g;
    public final Object h;

    public lbb(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                iq8 iq8Var = (iq8) obj;
                iq8Var.R = false;
                iq8Var.invalidate();
                return;
            case 1:
                o68 w = ((lcb) obj).w();
                if (w != null) {
                    w.c0(true);
                    return;
                }
                return;
            default:
                de0 de0Var = (de0) obj;
                de0Var.post(new s8b(de0Var, (byte) 6));
                return;
        }
    }

    @Override
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                iq8 iq8Var = (iq8) obj;
                iq8Var.R = true;
                iq8Var.invalidate();
                return;
            case 1:
                o68 w = ((lcb) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                u58 u58Var = this.f;
                if (u58Var != null) {
                    u58Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((de0) obj).setVisibility(0);
                return;
        }
    }
}
