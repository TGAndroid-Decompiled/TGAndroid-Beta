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
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.kz;
import org.telegram.ui.q30;
import org.telegram.ui.r30;
import org.telegram.ui.tv;
public final class b {
    public boolean f12921a;
    public int f12922b;
    public final Object f12923c;
    public final Object d;
    public Object f12924e;
    public Object f12925f;
    public Object f12926g;
    public Object h;
    public View f12927i;
    public Object f12928j;
    public Object f12929k;
    public Object f12930l;
    public Object f12931m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f12922b = -1;
        this.f12923c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        wy0 wy0Var = (wy0) this.f12925f;
        wy0Var.f41774p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f12923c;
        paint2.setColor(i0.a.f(f11, this.f12922b, n6.x0(null, n6.f29590kh, false)));
        float d = ((c6) this.f12928j).d(this.f12921a);
        int L2 = g0.L(14.0f);
        float k10 = wy0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((wy0) this.f12926g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f12931m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f12929k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f12930l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        r30[] r30VarArr = (r30[]) this.f12924e;
        boolean b10 = r30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z11 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (r30VarArr[1].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        wy0 wy0Var2 = (wy0) this.f12925f;
        wy0Var2.c(f15 - (wy0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (r30VarArr[2].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (r30VarArr[3].b(canvas, rectF3, f11)) {
            z10 = true;
        } else {
            z10 = z11;
        }
        if (f11 > 0.0f) {
            ((wy0) this.f12926g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((wy0) this.h).c(rectF.centerX() - (((wy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
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
        this.f12921a = z10;
        for (int i7 = 0; i7 < 4; i7++) {
            r30 r30Var = ((r30[]) this.f12924e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            q30 q30Var = r30Var.f51607k;
            boolean z12 = r30Var.f51603f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            r30Var.f51603f = z11;
            if (str != null && (r30Var.d == null || !TextUtils.equals(r30Var.f51608l, str))) {
                o5 o5Var = r30Var.d;
                if (o5Var != null) {
                    o5Var.o(q30Var);
                }
                r30Var.f51601c = j6.g(str);
                int l10 = i10.l();
                ?? drawable = new Drawable();
                drawable.f38029l = 1.0f;
                drawable.f38031n = null;
                drawable.f38032o = null;
                drawable.f38025g = 21;
                drawable.h = l10;
                drawable.x();
                o5.w();
                r30Var.d = drawable;
                r30Var.f51608l = str;
                drawable.q(str);
                r30Var.c();
                if (r30Var.f51606j) {
                    r30Var.d.b(q30Var);
                }
            }
            if (r30Var.f51603f && !z12) {
                r30Var.f51602e = false;
            }
        }
        tv tvVar = (tv) this.f12927i;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    public b() {
        this.f12923c = new Paint(1);
        this.d = new Paint(1);
        this.f12924e = new r30[4];
        this.f12921a = true;
        this.f12928j = new c6(new kz(this, 8), 320L, kr.h, 0);
        this.f12929k = new RectF();
        this.f12930l = new RectF();
        this.f12931m = new Path();
        int i7 = 0;
        while (true) {
            r30[] r30VarArr = (r30[]) this.f12924e;
            if (i7 < r30VarArr.length) {
                r30VarArr[i7] = new r30(i7);
                i7++;
            } else {
                ((Paint) this.f12923c).setColor(n6.x0(null, n6.f29590kh, false));
                this.f12925f = new wy0(gd.N0(2131751809, null), 12.0f, g0.o());
                wy0 wy0Var = new wy0(gd.N0(2131751807, null), 11.0f, null);
                wy0Var.m(99);
                wy0Var.p(g0.L(200.0f));
                wy0Var.l(g0.L(2.66f));
                this.f12926g = wy0Var;
                this.h = new wy0(gd.N0(2131751808, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
