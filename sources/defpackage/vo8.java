package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;
public final class vo8 extends k69 {
    public final byte a;
    public final ProfileActivity b;

    public vo8(ProfileActivity profileActivity, byte b) {
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
                    gm.t1(profileActivity.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 1) {
                    gm.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.D3(m, 0.0f);
                }
                zja zjaVar = profileActivity.U0;
                if (zjaVar != null) {
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    profileActivity.z1 = z;
                    if (z || profileActivity.q2) {
                        z2 = false;
                    }
                    zjaVar.setEnabled(z2);
                }
                wp8 wp8Var = profileActivity.O;
                boolean z3 = profileActivity.a.J1;
                wp8Var.getClass();
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                hg5 hg5Var = profileActivity.X;
                boolean z = true;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                profileActivity.H1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.D4 - 8) {
                    profileActivity.b2(false);
                }
                wp8 wp8Var = profileActivity.O;
                if (wp8Var.getY() > 0.0f) {
                    z = false;
                }
                wp8Var.setPinnedToTop(z);
                profileActivity.M3();
                return;
            default:
                return;
        }
    }
}
