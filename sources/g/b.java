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
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.iz;
import org.telegram.ui.o30;
import org.telegram.ui.p30;
import org.telegram.ui.rv;
public final class b {
    public boolean f12613a;
    public int f12614b;
    public final Object f12615c;
    public final Object d;
    public Object f12616e;
    public Object f12617f;
    public Object f12618g;
    public Object h;
    public View f12619i;
    public Object f12620j;
    public Object f12621k;
    public Object f12622l;
    public Object f12623m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f12614b = -1;
        this.f12615c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        oy0 oy0Var = (oy0) this.f12617f;
        oy0Var.f38114p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f12615c;
        paint2.setColor(i0.a.f(f11, this.f12614b, j6.x0(null, j6.f28988kh, false)));
        float d = ((u5) this.f12620j).d(this.f12613a);
        int L2 = g0.L(14.0f);
        float k10 = oy0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((oy0) this.f12618g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f12623m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f12621k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f12622l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        p30[] p30VarArr = (p30[]) this.f12616e;
        boolean b10 = p30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z11 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[1].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        oy0 oy0Var2 = (oy0) this.f12617f;
        oy0Var2.c(f15 - (oy0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[2].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (p30VarArr[3].b(canvas, rectF3, f11)) {
            z10 = true;
        } else {
            z10 = z11;
        }
        if (f11 > 0.0f) {
            ((oy0) this.f12618g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((oy0) this.h).c(rectF.centerX() - (((oy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z10;
    }

    public void b(String[] strArr) {
        boolean z10;
        String str;
        boolean z11;
        if (strArr == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12613a = z10;
        for (int i7 = 0; i7 < 4; i7++) {
            p30 p30Var = ((p30[]) this.f12616e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            o30 o30Var = p30Var.f50105k;
            boolean z12 = p30Var.f50101f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            p30Var.f50101f = z11;
            if (str != null && (p30Var.d == null || !TextUtils.equals(p30Var.f50106l, str))) {
                g5 g5Var = p30Var.d;
                if (g5Var != null) {
                    g5Var.o(o30Var);
                }
                p30Var.f50099c = org.telegram.messenger.j6.g(str);
                int l10 = m10.l();
                ?? drawable = new Drawable();
                drawable.f34814l = 1.0f;
                drawable.f34816n = null;
                drawable.f34817o = null;
                drawable.f34810g = 21;
                drawable.h = l10;
                drawable.x();
                g5.w();
                p30Var.d = drawable;
                p30Var.f50106l = str;
                drawable.q(str);
                p30Var.c();
                if (p30Var.f50104j) {
                    p30Var.d.b(o30Var);
                }
            }
            if (p30Var.f50101f && !z12) {
                p30Var.f50100e = false;
            }
        }
        rv rvVar = (rv) this.f12619i;
        if (rvVar != null) {
            rvVar.invalidate();
        }
    }

    public b() {
        this.f12615c = new Paint(1);
        this.d = new Paint(1);
        this.f12616e = new p30[4];
        this.f12613a = true;
        this.f12620j = new u5(new iz(this, 8), 320L, er.h, 0);
        this.f12621k = new RectF();
        this.f12622l = new RectF();
        this.f12623m = new Path();
        int i7 = 0;
        while (true) {
            p30[] p30VarArr = (p30[]) this.f12616e;
            if (i7 < p30VarArr.length) {
                p30VarArr[i7] = new p30(i7);
                i7++;
            } else {
                ((Paint) this.f12615c).setColor(j6.x0(null, j6.f28988kh, false));
                this.f12617f = new oy0(hd.M0(2131751821, null), 12.0f, g0.o());
                oy0 oy0Var = new oy0(hd.M0(2131751819, null), 11.0f, null);
                oy0Var.m(99);
                oy0Var.p(g0.L(200.0f));
                oy0Var.l(g0.L(2.66f));
                this.f12618g = oy0Var;
                this.h = new oy0(hd.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
