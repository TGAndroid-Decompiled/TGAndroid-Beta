package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class sq3 {
    public final rq3 b;
    public final rq3 c;
    public long e;
    public final RenderNode a = vk1.k();
    public final Rect d = new Rect();

    public sq3(tq3 tq3Var) {
        boolean z = tq3Var.a;
        boolean z2 = tq3Var.c;
        if (z) {
            if (z2) {
                rq3 rq3Var = new rq3(tq3Var, "glass", 0, true);
                this.c = rq3Var;
                rq3Var.e = (byte) 4;
                rq3Var.f = (byte) 4;
                rq3Var.d(hl.N(6.0f), zz.m());
            } else {
                rq3 rq3Var2 = new rq3(tq3Var, "glass", 1, true);
                this.c = rq3Var2;
                rq3Var2.e = (byte) 4;
                rq3Var2.f = (byte) 4;
                rq3Var2.c(hl.N(6.0f));
                rq3Var2.e(zz.m());
            }
            rq3 rq3Var3 = new rq3(tq3Var, "blur", 0, false);
            this.b = rq3Var3;
            rq3Var3.e = (byte) 8;
            rq3Var3.f = (byte) 8;
            rq3Var3.c(hl.N(38.34f));
        } else if (z2) {
            rq3 rq3Var4 = new rq3(tq3Var, "blur", 0, false);
            this.b = rq3Var4;
            byte b = tq3Var.b ? (byte) 16 : (byte) 8;
            rq3Var4.e = b;
            rq3Var4.f = b;
            rq3Var4.d(hl.N(40.0f), zz.m());
            this.c = null;
        } else {
            rq3 rq3Var5 = new rq3(tq3Var, "blur", 1, false);
            this.b = rq3Var5;
            rq3Var5.e = (byte) 8;
            rq3Var5.f = (byte) 8;
            rq3Var5.c(hl.N(40.0f));
            rq3Var5.e(zz.m());
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
