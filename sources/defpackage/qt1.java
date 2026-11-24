package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qt1 extends taa {
    public final k27 U2;
    public final wt1 V2;

    public qt1(wt1 wt1Var, Activity activity, mu1 mu1Var, ArrayList arrayList, boolean z, boolean z2, wjb wjbVar, boolean z3, k27 k27Var) {
        super(activity, mu1Var, arrayList, null, null, z, null, null, false, false, z2, null, wjbVar);
        this.V2 = wt1Var;
        this.U2 = k27Var;
        this.V1 = z3;
    }

    @Override
    public final void I() {
        int i;
        mu1 mu1Var = this.V2.a;
        Activity parentActivity = mu1Var.getParentActivity();
        i = ((d) mu1Var).classGuid;
        gl.W2(parentActivity, i);
        super.I();
        if (mu1Var.a0.getVisibility() == 0) {
            mu1Var.fragmentView.requestLayout();
        }
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int i2;
        mu1 mu1Var = this.V2.a;
        int i3 = mu1.md;
        mu1Var.Z5();
        if (mu1Var.N3 != null && z) {
            if (vf6Var.m() == 1) {
                if (((TLRPC.Dialog) vf6Var.n(0)).id == mu1Var.getUserConfig().e()) {
                    i2 = i;
                    if (u21.b0(mu1Var).h0(i2, ((TLRPC.Dialog) vf6Var.n(0)).id)) {
                        return;
                    }
                } else {
                    i2 = i;
                }
                mu1Var.N3.k(((TLRPC.Dialog) vf6Var.n(0)).id, 53, Integer.valueOf(i2), tL_forumTopic, null, null);
                return;
            }
            mu1Var.N3.k(0L, 53, Integer.valueOf(i), Integer.valueOf(vf6Var.m()), null, null);
        }
    }

    @Override
    public final void M0(View view) {
        m7b m7bVar;
        mu1 mu1Var = this.V2.a;
        f27 f27Var = null;
        if (view instanceof waa) {
            m7bVar = o7b.b((waa) view);
        } else {
            m7bVar = null;
        }
        ArrayList arrayList = new ArrayList();
        k27 k27Var = this.U2;
        if (k27Var.c1() != 0) {
            f27Var = (f27) mu1Var.P6.f(k27Var.c1());
        }
        if (f27Var != null) {
            arrayList.addAll(f27Var.d);
        } else {
            arrayList.add(k27Var);
        }
        t7b C = t7b.C(mu1Var.getParentActivity(), this.a);
        C.S = new lt1(this, C, view, (byte) 0);
        C.T(m7bVar, f4b.x(arrayList));
    }
}
