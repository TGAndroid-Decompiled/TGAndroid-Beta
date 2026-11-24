package defpackage;
public final class o9b extends q9b {
    public final byte g;
    public final Object h;

    public o9b(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                yo8 yo8Var = (yo8) obj;
                yo8Var.R = false;
                yo8Var.invalidate();
                return;
            case 1:
                a58 w = ((oab) obj).w();
                if (w != null) {
                    w.c0(true);
                    return;
                }
                return;
            default:
                bf0 bf0Var = (bf0) obj;
                bf0Var.post(new nsa(bf0Var, (byte) 27));
                return;
        }
    }

    @Override
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                yo8 yo8Var = (yo8) obj;
                yo8Var.R = true;
                yo8Var.invalidate();
                return;
            case 1:
                a58 w = ((oab) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                g48 g48Var = this.f;
                if (g48Var != null) {
                    g48Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((bf0) obj).setVisibility(0);
                return;
        }
    }
}
