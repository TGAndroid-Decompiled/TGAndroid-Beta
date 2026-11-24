package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.d;
public final class bxb extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final sxb c;

    public bxb(sxb sxbVar, boolean z, byte b) {
        this.a = b;
        this.c = sxbVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        int i;
        byte b = this.a;
        sxb sxbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                sxbVar.W0(f);
                if (z) {
                    sxbVar.r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = sxbVar.getParentActivity();
                i = ((d) sxbVar).classGuid;
                gm.g3(parentActivity, i);
                sxbVar.s0.setVisibility(8);
                sxbVar.U0(true);
                return;
            default:
                if (!z) {
                    sxbVar.p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
