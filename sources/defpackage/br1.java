package defpackage;

import android.text.style.CharacterStyle;
public final class br1 extends k11 {
    public final byte d;
    public final int e;
    public final rc2 f;
    public final yv1 g;
    public final Object h;

    public br1(yv1 yv1Var, int i, Object obj, rc2 rc2Var, byte b) {
        this.d = b;
        this.g = yv1Var;
        this.e = i;
        this.h = obj;
        this.f = rc2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    gm.d3(new eh(this, this.e, (byte) 14), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    gm.d3(new eh(this, this.e, (byte) 17), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        rc2 rc2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        yv1 yv1Var = this.g;
        switch (b) {
            case 0:
                yv1Var.kc = i;
                yv1Var.lc = 1;
                yv1Var.mc = (CharacterStyle) obj;
                rc2Var.invalidate();
                return;
            default:
                yv1Var.kc = i;
                yv1Var.lc = 3;
                yv1Var.nc = (String) obj;
                rc2Var.invalidate();
                return;
        }
    }
}
