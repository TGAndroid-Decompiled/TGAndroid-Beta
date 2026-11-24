package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class dw0 extends AnimatorListenerAdapter {
    public final byte a;
    public final int b;
    public final int c;
    public final Object d;

    public dw0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        w39 adapter;
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (b) {
            case 0:
                ow0 ow0Var = (ow0) obj;
                ow0Var.T = bm2.f(1.0f, i3, i2);
                ow0Var.h();
                return;
            case 1:
                m75 m75Var = (m75) obj;
                m75Var.M = i3;
                m75Var.N = i2;
                m75Var.G.setColorFilter(new PorterDuffColorFilter(m75Var.M, PorterDuff.Mode.MULTIPLY));
                m75Var.F.setColor(m75Var.M);
                m75Var.r.setColor(m75Var.N);
                m75Var.K.d(bm2.o(m75Var.N, 38));
                return;
            case 2:
                h85 h85Var = (h85) obj;
                h85Var.B0 = i3;
                h85Var.C0 = i3;
                h85Var.D0 = i2;
                h85Var.T.setColor(i2);
                if (h85Var.S > 0.0f) {
                    h85Var.invalidate();
                    return;
                }
                return;
            case 3:
                nfa nfaVar = (nfa) obj;
                iea[] ieaVarArr = nfaVar.n0;
                nfaVar.M1.e();
                nfaVar.r1 = false;
                int[] iArr = nfaVar.p1;
                iArr[i3] = i2;
                for (int i4 = 0; i4 < ieaVarArr.length; i4++) {
                    iea ieaVar = ieaVarArr[i4];
                    if (ieaVar != null && ieaVar.h != null && (((i = ieaVar.F) == 0 || nfa.j0(i)) && (adapter = ieaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            nfaVar.w1[0].g(false);
                        }
                        ieaVarArr[i4].x.x1(iArr[i3]);
                        ieaVarArr[i4].h.b0();
                        if (adapter.b() == b2) {
                            gl.V3(ieaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                        ieaVarArr[i4].n.setVisibility(8);
                    }
                }
                nfaVar.e1();
                return;
            default:
                if (i3 != i2) {
                    ((t7b) obj).P(i3, i2);
                    return;
                }
                return;
        }
    }
}
