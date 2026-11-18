package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;
public final class gb extends org.telegram.ui.Components.sa implements fs {
    public final FrameLayout T1;
    public z41 U1;
    public boolean V1;

    public gb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, i6Var);
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30225u0;
        ck0Var.setPadding(i7, 0, i7, 0);
        this.f39534o1.setOnItemClickListener(new bi.h8(this, 5));
        v4.k kVar = new v4.k();
        kVar.f59152m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        w0(i10);
        Q(i10);
        this.f39535p1.setTitle(gd.M0(2131744916, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1 = frameLayout;
        k80 k80Var = new k80(context, i6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        k80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, org.telegram.ui.ActionBar.n6.B6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        k80Var.setText(org.telegram.messenger.g0.T2(gd.M0(2131744732, null), new ca.r(this, 29)));
        k80Var.setGravity(17);
        k80Var.setMaxWidth(hi.m3.a(k80Var.getText(), k80Var.getPaint()));
        frameLayout.addView(k80Var, c8.ma.e(-2, -1, 17));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, frameLayout, i6Var);
        this.f30190b.addView(new uz(getContext()), c8.ma.c(-1.0f, -1));
        z41 z41Var = this.U1;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    @Override
    public final void L() {
        super.L();
        ks.f(this.f30187a).n(this, ks.f25221x3);
        ks.f(this.f30187a).n(this, ks.A3);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30187a, 0, true, new bi.b(this, 21), this.J0);
        this.U1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131744916, null);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if ((i7 == ks.f25221x3 || i7 == ks.A3) && (z41Var = this.U1) != null) {
            z41Var.O(true);
        }
    }

    @Override
    public final void show() {
        rj rjVar;
        long j3 = x8.y(this.f30187a, false).p().amount;
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q instanceof bn) {
            bn bnVar = (bn) Q;
            if (bnVar.V9() && (rjVar = bnVar.f45923a0) != null) {
                rjVar.U();
            }
        }
        super.show();
        ks.f(this.f30187a).c(this, ks.f25221x3);
        ks.f(this.f30187a).c(this, ks.A3);
    }
}
