package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class mq8 extends AnimatorListenerAdapter {
    public final byte a;
    public final ProfileActivity b;

    public mq8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 1:
                profileActivity.U5 = null;
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        vy4 vy4Var;
        a aVar;
        int v0;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                vy4Var = ((e) profileActivity).glassEngine;
                vy4Var.g();
                aVar = ((e) profileActivity).actionBar;
                if (profileActivity.q2) {
                    v0 = 1090519039;
                } else if (profileActivity.n6 != null) {
                    v0 = 553648127;
                } else {
                    v0 = aob.v0(aob.f8, profileActivity.A0);
                }
                aVar.G(v0, false);
                iq8 iq8Var = profileActivity.f0;
                ImageReceiver imageReceiver = iq8Var.V;
                lm m = imageReceiver.m();
                if (m != null) {
                    m.w(iq8Var);
                }
                imageReceiver.f();
                mn5 mn5Var = iq8Var.a0;
                if (mn5Var != null) {
                    mn5Var.a();
                    iq8Var.a0 = null;
                }
                iq8Var.W = 0.0f;
                iq8Var.invalidate();
                profileActivity.I0 = false;
                profileActivity.i4(false);
                return;
            case 1:
                if (profileActivity.U5 != null && !profileActivity.X5) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    profileActivity.V5 = animatorSet;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(profileActivity, profileActivity.p5, 1.0f));
                    profileActivity.V5.setDuration(100L);
                    profileActivity.V5.addListener(new n88(this, (byte) 20));
                    profileActivity.V5.start();
                }
                profileActivity.i4(false);
                profileActivity.U5 = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                RectF rectF = ProfileActivity.Z6;
                profileActivity.O2(true);
                return;
            case 3:
                AnimatorSet animatorSet2 = profileActivity.w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    profileActivity.w = null;
                    return;
                }
                return;
            case 4:
                profileActivity.O1 = false;
                profileActivity.a.P0 = true;
                profileActivity.k2.removeListener(this);
                profileActivity.d1.setBackgroundColor(-16777216);
                profileActivity.Y.setVisibility(8);
                profileActivity.o0.setVisibility(0);
                profileActivity.o0.setAlpha(1.0f);
                return;
            case 5:
                profileActivity.k2.removeListener(this);
                profileActivity.o0.setVisibility(8);
                profileActivity.o0.setAlpha(1.0f);
                return;
            default:
                profileActivity.x0 = null;
                profileActivity.fragmentView.invalidate();
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 4:
                RectF rectF = ProfileActivity.Z6;
                ProfileActivity profileActivity = this.b;
                profileActivity.t3(false);
                profileActivity.o0.setAnimatedFileMaybe(profileActivity.f0.getImageReceiver().m());
                profileActivity.o0.L();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
