package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.r9;
import java.util.regex.Pattern;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.ww;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hx;
public final class c7 extends org.telegram.ui.ActionBar.d2 {
    public final int f552a;
    public final Object f553b;

    public c7(Object obj, int i3) {
        super(null);
        this.f552a = i3;
        this.f553b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(c7 c7Var) {
        return c7Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i3;
        switch (this.f552a) {
            case 9:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 10:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new hx(this, 17));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                s80 s80Var = (s80) this.f553b;
                if (s80Var.f60580a) {
                    i3 = 2131744446;
                } else {
                    i3 = 2131748643;
                }
                kVar.setTitle(bd.M0(i3, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
                a10.N();
                a10.I = new lg.w1(this, 16);
                a10.setSearchFieldHint(bd.M0(2131745846, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.d2 d2Var = s80Var.f60585g;
                if (s80Var.f60590m == null) {
                    FrameLayout frameLayout = new FrameLayout(d2Var.getParentActivity());
                    s80Var.f60590m = frameLayout;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, frameLayout, d2Var.getResourceProvider());
                    iz b10 = s80Var.b();
                    s80Var.f60594q = b10;
                    s80Var.f60590m.addView(b10, -1, -1);
                    zu0 c2 = s80Var.c();
                    s80Var.f60592o = c2;
                    s80Var.f60590m.addView(c2, -1, -1);
                    zu0 a11 = s80Var.a();
                    s80Var.f60591n = a11;
                    s80Var.f60590m.addView(a11, mf.c(-1.0f, -1));
                    d2Var.getParentActivity();
                    u4.b0 b0Var = new u4.b0();
                    tj0 tj0Var = new tj0(d2Var.getParentActivity(), null);
                    s80Var.f60593p = tj0Var;
                    tj0Var.setAdapter(s80Var.f60584f);
                    s80Var.f60593p.r1();
                    s80Var.f60593p.setLayoutManager(b0Var);
                    s80Var.f60593p.setOnItemClickListener(new j6(s80Var, 25));
                    s80Var.f60593p.setOnScrollListener(s80Var.D);
                    org.telegram.ui.ActionBar.r6.K(s80Var.f60593p, org.telegram.ui.ActionBar.k6.f27972i6, d2Var.getResourceProvider());
                    s80Var.f60590m.addView(s80Var.f60593p, -1, -1);
                    u4.k kVar2 = new u4.k();
                    kVar2.n(350L);
                    kVar2.o(xq.h);
                    kVar2.C = false;
                    kVar2.f55567m = false;
                    s80Var.f60593p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = s80Var.f60590m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                tj0 tj0Var2 = s80Var.f60593p;
                kVar3.getClass();
                kVar3.B(tj0Var2, org.telegram.ui.ActionBar.k6.f27824a7, org.telegram.ui.ActionBar.k6.f28160s8);
                s80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f552a) {
            case 1:
                return ((ci.l6) this.f553b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((ei.u4) this.f553b).f11088b.getContext();
            case 5:
                return ((gi.m5) this.f553b).getContext();
            case 6:
                return ((gt) this.f553b).f34185a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f552a) {
            case 1:
                return this.currentAccount;
            case 2:
            case 4:
            case 9:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return ((ww) this.f553b).H.f33529d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i3 = this.f552a;
        Object obj = this.f553b;
        switch (i3) {
            case 7:
                pu puVar = ((lu) obj).f35890y;
                Pattern pattern = pu.N1;
                return puVar.f28586b;
            case 8:
                return ((ww) obj).H.f33570r;
            case 12:
                return ((vg.h1) obj).f28586b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i3 = this.f552a;
        Object obj = this.f553b;
        switch (i3) {
            case 7:
                pu puVar = ((lu) obj).f35890y;
                Pattern pattern = pu.N1;
                return (FrameLayout) puVar.f28586b;
            case 8:
                return ((ww) obj).H.f33570r;
            case 12:
                return ((vg.h1) obj).F2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f552a) {
            case 0:
                d7 d7Var = (d7) this.f553b;
                Activity ownerActivity = d7Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.K1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(d7Var.getContext());
                }
                return ownerActivity;
            case 1:
                for (Context context = ((ci.l6) this.f553b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((ei.j4) this.f553b).getContext());
                if (W == null) {
                    return LaunchActivity.K1;
                }
                return W;
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return super.getParentActivity();
            case 4:
                return LaunchActivity.K1;
            case 5:
                return org.telegram.messenger.g0.W(((gi.m5) this.f553b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.w0) this.f553b).f51061a0;
            case 12:
                org.telegram.ui.ActionBar.d2 d2Var = ((vg.h1) this.f553b).f56635m2;
                if (d2Var == null) {
                    return null;
                }
                return d2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.d2) this.f553b).getParentActivity();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        int i3 = this.f552a;
        Object obj = this.f553b;
        switch (i3) {
            case 0:
                return ((d7) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new ei.q2(0, ((ei.j4) obj).f10476l0);
            case 3:
                return ((ei.u4) obj).f11088b.f10578s;
            case 4:
                return new ei.q2(5, ((gi.a5) obj).J0);
            case 5:
                return ((gi.m5) obj).f13224q1;
            case 7:
                pu puVar = ((lu) obj).f35890y;
                Pattern pattern = pu.N1;
                return puVar.J0;
            case 8:
                return ((ww) obj).H.f33520a2;
            case 11:
                return new ei.q2(9, ((org.telegram.ui.web.w0) obj).f51067e);
            case 13:
                return new gi.e5(2, new ei.b());
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f552a) {
            case 6:
                return new ft(this, ((gt) this.f553b).f34185a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f552a) {
            case 2:
                return false;
            case 4:
                return false;
            case 11:
                return false;
            case 13:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public boolean onBackPressed(boolean z10) {
        switch (this.f552a) {
            case 10:
                zh.j jVar = ((s80) this.f553b).f60596s;
                if (jVar != null) {
                    if (!z10) {
                        return false;
                    }
                    jVar.e(false);
                    return false;
                }
                return true;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f552a) {
            case 9:
                if (z10 && z11) {
                    ((hb0) this.f553b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.d2 d2Var) {
        switch (this.f552a) {
            case 2:
                r9 r9Var = ((ei.j4) this.f553b).f10506t0;
                if (r9Var != null) {
                    r9Var.V(d2Var);
                    return true;
                }
                return true;
            case 5:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f27395a = true;
                Q.showAsSheet(d2Var, obj);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(d2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f552a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                r9 r9Var = ((ei.j4) this.f553b).f10506t0;
                if (r9Var != null) {
                    r9Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 4:
                dialog.show();
                return dialog;
            case 11:
                dialog.show();
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public c7(long j10) {
        super(null);
        this.f552a = 10;
        this.f553b = new s80(this, this, getLayoutContainer(), j10);
    }

    public c7(org.telegram.ui.ActionBar.d2 d2Var) {
        super(null);
        this.f552a = 13;
        this.f553b = d2Var;
    }

    public c7(gi.a5 a5Var) {
        super(null);
        this.f552a = 4;
        this.f553b = a5Var;
        this.currentAccount = a5Var.f28583a;
    }

    public c7(org.telegram.ui.web.w0 w0Var) {
        super(null);
        this.f552a = 11;
        this.f553b = w0Var;
        this.currentAccount = w0Var.N;
    }
}
