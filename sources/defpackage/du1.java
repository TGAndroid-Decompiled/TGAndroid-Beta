package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class du1 extends kea {
    public final r47 U2;
    public final ju1 V2;

    public du1(ju1 ju1Var, Activity activity, zu1 zu1Var, ArrayList arrayList, boolean z, boolean z2, vnb vnbVar, boolean z3, r47 r47Var) {
        super(activity, zu1Var, arrayList, null, null, z, null, null, false, false, z2, null, vnbVar);
        this.V2 = ju1Var;
        this.U2 = r47Var;
        this.V1 = z3;
    }

    @Override
    public final void H() {
        int i;
        zu1 zu1Var = this.V2.a;
        Activity parentActivity = zu1Var.getParentActivity();
        i = ((e) zu1Var).classGuid;
        hl.V2(parentActivity, i);
        super.H();
        if (zu1Var.a0.getVisibility() == 0) {
            zu1Var.fragmentView.requestLayout();
        }
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int i2;
        zu1 zu1Var = this.V2.a;
        int i3 = zu1.Ad;
        zu1Var.i6();
        if (zu1Var.N3 != null && z) {
            if (zh6Var.m() == 1) {
                if (((TLRPC.Dialog) zh6Var.n(0)).id == zu1Var.getUserConfig().e()) {
                    i2 = i;
                    if (d31.b0(zu1Var).h0(i2, ((TLRPC.Dialog) zh6Var.n(0)).id)) {
                        return;
                    }
                } else {
                    i2 = i;
                }
                zu1Var.N3.k(((TLRPC.Dialog) zh6Var.n(0)).id, 53, Integer.valueOf(i2), tL_forumTopic, null, null);
                return;
            }
            zu1Var.N3.k(0L, 53, Integer.valueOf(i), Integer.valueOf(zh6Var.m()), null, null);
        }
    }

    @Override
    public final void N0(View view) {
        lbb lbbVar;
        zu1 zu1Var = this.V2.a;
        m47 m47Var = null;
        if (view instanceof nea) {
            lbbVar = nbb.b((nea) view);
        } else {
            lbbVar = null;
        }
        ArrayList arrayList = new ArrayList();
        r47 r47Var = this.U2;
        if (r47Var.c1() != 0) {
            m47Var = (m47) zu1Var.P6.f(r47Var.c1());
        }
        if (m47Var != null) {
            arrayList.addAll(m47Var.d);
        } else {
            arrayList.add(r47Var);
        }
        sbb C = sbb.C(zu1Var.getParentActivity(), this.a);
        C.S = new yt1(this, C, view, (byte) 0);
        C.T(lbbVar, c8b.x(arrayList));
    }
}
