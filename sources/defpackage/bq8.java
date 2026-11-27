package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class bq8 extends x46 {
    public final ProfileActivity I;

    public bq8(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        ProfileActivity profileActivity = this.I;
        View m = profileActivity.c.m(0);
        if (m != null && !profileActivity.G0) {
            int top = m.getTop() - profileActivity.d2();
            boolean z = true;
            if (!profileActivity.p2) {
                if (top > i) {
                    if (!profileActivity.o0.Y0.isEmpty() && profileActivity.f0.getImageReceiver().E() && !hl.A1() && ((!profileActivity.o2 && !hl.O1()) || profileActivity.J0)) {
                        if (profileActivity.K2 != null) {
                            z = false;
                        }
                        profileActivity.p2 = z;
                    }
                    i = top;
                }
            } else if (i >= top) {
                profileActivity.p2 = false;
                i = top;
            } else if (profileActivity.a.getScrollState() == 1 && !profileActivity.q2) {
                i /= 2;
            }
        }
        if (profileActivity.O1 && !profileActivity.a.Q0) {
            return 0;
        }
        return super.n0(i, oh2Var, c89Var);
    }

    @Override
    public final boolean x0() {
        if (this.I.r0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void y0(c89 c89Var, int[] iArr) {
        super.y0(c89Var, iArr);
        int i = iArr[0];
        RectF rectF = ProfileActivity.Z6;
        iArr[0] = Math.max(i, this.I.c2());
    }
}
