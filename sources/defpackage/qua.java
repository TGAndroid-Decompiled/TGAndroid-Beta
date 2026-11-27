package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class qua extends AnimatorListenerAdapter {
    public final byte a;
    public final sua b;

    public qua(sua suaVar, byte b) {
        this.a = b;
        this.b = suaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sua suaVar = this.b;
        switch (b) {
            case 0:
                suaVar.k0 = false;
                return;
            case 1:
                suaVar.k0 = false;
                return;
            case 2:
                suaVar.P.setVisibility(4);
                return;
            case 3:
                suaVar.z0 = suaVar.y0;
                suaVar.d(suaVar.b0);
                return;
            default:
                suaVar.A0 = 1.0f;
                FrameLayout frameLayout = suaVar.b;
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(suaVar.A0);
                suaVar.invalidate();
                return;
        }
    }
}
