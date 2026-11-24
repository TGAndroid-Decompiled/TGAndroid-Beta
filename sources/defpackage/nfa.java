package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nfa extends AnimatorListenerAdapter {
    public final byte a;
    public final nha b;

    public nfa(nha nhaVar, byte b) {
        this.a = b;
        this.b = nhaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                nhaVar.O0 = null;
                return;
            default:
                r7 r7Var = nhaVar.q0;
                nhaVar.i1 = null;
                boolean z = nhaVar.l1;
                iga[] igaVarArr = nhaVar.n0;
                int i = 4;
                if (z) {
                    igaVarArr[1].setVisibility(8);
                    if (r7Var != null && !nhaVar.q()) {
                        if (nhaVar.s0()) {
                            i = 8;
                        }
                        nhaVar.setSearchItemVisibility(i);
                        nhaVar.r0 = 0.0f;
                    } else {
                        nhaVar.r0 = nhaVar.V(0.0f);
                        nhaVar.K1(0.0f);
                    }
                    nhaVar.G1(false);
                    nhaVar.A0 = (byte) 0;
                } else {
                    iga igaVar = igaVarArr[0];
                    igaVarArr[0] = igaVarArr[1];
                    igaVarArr[1] = igaVar;
                    igaVar.setVisibility(8);
                    if (r7Var != null && nhaVar.A0 == 2) {
                        if (nhaVar.s0()) {
                            i = 8;
                        }
                        nhaVar.setSearchItemVisibility(i);
                    }
                    nhaVar.A0 = (byte) 0;
                    nhaVar.g1(1.0f, igaVarArr[0].F);
                    nhaVar.S0();
                    nhaVar.q1();
                }
                nhaVar.j1 = false;
                nhaVar.B1 = false;
                nhaVar.A1 = false;
                nhaVar.setHeaderEnabled(true);
                nhaVar.L0.setEnabled(true);
                return;
        }
    }
}
