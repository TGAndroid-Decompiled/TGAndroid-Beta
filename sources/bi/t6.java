package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import fi.i9;
import java.util.regex.Pattern;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lx;
public final class t6 extends org.telegram.ui.ActionBar.e2 {
    public final int f3881a;
    public final Object f3882b;

    public t6(Object obj, int i7) {
        super(null);
        this.f3881a = i7;
        this.f3882b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(t6 t6Var) {
        return t6Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f3881a) {
            case 9:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 10:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new lx(this, 17));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                y80 y80Var = (y80) this.f3882b;
                if (y80Var.f61442a) {
                    i7 = 2131744436;
                } else {
                    i7 = 2131748635;
                }
                kVar.setTitle(hd.M0(i7, null));
                org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(0, 2131232487);
                a10.O();
                a10.I = new kg.x1(this, 16);
                a10.setSearchFieldHint(hd.M0(2131745836, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.e2 e2Var = y80Var.f61447g;
                if (y80Var.f61452m == null) {
                    FrameLayout frameLayout = new FrameLayout(e2Var.getParentActivity());
                    y80Var.f61452m = frameLayout;
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, e2Var.getResourceProvider());
                    pz b10 = y80Var.b();
                    y80Var.f61456q = b10;
                    y80Var.f61452m.addView(b10, -1, -1);
                    cv0 c10 = y80Var.c();
                    y80Var.f61454o = c10;
                    y80Var.f61452m.addView(c10, -1, -1);
                    cv0 a11 = y80Var.a();
                    y80Var.f61453n = a11;
                    y80Var.f61452m.addView(a11, ja.c(-1.0f, -1));
                    e2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    uj0 uj0Var = new uj0(e2Var.getParentActivity(), null);
                    y80Var.f61455p = uj0Var;
                    uj0Var.setAdapter(y80Var.f61446f);
                    y80Var.f61455p.r1();
                    y80Var.f61455p.setLayoutManager(b0Var);
                    y80Var.f61455p.setOnItemClickListener(new b6(y80Var, 25));
                    y80Var.f61455p.setOnScrollListener(y80Var.D);
                    org.telegram.ui.ActionBar.q6.J(y80Var.f61455p, org.telegram.ui.ActionBar.j6.f28941i6, e2Var.getResourceProvider());
                    y80Var.f61452m.addView(y80Var.f61455p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(er.h);
                    kVar2.C = false;
                    kVar2.f58564m = false;
                    y80Var.f61455p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = y80Var.f61452m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                uj0 uj0Var2 = y80Var.f61455p;
                kVar3.getClass();
                kVar3.D(uj0Var2, org.telegram.ui.ActionBar.j6.f28792a7, org.telegram.ui.ActionBar.j6.f29129s8);
                y80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f3881a) {
            case 1:
                return ((di.c6) this.f3882b).getContext();
            case 2:
            case 4:
            default:
                return super.getContext();
            case 3:
                return ((fi.m4) this.f3882b).f12030b.getContext();
            case 5:
                return ((hi.m5) this.f3882b).getContext();
            case 6:
                return ((pt) this.f3882b).f38408a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3881a) {
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
                return ((dx) this.f3882b).H.f36941d1;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f3881a;
        Object obj = this.f3882b;
        switch (i7) {
            case 7:
                wu wuVar = ((su) obj).f39436y;
                Pattern pattern = wu.Q1;
                return wuVar.f29682b;
            case 8:
                return ((dx) obj).H.f36981r;
            case 12:
                return ((ug.g1) obj).f29682b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f3881a;
        Object obj = this.f3882b;
        switch (i7) {
            case 7:
                wu wuVar = ((su) obj).f39436y;
                Pattern pattern = wu.Q1;
                return (FrameLayout) wuVar.f29682b;
            case 8:
                return ((dx) obj).H.f36981r;
            case 12:
                return ((ug.g1) obj).I2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3881a) {
            case 0:
                u6 u6Var = (u6) this.f3882b;
                Activity ownerActivity = u6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.g0.W(u6Var.getContext());
                }
                return ownerActivity;
            case 1:
                for (Context context = ((di.c6) this.f3882b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 2:
                Activity W = org.telegram.messenger.g0.W(((fi.b4) this.f3882b).getContext());
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
                return org.telegram.messenger.g0.W(((hi.m5) this.f3882b).getContext());
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.v0) this.f3882b).f52812a0;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var = ((ug.g1) this.f3882b).f58101p2;
                if (e2Var == null) {
                    return null;
                }
                return e2Var.getParentActivity();
            case 13:
                return ((org.telegram.ui.ActionBar.e2) this.f3882b).getParentActivity();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        int i7 = this.f3881a;
        Object obj = this.f3882b;
        switch (i7) {
            case 0:
                return ((u6) obj).J0;
            case 1:
            case 6:
            case 9:
            case 10:
            case 12:
            default:
                return super.getResourceProvider();
            case 2:
                return new fi.i2(0, ((fi.b4) obj).f11493l0);
            case 3:
                return ((fi.m4) obj).f12030b.f11604s;
            case 4:
                return new fi.i2(5, ((hi.a5) obj).J0);
            case 5:
                return ((hi.m5) obj).f14685q1;
            case 7:
                wu wuVar = ((su) obj).f39436y;
                Pattern pattern = wu.Q1;
                return wuVar.J0;
            case 8:
                return ((dx) obj).H.f36931a2;
            case 11:
                return new fi.i2(9, ((org.telegram.ui.web.v0) obj).f52818e);
            case 13:
                return new hi.e5(2, new fi.b());
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3881a) {
            case 6:
                return new ot(this, ((pt) this.f3882b).f38408a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3881a) {
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
        switch (this.f3881a) {
            case 10:
                zh.k kVar = ((y80) this.f3882b).f61458s;
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
        switch (this.f3881a) {
            case 9:
                if (z10 && z11) {
                    ((nb0) this.f3882b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.e2 e2Var) {
        switch (this.f3881a) {
            case 2:
                i9 i9Var = ((fi.b4) this.f3882b).f11522t0;
                if (i9Var != null) {
                    i9Var.N(e2Var);
                    return true;
                }
                return true;
            case 5:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f28476a = true;
                Q.showAsSheet(e2Var, obj);
                return true;
            case 13:
                return false;
            default:
                return super.presentFragment(e2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f3881a) {
            case 1:
                dialog.show();
                return dialog;
            case 2:
                i9 i9Var = ((fi.b4) this.f3882b).f11522t0;
                if (i9Var != null) {
                    i9Var.t(dialog);
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

    public t6(long j3) {
        super(null);
        this.f3881a = 10;
        this.f3882b = new y80(this, this, getLayoutContainer(), j3);
    }

    public t6(org.telegram.ui.ActionBar.e2 e2Var) {
        super(null);
        this.f3881a = 13;
        this.f3882b = e2Var;
    }

    public t6(hi.a5 a5Var) {
        super(null);
        this.f3881a = 4;
        this.f3882b = a5Var;
        this.currentAccount = a5Var.f29679a;
    }

    public t6(org.telegram.ui.web.v0 v0Var) {
        super(null);
        this.f3881a = 11;
        this.f3882b = v0Var;
        this.currentAccount = v0Var.N;
    }
}
