package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class mp8 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final ProfileActivity c;

    public mp8(ProfileActivity profileActivity, boolean z, byte b) {
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
        sb5 sb5Var;
        byte b = this.a;
        boolean z = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.e7;
                profileActivity.j4(z);
                profileActivity.Y.setClickable(true);
                if (z) {
                    zja zjaVar = profileActivity.U0;
                    if (zjaVar.G.getWidth() != 0 && !zjaVar.e.isFocused()) {
                        zjaVar.e.requestFocus();
                        gm.E3(zjaVar.e);
                    }
                }
                profileActivity.Q2(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z) {
                    profileActivity.d5 = true;
                    profileActivity.m3();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i = ((d) profileActivity).classGuid;
                    gm.V2(parentActivity, i);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                if (profileActivity.g0 != null && (sb5Var = profileActivity.h0) != null) {
                    if (!z) {
                        sb5Var.setVisibility(4);
                    }
                    profileActivity.g0 = null;
                    return;
                }
                return;
        }
    }
}
