package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.xw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xx;
public final class w4 extends org.telegram.ui.ActionBar.f2 {
    public final int f4963a;
    public final Object f4964b;

    public w4(Object obj, int i7) {
        super(null);
        this.f4963a = i7;
        this.f4964b = obj;
    }

    public static org.telegram.ui.ActionBar.l Z(w4 w4Var) {
        return w4Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f4963a) {
            case 8:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 9:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new xx(this, 16));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                w80 w80Var = (w80) this.f4964b;
                if (w80Var.f59550a) {
                    i7 = 2131744436;
                } else {
                    i7 = 2131748635;
                }
                lVar.setTitle(org.telegram.messenger.id.M0(i7, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.s().a(0, 2131232486);
                a10.N();
                a10.H = new kg.v1(this, 16);
                a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.f2 f2Var = w80Var.f59555g;
                if (w80Var.f59560m == null) {
                    FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
                    w80Var.f59560m = frameLayout;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, frameLayout, f2Var.getResourceProvider());
                    lz b10 = w80Var.b();
                    w80Var.f59564q = b10;
                    w80Var.f59560m.addView(b10, -1, -1);
                    bv0 c10 = w80Var.c();
                    w80Var.f59562o = c10;
                    w80Var.f59560m.addView(c10, -1, -1);
                    bv0 a11 = w80Var.a();
                    w80Var.f59561n = a11;
                    w80Var.f59560m.addView(a11, c8.ha.c(-1.0f, -1));
                    f2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    pj0 pj0Var = new pj0(f2Var.getParentActivity(), null);
                    w80Var.f59563p = pj0Var;
                    pj0Var.setAdapter(w80Var.f59554f);
                    w80Var.f59563p.r1();
                    w80Var.f59563p.setLayoutManager(b0Var);
                    w80Var.f59563p.setOnItemClickListener(new ai.k(w80Var, 24));
                    w80Var.f59563p.setOnScrollListener(w80Var.D);
                    org.telegram.ui.ActionBar.t6.J(w80Var.f59563p, org.telegram.ui.ActionBar.m6.f27982i6, f2Var.getResourceProvider());
                    w80Var.f59560m.addView(w80Var.f59563p, -1, -1);
                    v4.k kVar = new v4.k();
                    kVar.n(350L);
                    kVar.o(wq.h);
                    kVar.C = false;
                    kVar.f57079m = false;
                    w80Var.f59563p.setItemAnimator(kVar);
                }
                FrameLayout frameLayout2 = w80Var.f59560m;
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                pj0 pj0Var2 = w80Var.f59563p;
                lVar2.getClass();
                lVar2.D(pj0Var2, org.telegram.ui.ActionBar.m6.f27834a7, org.telegram.ui.ActionBar.m6.f28170s8);
                w80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f4963a) {
            case 0:
                return ((k7) this.f4964b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.v4) this.f4964b).f9868b.getContext();
            case 4:
                return ((fi.o5) this.f4964b).getContext();
            case 5:
                return ((ht) this.f4964b).f34459a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f4963a) {
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
                return ((xw) this.f4964b).G.f34016c1;
            case 11:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f4963a;
        Object obj = this.f4964b;
        switch (i7) {
            case 6:
                qu quVar = ((mu) obj).f36103y;
                Pattern pattern = qu.P1;
                return quVar.f28672b;
            case 7:
                return ((xw) obj).G.f34059r;
            case 11:
                return ((ug.f1) obj).f28672b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f4963a;
        Object obj = this.f4964b;
        switch (i7) {
            case 6:
                qu quVar = ((mu) obj).f36103y;
                Pattern pattern = qu.P1;
                return (FrameLayout) quVar.f28672b;
            case 7:
                return ((xw) obj).G.f34059r;
            case 11:
                return ((ug.f1) obj).H2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f4963a) {
            case 0:
                for (Context context = ((k7) this.f4964b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity W = org.telegram.messenger.g0.W(((di.j4) this.f4964b).getContext());
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
                return org.telegram.messenger.g0.W(((fi.o5) this.f4964b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.x0) this.f4964b).W;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = ((ug.f1) this.f4964b).f56587o2;
                if (f2Var == null) {
                    return null;
                }
                return f2Var.getParentActivity();
            case 12:
                return ((org.telegram.ui.ActionBar.f2) this.f4964b).getParentActivity();
            case 13:
                zh.b4 b4Var = (zh.b4) this.f4964b;
                Activity ownerActivity = b4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(b4Var.getContext());
                }
                return ownerActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
        int i7 = this.f4963a;
        Object obj = this.f4964b;
        switch (i7) {
            case 1:
                return new di.m2(0, ((di.j4) obj).f9200k0);
            case 2:
                return ((di.v4) obj).f9868b.f9335s;
            case 3:
                return new di.m2(5, ((fi.c5) obj).I0);
            case 4:
                return ((fi.o5) obj).f12542p1;
            case 5:
            case 8:
            case 9:
            case 11:
            default:
                return super.getResourceProvider();
            case 6:
                qu quVar = ((mu) obj).f36103y;
                Pattern pattern = qu.P1;
                return quVar.I0;
            case 7:
                return ((xw) obj).G.Z1;
            case 10:
                return new di.m2(9, ((org.telegram.ui.web.x0) obj).f51302e);
            case 12:
                return new fi.g5(2, new di.b());
            case 13:
                return ((zh.b4) obj).I0;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f4963a) {
            case 5:
                return new gt(this, ((ht) this.f4964b).f34459a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f4963a) {
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
        switch (this.f4963a) {
            case 9:
                yh.l lVar = ((w80) this.f4964b).f59566s;
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
        switch (this.f4963a) {
            case 8:
                if (z9 && z10) {
                    ((mb0) this.f4964b).dismiss();
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
        switch (this.f4963a) {
            case 1:
                di.q9 q9Var = ((di.j4) this.f4964b).f9229s0;
                if (q9Var != null) {
                    q9Var.N(f2Var);
                    return true;
                }
                return true;
            case 4:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f27388a = true;
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
        switch (this.f4963a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.q9 q9Var = ((di.j4) this.f4964b).f9229s0;
                if (q9Var != null) {
                    q9Var.t(dialog);
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
        this.f4963a = 9;
        this.f4964b = new w80(this, this, getLayoutContainer(), j3);
    }

    public w4(org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.f4963a = 12;
        this.f4964b = f2Var;
    }

    public w4(fi.c5 c5Var) {
        super(null);
        this.f4963a = 3;
        this.f4964b = c5Var;
        this.currentAccount = c5Var.f28669a;
    }

    public w4(org.telegram.ui.web.x0 x0Var) {
        super(null);
        this.f4963a = 10;
        this.f4964b = x0Var;
        this.currentAccount = x0Var.M;
    }
}
