package defpackage;

import android.text.style.CharacterStyle;
public final class cq1 extends l01 {
    public final byte d;
    public final int e;
    public final wb2 f;
    public final zu1 g;
    public final Object h;

    public cq1(zu1 zu1Var, int i, Object obj, wb2 wb2Var, byte b) {
        this.d = b;
        this.g = zu1Var;
        this.e = i;
        this.h = obj;
        this.f = wb2Var;
    }

    @Override
    public final void c(boolean z) {
        switch (this.d) {
            case 0:
                if (!z) {
                    hl.d3(new zd(this, this.e, (byte) 14), 240L);
                    return;
                }
                return;
            default:
                if (!z) {
                    hl.d3(new zd(this, this.e, (byte) 17), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        byte b = this.d;
        wb2 wb2Var = this.f;
        Object obj = this.h;
        int i = this.e;
        zu1 zu1Var = this.g;
        switch (b) {
            case 0:
                zu1Var.lc = i;
                zu1Var.mc = 1;
                zu1Var.nc = (CharacterStyle) obj;
                wb2Var.invalidate();
                return;
            default:
                zu1Var.lc = i;
                zu1Var.mc = 3;
                zu1Var.oc = (String) obj;
                wb2Var.invalidate();
                return;
        }
    }
}
