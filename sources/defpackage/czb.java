package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.ui.ActionBar.e;
public final class czb extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final tzb c;

    public czb(tzb tzbVar, boolean z, byte b) {
        this.a = b;
        this.c = tzbVar;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        int i;
        byte b = this.a;
        tzb tzbVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                tzbVar.W0(f);
                if (z) {
                    tzbVar.r0.setVisibility(8);
                    return;
                }
                Activity parentActivity = tzbVar.getParentActivity();
                i = ((e) tzbVar).classGuid;
                hl.g3(parentActivity, i);
                tzbVar.s0.setVisibility(8);
                tzbVar.U0(true);
                return;
            default:
                if (!z) {
                    tzbVar.p0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
