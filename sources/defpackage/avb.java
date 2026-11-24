package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.d;
public final class avb extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final qvb c;

    public avb(qvb qvbVar, boolean z, byte b) {
        this.a = b;
        this.c = qvbVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        int i;
        byte b = this.a;
        qvb qvbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                qvbVar.V0(f);
                if (z) {
                    qvbVar.r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = qvbVar.getParentActivity();
                i = ((d) qvbVar).classGuid;
                gl.h3(parentActivity, i);
                qvbVar.s0.setVisibility(8);
                qvbVar.T0(true);
                return;
            default:
                if (!z) {
                    qvbVar.p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
