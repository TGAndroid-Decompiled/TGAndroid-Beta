package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
public final class lr3 {
    public final kr3 b;
    public final kr3 c;
    public long e;
    public final RenderNode a = ul1.k();
    public final Rect d = new Rect();

    public lr3(mr3 mr3Var) {
        boolean z = mr3Var.a;
        boolean z2 = mr3Var.c;
        if (z) {
            if (z2) {
                kr3 kr3Var = new kr3(mr3Var, "glass", 0, true);
                this.c = kr3Var;
                kr3Var.e = (byte) 4;
                kr3Var.f = (byte) 4;
                kr3Var.d(gm.N(6.0f), y00.m());
            } else {
                kr3 kr3Var2 = new kr3(mr3Var, "glass", 1, true);
                this.c = kr3Var2;
                kr3Var2.e = (byte) 4;
                kr3Var2.f = (byte) 4;
                kr3Var2.c(gm.N(6.0f));
                kr3Var2.e(y00.m());
            }
            kr3 kr3Var3 = new kr3(mr3Var, "blur", 0, false);
            this.b = kr3Var3;
            kr3Var3.e = (byte) 8;
            kr3Var3.f = (byte) 8;
            kr3Var3.c(gm.N(38.34f));
        } else if (z2) {
            kr3 kr3Var4 = new kr3(mr3Var, "blur", 0, false);
            this.b = kr3Var4;
            byte b = mr3Var.b ? (byte) 16 : (byte) 8;
            kr3Var4.e = b;
            kr3Var4.f = b;
            kr3Var4.d(gm.N(40.0f), y00.m());
            this.c = null;
        } else {
            kr3 kr3Var5 = new kr3(mr3Var, "blur", 1, false);
            this.b = kr3Var5;
            kr3Var5.e = (byte) 8;
            kr3Var5.f = (byte) 8;
            kr3Var5.c(gm.N(40.0f));
            kr3Var5.e(y00.m());
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
