package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.regex.Pattern;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cv;
public final class e9 extends org.telegram.ui.ActionBar.g2 {
    public final int f3515a;
    public final Object f3516b;

    public e9(Object obj, int i7) {
        super(null);
        this.f3515a = i7;
        this.f3516b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(e9 e9Var) {
        return e9Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f3515a) {
            case 9:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 10:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new cv(this, 19));
                this.actionBar.setBackButtonImage(2131231243);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                i90 i90Var = (i90) this.f3516b;
                if (i90Var.f62137a) {
                    i7 = 2131744191;
                } else {
                    i7 = 2131748442;
                }
                kVar.setTitle(gd.N0(i7, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232491);
                a10.O();
                a10.I = new x1(this, 17);
                a10.setSearchFieldHint(gd.N0(2131745640, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.g2 g2Var = i90Var.f62142g;
                if (i90Var.f62147m == null) {
                    FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
                    i90Var.f62147m = frameLayout;
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, frameLayout, g2Var.getResourceProvider());
                    vz b10 = i90Var.b();
                    i90Var.f62151q = b10;
                    i90Var.f62147m.addView(b10, -1, -1);
                    mv0 c10 = i90Var.c();
                    i90Var.f62149o = c10;
                    i90Var.f62147m.addView(c10, -1, -1);
                    mv0 a11 = i90Var.a();
                    i90Var.f62148n = a11;
                    i90Var.f62147m.addView(a11, na.c(-1.0f, -1));
                    g2Var.getParentActivity();
                    v4.c0 c0Var = new v4.c0();
                    ek0 ek0Var = new ek0(g2Var.getParentActivity(), null);
                    i90Var.f62150p = ek0Var;
                    ek0Var.setAdapter(i90Var.f62141f);
                    i90Var.f62150p.r1();
                    i90Var.f62150p.setLayoutManager(c0Var);
                    i90Var.f62150p.setOnItemClickListener(new n8(i90Var, 25));
                    i90Var.f62150p.setOnScrollListener(i90Var.D);
                    org.telegram.ui.ActionBar.u6.J(i90Var.f62150p, org.telegram.ui.ActionBar.n6.f29543i6, g2Var.getResourceProvider());
                    i90Var.f62147m.addView(i90Var.f62150p, -1, -1);
                    v4.l lVar = new v4.l();
                    lVar.n(350L);
                    lVar.o(kr.h);
                    lVar.C = false;
                    lVar.f59274m = false;
                    i90Var.f62150p.setItemAnimator(lVar);
                }
                FrameLayout frameLayout2 = i90Var.f62147m;
                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                ek0 ek0Var2 = i90Var.f62150p;
                kVar2.getClass();
                kVar2.D(ek0Var2, org.telegram.ui.ActionBar.n6.f29394a7, org.telegram.ui.ActionBar.n6.f29731s8);
                i90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f3515a) {
            case 1:
                return ((di.f6) this.f3516b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((fi.k4) this.f3516b).f12186b.getContext();
            case 5:
                return ((hi.v5) this.f3516b).getContext();
            case 6:
                return ((ut) this.f3516b).f40468a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3515a) {
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
                return ((ix) this.f3516b).H.f39047d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f3515a;
        Object obj = this.f3516b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).f42202y;
                Pattern pattern = bv.Q1;
                return bvVar.f30226b;
            case 8:
                return ((ix) obj).H.f39087r;
            case 12:
                return ((ug.h1) obj).f30226b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f3515a;
        Object obj = this.f3516b;
        switch (i7) {
            case 7:
                bv bvVar = ((xu) obj).f42202y;
                Pattern pattern = bv.Q1;
                return (FrameLayout) bvVar.f30226b;
            case 8:
                return ((ix) obj).H.f39087r;
            case 12:
                return ((ug.h1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3515a) {
            case 0:
                f9 f9Var = (f9) this.f3516b;
                Activity ownerActivity = f9Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(f9Var.getContext());
                }
                return ownerActivity;
            case 1:
                for (Context context = ((di.f6) this.f3516b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((fi.z3) this.f3516b).getContext());
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
                return org.telegram.messenger.g0.W(((hi.v5) this.f3516b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.v0) this.f3516b).f53576a0;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var = ((ug.h1) this.f3516b).f58810p2;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.g2) this.f3516b).getParentActivity();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.i6 getResourceProvider() {
        int i7 = this.f3515a;
        Object obj = this.f3516b;
        switch (i7) {
            case 0:
                return ((f9) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new fi.g2(0, ((fi.z3) obj).f12849l0);
            case 3:
                return ((fi.k4) obj).f12186b.f11781s;
            case 4:
                return new fi.g2(5, ((hi.j5) obj).J0);
            case 5:
                return ((hi.v5) obj).f15585q1;
            case 7:
                bv bvVar = ((xu) obj).f42202y;
                Pattern pattern = bv.Q1;
                return bvVar.J0;
            case 8:
                return ((ix) obj).H.f39037a2;
            case 11:
                return new fi.g2(9, ((org.telegram.ui.web.v0) obj).f53582e);
            case 13:
                return new hi.n5(2, new fi.b());
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3515a) {
            case 6:
                return new tt(this, ((ut) this.f3516b).f40468a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3515a) {
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
        switch (this.f3515a) {
            case 10:
                zh.k kVar = ((i90) this.f3516b).f62153s;
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
        switch (this.f3515a) {
            case 9:
                if (z10 && z11) {
                    ((wb0) this.f3516b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.g2 g2Var) {
        switch (this.f3515a) {
            case 2:
                fi.f9 f9Var = ((fi.z3) this.f3516b).f12878t0;
                if (f9Var != null) {
                    f9Var.N(g2Var);
                    return true;
                }
                return true;
            case 5:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f28948a = true;
                Q.showAsSheet(g2Var, obj);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(g2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f3515a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                fi.f9 f9Var = ((fi.z3) this.f3516b).f12878t0;
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

    public e9(long j3) {
        super(null);
        this.f3515a = 10;
        this.f3516b = new i90(this, this, getLayoutContainer(), j3);
    }

    public e9(org.telegram.ui.ActionBar.g2 g2Var) {
        super(null);
        this.f3515a = 13;
        this.f3516b = g2Var;
    }

    public e9(hi.j5 j5Var) {
        super(null);
        this.f3515a = 4;
        this.f3516b = j5Var;
        this.currentAccount = j5Var.f30223a;
    }

    public e9(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.f3515a = 11;
        this.f3516b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
