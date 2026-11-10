package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;
public final class uc extends org.telegram.ui.Components.ma implements ls {
    public final FrameLayout S1;
    public m41 T1;
    public boolean U1;

    public uc(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        pj0 pj0Var = this.n1;
        int i7 = this.f28705t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.setOnItemClickListener(new ai.k(this, 4));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        w0(i10);
        P(i10);
        this.f35902o1.setTitle(org.telegram.messenger.id.M0(2131745151, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        w70 w70Var = new w70(context, h6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, org.telegram.ui.ActionBar.m6.B6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.Uc, h6Var);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744967, null), new ab(this, 4)));
        w70Var.setGravity(17);
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        frameLayout.addView(w70Var, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, frameLayout, h6Var);
        this.f28672b.addView(new jz(getContext()), c8.ha.c(-1.0f, -1));
        m41 m41Var = this.T1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28669a).n(this, qs.f25097v3);
        qs.f(this.f28669a).n(this, qs.f25118y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new ai.e(this, 11), this.I0);
        this.T1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745151, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if ((i7 == qs.f25097v3 || i7 == qs.f25118y3) && (m41Var = this.T1) != null) {
            m41Var.O(true);
        }
    }

    @Override
    public final void show() {
        sj sjVar;
        long j3 = ea.y(this.f28669a, false).p().amount;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof cn) {
            cn cnVar = (cn) Q;
            if (cnVar.U9() && (sjVar = cnVar.Z) != null) {
                sjVar.L();
            }
        }
        super.show();
        qs.f(this.f28669a).c(this, qs.f25097v3);
        qs.f(this.f28669a).c(this, qs.f25118y3);
    }
}
