package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class ve3 {
    public int a;
    public int b;
    public tgb c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static ve3 b(ue3 ue3Var, t97 t97Var) {
        ?? obj = new Object();
        obj.a = t97Var.a;
        obj.b = t97Var.m;
        String str = t97Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        tgb tgbVar = new tgb(spannableStringBuilder, 10.0f, gl.o());
        tgbVar.q(ue3Var);
        obj.c = tgbVar;
        obj.c.p(k27.A5(vu3.m(spannableStringBuilder, tgbVar.a.getFontMetricsInt(), false, null, 0), t97Var.c, obj.c.a.getFontMetricsInt(), false));
        obj.c.n(26);
        int L = gl.L(9.32f);
        tgb tgbVar2 = obj.c;
        obj.g = L + ((int) tgbVar2.c);
        tgbVar2.h();
        int[] iArr = bkb.q8;
        int i = iArr[t97Var.m % iArr.length];
        obj.f = i;
        obj.e = true;
        obj.d = bkb.w0(null, i, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f;
        if (this.e) {
            this.d = bkb.w0(null, this.f, false);
        }
        Paint paint = bkb.z0;
        int i = this.d;
        if (bkb.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        paint.setColor(bkb.p1(f, i));
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, this.g, gl.L(14.66f));
        canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), bkb.z0);
        this.c.c(gl.L(4.66f), gl.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
