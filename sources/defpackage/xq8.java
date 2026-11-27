package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class xq8 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final ProfileActivity c;

    public xq8(ProfileActivity profileActivity, boolean z, byte b) {
        this.a = b;
        this.c = profileActivity;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        vb5 vb5Var;
        byte b = this.a;
        boolean z = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.g4(z);
                profileActivity.Y.setClickable(true);
                if (z) {
                    sla slaVar = profileActivity.U0;
                    if (slaVar.G.getWidth() != 0 && !slaVar.e.isFocused()) {
                        slaVar.e.requestFocus();
                        hl.E3(slaVar.e);
                    }
                }
                profileActivity.O2(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z) {
                    profileActivity.Y4 = true;
                    profileActivity.j3();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i = ((e) profileActivity).classGuid;
                    hl.V2(parentActivity, i);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                if (profileActivity.g0 != null && (vb5Var = profileActivity.h0) != null) {
                    if (!z) {
                        vb5Var.setVisibility(4);
                    }
                    profileActivity.g0 = null;
                    return;
                }
                return;
        }
    }
}
