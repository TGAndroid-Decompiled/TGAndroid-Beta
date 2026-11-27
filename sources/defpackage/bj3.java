package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class bj3 extends nx9 {
    public final n15 b1;
    public final n15 c1;
    public final uj3 d1;

    public bj3(uj3 uj3Var, Activity activity, uj3 uj3Var2, int i, int i2, int i3, long j, aj3 aj3Var) {
        super(activity, uj3Var2, i, i2, i3, j, aj3Var);
        this.d1 = uj3Var;
        this.b1 = new n15(2);
        this.c1 = new n15(8);
    }

    public final void U() {
        vy4 vy4Var;
        vy4Var = ((e) this.d1).glassEngine;
        vy4Var.g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        int i;
        int i2;
        super.dispatchDraw(canvas);
        uj3 uj3Var = this.d1;
        if (uj3Var.b0 != null || uj3Var.a3 != 0) {
            int L = hl.L(54.0f);
            aVar = ((e) uj3Var).actionBar;
            int L2 = (hl.L(uj3Var.a) + aVar.getMeasuredHeight()) - hl.L(2.0f);
            if (uj3Var.a3 != 0) {
                i = L;
            } else {
                i = 0;
            }
            int i3 = L2 - i;
            xj3 xj3Var = uj3Var.L1;
            if (xj3Var != null) {
                i2 = (int) xj3Var.c(hl.L(7.0f));
            } else {
                i2 = 0;
            }
            int i4 = i3 + i2;
            int p1 = aob.p1(0.7f, uj3Var.getThemedColor(aob.d6));
            n15 n15Var = this.b1;
            n15Var.b(p1);
            n15Var.c(i4, 0);
            n15Var.setBounds(0, 0, getMeasuredWidth(), i4 + L);
            n15Var.draw(canvas);
        }
        if (uj3Var.m4 > hl.L(32.0f)) {
            int p12 = aob.p1(0.9f, uj3Var.getThemedColor(aob.d6));
            n15 n15Var2 = this.c1;
            n15Var2.b(p12);
            n15Var2.setBounds(0, getMeasuredHeight() - uj3Var.m4, getMeasuredWidth(), getMeasuredHeight());
            n15Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f) {
        vy4 vy4Var;
        super.setAlpha(f);
        vy4Var = ((e) this.d1).glassEngine;
        vy4Var.g();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ew9 ew9Var = this.d1.a0;
        if (ew9Var != null) {
            ew9Var.setTranslationY(f);
        }
    }

    @Override
    public final void z(int i) {
        boolean z;
        bn0 bn0Var = this.W;
        if (bn0Var != null && bn0Var.h(i) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.d1.A5(z);
    }
}
