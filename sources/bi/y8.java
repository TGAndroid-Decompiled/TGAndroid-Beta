package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import fi.f9;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dv;
public final class y8 extends org.telegram.ui.ActionBar.h2 {
    public final int f4254a;
    public final Object f4255b;

    public y8(Object obj, int i7) {
        super(null);
        this.f4254a = i7;
        this.f4255b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(y8 y8Var) {
        return y8Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f4254a) {
            case 9:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 10:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new dv(this, 19));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                j90 j90Var = (j90) this.f4255b;
                if (j90Var.f62009a) {
                    i7 = 2131744201;
                } else {
                    i7 = 2131748443;
                }
                kVar.setTitle(gd.M0(i7, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.t().a(0, 2131232488);
                a10.O();
                a10.I = new s1(this, 17);
                a10.setSearchFieldHint(gd.M0(2131745641, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.h2 h2Var = j90Var.f62014g;
                if (j90Var.f62019m == null) {
                    FrameLayout frameLayout = new FrameLayout(h2Var.getParentActivity());
                    j90Var.f62019m = frameLayout;
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, frameLayout, h2Var.getResourceProvider());
                    wz b10 = j90Var.b();
                    j90Var.f62023q = b10;
                    j90Var.f62019m.addView(b10, -1, -1);
                    kv0 c10 = j90Var.c();
                    j90Var.f62021o = c10;
                    j90Var.f62019m.addView(c10, -1, -1);
                    kv0 a11 = j90Var.a();
                    j90Var.f62020n = a11;
                    j90Var.f62019m.addView(a11, ma.c(-1.0f, -1));
                    h2Var.getParentActivity();
                    v4.c0 c0Var = new v4.c0();
                    ck0 ck0Var = new ck0(h2Var.getParentActivity(), null);
                    j90Var.f62022p = ck0Var;
                    ck0Var.setAdapter(j90Var.f62013f);
                    j90Var.f62022p.r1();
                    j90Var.f62022p.setLayoutManager(c0Var);
                    j90Var.f62022p.setOnItemClickListener(new h8(j90Var, 25));
                    j90Var.f62022p.setOnScrollListener(j90Var.D);
                    org.telegram.ui.ActionBar.u6.J(j90Var.f62022p, org.telegram.ui.ActionBar.n6.f29486i6, h2Var.getResourceProvider());
                    j90Var.f62019m.addView(j90Var.f62022p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(lr.h);
                    kVar2.C = false;
                    kVar2.f59152m = false;
                    j90Var.f62022p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = j90Var.f62019m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                ck0 ck0Var2 = j90Var.f62022p;
                kVar3.getClass();
                kVar3.F(ck0Var2, org.telegram.ui.ActionBar.n6.f29337a7, org.telegram.ui.ActionBar.n6.f29674s8);
                j90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f4254a) {
            case 1:
                return ((di.f6) this.f4255b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((fi.k4) this.f4255b).f12182b.getContext();
            case 5:
                return ((hi.l5) this.f4255b).getContext();
            case 6:
                return ((ut) this.f4255b).f40413a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f4254a) {
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
                return ((jx) this.f4255b).H.f39345d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f4254a;
        Object obj = this.f4255b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).f42194y;
                Pattern pattern = bv.Q1;
                return bvVar.f30190b;
            case 8:
                return ((jx) obj).H.f39385r;
            case 12:
                return ((ug.i1) obj).f30190b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f4254a;
        Object obj = this.f4255b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).f42194y;
                Pattern pattern = bv.Q1;
                return (FrameLayout) bvVar.f30190b;
            case 8:
                return ((jx) obj).H.f39385r;
            case 12:
                return ((ug.i1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f4254a) {
            case 0:
                z8 z8Var = (z8) this.f4255b;
                Activity ownerActivity = z8Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(z8Var.getContext());
                }
                return ownerActivity;
            case 1:
                for (Context context = ((di.f6) this.f4255b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((fi.z3) this.f4255b).getContext());
                if (W == null) {
                    return LaunchActivity.H1;
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
                return LaunchActivity.H1;
            case 5:
                return org.telegram.messenger.g0.W(((hi.l5) this.f4255b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.v0) this.f4255b).f53295a0;
            case 12:
                org.telegram.ui.ActionBar.h2 h2Var = ((ug.i1) this.f4255b).f58692p2;
                if (h2Var == null) {
                    return null;
                }
                return h2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.h2) this.f4255b).getParentActivity();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        int i7 = this.f4254a;
        Object obj = this.f4255b;
        switch (i7) {
            case 0:
                return ((z8) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new fi.g2(0, ((fi.z3) obj).f12843l0);
            case 3:
                return ((fi.k4) obj).f12182b.f11732s;
            case 4:
                return new fi.g2(5, ((hi.z4) obj).J0);
            case 5:
                return ((hi.l5) obj).f14921q1;
            case 7:
                bv bvVar = ((xu) obj).f42194y;
                Pattern pattern = bv.Q1;
                return bvVar.J0;
            case 8:
                return ((jx) obj).H.f39335a2;
            case 11:
                return new fi.g2(9, ((org.telegram.ui.web.v0) obj).f53301e);
            case 13:
                return new hi.d5(2, new fi.b());
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f4254a) {
            case 6:
                return new tt(this, ((ut) this.f4255b).f40413a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f4254a) {
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
        switch (this.f4254a) {
            case 10:
                zh.k kVar = ((j90) this.f4255b).f62025s;
                if (kVar != null) {
                    if (!z10) {
                        return false;
                    }
                    kVar.e(false);
                    return false;
                }
                return true;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f4254a) {
            case 9:
                if (z10 && z11) {
                    ((yb0) this.f4255b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.h2 h2Var) {
        switch (this.f4254a) {
            case 2:
                f9 f9Var = ((fi.z3) this.f4255b).f12872t0;
                if (f9Var != null) {
                    f9Var.N(h2Var);
                    return true;
                }
                return true;
            case 5:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f28921a = true;
                Q.showAsSheet(h2Var, obj);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(h2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f4254a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                f9 f9Var = ((fi.z3) this.f4255b).f12872t0;
                if (f9Var != null) {
                    f9Var.t(dialog);
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

    public y8(long j3) {
        super(null);
        this.f4254a = 10;
        this.f4255b = new j90(this, this, getLayoutContainer(), j3);
    }

    public y8(org.telegram.ui.ActionBar.h2 h2Var) {
        super(null);
        this.f4254a = 13;
        this.f4255b = h2Var;
    }

    public y8(hi.z4 z4Var) {
        super(null);
        this.f4254a = 4;
        this.f4255b = z4Var;
        this.currentAccount = z4Var.f30187a;
    }

    public y8(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.f4254a = 11;
        this.f4255b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
