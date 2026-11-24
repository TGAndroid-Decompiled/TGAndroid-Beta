package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yhc extends AnimatorListenerAdapter {
    public final byte a;
    public final iic b;

    public yhc(iic iicVar, byte b) {
        this.a = b;
        this.b = iicVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        mm mmVar;
        mm mmVar2;
        byte b = this.a;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                iicVar.i1 = null;
                iicVar.f1 = 1.0f;
                iicVar.Y0 = 0.0f;
                iicVar.Z0 = 0.0f;
                iicVar.s.invalidate();
                return;
            case 1:
                yic.d().a.setAlpha(1.0f);
                gm.d3(new f8c(this, (byte) 16), 200L);
                return;
            case 2:
                iicVar.L0.e();
                iicVar.Z.setCornerRadius(-1.0f);
                iicVar.E0 = false;
                iicVar.Z.c0 = false;
                iicVar.q0 = iicVar.p0;
                iicVar.y();
                return;
            case 3:
                for (bf0 bf0Var : iicVar.W) {
                    vm vmVar = bf0Var.e;
                    if (vmVar != null && (mmVar = vmVar.k) != null) {
                        mmVar.u0 = true;
                        mmVar.w0(false);
                    }
                }
                return;
            case 4:
                iicVar.s();
                for (bf0 bf0Var2 : iicVar.W) {
                    vm vmVar2 = bf0Var2.e;
                    if (vmVar2 != null && (mmVar2 = vmVar2.k) != null) {
                        mmVar2.u0 = false;
                        mmVar2.x0();
                    }
                }
                iicVar.S.setVisibility(8);
                return;
            case 5:
                iicVar.F.setText(jb6.M0(2131743174, null));
                iicVar.F.animate().alpha(1.0f).setDuration(70L).setListener(null).start();
                return;
            case 6:
                if (iicVar.a0.getTag() == null) {
                    iicVar.a0.setVisibility(8);
                    return;
                }
                return;
            case 7:
                iicVar.Z.setTranslationX(0.0f);
                iicVar.Z.setTranslationY(0.0f);
                iicVar.Z.setScaleY(1.0f);
                iicVar.Z.setScaleX(1.0f);
                iicVar.Z.setVisibility(8);
                return;
            case 8:
                iicVar.E.setVisibility(8);
                return;
            default:
                iicVar.f0.setVisibility(8);
                return;
        }
    }
}
