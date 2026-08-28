package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ua extends AnimatorListenerAdapter {
    public final int f16171a;
    public final wb f16172b;

    public ua(wb wbVar, int i9) {
        this.f16171a = i9;
        this.f16172b = wbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16171a) {
            case 0:
                wb wbVar = this.f16172b;
                wbVar.f16267f2 = null;
                wbVar.f16300r.setTranslationY(0.0f);
                wbVar.f16300r.b(0.0f);
                return;
            case 1:
                wb wbVar2 = this.f16172b;
                wbVar2.f16287n.removeView(wbVar2.I0);
                wbVar2.I0 = null;
                wbVar2.f16279j2 = null;
                wbVar2.f16284l2 = null;
                b4 b4Var = wbVar2.Y0.H;
                boolean z10 = true;
                if (wbVar2.f16250b0 == 1) {
                    z10 = false;
                }
                b4Var.b(z10);
                return;
            default:
                wb wbVar3 = this.f16172b;
                eb ebVar = wbVar3.f16328y2;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) wbVar3.f16328y2.getParent()).removeView(wbVar3.f16328y2);
                    }
                    wbVar3.f16328y2 = null;
                }
                wbVar3.A2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
