package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nda extends AnimatorListenerAdapter {
    public final byte a;
    public final nfa b;

    public nda(nfa nfaVar, byte b) {
        this.a = b;
        this.b = nfaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nfa nfaVar = this.b;
        switch (b) {
            case 0:
                nfaVar.O0 = null;
                return;
            default:
                r7 r7Var = nfaVar.q0;
                nfaVar.i1 = null;
                boolean z = nfaVar.l1;
                iea[] ieaVarArr = nfaVar.n0;
                int i = 4;
                if (z) {
                    ieaVarArr[1].setVisibility(8);
                    if (r7Var != null && !nfaVar.q()) {
                        if (nfaVar.s0()) {
                            i = 8;
                        }
                        nfaVar.setSearchItemVisibility(i);
                        nfaVar.r0 = 0.0f;
                    } else {
                        nfaVar.r0 = nfaVar.V(0.0f);
                        nfaVar.K1(0.0f);
                    }
                    nfaVar.G1(false);
                    nfaVar.A0 = (byte) 0;
                } else {
                    iea ieaVar = ieaVarArr[0];
                    ieaVarArr[0] = ieaVarArr[1];
                    ieaVarArr[1] = ieaVar;
                    ieaVar.setVisibility(8);
                    if (r7Var != null && nfaVar.A0 == 2) {
                        if (nfaVar.s0()) {
                            i = 8;
                        }
                        nfaVar.setSearchItemVisibility(i);
                    }
                    nfaVar.A0 = (byte) 0;
                    nfaVar.g1(1.0f, ieaVarArr[0].F);
                    nfaVar.S0();
                    nfaVar.q1();
                }
                nfaVar.j1 = false;
                nfaVar.B1 = false;
                nfaVar.A1 = false;
                nfaVar.setHeaderEnabled(true);
                nfaVar.L0.setEnabled(true);
                return;
        }
    }
}
