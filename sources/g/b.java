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
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.lz;
import org.telegram.ui.r30;
import org.telegram.ui.s30;
import org.telegram.ui.uv;
public final class b {
    public boolean f12959a;
    public int f12960b;
    public final Object f12961c;
    public final Object d;
    public Object f12962e;
    public Object f12963f;
    public Object f12964g;
    public Object h;
    public View f12965i;
    public Object f12966j;
    public Object f12967k;
    public Object f12968l;
    public Object f12969m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f12960b = -1;
        this.f12961c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f10, float f11) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        xy0 xy0Var = (xy0) this.f12963f;
        xy0Var.f42258p = f10 - g0.L(132.0f);
        Paint paint2 = (Paint) this.f12961c;
        paint2.setColor(i0.a.f(f11, this.f12960b, m6.x0(null, m6.f29520kh, false)));
        float d = ((d6) this.f12966j).d(this.f12959a);
        int L2 = g0.L(14.0f);
        float k10 = xy0Var.k() + g0.L(86.0f) + L2;
        float L3 = g0.L(28.0f);
        float L4 = g0.L(232.0f);
        float i7 = ((xy0) this.f12964g).i() + g0.L(54.0f) + g0.L(50.0f);
        float T1 = g0.T1(k10, L4, f11);
        float T12 = g0.T1(L3, i7, f11);
        float W1 = g0.W1(f11, g0.L(14.0f), g0.L(16.0f));
        RectF rectF = g0.P;
        rectF.set((f10 - T1) / 2.0f, 0.0f, (f10 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f12969m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = g0.L(18.0f);
        int L6 = g0.L(30.0f);
        int i10 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        RectF rectF2 = (RectF) this.f12967k;
        int L7 = g0.L(7.0f);
        float f12 = L5 / 2.0f;
        float f13 = centerY;
        float f14 = centerY2;
        rectF2.set((g0.L(10.0f) + (L7 + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(7.0f) + ((int) rectF.left) + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (L * 2);
        float L8 = (int) ((L4 - g0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f12968l;
        float f17 = (int) ((0.5f * L8) + f16);
        float f18 = L6 / 2.0f;
        rectF3.set(f17 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f17 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        s30[] s30VarArr = (s30[]) this.f12962e;
        boolean b10 = s30VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((g0.L(10.0f) + (g0.L(27.0f) + ((int) rectF.left))) - f12, f13, g0.L(10.0f) + g0.L(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * L8) + f16);
        boolean z11 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + g0.L(27.33f)) - f18), f19 + f18, (int) (rectF.top + g0.L(27.33f) + f18));
        g0.c2(rectF2, rectF3, f11, rectF3);
        if (s30VarArr[1].b(canvas, rectF3, f11)) {
            z11 = true;
        }
        xy0 xy0Var2 = (xy0) this.f12963f;
        xy0Var2.c(f15 - (xy0Var2.k() / 2.0f), L3 / 2.0f, g0.T1(1.0f, 0.75f, d) * (1.0f - f11), -1, canvas);
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
            ((xy0) this.f12964g).c((rectF.centerX() - (L4 / 2.0f)) + g0.L(16.0f), g0.L(54.0f), f11, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, i7 - g0.L(40.0f), rectF.right, g0.L(0.66f) + (i7 - g0.L(40.0f)), paint);
            ((xy0) this.h).c(rectF.centerX() - (((xy0) this.h).k() / 2.0f), i7 - g0.L(20.0f), f11, -1, canvas);
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
        this.f12959a = z10;
        for (int i7 = 0; i7 < 4; i7++) {
            s30 s30Var = ((s30[]) this.f12962e)[i7];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i7];
            }
            r30 r30Var = s30Var.f51915k;
            boolean z12 = s30Var.f51911f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s30Var.f51911f = z11;
            if (str != null && (s30Var.d == null || !TextUtils.equals(s30Var.f51916l, str))) {
                p5 p5Var = s30Var.d;
                if (p5Var != null) {
                    p5Var.o(r30Var);
                }
                s30Var.f51909c = j6.g(str);
                int l10 = k10.l();
                ?? drawable = new Drawable();
                drawable.f38501l = 1.0f;
                drawable.f38503n = null;
                drawable.f38504o = null;
                drawable.f38497g = 21;
                drawable.h = l10;
                drawable.x();
                p5.w();
                s30Var.d = drawable;
                s30Var.f51916l = str;
                drawable.q(str);
                s30Var.c();
                if (s30Var.f51914j) {
                    s30Var.d.b(r30Var);
                }
            }
            if (s30Var.f51911f && !z12) {
                s30Var.f51910e = false;
            }
        }
        uv uvVar = (uv) this.f12965i;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    public b() {
        this.f12961c = new Paint(1);
        this.d = new Paint(1);
        this.f12962e = new s30[4];
        this.f12959a = true;
        this.f12966j = new d6(new lz(this, 8), 320L, nr.h, 0);
        this.f12967k = new RectF();
        this.f12968l = new RectF();
        this.f12969m = new Path();
        int i7 = 0;
        while (true) {
            s30[] s30VarArr = (s30[]) this.f12962e;
            if (i7 < s30VarArr.length) {
                s30VarArr[i7] = new s30(i7);
                i7++;
            } else {
                ((Paint) this.f12961c).setColor(m6.x0(null, m6.f29520kh, false));
                this.f12963f = new xy0(hd.N0(2131751809, null), 12.0f, g0.o());
                xy0 xy0Var = new xy0(hd.N0(2131751807, null), 11.0f, null);
                xy0Var.m(99);
                xy0Var.p(g0.L(200.0f));
                xy0Var.l(g0.L(2.66f));
                this.f12964g = xy0Var;
                this.h = new xy0(hd.N0(2131751808, null), 14.0f, g0.o());
                b(null);
                return;
            }
        }
    }
}
