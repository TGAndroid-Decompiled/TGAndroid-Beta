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
import bi.t0;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.m40;
import org.telegram.ui.n40;
import org.telegram.ui.yy;
public final class b {
    public boolean f7138a;
    public int f7139b;
    public final Object f7140c;
    public final Object d;
    public Object e;
    public Object f7141f;
    public Object f7142g;
    public Object h;
    public View f7143i;
    public Object f7144j;
    public Object f7145k;
    public Object f7146l;
    public Object f7147m;

    public b(ContextThemeWrapper contextThemeWrapper) {
        this.f7139b = -1;
        this.f7140c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }

    public boolean a(Canvas canvas, float f7, float f10) {
        int L;
        boolean z10;
        Paint paint = (Paint) this.d;
        canvas.save();
        rz0 rz0Var = (rz0) this.f7141f;
        rz0Var.f30136p = f7 - i0.L(132.0f);
        Paint paint2 = (Paint) this.f7140c;
        paint2.setColor(i0.b.f(f10, this.f7139b, t6.x0(null, t6.f21012hh, false)));
        float d = ((t5) this.f7144j).d(this.f7138a);
        int L2 = i0.L(14.0f);
        float k10 = rz0Var.k() + i0.L(86.0f) + L2;
        float L3 = i0.L(28.0f);
        float L4 = i0.L(232.0f);
        float i10 = ((rz0) this.f7142g).i() + i0.L(54.0f) + i0.L(50.0f);
        float T1 = i0.T1(k10, L4, f10);
        float T12 = i0.T1(L3, i10, f10);
        float W1 = i0.W1(f10, i0.L(14.0f), i0.L(16.0f));
        RectF rectF = i0.P;
        rectF.set((f7 - T1) / 2.0f, 0.0f, (f7 + T1) / 2.0f, T12);
        canvas.drawRoundRect(rectF, W1, W1, paint2);
        Path path = (Path) this.f7147m;
        path.rewind();
        path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
        canvas.clipPath(path);
        int L5 = i0.L(18.0f);
        int L6 = i0.L(30.0f);
        int i11 = L5 / 2;
        int centerY = ((int) rectF.centerY()) - i11;
        int centerY2 = ((int) rectF.centerY()) + i11;
        RectF rectF2 = (RectF) this.f7145k;
        int L7 = i0.L(7.0f);
        float f11 = L5 / 2.0f;
        float f12 = centerY;
        float f13 = centerY2;
        rectF2.set((i0.L(10.0f) + (L7 + ((int) rectF.left))) - f11, f12, i0.L(10.0f) + i0.L(7.0f) + ((int) rectF.left) + f11, f13);
        float f14 = f7 / 2.0f;
        float f15 = f14 - (L * 2);
        float L8 = (int) ((L4 - i0.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.f7146l;
        float f16 = (int) ((0.5f * L8) + f15);
        float f17 = L6 / 2.0f;
        rectF3.set(f16 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f16 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        n40[] n40VarArr = (n40[]) this.e;
        boolean b10 = n40VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((i0.L(10.0f) + (i0.L(27.0f) + ((int) rectF.left))) - f11, f12, i0.L(10.0f) + i0.L(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * L8) + f15);
        boolean z11 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f18 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        if (n40VarArr[1].b(canvas, rectF3, f10)) {
            z11 = true;
        }
        rz0 rz0Var2 = (rz0) this.f7141f;
        rz0Var2.c(f14 - (rz0Var2.k() / 2.0f), L3 / 2.0f, i0.T1(1.0f, 0.75f, d) * (1.0f - f10), -1, canvas);
        rectF2.set((i0.L(10.0f) + (((int) rectF.right) - i0.L(47.0f))) - f11, f12, i0.L(10.0f) + (((int) rectF.right) - i0.L(47.0f)) + f11, f13);
        float f19 = (int) ((L8 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f19 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        if (n40VarArr[2].b(canvas, rectF3, f10)) {
            z11 = true;
        }
        rectF2.set((i0.L(10.0f) + (((int) rectF.right) - i0.L(27.0f))) - f11, f12, i0.L(10.0f) + (((int) rectF.right) - i0.L(27.0f)) + f11, f13);
        float f20 = (int) ((L8 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + i0.L(27.33f)) - f17), f20 + f17, (int) (rectF.top + i0.L(27.33f) + f17));
        i0.c2(rectF2, rectF3, f10, rectF3);
        if (n40VarArr[3].b(canvas, rectF3, f10)) {
            z10 = true;
        } else {
            z10 = z11;
        }
        if (f10 > 0.0f) {
            ((rz0) this.f7142g).c((rectF.centerX() - (L4 / 2.0f)) + i0.L(16.0f), i0.L(54.0f), f10, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, i10 - i0.L(40.0f), rectF.right, i0.L(0.66f) + (i10 - i0.L(40.0f)), paint);
            ((rz0) this.h).c(rectF.centerX() - (((rz0) this.h).k() / 2.0f), i10 - i0.L(20.0f), f10, -1, canvas);
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
        this.f7138a = z10;
        for (int i10 = 0; i10 < 4; i10++) {
            n40 n40Var = ((n40[]) this.e)[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            m40 m40Var = n40Var.f39693k;
            boolean z12 = n40Var.f39689f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            n40Var.f39689f = z11;
            if (str != null && (n40Var.d == null || !TextUtils.equals(n40Var.f39694l, str))) {
                f5 f5Var = n40Var.d;
                if (f5Var != null) {
                    f5Var.o(m40Var);
                }
                n40Var.f39688c = k6.g(str);
                int l4 = e20.l();
                ?? drawable = new Drawable();
                drawable.f26071l = 1.0f;
                drawable.f26073n = null;
                drawable.f26074o = null;
                drawable.f26067g = 21;
                drawable.h = l4;
                drawable.x();
                f5.w();
                n40Var.d = drawable;
                n40Var.f39694l = str;
                drawable.q(str);
                n40Var.c();
                if (n40Var.f39692j) {
                    n40Var.d.b(m40Var);
                }
            }
            if (n40Var.f39689f && !z12) {
                n40Var.e = false;
            }
        }
        t0 t0Var = (t0) this.f7143i;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    public b() {
        this.f7140c = new Paint(1);
        this.d = new Paint(1);
        this.e = new n40[4];
        this.f7138a = true;
        this.f7144j = new t5(new yy(this, 8), 320L, gr.h, 0);
        this.f7145k = new RectF();
        this.f7146l = new RectF();
        this.f7147m = new Path();
        int i10 = 0;
        while (true) {
            n40[] n40VarArr = (n40[]) this.e;
            if (i10 < n40VarArr.length) {
                n40VarArr[i10] = new n40(i10);
                i10++;
            } else {
                ((Paint) this.f7140c).setColor(t6.x0(null, t6.f21012hh, false));
                this.f7141f = new rz0(dd.L0(2131751821, null), 12.0f, i0.o());
                rz0 rz0Var = new rz0(dd.L0(2131751819, null), 11.0f, null);
                rz0Var.m(99);
                rz0Var.p(i0.L(200.0f));
                rz0Var.l(i0.L(2.66f));
                this.f7142g = rz0Var;
                this.h = new rz0(dd.L0(2131751820, null), 14.0f, i0.o());
                b(null);
                return;
            }
        }
    }
}
