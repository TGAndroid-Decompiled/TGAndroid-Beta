package defpackage;
public final class m7b extends o7b {
    public final byte g;
    public final Object h;

    public m7b(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override
    public final void e() {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                xm8 xm8Var = (xm8) obj;
                xm8Var.R = false;
                xm8Var.invalidate();
                return;
            case 1:
                y28 w = ((m8b) obj).w();
                if (w != null) {
                    w.c0(true);
                    return;
                }
                return;
            default:
                be0 be0Var = (be0) obj;
                be0Var.post(new kya(be0Var, (byte) 19));
                return;
        }
    }

    @Override
    public final void f(boolean z) {
        byte b = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                xm8 xm8Var = (xm8) obj;
                xm8Var.R = true;
                xm8Var.invalidate();
                return;
            case 1:
                y28 w = ((m8b) obj).w();
                if (w != null) {
                    w.c0(false);
                }
                d28 d28Var = this.f;
                if (d28Var != null) {
                    d28Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((be0) obj).setVisibility(0);
                return;
        }
    }
}
