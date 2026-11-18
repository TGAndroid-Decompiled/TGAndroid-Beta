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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.lz;
import org.telegram.ui.r30;
import org.telegram.ui.s30;
import org.telegram.ui.uv;
public final class b {
    public boolean f12927a;
    public int f12928b;
    public final Object f12929c;
    public final Object d;
    public Object f12930e;
    public Object f12931f;
    public Object f12932g;
    public Object h;
    public View f12933i;
    public Object f12934j;
    public Object f12935k;
    public Object f12936l;
    public Object f12937m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f12928b = -1;
        this.f12929c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        vy0 vy0Var = (vy0) this.f12931f;
        vy0Var.f41493p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f12929c;
        paint2.setColor(i0.a.f(f11, this.f12928b, n6.x0(null, n6.f29533kh, false)));
        float d = ((c6) this.f12934j).d(this.f12927a);
        int L2 = g0.L(14.0f);
        float k10 = vy0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((vy0) this.f12932g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f12937m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f12935k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f12936l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        s30[] s30VarArr = (s30[]) this.f12930e;
        boolean b10 = s30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z11 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[1].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        vy0 vy0Var2 = (vy0) this.f12931f;
        vy0Var2.c(f15 - (vy0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[2].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[3].b(canvas, rectF3, f11)) {
            z10 = true;
        } else {
            z10 = z11;
        }
        if (f11 > 0.0f) {
            ((vy0) this.f12932g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((vy0) this.h).c(rectF.centerX() - (((vy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
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
        this.f12927a = z10;
        for (int i7 = 0; i7 < 4; i7++) {
            s30 s30Var = ((s30[]) this.f12930e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            r30 r30Var = s30Var.f51871k;
            boolean z12 = s30Var.f51867f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s30Var.f51867f = z11;
            if (str != null && (s30Var.d == null || !TextUtils.equals(s30Var.f51872l, str))) {
                o5 o5Var = s30Var.d;
                if (o5Var != null) {
                    o5Var.o(r30Var);
                }
                s30Var.f51865c = j6.g(str);
                int l10 = j10.l();
                ?? drawable = new Drawable();
                drawable.f37977l = 1.0f;
                drawable.f37979n = null;
                drawable.f37980o = null;
                drawable.f37973g = 21;
                drawable.h = l10;
                drawable.x();
                o5.w();
                s30Var.d = drawable;
                s30Var.f51872l = str;
                drawable.q(str);
                s30Var.c();
                if (s30Var.f51870j) {
                    s30Var.d.b(r30Var);
                }
            }
            if (s30Var.f51867f && !z12) {
                s30Var.f51866e = false;
            }
        }
        uv uvVar = (uv) this.f12933i;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    public b() {
        this.f12929c = new Paint(1);
        this.d = new Paint(1);
        this.f12930e = new s30[4];
        this.f12927a = true;
        this.f12934j = new c6(new lz(this, 8), 320L, lr.h, 0);
        this.f12935k = new RectF();
        this.f12936l = new RectF();
        this.f12937m = new Path();
        int i7 = 0;
        while (true) {
            s30[] s30VarArr = (s30[]) this.f12930e;
            if (i7 < s30VarArr.length) {
                s30VarArr[i7] = new s30(i7);
                i7++;
            } else {
                ((Paint) this.f12929c).setColor(n6.x0(null, n6.f29533kh, false));
                this.f12931f = new vy0(gd.M0(2131751810, null), 12.0f, g0.o());
                vy0 vy0Var = new vy0(gd.M0(2131751808, null), 11.0f, null);
                vy0Var.m(99);
                vy0Var.p(g0.L(200.0f));
                vy0Var.l(g0.L(2.66f));
                this.f12932g = vy0Var;
                this.h = new vy0(gd.M0(2131751809, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
