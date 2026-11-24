package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class ig3 {
    public int a;
    public int b;
    public uib c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static ig3 b(hg3 hg3Var, ub7 ub7Var) {
        ?? obj = new Object();
        obj.a = ub7Var.a;
        obj.b = ub7Var.m;
        String str = ub7Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        uib uibVar = new uib(spannableStringBuilder, 10.0f, gm.o());
        uibVar.q(hg3Var);
        obj.c = uibVar;
        obj.c.p(k47.A5(gw3.m(spannableStringBuilder, uibVar.a.getFontMetricsInt(), false, null, 0), ub7Var.c, obj.c.a.getFontMetricsInt(), false));
        obj.c.n(26);
        int L = gm.L(9.32f);
        uib uibVar2 = obj.c;
        obj.g = L + ((int) uibVar2.c);
        uibVar2.h();
        int[] iArr = cmb.q8;
        int i = iArr[ub7Var.m % iArr.length];
        obj.f = i;
        obj.e = true;
        obj.d = cmb.w0(null, i, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f;
        if (this.e) {
            this.d = cmb.w0(null, this.f, false);
        }
        Paint paint = cmb.z0;
        int i = this.d;
        if (cmb.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        paint.setColor(cmb.p1(f, i));
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, this.g, gm.L(14.66f));
        canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), cmb.z0);
        this.c.c(gm.L(4.66f), gm.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
