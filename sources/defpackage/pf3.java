package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
public final class pf3 {
    public int a;
    public int b;
    public pkb c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public static pf3 b(of3 of3Var, ac7 ac7Var) {
        ?? obj = new Object();
        obj.a = ac7Var.a;
        obj.b = ac7Var.m;
        String str = ac7Var.b;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase());
        pkb pkbVar = new pkb(spannableStringBuilder, 10.0f, hl.o());
        pkbVar.q(of3Var);
        obj.c = pkbVar;
        obj.c.p(r47.A5(pv3.m(spannableStringBuilder, pkbVar.a.getFontMetricsInt(), false, null, 0), ac7Var.c, obj.c.a.getFontMetricsInt(), false));
        obj.c.n(26);
        int L = hl.L(9.32f);
        pkb pkbVar2 = obj.c;
        obj.g = L + ((int) pkbVar2.c);
        pkbVar2.h();
        int[] iArr = aob.r8;
        int i = iArr[ac7Var.m % iArr.length];
        obj.f = i;
        obj.e = true;
        obj.d = aob.w0(null, i, false);
        return obj;
    }

    public final void a(Canvas canvas) {
        float f;
        if (this.e) {
            this.d = aob.w0(null, this.f, false);
        }
        Paint paint = aob.z0;
        int i = this.d;
        if (aob.I.o()) {
            f = 0.2f;
        } else {
            f = 0.1f;
        }
        paint.setColor(aob.p1(f, i));
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, this.g, hl.L(14.66f));
        canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), aob.z0);
        this.c.c(hl.L(4.66f), hl.L(14.66f) / 2.0f, 1.0f, this.d, canvas);
    }
}
