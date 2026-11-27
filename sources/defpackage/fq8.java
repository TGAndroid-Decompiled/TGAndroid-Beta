package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ProfileActivity;
public final class fq8 extends v79 {
    public final byte a;
    public final ProfileActivity b;

    public fq8(ProfileActivity profileActivity, byte b) {
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
                    hl.t1(profileActivity.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                if (i == 1) {
                    hl.t1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i != 2) {
                    profileActivity.G0 = false;
                }
                if (i == 0 && !profileActivity.G1 && (m = profileActivity.c.m(0)) != null) {
                    profileActivity.A3(m, 0.0f);
                }
                sla slaVar = profileActivity.U0;
                if (slaVar != null) {
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    profileActivity.z1 = z;
                    if (z || profileActivity.q2) {
                        z2 = false;
                    }
                    slaVar.setEnabled(z2);
                }
                gr8 gr8Var = profileActivity.O;
                boolean z3 = profileActivity.a.J1;
                gr8Var.getClass();
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        switch (this.a) {
            case 1:
                ProfileActivity profileActivity = this.b;
                kg5 kg5Var = profileActivity.X;
                boolean z = true;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                profileActivity.G1();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.c.M0() > profileActivity.y4 - 8) {
                    profileActivity.a2(false);
                }
                gr8 gr8Var = profileActivity.O;
                if (gr8Var.getY() > 0.0f) {
                    z = false;
                }
                gr8Var.setPinnedToTop(z);
                profileActivity.J3();
                return;
            default:
                return;
        }
    }
}
