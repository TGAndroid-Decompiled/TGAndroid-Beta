package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wx;
public final class w4 extends org.telegram.ui.ActionBar.f2 {
    public final int f4959a;
    public final Object f4960b;

    public w4(Object obj, int i7) {
        super(null);
        this.f4959a = i7;
        this.f4960b = obj;
    }

    public static org.telegram.ui.ActionBar.k Z(w4 w4Var) {
        return w4Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i7;
        switch (this.f4959a) {
            case 8:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 9:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new wx(this, 16));
                this.actionBar.setBackButtonImage(2131231240);
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                x80 x80Var = (x80) this.f4960b;
                if (x80Var.f59552a) {
                    i7 = 2131744436;
                } else {
                    i7 = 2131748635;
                }
                kVar.setTitle(org.telegram.messenger.id.M0(i7, null));
                org.telegram.ui.ActionBar.r0 a10 = this.actionBar.r().a(0, 2131232486);
                a10.N();
                a10.H = new kg.v1(this, 16);
                a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
                a10.setVisibility(8);
                org.telegram.ui.ActionBar.f2 f2Var = x80Var.f59557g;
                if (x80Var.f59562m == null) {
                    FrameLayout frameLayout = new FrameLayout(f2Var.getParentActivity());
                    x80Var.f59562m = frameLayout;
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, frameLayout, f2Var.getResourceProvider());
                    mz b10 = x80Var.b();
                    x80Var.f59566q = b10;
                    x80Var.f59562m.addView(b10, -1, -1);
                    cv0 c10 = x80Var.c();
                    x80Var.f59564o = c10;
                    x80Var.f59562m.addView(c10, -1, -1);
                    cv0 a11 = x80Var.a();
                    x80Var.f59563n = a11;
                    x80Var.f59562m.addView(a11, c8.ha.c(-1.0f, -1));
                    f2Var.getParentActivity();
                    v4.b0 b0Var = new v4.b0();
                    qj0 qj0Var = new qj0(f2Var.getParentActivity(), null);
                    x80Var.f59565p = qj0Var;
                    qj0Var.setAdapter(x80Var.f59556f);
                    x80Var.f59565p.r1();
                    x80Var.f59565p.setLayoutManager(b0Var);
                    x80Var.f59565p.setOnItemClickListener(new ai.k(x80Var, 24));
                    x80Var.f59565p.setOnScrollListener(x80Var.D);
                    org.telegram.ui.ActionBar.s6.J(x80Var.f59565p, org.telegram.ui.ActionBar.l6.f27957i6, f2Var.getResourceProvider());
                    x80Var.f59562m.addView(x80Var.f59565p, -1, -1);
                    v4.k kVar2 = new v4.k();
                    kVar2.n(350L);
                    kVar2.o(xq.h);
                    kVar2.C = false;
                    kVar2.f57083m = false;
                    x80Var.f59565p.setItemAnimator(kVar2);
                }
                FrameLayout frameLayout2 = x80Var.f59562m;
                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                qj0 qj0Var2 = x80Var.f59565p;
                kVar3.getClass();
                kVar3.C(qj0Var2, org.telegram.ui.ActionBar.l6.f27809a7, org.telegram.ui.ActionBar.l6.f28145s8);
                x80Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f4959a) {
            case 0:
                return ((k7) this.f4960b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.v4) this.f4960b).f9863b.getContext();
            case 4:
                return ((fi.o5) this.f4960b).getContext();
            case 5:
                return ((jt) this.f4960b).f35129a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f4959a) {
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
                return ((yw) this.f4960b).G.f34415c1;
            case 11:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        int i7 = this.f4959a;
        Object obj = this.f4960b;
        switch (i7) {
            case 6:
                ru ruVar = ((nu) obj).f36511y;
                Pattern pattern = ru.M1;
                return ruVar.f28624b;
            case 7:
                return ((yw) obj).G.f34458r;
            case 11:
                return ((ug.f1) obj).f28624b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i7 = this.f4959a;
        Object obj = this.f4960b;
        switch (i7) {
            case 6:
                ru ruVar = ((nu) obj).f36511y;
                Pattern pattern = ru.M1;
                return (FrameLayout) ruVar.f28624b;
            case 7:
                return ((yw) obj).G.f34458r;
            case 11:
                return ((ug.f1) obj).E2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f4959a) {
            case 0:
                for (Context context = ((k7) this.f4960b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity W = org.telegram.messenger.g0.W(((di.j4) this.f4960b).getContext());
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
                return org.telegram.messenger.g0.W(((fi.o5) this.f4960b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.x0) this.f4960b).W;
            case 11:
                org.telegram.ui.ActionBar.f2 f2Var = ((ug.f1) this.f4960b).f56585l2;
                if (f2Var == null) {
                    return null;
                }
                return f2Var.getParentActivity();
            case 12:
                return ((org.telegram.ui.ActionBar.f2) this.f4960b).getParentActivity();
            case 13:
                zh.b4 b4Var = (zh.b4) this.f4960b;
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
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        int i7 = this.f4959a;
        Object obj = this.f4960b;
        switch (i7) {
            case 1:
                return new di.m2(0, ((di.j4) obj).f9195k0);
            case 2:
                return ((di.v4) obj).f9863b.f9330s;
            case 3:
                return new di.m2(5, ((fi.c5) obj).I0);
            case 4:
                return ((fi.o5) obj).f12538p1;
            case 5:
            case 8:
            case 9:
            case 11:
            default:
                return super.getResourceProvider();
            case 6:
                ru ruVar = ((nu) obj).f36511y;
                Pattern pattern = ru.M1;
                return ruVar.I0;
            case 7:
                return ((yw) obj).G.Z1;
            case 10:
                return new di.m2(9, ((org.telegram.ui.web.x0) obj).f51348e);
            case 12:
                return new fi.g5(2, new di.b());
            case 13:
                return ((zh.b4) obj).I0;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f4959a) {
            case 5:
                return new ht(this, ((jt) this.f4960b).f35129a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f4959a) {
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
        switch (this.f4959a) {
            case 9:
                yh.l lVar = ((x80) this.f4960b).f59568s;
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
        switch (this.f4959a) {
            case 8:
                if (z9 && z10) {
                    ((nb0) this.f4960b).dismiss();
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
        switch (this.f4959a) {
            case 1:
                di.q9 q9Var = ((di.j4) this.f4960b).f9224s0;
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
                obj.f27408a = true;
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
        switch (this.f4959a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.q9 q9Var = ((di.j4) this.f4960b).f9224s0;
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
        this.f4959a = 9;
        this.f4960b = new x80(this, this, getLayoutContainer(), j3);
    }

    public w4(org.telegram.ui.ActionBar.f2 f2Var) {
        super(null);
        this.f4959a = 12;
        this.f4960b = f2Var;
    }

    public w4(fi.c5 c5Var) {
        super(null);
        this.f4959a = 3;
        this.f4960b = c5Var;
        this.currentAccount = c5Var.f28621a;
    }

    public w4(org.telegram.ui.web.x0 x0Var) {
        super(null);
        this.f4959a = 10;
        this.f4960b = x0Var;
        this.currentAccount = x0Var.M;
    }
}
