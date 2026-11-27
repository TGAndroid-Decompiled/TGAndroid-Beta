package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class m68 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final fp g = new fp((byte) 1);
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
    public final b29 t;
    public final b29 u;

    public m68(Context context) {
        this.m = context.getDrawable(2131231761);
        this.o = context.getDrawable(2131231747);
        this.n = context.getDrawable(2131231758);
        Drawable drawable = context.getDrawable(2131231748);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(2131231753);
        this.r = context.getDrawable(2131231900);
        this.s = context.getDrawable(2131232113);
        this.u = new b29(2131624089, hl.L(28.0f), hl.L(28.0f), true, null);
        b29 b29Var = new b29(2131624089, hl.L(28.0f), hl.L(28.0f), true, null);
        this.t = b29Var;
        b29Var.I(20, false, true);
        b29Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o = vm2.o(-16777216, 102);
        this.d = context.getDrawable(2131232738);
        this.e = context.getDrawable(2131232737);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o);
        this.f = new ColorDrawable(vm2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        int i;
        int i2 = 20;
        b29 b29Var = this.u;
        if (!z2) {
            if (z) {
                i = 20;
            } else {
                i = 0;
            }
            b29Var.I(i, false, false);
            if (!z) {
                i2 = 0;
            }
            b29Var.K(i2);
        } else if (z) {
            if (b29Var.b0 > 20) {
                b29Var.I(0, false, false);
            }
            b29Var.K(20);
            b29Var.start();
        } else {
            int i3 = b29Var.b0;
            if (i3 != 0 && i3 < 43) {
                b29Var.K(43);
                b29Var.start();
            }
        }
    }
}
