package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class bxa extends AnimatorListenerAdapter {
    public final byte a;
    public final dxa b;

    public bxa(dxa dxaVar, byte b) {
        this.a = b;
        this.b = dxaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dxa dxaVar = this.b;
        switch (b) {
            case 0:
                nf0 nf0Var = dxaVar.b;
                nf0Var.setVisibility(4);
                nf0Var.K = false;
                nf0 nf0Var2 = dxaVar.c;
                nf0Var2.K = true;
                nf0Var.z0 = (byte) 0;
                nf0Var2.z0 = (byte) 0;
                Window window = dxaVar.a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                nf0 nf0Var3 = dxaVar.c;
                nf0Var3.setVisibility(4);
                nf0 nf0Var4 = dxaVar.b;
                nf0Var4.z0 = (byte) 0;
                nf0Var3.z0 = (byte) 0;
                nf0Var4.K = true;
                nf0Var3.K = false;
                if (!(nf0Var4 instanceof mma)) {
                    nf0Var4.v0 = true;
                    nf0Var4.x((nf0Var4.H0 * nf0Var4.h0.k) - nf0.l1);
                    nf0Var4.c(true);
                    nf0Var4.invalidate();
                } else {
                    nf0Var4.v0 = false;
                    nf0Var4.d();
                }
                Window window2 = dxaVar.a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                dxaVar.b.z0 = (byte) 0;
                dxaVar.e.setVisibility(8);
                return;
        }
    }
}
