package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;
public final class fr8 implements jbb {
    public final ProfileActivity a;

    public fr8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override
    public final nbb b(long j) {
        float f;
        ProfileActivity profileActivity = this.a;
        if (j == profileActivity.a()) {
            profileActivity.f0.setRoundRadiusForExpand((int) hl.R1(profileActivity.m2(), 0.0f, profileActivity.l2));
            iq8 iq8Var = profileActivity.f0;
            boolean c0 = xc2.c0(profileActivity.F2);
            if (iq8Var != null && iq8Var.getRootView() != null) {
                float scaleX = ((View) iq8Var.getParent()).getScaleX();
                float f2 = iq8Var.getImageReceiver().N0 * scaleX;
                if (c0) {
                    f = 0.32f * f2;
                } else {
                    f = f2;
                }
                lbb lbbVar = new lbb(iq8Var, (byte) 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                iq8Var.getRootView().getLocationOnScreen(iArr);
                hl.p1(iq8Var, (ViewGroup) iq8Var.getRootView(), fArr);
                float f3 = (iq8Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f4 = (iq8Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                lbbVar.c.set(f3, f4, f3 + f2, f2 + f4);
                lbbVar.e = iq8Var.getImageReceiver();
                lbbVar.b = f;
                return lbbVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j, pqa pqaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.N2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.d2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new y56(profileActivity, (byte) 15));
        }
        hl.d3(pqaVar, 30L);
    }
}
