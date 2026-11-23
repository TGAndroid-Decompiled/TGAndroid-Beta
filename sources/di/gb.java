package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class gb extends org.telegram.ui.Components.sa implements gs {
    public final FrameLayout T1;
    public c51 U1;
    public boolean V1;

    public gb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        ek0 ek0Var = this.f39532o1;
        int i7 = this.f30211u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.f39532o1.setOnItemClickListener(new bi.k8(this, 5));
        v4.k kVar = new v4.k();
        kVar.f59194m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39532o1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        w0(i10);
        Q(i10);
        this.f39533p1.setTitle(hd.N0(2131744908, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        m80 m80Var = new m80(context, h6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        m80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.B6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.Xc, h6Var);
        m80Var.setText(org.telegram.messenger.g0.T2(hd.N0(2131744724, null), new ca.r(this, 29)));
        m80Var.setGravity(17);
        m80Var.setMaxWidth(hi.l3.a(m80Var.getText(), m80Var.getPaint()));
        frameLayout.addView(m80Var, c8.ma.e(-2, -1, 17));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, frameLayout, h6Var);
        this.f30176b.addView(new wz(getContext()), c8.ma.c(-1.0f, -1));
        c51 c51Var = this.U1;
        if (c51Var != null) {
            c51Var.O(false);
        }
    }

    @Override
    public final void L() {
        super.L();
        ls.f(this.f30173a).n(this, ls.f25415x3);
        ls.f(this.f30173a).n(this, ls.A3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39532o1, getContext(), this.f30173a, 0, true, new bi.b(this, 21), this.J0);
        this.U1 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131744908, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if ((i7 == ls.f25415x3 || i7 == ls.A3) && (c51Var = this.U1) != null) {
            c51Var.O(true);
        }
    }

    @Override
    public final void show() {
        rj rjVar;
        long j3 = y8.y(this.f30173a, false).p().amount;
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.f45950a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ls.f(this.f30173a).c(this, ls.f25415x3);
        ls.f(this.f30173a).c(this, ls.A3);
    }
}
