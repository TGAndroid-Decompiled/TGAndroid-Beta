package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;
public final class uc extends org.telegram.ui.Components.na implements ls {
    public final FrameLayout P1;
    public l41 Q1;
    public boolean R1;

    public uc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        pj0 pj0Var = this.f36277k1;
        int i7 = this.f28649t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.f36277k1.setOnItemClickListener(new ai.k(this, 4));
        v4.k kVar = new v4.k();
        kVar.f57071m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36277k1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        w0(i10);
        P(i10);
        this.l1.setTitle(org.telegram.messenger.id.M0(2131745154, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P1 = frameLayout;
        w70 w70Var = new w70(context, f6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        w70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.B6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.Uc, f6Var);
        w70Var.setText(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131744970, null), new ab(this, 4)));
        w70Var.setGravity(17);
        w70Var.setMaxWidth(fi.m3.a(w70Var.getText(), w70Var.getPaint()));
        frameLayout.addView(w70Var, c8.ha.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27925h5, frameLayout, f6Var);
        this.f28619b.addView(new kz(getContext()), c8.ha.c(-1.0f, -1));
        l41 l41Var = this.Q1;
        if (l41Var != null) {
            l41Var.O(false);
        }
    }

    @Override
    public final void K() {
        super.K();
        qs.f(this.f28616a).n(this, qs.f25093v3);
        qs.f(this.f28616a).n(this, qs.f25114y3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.f36277k1, getContext(), this.f28616a, 0, true, new ai.e(this, 11), this.I0);
        this.Q1 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return org.telegram.messenger.id.M0(2131745154, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if ((i7 == qs.f25093v3 || i7 == qs.f25114y3) && (l41Var = this.Q1) != null) {
            l41Var.O(true);
        }
    }

    @Override
    public final void show() {
        qj qjVar;
        long j3 = ea.y(this.f28616a, false).p().amount;
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q instanceof an) {
            an anVar = (an) Q;
            if (anVar.T9() && (qjVar = anVar.Z) != null) {
                qjVar.L();
            }
        }
        super.show();
        qs.f(this.f28616a).c(this, qs.f25093v3);
        qs.f(this.f28616a).c(this, qs.f25114y3);
    }
}
