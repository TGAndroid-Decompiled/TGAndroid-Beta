package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ProfileActivity;
public final class vp8 implements m9b {
    public final ProfileActivity a;

    public vp8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override
    public final q9b b(long j) {
        float f;
        ProfileActivity profileActivity = this.a;
        if (j == profileActivity.a()) {
            profileActivity.f0.setRoundRadiusForExpand((int) gm.R1(profileActivity.n2(), 0.0f, profileActivity.l2));
            yo8 yo8Var = profileActivity.f0;
            boolean c0 = sd2.c0(profileActivity.F2);
            if (yo8Var != null && yo8Var.getRootView() != null) {
                float scaleX = ((View) yo8Var.getParent()).getScaleX();
                float f2 = yo8Var.getImageReceiver().N0 * scaleX;
                if (c0) {
                    f = 0.32f * f2;
                } else {
                    f = f2;
                }
                o9b o9bVar = new o9b(yo8Var, (byte) 0);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                yo8Var.getRootView().getLocationOnScreen(iArr);
                gm.p1(yo8Var, (ViewGroup) yo8Var.getRootView(), fArr);
                float f3 = (yo8Var.getImageReceiver().L0 * scaleX) + iArr[0] + fArr[0];
                float f4 = (yo8Var.getImageReceiver().M0 * scaleX) + iArr[1] + fArr[1];
                o9bVar.c.set(f3, f4, f3 + f2, f2 + f4);
                o9bVar.e = yo8Var.getImageReceiver();
                o9bVar.b = f;
                return o9bVar;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void c(long j, toa toaVar) {
        ProfileActivity profileActivity = this.a;
        profileActivity.f0.setHasStories(profileActivity.P2());
        if (j == profileActivity.a() && profileActivity.p2 && profileActivity.l2 > 0.0f) {
            profileActivity.c.g1(0, profileActivity.e2() - profileActivity.a.getPaddingTop());
            profileActivity.a.post(new v56(profileActivity, (byte) 17));
        }
        gm.d3(toaVar, 30L);
    }
}
