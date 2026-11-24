package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class lx0 extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public lx0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        y59 adapter;
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (b) {
            case 0:
                wx0 wx0Var = (wx0) obj;
                wx0Var.T = on2.f(1.0f, i3, i2);
                wx0Var.h();
                return;
            case 1:
                l95 l95Var = (l95) obj;
                l95Var.M = i3;
                l95Var.N = i2;
                l95Var.G.setColorFilter(new PorterDuffColorFilter(l95Var.M, PorterDuff.Mode.MULTIPLY));
                l95Var.F.setColor(l95Var.M);
                l95Var.r.setColor(l95Var.N);
                l95Var.K.d(on2.p(l95Var.N, 38));
                return;
            case 2:
                ha5 ha5Var = (ha5) obj;
                ha5Var.B0 = i3;
                ha5Var.C0 = i3;
                ha5Var.D0 = i2;
                ha5Var.T.setColor(i2);
                if (ha5Var.S > 0.0f) {
                    ha5Var.invalidate();
                    return;
                }
                return;
            case 3:
                nha nhaVar = (nha) obj;
                iga[] igaVarArr = nhaVar.n0;
                nhaVar.M1.e();
                nhaVar.r1 = false;
                int[] iArr = nhaVar.p1;
                iArr[i3] = i2;
                for (int i4 = 0; i4 < igaVarArr.length; i4++) {
                    iga igaVar = igaVarArr[i4];
                    if (igaVar != null && igaVar.h != null && (((i = igaVar.F) == 0 || nha.j0(i)) && (adapter = igaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            nhaVar.w1[0].g(false);
                        }
                        igaVarArr[i4].x.x1(iArr[i3]);
                        igaVarArr[i4].h.b0();
                        if (adapter.b() == b2) {
                            gm.V3(igaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                        igaVarArr[i4].n.setVisibility(8);
                    }
                }
                nhaVar.e1();
                return;
            default:
                if (i3 != i2) {
                    ((v9b) obj).P(i3, i2);
                    return;
                }
                return;
        }
    }
}
