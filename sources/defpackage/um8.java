package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;
public final class um8 extends i49 {
    public final byte a;
    public final ProfileActivity b;

    public um8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        View m;
        byte b = this.a;
        boolean z2 = true;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gl.t1(profileActivity.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 1) {
                    gl.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.z3(m, 0.0f);
                }
                xha xhaVar = profileActivity.U0;
                if (xhaVar != null) {
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    profileActivity.z1 = z;
                    if (z || profileActivity.q2) {
                        z2 = false;
                    }
                    xhaVar.setEnabled(z2);
                }
                vn8 vn8Var = profileActivity.O;
                boolean z3 = profileActivity.a.J1;
                vn8Var.getClass();
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                je5 je5Var = profileActivity.X;
                boolean z = true;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                profileActivity.F1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.y4 - 8) {
                    profileActivity.Z1(false);
                }
                vn8 vn8Var = profileActivity.O;
                if (vn8Var.getY() > 0.0f) {
                    z = false;
                }
                vn8Var.setPinnedToTop(z);
                profileActivity.I3();
                return;
            default:
                return;
        }
    }
}
