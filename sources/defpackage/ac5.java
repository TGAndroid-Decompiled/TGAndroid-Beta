package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
public final class ac5 extends vi1 {
    public oi1 A0;
    public float B0;
    public boolean C0;

    public ac5(long j) {
        super(j);
        this.d = true;
    }

    public static a m1(ac5 ac5Var) {
        return ac5Var.actionBar;
    }

    public static a n1(ac5 ac5Var) {
        return ac5Var.actionBar;
    }

    @Override
    public final void B0() {
        fv fvVar = new fv(this, getParentActivity(), this.resourceProvider, (byte) 23);
        this.N = fvVar;
        fvVar.setOnScrollListener(new ip2(this, (byte) 17));
        this.N.setSections(true);
    }

    @Override
    public final int D0() {
        return getMessagesController().l4.Y1.f();
    }

    @Override
    public final int E0() {
        return 2131749198;
    }

    @Override
    public final int F0() {
        return 2131749200;
    }

    @Override
    public final int I0() {
        return 2131749196;
    }

    @Override
    public final int J0() {
        return getMessagesController().l4.c2.f();
    }

    @Override
    public final int K0() {
        return 2131749197;
    }

    @Override
    public final int L0() {
        return getMessagesController().l4.d2.f();
    }

    @Override
    public final int M0() {
        return 4;
    }

    @Override
    public final int N0() {
        return getMessagesController().l4.e2.f();
    }

    @Override
    public final int O0() {
        return 2131749161;
    }

    @Override
    public final int P0() {
        return 2131749155;
    }

    @Override
    public final int Q0() {
        return 2131749156;
    }

    @Override
    public final int R0() {
        return 2131749141;
    }

    @Override
    public final int S0() {
        return getMessagesController().l4.b2.f();
    }

    @Override
    public final int T0() {
        return 2131749142;
    }

    @Override
    public final boolean V0() {
        return sd2.c0(getMessagesController().L0(Long.valueOf(-this.a)));
    }

    @Override
    public final void a1(final int i) {
        if (this.c != null && !this.C0) {
            this.C0 = true;
            oc7.r1(this.currentAccount).F0().b(this.a, this.c, new qac() {
                @Override
                public final void a(Object obj) {
                    ac5.this.o1(i, (vh1) obj);
                }
            });
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new yb5(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == nm7.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z) {
        int i;
        super.e1(z);
        oi1 oi1Var = this.A0;
        if (oi1Var != null) {
            TextView textView = oi1Var.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            if (tL_premium_boostsStatus != null) {
                i = tL_premium_boostsStatus.boosts;
            } else {
                i = 0;
            }
            textView.setText(gm.S2(jb6.G(i, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z) {
        super.g1(z);
        this.actionBar.setBackgroundColor(0);
        sn2 sn2Var = new sn2(new ColorDrawable(cmb.v0(cmb.c6, this.resourceProvider)), cmb.W0(getParentActivity(), 2131231234, cmb.a7), 0, 0);
        sn2Var.x = true;
        this.P.setBackground(sn2Var);
        this.N.setBackgroundColor(getThemedColor(cmb.Z6));
        oi1 oi1Var = this.A0;
        if (oi1Var != null && !z) {
            oi1Var.a.b(this.currentAccount, this.s, false);
            this.A0.b.b(this.s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        ii1 ii1Var;
        ii1 ii1Var2;
        this.a0 = 0;
        boolean z = true;
        this.b0 = true;
        this.c0 = 2;
        this.S = 4;
        this.d0 = 3;
        if (this.x == 0 && this.s < 0) {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (ii1Var2 = this.O) != null) {
                ii1Var2.s(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 < 0) {
                z = false;
            }
            this.S = 5;
            this.f0 = 4;
            if (!z && (ii1Var = this.O) != null) {
                ii1Var.i(4);
                this.O.g(this.d0);
                this.N.w0(0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.i0 = i2 + 1;
        this.j0 = i2 + 2;
        this.g0 = i2 + 3;
        this.S = i2 + 5;
        this.h0 = i2 + 4;
        TLRPC.ChatFull M0 = getMessagesController().M0(-this.a);
        if (M0 != null && M0.can_set_stickers) {
            int i3 = this.S;
            this.k0 = i3;
            this.S = i3 + 2;
            this.l0 = i3 + 1;
        } else {
            this.k0 = -1;
            this.l0 = -1;
        }
        int i4 = this.S;
        this.T = i4;
        this.X = i4 + 1;
        this.Y = i4 + 2;
        this.S = i4 + 4;
        this.Z = i4 + 3;
    }

    public final void o1(int i, vh1 vh1Var) {
        if (vh1Var != null && getParentActivity() != null) {
            zb5 zb5Var = new zb5(this, this, getParentActivity(), i, this.currentAccount, this.resourceProvider);
            zb5Var.r1(vh1Var);
            zb5Var.q1(this.c, true);
            zb5Var.s1(this.a);
            zb5Var.show();
            return;
        }
        this.C0 = false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oi1 oi1Var = this.A0;
        if (oi1Var != null) {
            oi1Var.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        nm7.f(this.currentAccount).b(this, nm7.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.T);
    }

    @Override
    public final void z0() {
        y0();
        r59 r59Var = this.N;
        if (r59Var != null) {
            r59Var.setBackgroundColor(getThemedColor(cmb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof sn2)) {
            Drawable drawable = ((sn2) this.P.getBackground()).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(cmb.v0(cmb.c6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }
}
