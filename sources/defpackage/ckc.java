package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ckc extends AnimatorListenerAdapter {
    public final byte a;
    public final mkc b;

    public ckc(mkc mkcVar, byte b) {
        this.a = b;
        this.b = mkcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        nl nlVar;
        nl nlVar2;
        byte b = this.a;
        mkc mkcVar = this.b;
        switch (b) {
            case 0:
                mkcVar.i1 = null;
                mkcVar.f1 = 1.0f;
                mkcVar.Y0 = 0.0f;
                mkcVar.Z0 = 0.0f;
                mkcVar.s.invalidate();
                return;
            case 1:
                dlc.d().a.setAlpha(1.0f);
                hl.d3(new azb(this, (byte) 25), 200L);
                return;
            case 2:
                mkcVar.L0.e();
                mkcVar.Z.setCornerRadius(-1.0f);
                mkcVar.E0 = false;
                mkcVar.Z.c0 = false;
                mkcVar.q0 = mkcVar.p0;
                mkcVar.y();
                return;
            case 3:
                for (de0 de0Var : mkcVar.W) {
                    wl wlVar = de0Var.e;
                    if (wlVar != null && (nlVar = wlVar.k) != null) {
                        nlVar.u0 = true;
                        nlVar.w0(false);
                    }
                }
                return;
            case 4:
                mkcVar.s();
                for (de0 de0Var2 : mkcVar.W) {
                    wl wlVar2 = de0Var2.e;
                    if (wlVar2 != null && (nlVar2 = wlVar2.k) != null) {
                        nlVar2.u0 = false;
                        nlVar2.x0();
                    }
                }
                mkcVar.S.setVisibility(8);
                return;
            case 5:
                mkcVar.F.setText(ob6.M0(2131743142, null));
                mkcVar.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (mkcVar.a0.getTag() == null) {
                    mkcVar.a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                mkcVar.Z.setTranslationX(0.0f);
                mkcVar.Z.setTranslationY(0.0f);
                mkcVar.Z.setScaleY(1.0f);
                mkcVar.Z.setScaleX(1.0f);
                mkcVar.Z.setVisibility(8);
                return;
            case 8:
                mkcVar.E.setVisibility(8);
                return;
            default:
                mkcVar.f0.setVisibility(8);
                return;
        }
    }
}
