package defpackage;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class cv1 extends tca {
    public final k47 U2;
    public final iv1 V2;

    public cv1(iv1 iv1Var, Activity activity, yv1 yv1Var, ArrayList arrayList, boolean z, boolean z2, ylb ylbVar, boolean z3, k47 k47Var) {
        super(activity, yv1Var, arrayList, null, null, z, null, null, false, false, z2, null, ylbVar);
        this.V2 = iv1Var;
        this.U2 = k47Var;
        this.V1 = z3;
    }

    @Override
    public final void H() {
        int i;
        yv1 yv1Var = this.V2.a;
        Activity parentActivity = yv1Var.getParentActivity();
        i = ((d) yv1Var).classGuid;
        gm.V2(parentActivity, i);
        super.H();
        if (yv1Var.a0.getVisibility() == 0) {
            yv1Var.fragmentView.requestLayout();
        }
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        int i2;
        yv1 yv1Var = this.V2.a;
        int i3 = yv1.xd;
        yv1Var.i6();
        if (yv1Var.N3 != null && z) {
            if (vh6Var.m() == 1) {
                if (((TLRPC.Dialog) vh6Var.n(0)).id == yv1Var.getUserConfig().e()) {
                    i2 = i;
                    if (c41.b0(yv1Var).h0(i2, ((TLRPC.Dialog) vh6Var.n(0)).id)) {
                        return;
                    }
                } else {
                    i2 = i;
                }
                yv1Var.N3.k(((TLRPC.Dialog) vh6Var.n(0)).id, 53, Integer.valueOf(i2), tL_forumTopic, null, null);
                return;
            }
            yv1Var.N3.k(0L, 53, Integer.valueOf(i), Integer.valueOf(vh6Var.m()), null, null);
        }
    }

    @Override
    public final void M0(View view) {
        o9b o9bVar;
        yv1 yv1Var = this.V2.a;
        f47 f47Var = null;
        if (view instanceof wca) {
            o9bVar = q9b.b((wca) view);
        } else {
            o9bVar = null;
        }
        ArrayList arrayList = new ArrayList();
        k47 k47Var = this.U2;
        if (k47Var.c1() != 0) {
            f47Var = (f47) yv1Var.P6.f(k47Var.c1());
        }
        if (f47Var != null) {
            arrayList.addAll(f47Var.d);
        } else {
            arrayList.add(k47Var);
        }
        v9b C = v9b.C(yv1Var.getParentActivity(), this.a);
        C.S = new xu1(this, C, view, (byte) 0);
        C.T(o9bVar, g6b.x(arrayList));
    }
}
