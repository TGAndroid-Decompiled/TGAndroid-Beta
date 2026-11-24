package defpackage;

import android.text.style.CharacterStyle;
public final class op1 extends c01 {
    public final byte d;
    public final int e;
    public final gb2 f;
    public final mu1 g;
    public final Object h;

    public op1(mu1 mu1Var, int i, Object obj, gb2 gb2Var, byte b) {
        this.d = b;
        this.g = mu1Var;
        this.e = i;
        this.h = obj;
        this.f = gb2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gl.e3(new eg(this, this.e, (byte) 14), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gl.e3(new eg(this, this.e, (byte) 17), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        gb2 gb2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        mu1 mu1Var = this.g;
        switch (b) {
            case 0:
                mu1Var.ac = i;
                mu1Var.bc = 1;
                mu1Var.cc = (CharacterStyle) obj;
                gb2Var.invalidate();
                return;
            default:
                mu1Var.ac = i;
                mu1Var.bc = 3;
                mu1Var.dc = (String) obj;
                gb2Var.invalidate();
                return;
        }
    }
}
