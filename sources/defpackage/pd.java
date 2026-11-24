package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
public final class pd {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public View i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public pd() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new u85[4];
        this.a = true;
        this.j = new ln(new qn4(this, (byte) 20), 320L, d53.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i = 0;
        while (true) {
            u85[] u85VarArr = (u85[]) this.e;
            if (i < u85VarArr.length) {
                u85VarArr[i] = new u85(i);
                i++;
            } else {
                ((Paint) this.c).setColor(cmb.w0(null, cmb.jh, false));
                this.f = new uib(jb6.M0(2131751758, null), 12.0f, gm.o());
                uib uibVar = new uib(jb6.M0(2131751756, null), 11.0f, null);
                uibVar.l(99);
                uibVar.o(gm.L(200.0f));
                uibVar.k(gm.L(2.66f));
                this.g = uibVar;
                this.h = new uib(jb6.M0(2131751757, null), 14.0f, gm.o());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f, float f2) {
        int L;
        boolean z;
        Paint paint = (Paint) this.d;
        canvas.save();
        uib uibVar = (uib) this.f;
        uibVar.p = f - gm.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(on2.f(f2, this.b, cmb.w0(null, cmb.jh, false)));
        float d = ((ln) this.j).d(this.a);
        float j = uibVar.j() + gm.L(86.0f) + gm.L(14.0f);
        float L2 = gm.L(28.0f);
        float L3 = gm.L(232.0f);
        float h = ((uib) this.g).h() + gm.L(54.0f) + gm.L(50.0f);
        float R1 = gm.R1(j, L3, f2);
        float R12 = gm.R1(L2, h, f2);
        float U1 = gm.U1(f2, gm.L(14.0f), gm.L(16.0f));
        RectF rectF = gm.P;
        rectF.set((f - R1) / 2.0f, 0.0f, (f + R1) / 2.0f, R12);
        canvas.drawRoundRect(rectF, U1, U1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        int L4 = gm.L(18.0f);
        int L5 = gm.L(30.0f);
        int i = L4 / 2;
        int centerY = ((int) rectF.centerY()) - i;
        int centerY2 = ((int) rectF.centerY()) + i;
        RectF rectF2 = (RectF) this.k;
        int L6 = gm.L(7.0f) + ((int) rectF.left);
        float f3 = L4 / 2.0f;
        float f4 = centerY;
        float f5 = centerY2;
        rectF2.set((gm.L(10.0f) + L6) - f3, f4, gm.L(10.0f) + gm.L(7.0f) + ((int) rectF.left) + f3, f5);
        float f6 = f / 2.0f;
        float f7 = f6 - (L << 1);
        float L7 = (int) ((L3 - gm.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.l;
        float f8 = (int) ((0.5f * L7) + f7);
        float f9 = L5 / 2.0f;
        rectF3.set(f8 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f8 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        u85[] u85VarArr = (u85[]) this.e;
        boolean b = u85VarArr[0].b(canvas, rectF3, f2);
        rectF2.set((gm.L(10.0f) + (gm.L(27.0f) + ((int) rectF.left))) - f3, f4, gm.L(10.0f) + gm.L(27.0f) + ((int) rectF.left) + f3, f5);
        float f10 = (int) ((1.5f * L7) + f7);
        boolean z2 = b;
        rectF3.set(f10 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f10 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        if (u85VarArr[1].b(canvas, rectF3, f2)) {
            z2 = true;
        }
        uibVar.c(f6 - (uibVar.j() / 2.0f), L2 / 2.0f, gm.R1(1.0f, 0.75f, d) * (1.0f - f2), -1, canvas);
        rectF2.set((gm.L(10.0f) + (((int) rectF.right) - gm.L(47.0f))) - f3, f4, gm.L(10.0f) + (((int) rectF.right) - gm.L(47.0f)) + f3, f5);
        float f11 = (int) ((L7 * 2.5f) + f7);
        rectF3.set(f11 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f11 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        if (u85VarArr[2].b(canvas, rectF3, f2)) {
            z2 = true;
        }
        rectF2.set((gm.L(10.0f) + (((int) rectF.right) - gm.L(27.0f))) - f3, f4, gm.L(10.0f) + (((int) rectF.right) - gm.L(27.0f)) + f3, f5);
        float f12 = (int) ((L7 * 3.5f) + f7);
        rectF3.set(f12 - f9, (int) ((rectF.top + gm.L(27.33f)) - f9), f12 + f9, (int) (rectF.top + gm.L(27.33f) + f9));
        gm.a2(rectF2, rectF3, f2, rectF3);
        if (u85VarArr[3].b(canvas, rectF3, f2)) {
            z = true;
        } else {
            z = z2;
        }
        if (f2 > 0.0f) {
            ((uib) this.g).c((rectF.centerX() - (L3 / 2.0f)) + gm.L(16.0f), gm.L(54.0f), f2, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f2));
            canvas.drawRect(rectF.left, h - gm.L(40.0f), rectF.right, gm.L(0.66f) + (h - gm.L(40.0f)), paint);
            ((uib) this.h).c(rectF.centerX() - (((uib) this.h).j() / 2.0f), h - gm.L(20.0f), f2, -1, canvas);
        }
        canvas.restore();
        return z;
    }

    public final void b(String[] strArr) {
        boolean z;
        String str;
        boolean z2;
        if (strArr == null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        for (int i = 0; i < 4; i++) {
            u85 u85Var = ((u85[]) this.e)[i];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i];
            }
            ec2 ec2Var = u85Var.k;
            boolean z3 = u85Var.f;
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            u85Var.f = z2;
            if (str != null && (u85Var.d == null || !TextUtils.equals(u85Var.l, str))) {
                vm vmVar = u85Var.d;
                if (vmVar != null) {
                    vmVar.n(ec2Var);
                }
                u85Var.c = gw3.g(str);
                int k = z8c.k();
                ?? drawable = new Drawable();
                drawable.l = 1.0f;
                drawable.n = null;
                drawable.o = null;
                drawable.g = 21;
                drawable.h = k;
                drawable.x();
                vm.w();
                u85Var.d = drawable;
                u85Var.l = str;
                drawable.q(str);
                u85Var.c();
                if (u85Var.j) {
                    u85Var.d.a(ec2Var);
                }
            }
            if (u85Var.f && !z3) {
                u85Var.e = false;
            }
        }
        sb sbVar = (sb) this.i;
        if (sbVar != null) {
            sbVar.invalidate();
        }
    }

    public pd(ContextThemeWrapper contextThemeWrapper) {
        this.b = -1;
        this.c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
