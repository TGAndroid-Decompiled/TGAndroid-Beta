package g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.kz;
import org.telegram.ui.o00;
import org.telegram.ui.r30;
import org.telegram.ui.s30;
public final class b {
    public boolean f13265a;
    public int f13266b;
    public final Object f13267c;
    public final Object d;
    public Object f13268e;
    public Object f13269f;
    public Object f13270g;
    public Object h;
    public View f13271i;
    public Object f13272j;
    public Object f13273k;
    public Object f13274l;
    public Object f13275m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f13266b = -1;
        this.f13267c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z9;
        Paint paint = (Paint) this.d;
        canvas.save();
        my0 my0Var = (my0) this.f13269f;
        my0Var.f36144p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f13267c;
        paint2.setColor(i0.a.f(f11, this.f13266b, m6.x0(null, m6.f27973hh, false)));
        float d = ((v5) this.f13272j).d(this.f13265a);
        int L2 = g0.L(14.0f);
        float k10 = my0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((my0) this.f13270g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f13275m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f13273k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f13274l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        s30[] s30VarArr = (s30[]) this.f13268e;
        boolean b10 = s30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        my0 my0Var2 = (my0) this.f13269f;
        my0Var2.c(f15 - (my0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[3].b(canvas, rectF3, f11)) {
            z9 = true;
        } else {
            z9 = z10;
        }
        if (f11 > 0.0f) {
            ((my0) this.f13270g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((my0) this.h).c(rectF.centerX() - (((my0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z9;
    }

    public void b(String[] strArr) {
        boolean z9;
        String str;
        boolean z10;
        if (strArr == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13265a = z9;
        for (int i7 = 0; i7 < 4; i7++) {
            s30 s30Var = ((s30[]) this.f13268e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            r30 r30Var = s30Var.f49651k;
            boolean z11 = s30Var.f49647f;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            s30Var.f49647f = z10;
            if (str != null && (s30Var.d == null || !TextUtils.equals(s30Var.f49652l, str))) {
                h5 h5Var = s30Var.d;
                if (h5Var != null) {
                    h5Var.o(r30Var);
                }
                s30Var.f49645c = i6.g(str);
                int l10 = p10.l();
                ?? drawable = new Drawable();
                drawable.f34177l = 1.0f;
                drawable.f34179n = null;
                drawable.f34180o = null;
                drawable.f34173g = 21;
                drawable.h = l10;
                drawable.x();
                h5.w();
                s30Var.d = drawable;
                s30Var.f49652l = str;
                drawable.q(str);
                s30Var.c();
                if (s30Var.f49650j) {
                    s30Var.d.b(r30Var);
                }
            }
            if (s30Var.f49647f && !z11) {
                s30Var.f49646e = false;
            }
        }
        o00 o00Var = (o00) this.f13271i;
        if (o00Var != null) {
            o00Var.invalidate();
        }
    }

    public b() {
        this.f13267c = new Paint(1);
        this.d = new Paint(1);
        this.f13268e = new s30[4];
        this.f13265a = true;
        this.f13272j = new v5(new kz(this, 8), 320L, wq.h, 0);
        this.f13273k = new RectF();
        this.f13274l = new RectF();
        this.f13275m = new Path();
        int i7 = 0;
        while (true) {
            s30[] s30VarArr = (s30[]) this.f13268e;
            if (i7 < s30VarArr.length) {
                s30VarArr[i7] = new s30(i7);
                i7++;
            } else {
                ((Paint) this.f13267c).setColor(m6.x0(null, m6.f27973hh, false));
                this.f13269f = new my0(id.M0(2131751821, null), 12.0f, g0.o());
                my0 my0Var = new my0(id.M0(2131751819, null), 11.0f, null);
                my0Var.m(99);
                my0Var.p(g0.L(200.0f));
                my0Var.l(g0.L(2.66f));
                this.f13270g = my0Var;
                this.h = new my0(id.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
