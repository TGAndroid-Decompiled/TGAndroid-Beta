package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class w28 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final ep g = new ep((byte) 1);
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
    public final oy8 t;
    public final oy8 u;

    public w28(Context context) {
        this.m = context.getDrawable(2131231761);
        this.o = context.getDrawable(2131231747);
        this.n = context.getDrawable(2131231758);
        Drawable drawable = context.getDrawable(2131231748);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(2131231753);
        this.r = context.getDrawable(2131231900);
        this.s = context.getDrawable(2131232113);
        this.u = new oy8(2131624089, gl.L(28.0f), gl.L(28.0f), true, null);
        oy8 oy8Var = new oy8(2131624089, gl.L(28.0f), gl.L(28.0f), true, null);
        this.t = oy8Var;
        oy8Var.I(20, false, true);
        oy8Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o = bm2.o(-16777216, 102);
        this.d = context.getDrawable(2131232727);
        this.e = context.getDrawable(2131232726);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o);
        this.f = new ColorDrawable(bm2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        int i;
        int i2 = 20;
        oy8 oy8Var = this.u;
        if (!z2) {
            if (z) {
                i = 20;
            } else {
                i = 0;
            }
            oy8Var.I(i, false, false);
            if (!z) {
                i2 = 0;
            }
            oy8Var.K(i2);
        } else if (z) {
            if (oy8Var.b0 > 20) {
                oy8Var.I(0, false, false);
            }
            oy8Var.K(20);
            oy8Var.start();
        } else {
            int i3 = oy8Var.b0;
            if (i3 != 0 && i3 < 43) {
                oy8Var.K(43);
                oy8Var.start();
            }
        }
    }
}
