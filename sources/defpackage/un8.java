package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;
public final class un8 implements k7b {
    public final ProfileActivity a;

    public un8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override
    public final o7b b(long j) {
        float f;
        ProfileActivity profileActivity = this.a;
        if (j == profileActivity.a()) {
            profileActivity.f0.setRoundRadiusForExpand((int) gl.R1(profileActivity.l2(), 0.0f, profileActivity.l2));
            xm8 xm8Var = profileActivity.f0;
            boolean c0 = hc2.c0(profileActivity.F2);
            if (xm8Var != null && xm8Var.getRootView() != null) {
                float scaleX = ((View) xm8Var.getParent()).getScaleX();
                float f2 = xm8Var.getImageReceiver().N0 * scaleX;
                if (c0) {
                    f = 0.32f * f2;
                } else {
                    f = f2;
                }
                m7b m7bVar = new m7b(xm8Var, (byte) 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                xm8Var.getRootView().getLocationOnScreen(iArr);
                gl.p1(xm8Var, (ViewGroup) xm8Var.getRootView(), fArr);
                float f3 = (xm8Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f4 = (xm8Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                m7bVar.c.set(f3, f4, f3 + f2, f2 + f4);
                m7bVar.e = xm8Var.getImageReceiver();
                m7bVar.b = f;
                return m7bVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j, sma smaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.M2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.c2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new v36(profileActivity, (byte) 16));
        }
        gl.e3(smaVar, 30L);
    }
}
