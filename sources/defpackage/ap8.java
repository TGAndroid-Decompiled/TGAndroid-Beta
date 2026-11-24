package defpackage;

import android.content.Context;
import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
public final class ap8 extends jm {
    public final ProfileActivity V0;

    public ap8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f) {
        super.setAlpha(f);
        RectF rectF = ProfileActivity.e7;
        this.V0.J1();
    }

    @Override
    public final void setTextColor(int i) {
        int p1;
        ProfileActivity profileActivity = this.V0;
        profileActivity.P5 = i;
        int f = on2.f(profileActivity.L5, i, cmb.v0(cmb.x6, profileActivity.A0));
        super.setTextColor(f);
        vq8 vq8Var = profileActivity.K6;
        if (vq8Var != null && vq8Var.c != (p1 = cmb.p1(1.4f, cmb.a(-0.02f, 0.15f, f)))) {
            vq8Var.c = p1;
            vq8Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.V0;
        profileActivity.m2();
        ita itaVar = profileActivity.T;
        if (itaVar != null) {
            itaVar.setTranslationX(f - profileActivity.m2());
        }
    }

    @Override
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            gm.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        ita itaVar = profileActivity.T;
        if (itaVar != null) {
            itaVar.setTranslationY(f - gm.L(5.0f));
        }
    }
}
