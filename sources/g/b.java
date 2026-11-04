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
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fz;
import org.telegram.ui.j30;
import org.telegram.ui.k30;
public final class b {
    public boolean f11647a;
    public int f11648b;
    public final Object f11649c;
    public final Object d;
    public Object f11650e;
    public Object f11651f;
    public Object f11652g;
    public Object h;
    public View f11653i;
    public Object f11654j;
    public Object f11655k;
    public Object f11656l;
    public Object f11657m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f11648b = -1;
        this.f11649c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        ly0 ly0Var = (ly0) this.f11651f;
        ly0Var.f35929p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f11649c;
        paint2.setColor(i0.a.f(f11, this.f11648b, k6.x0(null, k6.f27964hh, false)));
        float d = ((u5) this.f11654j).d(this.f11647a);
        int L2 = g0.L(14.0f);
        float k10 = ly0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i3 = ((ly0) this.f11652g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i3, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f11657m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f11655k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f11656l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        k30[] k30VarArr = (k30[]) this.f11650e;
        boolean b10 = k30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z11 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (k30VarArr[1].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        ly0 ly0Var2 = (ly0) this.f11651f;
        ly0Var2.c(f15 - (ly0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(47.0f)) + f12, f14);
        float f20 = (int) ((L8 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f20 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (k30VarArr[2].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        rectF2.set((g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f))) - f12, f13, g0.L(10.0f) + (((int) rectF.right) - g0.L(27.0f)) + f12, f14);
        float f21 = (int) ((L8 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f21 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (k30VarArr[3].b(canvas, rectF3, f11)) {
            z10 = true;
        } else {
            z10 = z11;
        }
        if (f11 > 0.0f) {
            ((ly0) this.f11652g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i3 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i3 - g0.L(40.0f)), paint);
            ((ly0) this.h).c(rectF.centerX() - (((ly0) this.h).k() / 2.0f), i3 - g0.L(20.0f), f11, -1, canvas);
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
        this.f11647a = z10;
        for (int i3 = 0; i3 < 4; i3++) {
            k30 k30Var = ((k30[]) this.f11650e)[i3];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i3];
            }
            j30 j30Var = k30Var.f46755k;
            boolean z12 = k30Var.f46751f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            k30Var.f46751f = z11;
            if (str != null && (k30Var.d == null || !TextUtils.equals(k30Var.f46756l, str))) {
                g5 g5Var = k30Var.d;
                if (g5Var != null) {
                    g5Var.o(j30Var);
                }
                k30Var.f46749c = i6.g(str);
                int l10 = h10.l();
                ?? drawable = new Drawable();
                drawable.f33972l = 1.0f;
                drawable.f33974n = null;
                drawable.f33975o = null;
                drawable.f33968g = 21;
                drawable.h = l10;
                drawable.x();
                g5.w();
                k30Var.d = drawable;
                k30Var.f46756l = str;
                drawable.q(str);
                k30Var.c();
                if (k30Var.f46754j) {
                    k30Var.d.b(j30Var);
                }
            }
            if (k30Var.f46751f && !z12) {
                k30Var.f46750e = false;
            }
        }
        r0 r0Var = (r0) this.f11653i;
        if (r0Var != null) {
            r0Var.invalidate();
        }
    }

    public b() {
        this.f11649c = new Paint(1);
        this.d = new Paint(1);
        this.f11650e = new k30[4];
        this.f11647a = true;
        this.f11654j = new u5(new fz(this, 7), 320L, xq.h, 0);
        this.f11655k = new RectF();
        this.f11656l = new RectF();
        this.f11657m = new Path();
        int i3 = 0;
        while (true) {
            k30[] k30VarArr = (k30[]) this.f11650e;
            if (i3 < k30VarArr.length) {
                k30VarArr[i3] = new k30(i3);
                i3++;
            } else {
                ((Paint) this.f11649c).setColor(k6.x0(null, k6.f27964hh, false));
                this.f11651f = new ly0(bd.M0(2131751821, null), 12.0f, g0.o());
                ly0 ly0Var = new ly0(bd.M0(2131751819, null), 11.0f, null);
                ly0Var.m(99);
                ly0Var.p(g0.L(200.0f));
                ly0Var.l(g0.L(2.66f));
                this.f11652g = ly0Var;
                this.h = new ly0(bd.M0(2131751820, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
