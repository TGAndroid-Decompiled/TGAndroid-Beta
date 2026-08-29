package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class fa extends AnimatorListenerAdapter {
    public final int f17680a;
    public final gb f17681b;

    public fa(gb gbVar, int i10) {
        this.f17680a = i10;
        this.f17681b = gbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17680a) {
            case 0:
                gb gbVar = this.f17681b;
                gbVar.f17757f2 = null;
                gbVar.f17790r.setTranslationY(0.0f);
                gbVar.f17790r.b(0.0f);
                return;
            case 1:
                gb gbVar2 = this.f17681b;
                gbVar2.f17777n.removeView(gbVar2.I0);
                gbVar2.I0 = null;
                gbVar2.f17769j2 = null;
                gbVar2.f17774l2 = null;
                w3 w3Var = gbVar2.Y0.H;
                boolean z10 = true;
                if (gbVar2.f17740b0 == 1) {
                    z10 = false;
                }
                w3Var.b(z10);
                return;
            default:
                gb gbVar3 = this.f17681b;
                pa paVar = gbVar3.f17818y2;
                if (paVar != null) {
                    if (paVar.getParent() != null) {
                        ((ViewGroup) gbVar3.f17818y2.getParent()).removeView(gbVar3.f17818y2);
                    }
                    gbVar3.f17818y2 = null;
                }
                gbVar3.A2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
