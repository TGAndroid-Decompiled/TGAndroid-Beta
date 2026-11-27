package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eha extends AnimatorListenerAdapter {
    public final byte a;
    public final eja b;

    public eha(eja ejaVar, byte b) {
        this.a = b;
        this.b = ejaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                ejaVar.O0 = null;
                return;
            default:
                s7 s7Var = ejaVar.q0;
                ejaVar.i1 = null;
                boolean z = ejaVar.l1;
                zha[] zhaVarArr = ejaVar.n0;
                int i = 4;
                if (z) {
                    zhaVarArr[1].setVisibility(8);
                    if (s7Var != null && !ejaVar.q()) {
                        if (ejaVar.s0()) {
                            i = 8;
                        }
                        ejaVar.setSearchItemVisibility(i);
                        ejaVar.r0 = 0.0f;
                    } else {
                        ejaVar.r0 = ejaVar.V(0.0f);
                        ejaVar.K1(0.0f);
                    }
                    ejaVar.G1(false);
                    ejaVar.A0 = (byte) 0;
                } else {
                    zha zhaVar = zhaVarArr[0];
                    zhaVarArr[0] = zhaVarArr[1];
                    zhaVarArr[1] = zhaVar;
                    zhaVar.setVisibility(8);
                    if (s7Var != null && ejaVar.A0 == 2) {
                        if (ejaVar.s0()) {
                            i = 8;
                        }
                        ejaVar.setSearchItemVisibility(i);
                    }
                    ejaVar.A0 = (byte) 0;
                    ejaVar.g1(1.0f, zhaVarArr[0].F);
                    ejaVar.S0();
                    ejaVar.q1();
                }
                ejaVar.j1 = false;
                ejaVar.B1 = false;
                ejaVar.A1 = false;
                ejaVar.setHeaderEnabled(true);
                ejaVar.L0.setEnabled(true);
                return;
        }
    }
}
