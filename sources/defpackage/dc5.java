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
public final class dc5 extends wh1 {
    public ph1 A0;
    public float B0;
    public boolean C0;

    public dc5(long j) {
        super(j);
        this.d = true;
    }

    public static a m1(dc5 dc5Var) {
        return dc5Var.actionBar;
    }

    public static a n1(dc5 dc5Var) {
        return dc5Var.actionBar;
    }

    @Override
    public final void B0() {
        gu guVar = new gu(this, getParentActivity(), this.resourceProvider, (byte) 23);
        this.N = guVar;
        guVar.setOnScrollListener(new to2(this, (byte) 16));
        this.N.setSections(true);
    }

    @Override
    public final int D0() {
        return getMessagesController().l4.g2.f();
    }

    @Override
    public final int E0() {
        return 2131749195;
    }

    @Override
    public final int F0() {
        return 2131749197;
    }

    @Override
    public final int I0() {
        return 2131749193;
    }

    @Override
    public final int J0() {
        return getMessagesController().l4.k2.f();
    }

    @Override
    public final int K0() {
        return 2131749194;
    }

    @Override
    public final int L0() {
        return getMessagesController().l4.l2.f();
    }

    @Override
    public final int M0() {
        return 4;
    }

    @Override
    public final int N0() {
        return getMessagesController().l4.m2.f();
    }

    @Override
    public final int O0() {
        return 2131749158;
    }

    @Override
    public final int P0() {
        return 2131749152;
    }

    @Override
    public final int Q0() {
        return 2131749153;
    }

    @Override
    public final int R0() {
        return 2131749138;
    }

    @Override
    public final int S0() {
        return getMessagesController().l4.j2.f();
    }

    @Override
    public final int T0() {
        return 2131749139;
    }

    @Override
    public final boolean V0() {
        return xc2.c0(getMessagesController().M0(Long.valueOf(-this.a)));
    }

    @Override
    public final void a1(final int i) {
        if (this.c != null && !this.C0) {
            this.C0 = true;
            uc7.s1(this.currentAccount).G0().b(this.a, this.c, new pcc() {
                @Override
                public final void a(Object obj) {
                    dc5.this.o1(i, (wg1) obj);
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new bc5(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == jn7.T && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z) {
        int i;
        super.e1(z);
        ph1 ph1Var = this.A0;
        if (ph1Var != null) {
            TextView textView = ph1Var.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            if (tL_premium_boostsStatus != null) {
                i = tL_premium_boostsStatus.boosts;
            } else {
                i = 0;
            }
            textView.setText(hl.S2(ob6.G(i, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z) {
        super.g1(z);
        this.actionBar.setBackgroundColor(0);
        zm2 zm2Var = new zm2(new ColorDrawable(aob.v0(aob.d6, this.resourceProvider)), aob.W0(getParentActivity(), 2131231233, aob.b7), 0, 0);
        zm2Var.x = true;
        this.P.setBackground(zm2Var);
        this.N.setBackgroundColor(getThemedColor(aob.a7));
        ph1 ph1Var = this.A0;
        if (ph1Var != null && !z) {
            ph1Var.a.b(this.currentAccount, this.s, false);
            this.A0.b.b(this.s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        jh1 jh1Var;
        jh1 jh1Var2;
        this.a0 = 0;
        boolean z = true;
        this.b0 = true;
        this.c0 = 2;
        this.S = 4;
        this.d0 = 3;
        if (this.x == 0 && this.s < 0) {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (jh1Var2 = this.O) != null) {
                jh1Var2.s(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 < 0) {
                z = false;
            }
            this.S = 5;
            this.f0 = 4;
            if (!z && (jh1Var = this.O) != null) {
                jh1Var.i(4);
                this.O.g(this.d0);
                this.N.x0(0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.i0 = i2 + 1;
        this.j0 = i2 + 2;
        this.g0 = i2 + 3;
        this.S = i2 + 5;
        this.h0 = i2 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.a);
        if (N0 != null && N0.can_set_stickers) {
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

    public final void o1(int i, wg1 wg1Var) {
        if (wg1Var != null && getParentActivity() != null) {
            cc5 cc5Var = new cc5(this, this, getParentActivity(), i, this.currentAccount, this.resourceProvider);
            cc5Var.s1(wg1Var);
            cc5Var.r1(this.c, true);
            cc5Var.t1(this.a);
            cc5Var.show();
            return;
        }
        this.C0 = false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ph1 ph1Var = this.A0;
        if (ph1Var != null) {
            ph1Var.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.T);
    }

    @Override
    public final void z0() {
        y0();
        d79 d79Var = this.N;
        if (d79Var != null) {
            d79Var.setBackgroundColor(getThemedColor(aob.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof zm2)) {
            Drawable drawable = ((zm2) this.P.getBackground()).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(aob.v0(aob.d6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }
}
