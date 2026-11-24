package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class pqa extends AnimatorListenerAdapter {
    public final byte a;
    public final rqa b;

    public pqa(rqa rqaVar, byte b) {
        this.a = b;
        this.b = rqaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rqa rqaVar = this.b;
        switch (b) {
            case 0:
                rqaVar.k0 = false;
                return;
            case 1:
                rqaVar.k0 = false;
                return;
            case 2:
                rqaVar.P.setVisibility(4);
                return;
            case 3:
                rqaVar.z0 = rqaVar.y0;
                rqaVar.d(rqaVar.b0);
                return;
            default:
                rqaVar.A0 = 1.0f;
                FrameLayout frameLayout = rqaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(rqaVar.A0);
                rqaVar.invalidate();
                return;
        }
    }
}
