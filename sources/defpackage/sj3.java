package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class sj3 extends vv9 {
    public final i15 b1;
    public final i15 c1;
    public final nk3 d1;

    public sj3(nk3 nk3Var, Activity activity, nk3 nk3Var2, int i, int i2, int i3, long j, k6d k6dVar) {
        super(activity, nk3Var2, i, i2, i3, j, k6dVar);
        this.d1 = nk3Var;
        this.b1 = new i15(2);
        this.c1 = new i15(8);
    }

    public final void T() {
        sy4 sy4Var;
        sy4Var = ((d) this.d1).glassEngine;
        sy4Var.g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        int i;
        int i2;
        super.dispatchDraw(canvas);
        nk3 nk3Var = this.d1;
        if (nk3Var.b0 != null || nk3Var.a3 != 0) {
            int L = gm.L(54.0f);
            aVar = ((d) nk3Var).actionBar;
            int L2 = (gm.L(nk3Var.a) + aVar.getMeasuredHeight()) - gm.L(2.0f);
            if (nk3Var.a3 != 0) {
                i = L;
            } else {
                i = 0;
            }
            int i3 = L2 - i;
            qk3 qk3Var = nk3Var.L1;
            if (qk3Var != null) {
                i2 = (int) qk3Var.c(gm.L(7.0f));
            } else {
                i2 = 0;
            }
            int i4 = i3 + i2;
            int p1 = cmb.p1(0.7f, nk3Var.getThemedColor(cmb.c6));
            i15 i15Var = this.b1;
            i15Var.b(p1);
            i15Var.c(i4, 0);
            i15Var.setBounds(0, 0, getMeasuredWidth(), i4 + L);
            i15Var.draw(canvas);
        }
        if (nk3Var.m4 > gm.L(32.0f)) {
            int p12 = cmb.p1(0.9f, nk3Var.getThemedColor(cmb.c6));
            i15 i15Var2 = this.c1;
            i15Var2.b(p12);
            i15Var2.setBounds(0, getMeasuredHeight() - nk3Var.m4, getMeasuredWidth(), getMeasuredHeight());
            i15Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f) {
        sy4 sy4Var;
        super.setAlpha(f);
        sy4Var = ((d) this.d1).glassEngine;
        sy4Var.g();
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        nu9 nu9Var = this.d1.a0;
        if (nu9Var != null) {
            nu9Var.setTranslationY(f);
        }
    }

    @Override
    public final void y(int i) {
        boolean z;
        bo0 bo0Var = this.W;
        if (bo0Var != null && bo0Var.h(i) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.d1.A5(z);
    }
}
