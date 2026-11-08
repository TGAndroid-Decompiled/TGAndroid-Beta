package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ux;
public final class w4 extends org.telegram.ui.ActionBar.f2 {
    public final int f4961a;
    public final Object f4962b;

    public w4(Object obj, int i7) {
        super(null);
        this.f4961a = i7;
        this.f4962b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(w4 w4Var) {
        return w4Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f4961a) {
            case 8:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 9:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new ux(this, 16));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                w80 w80Var = (w80) this.f4962b;
                if (w80Var.f59542a) {
                    i7 = 2131744439;
                } else {
                    i7 = 2131748636;
                }
                kVar.setTitle(org.telegram.messenger.id.M0(i7, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(0, 2131232486);
                a10.N();
                a10.H = new kg.v1(this, 16);
                a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.f2 f2Var = w80Var.f59547g;
                if (w80Var.f59552m == null) {
                    FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
                    w80Var.f59552m = frameLayout;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, frameLayout, f2Var.getResourceProvider());
                    mz b10 = w80Var.b();
                    w80Var.f59556q = b10;
                    w80Var.f59552m.addView(b10, -1, -1);
                    av0 c10 = w80Var.c();
                    w80Var.f59554o = c10;
                    w80Var.f59552m.addView(c10, -1, -1);
                    av0 a11 = w80Var.a();
                    w80Var.f59553n = a11;
                    w80Var.f59552m.addView(a11, c8.ha.c(-1.0f, -1));
                    f2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    pj0 pj0Var = new pj0(f2Var.getParentActivity(), null);
                    w80Var.f59555p = pj0Var;
                    pj0Var.setAdapter(w80Var.f59546f);
                    w80Var.f59555p.r1();
                    w80Var.f59555p.setLayoutManager(b0Var);
                    w80Var.f59555p.setOnItemClickListener(new ai.k(w80Var, 24));
                    w80Var.f59555p.setOnScrollListener(w80Var.D);
                    org.telegram.ui.ActionBar.r6.K(w80Var.f59555p, org.telegram.ui.ActionBar.k6.f27944i6, f2Var.getResourceProvider());
                    w80Var.f59552m.addView(w80Var.f59555p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(xq.h);
                    kVar2.C = false;
                    kVar2.f57070m = false;
                    w80Var.f59555p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = w80Var.f59552m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                pj0 pj0Var2 = w80Var.f59555p;
                kVar3.getClass();
                kVar3.B(pj0Var2, org.telegram.ui.ActionBar.k6.f27796a7, org.telegram.ui.ActionBar.k6.f28132s8);
                w80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f4961a) {
            case 0:
                return ((k7) this.f4962b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.u4) this.f4962b).f9835b.getContext();
            case 4:
                return ((fi.o5) this.f4962b).getContext();
            case 5:
                return ((jt) this.f4962b).f35091a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f4961a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 3:
            case 8:
            case 9:
            case 10:
            default:
                return super.getCurrentAccount();
            case 2:
                return this.currentAccount;
            case 4:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return ((yw) this.f4962b).G.f34400c1;
            case 11:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f4961a;
        Object obj = this.f4962b;
        switch (i7) {
            case 6:
                ru ruVar = ((nu) obj).f36450y;
                Pattern pattern = ru.M1;
                return ruVar.f28619b;
            case 7:
                return ((yw) obj).G.f34443r;
            case 11:
                return ((ug.f1) obj).f28619b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f4961a;
        Object obj = this.f4962b;
        switch (i7) {
            case 6:
                ru ruVar = ((nu) obj).f36450y;
                Pattern pattern = ru.M1;
                return (FrameLayout) ruVar.f28619b;
            case 7:
                return ((yw) obj).G.f34443r;
            case 11:
                return ((ug.f1) obj).E2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f4961a) {
            case 0:
                for (Context context = ((k7) this.f4962b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity W = org.telegram.messenger.g0.W(((di.i4) this.f4962b).getContext());
                if (W == null) {
                    return LaunchActivity.G1;
                }
                return W;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.G1;
            case 4:
                return org.telegram.messenger.g0.W(((fi.o5) this.f4962b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.x0) this.f4962b).W;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = ((ug.f1) this.f4962b).f56572l2;
                if (f2Var == null) {
                    return null;
                }
                return f2Var.getParentActivity();
            case 12:
                return ((org.telegram.ui.ActionBar.f2) this.f4962b).getParentActivity();
            case 13:
                zh.a4 a4Var = (zh.a4) this.f4962b;
                Activity ownerActivity = a4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(a4Var.getContext());
                }
                return ownerActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        int i7 = this.f4961a;
        Object obj = this.f4962b;
        switch (i7) {
            case 1:
                return new di.m2(0, ((di.i4) obj).f9163k0);
            case 2:
                return ((di.u4) obj).f9835b.f9306s;
            case 3:
                return new di.m2(5, ((fi.c5) obj).I0);
            case 4:
                return ((fi.o5) obj).f12540p1;
            case 5:
            case 8:
            case 9:
            case 11:
            default:
                return super.getResourceProvider();
            case 6:
                ru ruVar = ((nu) obj).f36450y;
                Pattern pattern = ru.M1;
                return ruVar.I0;
            case 7:
                return ((yw) obj).G.Z1;
            case 10:
                return new di.m2(9, ((org.telegram.ui.web.x0) obj).f51367e);
            case 12:
                return new fi.g5(2, new di.b());
            case 13:
                return ((zh.a4) obj).I0;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f4961a) {
            case 5:
                return new ht(this, ((jt) this.f4962b).f35091a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f4961a) {
            case 1:
                return false;
            case 3:
                return false;
            case 10:
                return false;
            case 12:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public boolean onBackPressed(boolean z9) {
        switch (this.f4961a) {
            case 9:
                yh.l lVar = ((w80) this.f4962b).f59558s;
                if (lVar != null) {
                    if (!z9) {
                        return false;
                    }
                    lVar.e(false);
                    return false;
                }
                return true;
            default:
                return super.onBackPressed(z9);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z9, boolean z10) {
        switch (this.f4961a) {
            case 8:
                if (z9 && z10) {
                    ((mb0) this.f4962b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z9, z10);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.f2 f2Var) {
        switch (this.f4961a) {
            case 1:
                di.p9 p9Var = ((di.i4) this.f4962b).f9192s0;
                if (p9Var != null) {
                    p9Var.N(f2Var);
                    return true;
                }
                return true;
            case 4:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f27424a = true;
                Q.showAsSheet(f2Var, obj);
                return true;
            case 12:
                return false;
            default:
                return super.presentFragment(f2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f4961a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.p9 p9Var = ((di.i4) this.f4962b).f9192s0;
                if (p9Var != null) {
                    p9Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 11:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public w4(long j3) {
        super(null);
        this.f4961a = 9;
        this.f4962b = new w80(this, this, getLayoutContainer(), j3);
    }

    public w4(org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.f4961a = 12;
        this.f4962b = f2Var;
    }

    public w4(fi.c5 c5Var) {
        super(null);
        this.f4961a = 3;
        this.f4962b = c5Var;
        this.currentAccount = c5Var.f28616a;
    }

    public w4(org.telegram.ui.web.x0 x0Var) {
        super(null);
        this.f4961a = 10;
        this.f4962b = x0Var;
        this.currentAccount = x0Var.M;
    }
}
