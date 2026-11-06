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
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hz;
import org.telegram.ui.l00;
import org.telegram.ui.o30;
import org.telegram.ui.p30;
public final class b {
    public boolean f13263a;
    public int f13264b;
    public final Object f13265c;
    public final Object d;
    public Object f13266e;
    public Object f13267f;
    public Object f13268g;
    public Object h;
    public View f13269i;
    public Object f13270j;
    public Object f13271k;
    public Object f13272l;
    public Object f13273m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f13264b = -1;
        this.f13265c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z9;
        Paint paint = (Paint) this.d;
        canvas.save();
        ly0 ly0Var = (ly0) this.f13267f;
        ly0Var.f35793p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f13265c;
        paint2.setColor(i0.a.f(f11, this.f13264b, k6.x0(null, k6.f27931hh, false)));
        float d = ((w5) this.f13270j).d(this.f13263a);
        int L2 = g0.L(14.0f);
        float k10 = ly0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((ly0) this.f13268g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f13273m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f13271k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f13272l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        p30[] p30VarArr = (p30[]) this.f13266e;
        boolean b10 = p30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        ly0 ly0Var2 = (ly0) this.f13267f;
        ly0Var2.c(f15 - (ly0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[3].b(canvas, rectF3, f11)) {
            z9 = true;
        } else {
            z9 = z10;
        }
        if (f11 > 0.0f) {
            ((ly0) this.f13268g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((ly0) this.h).c(rectF.centerX() - (((ly0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
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
        this.f13263a = z9;
        for (int i7 = 0; i7 < 4; i7++) {
            p30 p30Var = ((p30[]) this.f13266e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            o30 o30Var = p30Var.f48607k;
            boolean z11 = p30Var.f48603f;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p30Var.f48603f = z10;
            if (str != null && (p30Var.d == null || !TextUtils.equals(p30Var.f48608l, str))) {
                i5 i5Var = p30Var.d;
                if (i5Var != null) {
                    i5Var.o(o30Var);
                }
                p30Var.f48601c = i6.g(str);
                int l10 = p10.l();
                ?? drawable = new Drawable();
                drawable.f34451l = 1.0f;
                drawable.f34453n = null;
                drawable.f34454o = null;
                drawable.f34447g = 21;
                drawable.h = l10;
                drawable.x();
                i5.w();
                p30Var.d = drawable;
                p30Var.f48608l = str;
                drawable.q(str);
                p30Var.c();
                if (p30Var.f48606j) {
                    p30Var.d.b(o30Var);
                }
            }
            if (p30Var.f48603f && !z11) {
                p30Var.f48602e = false;
            }
        }
        l00 l00Var = (l00) this.f13269i;
        if (l00Var != null) {
            l00Var.invalidate();
        }
    }

    public b() {
        this.f13265c = new Paint(1);
        this.d = new Paint(1);
        this.f13266e = new p30[4];
        this.f13263a = true;
        this.f13270j = new w5(new hz(this, 8), 320L, xq.h, 0);
        this.f13271k = new RectF();
        this.f13272l = new RectF();
        this.f13273m = new Path();
        int i7 = 0;
        while (true) {
            p30[] p30VarArr = (p30[]) this.f13266e;
            if (i7 < p30VarArr.length) {
                p30VarArr[i7] = new p30(i7);
                i7++;
            } else {
                ((Paint) this.f13265c).setColor(k6.x0(null, k6.f27931hh, false));
                this.f13267f = new ly0(hd.M0(2131751821, null), 12.0f, g0.o());
                ly0 ly0Var = new ly0(hd.M0(2131751819, null), 11.0f, null);
                ly0Var.m(99);
                ly0Var.p(g0.L(200.0f));
                ly0Var.l(g0.L(2.66f));
                this.f13268g = ly0Var;
                this.h = new ly0(hd.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
