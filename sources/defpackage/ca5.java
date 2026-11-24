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
public final class ca5 extends nh1 {
    public gh1 A0;
    public float B0;
    public boolean C0;

    public ca5(long j) {
        super(j);
        this.d = true;
    }

    public static a l1(ca5 ca5Var) {
        return ca5Var.actionBar;
    }

    public static a m1(ca5 ca5Var) {
        return ca5Var.actionBar;
    }

    @Override
    public final void A0() {
        fu fuVar = new fu(this, getParentActivity(), this.resourceProvider, (byte) 23);
        this.N = fuVar;
        fuVar.setOnScrollListener(new ao2(this, (byte) 16));
        this.N.setSections(true);
    }

    @Override
    public final int C0() {
        return getMessagesController().k4.Y1.f();
    }

    @Override
    public final int D0() {
        return 2131749249;
    }

    @Override
    public final int E0() {
        return 2131749251;
    }

    @Override
    public final int H0() {
        return 2131749247;
    }

    @Override
    public final int I0() {
        return getMessagesController().k4.c2.f();
    }

    @Override
    public final int J0() {
        return 2131749248;
    }

    @Override
    public final int K0() {
        return getMessagesController().k4.d2.f();
    }

    @Override
    public final int L0() {
        return 4;
    }

    @Override
    public final int M0() {
        return getMessagesController().k4.e2.f();
    }

    @Override
    public final int N0() {
        return 2131749212;
    }

    @Override
    public final int O0() {
        return 2131749206;
    }

    @Override
    public final int P0() {
        return 2131749207;
    }

    @Override
    public final int Q0() {
        return 2131749192;
    }

    @Override
    public final int R0() {
        return getMessagesController().k4.b2.f();
    }

    @Override
    public final int S0() {
        return 2131749193;
    }

    @Override
    public final boolean U0() {
        return hc2.c0(getMessagesController().K0(Long.valueOf(-this.a)));
    }

    @Override
    public final void Z0(final int i) {
        if (this.c != null && !this.C0) {
            this.C0 = true;
            na7.q1(this.currentAccount).E0().b(this.a, this.c, new p8c() {
                @Override
                public final void a(Object obj) {
                    ca5.this.n1(i, (ng1) obj);
                }
            });
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        f1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new aa5(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void d1(boolean z) {
        int i;
        super.d1(z);
        gh1 gh1Var = this.A0;
        if (gh1Var != null) {
            TextView textView = gh1Var.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.c;
            if (tL_premium_boostsStatus != null) {
                i = tL_premium_boostsStatus.boosts;
            } else {
                i = 0;
            }
            textView.setText(gl.T2(k96.G(i, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == kk7.S && ((TLRPC.ChatFull) objArr[0]).id == (-this.a)) {
            h1();
        }
    }

    @Override
    public final void f1(boolean z) {
        super.f1(z);
        this.actionBar.setBackgroundColor(0);
        fm2 fm2Var = new fm2(new ColorDrawable(bkb.v0(bkb.c6, this.resourceProvider)), bkb.W0(getParentActivity(), 2131231233, bkb.a7), 0, 0);
        fm2Var.x = true;
        this.P.setBackground(fm2Var);
        this.N.setBackgroundColor(getThemedColor(bkb.Z6));
        gh1 gh1Var = this.A0;
        if (gh1Var != null && !z) {
            gh1Var.a.b(this.currentAccount, this.s, false);
            this.A0.b.b(this.s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void i1() {
        ah1 ah1Var;
        ah1 ah1Var2;
        this.a0 = 0;
        boolean z = true;
        this.b0 = true;
        this.c0 = 2;
        this.S = 4;
        this.d0 = 3;
        if (this.x == 0 && this.s < 0) {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (ah1Var2 = this.O) != null) {
                ah1Var2.r(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 < 0) {
                z = false;
            }
            this.S = 5;
            this.f0 = 4;
            if (!z && (ah1Var = this.O) != null) {
                ah1Var.i(4);
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
        TLRPC.ChatFull L0 = getMessagesController().L0(-this.a);
        if (L0 != null && L0.can_set_stickers) {
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

    public final void n1(int i, ng1 ng1Var) {
        if (ng1Var != null && getParentActivity() != null) {
            ba5 ba5Var = new ba5(this, this, getParentActivity(), i, this.currentAccount, this.resourceProvider);
            ba5Var.r1(ng1Var);
            ba5Var.q1(this.c, true);
            ba5Var.s1(this.a);
            ba5Var.show();
            return;
        }
        this.C0 = false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gh1 gh1Var = this.A0;
        if (gh1Var != null) {
            gh1Var.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.S);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.S);
    }

    @Override
    public final void y0() {
        x0();
        o39 o39Var = this.N;
        if (o39Var != null) {
            o39Var.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof fm2)) {
            Drawable drawable = ((fm2) this.P.getBackground()).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(bkb.v0(bkb.c6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }
}
