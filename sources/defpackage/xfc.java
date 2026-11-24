package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xfc extends AnimatorListenerAdapter {
    public final byte a;
    public final hgc b;

    public xfc(hgc hgcVar, byte b) {
        this.a = b;
        this.b = hgcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ml mlVar;
        ml mlVar2;
        byte b = this.a;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                hgcVar.i1 = null;
                hgcVar.f1 = 1.0f;
                hgcVar.Y0 = 0.0f;
                hgcVar.Z0 = 0.0f;
                hgcVar.s.invalidate();
                return;
            case 1:
                xgc.d().a.setAlpha(1.0f);
                gl.d3(new kbc(this, (byte) 8), 200L);
                return;
            case 2:
                hgcVar.L0.e();
                hgcVar.Z.setCornerRadius(-1.0f);
                hgcVar.E0 = false;
                hgcVar.Z.c0 = false;
                hgcVar.q0 = hgcVar.p0;
                hgcVar.y();
                return;
            case 3:
                for (be0 be0Var : hgcVar.W) {
                    vl vlVar = be0Var.e;
                    if (vlVar != null && (mlVar = vlVar.k) != null) {
                        mlVar.u0 = true;
                        mlVar.w0(false);
                    }
                }
                return;
            case 4:
                hgcVar.s();
                for (be0 be0Var2 : hgcVar.W) {
                    vl vlVar2 = be0Var2.e;
                    if (vlVar2 != null && (mlVar2 = vlVar2.k) != null) {
                        mlVar2.u0 = false;
                        mlVar2.x0();
                    }
                }
                hgcVar.S.setVisibility(8);
                return;
            case 5:
                hgcVar.F.setText(k96.M0(2131743248, null));
                hgcVar.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (hgcVar.a0.getTag() == null) {
                    hgcVar.a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                hgcVar.Z.setTranslationX(0.0f);
                hgcVar.Z.setTranslationY(0.0f);
                hgcVar.Z.setScaleY(1.0f);
                hgcVar.Z.setScaleX(1.0f);
                hgcVar.Z.setVisibility(8);
                return;
            case 8:
                hgcVar.E.setVisibility(8);
                return;
            default:
                hgcVar.f0.setVisibility(8);
                return;
        }
    }
}
