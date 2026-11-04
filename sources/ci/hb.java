package ci;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.mj;
import org.telegram.ui.p80;
import org.telegram.ui.wm;
public final class hb extends org.telegram.ui.Components.ma implements cs {
    public final gb Q1;
    public final FrameLayout R1;
    public final TLRPC.User S1;
    public final xg.x0 T1;
    public f41 U1;
    public boolean V1;

    public hb(Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, xg.x0 x0Var) {
        super(context, null, false, false, e6Var);
        this.S1 = user;
        this.T1 = x0Var;
        this.f36108s1 = 0.2f;
        hs.f(this.f28583a).c(this, hs.f23329w3);
        hs.f(this.f28583a).c(this, hs.f23343y3);
        N();
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        this.f36102l1.setOnItemClickListener(new ai.j6(this, 3));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        w0(org.telegram.ui.ActionBar.k6.f27971i5);
        gb gbVar = new gb(0, context, e6Var);
        this.Q1 = gbVar;
        ((TextView) gbVar.f5199c).setText(bd.M0(2131749615, null));
        s70 s70Var = (s70) gbVar.d;
        s70Var.setText(TextUtils.concat(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749617, l10.k(user))), " ", org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131749616, null).replace(' ', (char) 160), new Runnable(this) {
            public final hb f5139b;

            {
                this.f5139b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.d2 d2Var;
                int i10 = r2;
                hb hbVar = this.f5139b;
                switch (i10) {
                    case 0:
                        gu0 gu0Var = new gu0(hbVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(hbVar.f28601g1) && (d2Var = hbVar.f28601g1) != null) {
                            gu0Var.a0(d2Var);
                        }
                        gu0Var.show();
                        return;
                    default:
                        sf.c.t(hbVar.getContext(), bd.M0(2131744976, null));
                        return;
                }
            }
        }), true)));
        s70Var.setMaxWidth(gi.l3.a(s70Var.getText(), s70Var.getPaint()) + 1);
        this.m1.setTitle(O0());
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.r(user);
        ((org.telegram.ui.Components.k9) gbVar.f5198b).e(user, u8Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        s70 s70Var2 = new s70(context, e6Var);
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f));
        s70Var2.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.B6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, org.telegram.ui.ActionBar.k6.Uc, e6Var);
        s70Var2.setText(org.telegram.messenger.g0.U2(bd.M0(2131744977, null), new Runnable(this) {
            public final hb f5139b;

            {
                this.f5139b = this;
            }

            @Override
            public final void run() {
                org.telegram.ui.ActionBar.d2 d2Var;
                int i10 = r2;
                hb hbVar = this.f5139b;
                switch (i10) {
                    case 0:
                        gu0 gu0Var = new gu0(hbVar.getContext());
                        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(hbVar.f28601g1) && (d2Var = hbVar.f28601g1) != null) {
                            gu0Var.a0(d2Var);
                        }
                        gu0Var.show();
                        return;
                    default:
                        sf.c.t(hbVar.getContext(), bd.M0(2131744976, null));
                        return;
                }
            }
        }));
        s70Var2.setGravity(17);
        s70Var2.setMaxWidth(gi.l3.a(s70Var2.getText(), s70Var2.getPaint()));
        frameLayout.addView(s70Var2, mf.e(-2, -1, 17));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, frameLayout, e6Var);
        this.f28586b.addView(new gz(getContext()), mf.c(-1.0f, -1));
        f41 f41Var = this.U1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    public static void d1(hb hbVar, r31 r31Var, long j10, Boolean bool, String str) {
        xg.x0 x0Var;
        if (hbVar.getContext() != null) {
            if ((bool.booleanValue() || str != null) && (x0Var = hbVar.T1) != null) {
                x0Var.run();
            }
            super.dismiss();
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            p80 p80Var = LaunchActivity.K1.f41328y0;
            if (T != null) {
                if (bool.booleanValue()) {
                    org.telegram.ui.Components.ac L = org.telegram.ui.Components.fc.a0(T).L(2131624225, bd.M0(2131745110, null), org.telegram.messenger.g0.X2(bd.G((int) r31Var.B, "StarsGiftSentPopupInfo", l10.k(hbVar.S1))), bd.M0(2131743562, null), new u3(j10, 1));
                    L.f31792j = 5000;
                    L.k(true);
                    if (p80Var != null) {
                        p80Var.c(true);
                    }
                    e9.y(hbVar.f28583a, false).S(true);
                } else if (str != null) {
                    org.telegram.ui.Components.fc.a0(T).Q(2131624011, 36, bd.a0(null, null, 2131743888, str)).j();
                }
            }
        }
    }

    @Override
    public final void K() {
        super.K();
        hs.f(this.f28583a).n(this, hs.f23329w3);
        hs.f(this.f28583a).n(this, hs.f23343y3);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new ai.c(this, 19), this.J0);
        this.U1 = f41Var;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        gb gbVar = this.Q1;
        if (gbVar == null) {
            return null;
        }
        return ((TextView) gbVar.f5199c).getText();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if ((i3 == hs.f23329w3 || i3 == hs.f23343y3) && (f41Var = this.U1) != null) {
            f41Var.O(true);
        }
    }

    @Override
    public final void show() {
        mj mjVar;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q instanceof wm) {
            wm wmVar = (wm) Q;
            if (wmVar.T9() && (mjVar = wmVar.f51237a0) != null) {
                mjVar.L();
            }
        }
        super.show();
    }
}
