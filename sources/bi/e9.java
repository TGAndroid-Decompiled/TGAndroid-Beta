package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.yz;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dv;
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
                this.actionBar.setActionBarMenuOnItemClick(new dv(this, 19));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                l90 l90Var = (l90) this.f3516b;
                if (l90Var.f62019a) {
                    i7 = 2131744195;
                } else {
                    i7 = 2131748442;
                }
                kVar.setTitle(hd.N0(i7, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232488);
                a10.O();
                a10.I = new x1(this, 17);
                a10.setSearchFieldHint(hd.N0(2131745640, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.g2 g2Var = l90Var.f62024g;
                if (l90Var.f62029m == null) {
                    FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
                    l90Var.f62029m = frameLayout;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, frameLayout, g2Var.getResourceProvider());
                    yz b10 = l90Var.b();
                    l90Var.f62033q = b10;
                    l90Var.f62029m.addView(b10, -1, -1);
                    nv0 c10 = l90Var.c();
                    l90Var.f62031o = c10;
                    l90Var.f62029m.addView(c10, -1, -1);
                    nv0 a11 = l90Var.a();
                    l90Var.f62030n = a11;
                    l90Var.f62029m.addView(a11, na.c(-1.0f, -1));
                    g2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    ek0 ek0Var = new ek0(g2Var.getParentActivity(), null);
                    l90Var.f62032p = ek0Var;
                    ek0Var.setAdapter(l90Var.f62023f);
                    l90Var.f62032p.r1();
                    l90Var.f62032p.setLayoutManager(b0Var);
                    l90Var.f62032p.setOnItemClickListener(new n8(l90Var, 25));
                    l90Var.f62032p.setOnScrollListener(l90Var.D);
                    org.telegram.ui.ActionBar.t6.J(l90Var.f62032p, org.telegram.ui.ActionBar.m6.f29439i6, g2Var.getResourceProvider());
                    l90Var.f62029m.addView(l90Var.f62032p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(nr.h);
                    kVar2.C = false;
                    kVar2.f59139m = false;
                    l90Var.f62032p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = l90Var.f62029m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                ek0 ek0Var2 = l90Var.f62032p;
                kVar3.getClass();
                kVar3.E(ek0Var2, org.telegram.ui.ActionBar.m6.f29290a7, org.telegram.ui.ActionBar.m6.f29627s8);
                l90Var.e();
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
                return ((fi.k4) this.f3516b).f12177b.getContext();
            case 5:
                return ((hi.l5) this.f3516b).getContext();
            case 6:
                return ((wt) this.f3516b).f41855a.getContext();
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
                return ((lx) this.f3516b).H.f40074d1;
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
                org.telegram.ui.Components.dv dvVar = ((zu) obj).f42959y;
                Pattern pattern = org.telegram.ui.Components.dv.Q1;
                return dvVar.f30142b;
            case 8:
                return ((lx) obj).H.f40114r;
            case 12:
                return ((ug.h1) obj).f30142b;
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
                org.telegram.ui.Components.dv dvVar = ((zu) obj).f42959y;
                Pattern pattern = org.telegram.ui.Components.dv.Q1;
                return (FrameLayout) dvVar.f30142b;
            case 8:
                return ((lx) obj).H.f40114r;
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
                return org.telegram.messenger.g0.W(((hi.l5) this.f3516b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.v0) this.f3516b).f53306a0;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var = ((ug.h1) this.f3516b).f58695p2;
                if (g2Var == null) {
                    return null;
                }
                return g2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.g2) this.f3516b).getParentActivity();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.h6 getResourceProvider() {
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
                return new fi.g2(0, ((fi.z3) obj).f12838l0);
            case 3:
                return ((fi.k4) obj).f12177b.f11727s;
            case 4:
                return new fi.g2(5, ((hi.z4) obj).J0);
            case 5:
                return ((hi.l5) obj).f14911q1;
            case 7:
                org.telegram.ui.Components.dv dvVar = ((zu) obj).f42959y;
                Pattern pattern = org.telegram.ui.Components.dv.Q1;
                return dvVar.J0;
            case 8:
                return ((lx) obj).H.f40064a2;
            case 11:
                return new fi.g2(9, ((org.telegram.ui.web.v0) obj).f53312e);
            case 13:
                return new hi.d5(2, new fi.b());
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3515a) {
            case 6:
                return new vt(this, ((wt) this.f3516b).f41855a.getContext());
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
                zh.k kVar = ((l90) this.f3516b).f62035s;
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
                    ((zb0) this.f3516b).dismiss();
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
                fi.f9 f9Var = ((fi.z3) this.f3516b).f12867t0;
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
                obj.f28871a = true;
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
                fi.f9 f9Var = ((fi.z3) this.f3516b).f12867t0;
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
        this.f3516b = new l90(this, this, getLayoutContainer(), j3);
    }

    public e9(org.telegram.ui.ActionBar.g2 g2Var) {
        super(null);
        this.f3515a = 13;
        this.f3516b = g2Var;
    }

    public e9(hi.z4 z4Var) {
        super(null);
        this.f3515a = 4;
        this.f3516b = z4Var;
        this.currentAccount = z4Var.f30139a;
    }

    public e9(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.f3515a = 11;
        this.f3516b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
