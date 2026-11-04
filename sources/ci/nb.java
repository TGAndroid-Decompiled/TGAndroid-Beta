package ci;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
public final class nb extends org.telegram.ui.Components.ma implements cs {
    public final FrameLayout Q1;
    public f41 R1;
    public boolean S1;

    public nb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        this.f36102l1.setOnItemClickListener(new ai.j6(this, 5));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        w0(i10);
        P(i10);
        this.m1.setTitle(bd.M0(2131745161, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q1 = frameLayout;
        s70 s70Var = new s70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        s70Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.B6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var.setText(org.telegram.messenger.g0.U2(bd.M0(2131744977, null), new d1(this, 14)));
        s70Var.setGravity(17);
        s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()));
        frameLayout.addView(s70Var, mf.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout, e6Var);
        this.f28586b.addView(new gz(getContext()), mf.c(-1.0f, -1));
        f41 f41Var = this.R1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    @Override
    public final void K() {
        super.K();
        hs.f(this.f28583a).n(this, hs.f23322v3);
        hs.f(this.f28583a).n(this, hs.f23343y3);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new ai.c(this, 21), this.J0);
        this.R1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131745161, null);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if ((i3 == hs.f23322v3 || i3 == hs.f23343y3) && (f41Var = this.R1) != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final void show() {
        mj mjVar;
        long j10 = e9.y(this.f28583a, false).p().amount;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            wm wmVar = (wm) Q;
            if (wmVar.T9() && (mjVar = wmVar.f51237a0) != null) {
                mjVar.L();
            }
        }
        super.show();
        hs.f(this.f28583a).c(this, hs.f23322v3);
        hs.f(this.f28583a).c(this, hs.f23343y3);
    }
}
