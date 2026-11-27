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
public final class qc {
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

    public qc() {
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new y85[4];
        this.a = true;
        this.j = new mm(new rj4(this, (byte) 27), 320L, k43.h, 0);
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Path();
        int i = 0;
        while (true) {
            y85[] y85VarArr = (y85[]) this.e;
            if (i < y85VarArr.length) {
                y85VarArr[i] = new y85(i);
                i++;
            } else {
                ((Paint) this.c).setColor(aob.w0(null, aob.kh, false));
                this.f = new pkb(ob6.M0(2131751786, null), 12.0f, hl.o());
                pkb pkbVar = new pkb(ob6.M0(2131751784, null), 11.0f, null);
                pkbVar.l(99);
                pkbVar.o(hl.L(200.0f));
                pkbVar.k(hl.L(2.66f));
                this.g = pkbVar;
                this.h = new pkb(ob6.M0(2131751785, null), 14.0f, hl.o());
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
        pkb pkbVar = (pkb) this.f;
        pkbVar.p = f - hl.L(132.0f);
        Paint paint2 = (Paint) this.c;
        paint2.setColor(vm2.f(f2, this.b, aob.w0(null, aob.kh, false)));
        float d = ((mm) this.j).d(this.a);
        float j = pkbVar.j() + hl.L(86.0f) + hl.L(14.0f);
        float L2 = hl.L(28.0f);
        float L3 = hl.L(232.0f);
        float h = ((pkb) this.g).h() + hl.L(54.0f) + hl.L(50.0f);
        float R1 = hl.R1(j, L3, f2);
        float R12 = hl.R1(L2, h, f2);
        float U1 = hl.U1(f2, hl.L(14.0f), hl.L(16.0f));
        RectF rectF = hl.P;
        rectF.set((f - R1) / 2.0f, 0.0f, (f + R1) / 2.0f, R12);
        canvas.drawRoundRect(rectF, U1, U1, paint2);
        Path path = (Path) this.m;
        path.rewind();
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.clipPath(path);
        int L4 = hl.L(18.0f);
        int L5 = hl.L(30.0f);
        int i = L4 / 2;
        int centerY = ((int) rectF.centerY()) - i;
        int centerY2 = ((int) rectF.centerY()) + i;
        RectF rectF2 = (RectF) this.k;
        int L6 = hl.L(7.0f) + ((int) rectF.left);
        float f3 = L4 / 2.0f;
        float f4 = centerY;
        float f5 = centerY2;
        rectF2.set((hl.L(10.0f) + L6) - f3, f4, hl.L(10.0f) + hl.L(7.0f) + ((int) rectF.left) + f3, f5);
        float f6 = f / 2.0f;
        float f7 = f6 - (L << 1);
        float L7 = (int) ((L3 - hl.L(32.0f)) / 4.0f);
        RectF rectF3 = (RectF) this.l;
        float f8 = (int) ((0.5f * L7) + f7);
        float f9 = L5 / 2.0f;
        rectF3.set(f8 - f9, (int) ((rectF.top + hl.L(27.33f)) - f9), f8 + f9, (int) (rectF.top + hl.L(27.33f) + f9));
        hl.a2(rectF2, rectF3, f2, rectF3);
        y85[] y85VarArr = (y85[]) this.e;
        boolean b = y85VarArr[0].b(canvas, rectF3, f2);
        rectF2.set((hl.L(10.0f) + (hl.L(27.0f) + ((int) rectF.left))) - f3, f4, hl.L(10.0f) + hl.L(27.0f) + ((int) rectF.left) + f3, f5);
        float f10 = (int) ((1.5f * L7) + f7);
        boolean z2 = b;
        rectF3.set(f10 - f9, (int) ((rectF.top + hl.L(27.33f)) - f9), f10 + f9, (int) (rectF.top + hl.L(27.33f) + f9));
        hl.a2(rectF2, rectF3, f2, rectF3);
        if (y85VarArr[1].b(canvas, rectF3, f2)) {
            z2 = true;
        }
        pkbVar.c(f6 - (pkbVar.j() / 2.0f), L2 / 2.0f, hl.R1(1.0f, 0.75f, d) * (1.0f - f2), -1, canvas);
        rectF2.set((hl.L(10.0f) + (((int) rectF.right) - hl.L(47.0f))) - f3, f4, hl.L(10.0f) + (((int) rectF.right) - hl.L(47.0f)) + f3, f5);
        float f11 = (int) ((L7 * 2.5f) + f7);
        rectF3.set(f11 - f9, (int) ((rectF.top + hl.L(27.33f)) - f9), f11 + f9, (int) (rectF.top + hl.L(27.33f) + f9));
        hl.a2(rectF2, rectF3, f2, rectF3);
        if (y85VarArr[2].b(canvas, rectF3, f2)) {
            z2 = true;
        }
        rectF2.set((hl.L(10.0f) + (((int) rectF.right) - hl.L(27.0f))) - f3, f4, hl.L(10.0f) + (((int) rectF.right) - hl.L(27.0f)) + f3, f5);
        float f12 = (int) ((L7 * 3.5f) + f7);
        rectF3.set(f12 - f9, (int) ((rectF.top + hl.L(27.33f)) - f9), f12 + f9, (int) (rectF.top + hl.L(27.33f) + f9));
        hl.a2(rectF2, rectF3, f2, rectF3);
        if (y85VarArr[3].b(canvas, rectF3, f2)) {
            z = true;
        } else {
            z = z2;
        }
        if (f2 > 0.0f) {
            ((pkb) this.g).c((rectF.centerX() - (L3 / 2.0f)) + hl.L(16.0f), hl.L(54.0f), f2, -1, canvas);
            paint.setColor(-16777216);
            paint.setAlpha((int) (255.0f * f2));
            canvas.drawRect(rectF.left, h - hl.L(40.0f), rectF.right, hl.L(0.66f) + (h - hl.L(40.0f)), paint);
            ((pkb) this.h).c(rectF.centerX() - (((pkb) this.h).j() / 2.0f), h - hl.L(20.0f), f2, -1, canvas);
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
            y85 y85Var = ((y85[]) this.e)[i];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i];
            }
            jb2 jb2Var = y85Var.k;
            boolean z3 = y85Var.f;
            if (str != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            y85Var.f = z2;
            if (str != null && (y85Var.d == null || !TextUtils.equals(y85Var.l, str))) {
                wl wlVar = y85Var.d;
                if (wlVar != null) {
                    wlVar.n(jb2Var);
                }
                y85Var.c = pv3.g(str);
                int k = yac.k();
                ?? drawable = new Drawable();
                drawable.l = 1.0f;
                drawable.n = null;
                drawable.o = null;
                drawable.g = 21;
                drawable.h = k;
                drawable.x();
                wl.w();
                y85Var.d = drawable;
                y85Var.l = str;
                drawable.q(str);
                y85Var.c();
                if (y85Var.j) {
                    y85Var.d.a(jb2Var);
                }
            }
            if (y85Var.f && !z3) {
                y85Var.e = false;
            }
        }
        tb tbVar = (tb) this.i;
        if (tbVar != null) {
            tbVar.invalidate();
        }
    }

    public qc(ContextThemeWrapper contextThemeWrapper) {
        this.b = -1;
        this.c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
