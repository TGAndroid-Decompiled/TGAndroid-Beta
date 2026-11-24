package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class y48 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final eq g = new eq((byte) 1);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Paint l = new Paint();
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final p09 t;
    public final p09 u;

    public y48(Context context) {
        this.m = context.getDrawable(2131231762);
        this.o = context.getDrawable(2131231748);
        this.n = context.getDrawable(2131231759);
        Drawable drawable = context.getDrawable(2131231749);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(2131231754);
        this.r = context.getDrawable(2131231901);
        this.s = context.getDrawable(2131232114);
        this.u = new p09(2131624089, gm.L(28.0f), gm.L(28.0f), true, null);
        p09 p09Var = new p09(2131624089, gm.L(28.0f), gm.L(28.0f), true, null);
        this.t = p09Var;
        p09Var.I(20, false, true);
        p09Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int p = on2.p(-16777216, 102);
        this.d = context.getDrawable(2131232739);
        this.e = context.getDrawable(2131232738);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(p);
        this.f = new ColorDrawable(on2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        int i;
        int i2 = 20;
        p09 p09Var = this.u;
        if (!z2) {
            if (z) {
                i = 20;
            } else {
                i = 0;
            }
            p09Var.I(i, false, false);
            if (!z) {
                i2 = 0;
            }
            p09Var.K(i2);
        } else if (z) {
            if (p09Var.b0 > 20) {
                p09Var.I(0, false, false);
            }
            p09Var.K(20);
            p09Var.start();
        } else {
            int i3 = p09Var.b0;
            if (i3 != 0 && i3 < 43) {
                p09Var.K(43);
                p09Var.start();
            }
        }
    }
}
