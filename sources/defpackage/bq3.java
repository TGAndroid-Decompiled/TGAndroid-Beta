package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class bq3 {
    public final aq3 b;
    public final aq3 c;
    public long e;
    public final RenderNode a = mk1.k();
    public final Rect d = new Rect();

    public bq3(cq3 cq3Var) {
        boolean z = cq3Var.a;
        boolean z2 = cq3Var.c;
        if (z) {
            if (z2) {
                aq3 aq3Var = new aq3(cq3Var, "glass", 0, true);
                this.c = aq3Var;
                aq3Var.e = (byte) 4;
                aq3Var.f = (byte) 4;
                aq3Var.d(gl.N(6.0f), yz.m());
            } else {
                aq3 aq3Var2 = new aq3(cq3Var, "glass", 1, true);
                this.c = aq3Var2;
                aq3Var2.e = (byte) 4;
                aq3Var2.f = (byte) 4;
                aq3Var2.c(gl.N(6.0f));
                aq3Var2.e(yz.m());
            }
            aq3 aq3Var3 = new aq3(cq3Var, "blur", 0, false);
            this.b = aq3Var3;
            aq3Var3.e = (byte) 8;
            aq3Var3.f = (byte) 8;
            aq3Var3.c(gl.N(38.34f));
        } else if (z2) {
            aq3 aq3Var4 = new aq3(cq3Var, "blur", 0, false);
            this.b = aq3Var4;
            byte b = cq3Var.b ? (byte) 16 : (byte) 8;
            aq3Var4.e = b;
            aq3Var4.f = b;
            aq3Var4.d(gl.N(40.0f), yz.m());
            this.c = null;
        } else {
            aq3 aq3Var5 = new aq3(cq3Var, "blur", 1, false);
            this.b = aq3Var5;
            aq3Var5.e = (byte) 8;
            aq3Var5.f = (byte) 8;
            aq3Var5.c(gl.N(40.0f));
            aq3Var5.e(yz.m());
            this.c = null;
        }
    }

    public final void a(RectF rectF) {
        float f = rectF.left;
        int round = Math.round(f - (f % 16.0f));
        Rect rect = this.d;
        rect.left = round;
        float f2 = rectF.top;
        rect.top = Math.round(f2 - (f2 % 16.0f));
        float f3 = rectF.right;
        rect.right = Math.round((16.0f - (f3 % 16.0f)) + f3);
        float f4 = rectF.bottom;
        rect.bottom = Math.round((16.0f - (f4 % 16.0f)) + f4);
    }
}
