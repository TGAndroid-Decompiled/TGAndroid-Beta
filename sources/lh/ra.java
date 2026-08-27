package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

public final class ra extends AnimatorListenerAdapter {

    public final int f16678a;

    public final sb f16679b;

    public ra(sb sbVar, int i10) {
        this.f16678a = i10;
        this.f16679b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16678a) {
            case 0:
                sb sbVar = this.f16679b;
                sbVar.f16763f2 = null;
                sbVar.f16796r.setTranslationY(0.0f);
                sbVar.f16796r.b(0.0f);
                break;
            case 1:
                sb sbVar2 = this.f16679b;
                sbVar2.f16783n.removeView(sbVar2.I0);
                sbVar2.I0 = null;
                sbVar2.f16775j2 = null;
                sbVar2.f16780l2 = null;
                sbVar2.Y0.H.b(sbVar2.f16746b0 != 1);
                break;
            default:
                sb sbVar3 = this.f16679b;
                bb bbVar = sbVar3.f16824y2;
                if (bbVar != null) {
                    if (bbVar.getParent() != null) {
                        ((ViewGroup) sbVar3.f16824y2.getParent()).removeView(sbVar3.f16824y2);
                    }
                    sbVar3.f16824y2 = null;
                }
                sbVar3.A2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
