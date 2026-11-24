package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class mn8 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final ProfileActivity c;

    public mn8(ProfileActivity profileActivity, boolean z, byte b) {
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
        u95 u95Var;
        byte b = this.a;
        boolean z = this.b;
        ProfileActivity profileActivity = this.c;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.f4(z);
                profileActivity.Y.setClickable(true);
                if (z) {
                    xha xhaVar = profileActivity.U0;
                    if (xhaVar.G.getWidth() != 0 && !xhaVar.e.isFocused()) {
                        xhaVar.e.requestFocus();
                        gl.F3(xhaVar.e);
                    }
                }
                profileActivity.N2(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z) {
                    profileActivity.Y4 = true;
                    profileActivity.i3();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i = ((d) profileActivity).classGuid;
                    gl.W2(parentActivity, i);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                if (profileActivity.g0 != null && (u95Var = profileActivity.h0) != null) {
                    if (!z) {
                        u95Var.setVisibility(4);
                    }
                    profileActivity.g0 = null;
                    return;
                }
                return;
        }
    }
}
