package kg;

import ag.l3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yu;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s60;
import ph.g4;
import rh.e4;
import th.j3;
import th.o7;
import th.z2;
import vh.b4;
import vh.q3;
import w7.b6;
public final class q1 extends org.telegram.ui.ActionBar.k2 {
    public final int f11251a;
    public final Object f11252b;

    public q1(Object obj, int i10) {
        super(null);
        this.f11251a = i10;
        this.f11252b = obj;
    }

    public static org.telegram.ui.ActionBar.l Z(q1 q1Var) {
        return q1Var.actionBar;
    }

    @Override
    public View createView(Context context) {
        int i10;
        switch (this.f11251a) {
            case 5:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            case 6:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new s60(this, 7));
                this.actionBar.setBackButtonImage(2131231241);
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                o90 o90Var = (o90) this.f11252b;
                if (o90Var.f14293a) {
                    i10 = 2131744462;
                } else {
                    i10 = 2131748650;
                }
                lVar.setTitle(dd.L0(i10, null));
                org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(0, 2131232485);
                a2.N();
                a2.H = new l3(this, 16);
                a2.setSearchFieldHint(dd.L0(2131745853, null));
                a2.setVisibility(8);
                org.telegram.ui.ActionBar.k2 k2Var = o90Var.f14297g;
                if (o90Var.f14302m == null) {
                    FrameLayout frameLayout = new FrameLayout(k2Var.getParentActivity());
                    o90Var.f14302m = frameLayout;
                    a7.i(t6.f20873a7, frameLayout, k2Var.getResourceProvider());
                    zz b10 = o90Var.b();
                    o90Var.f14306q = b10;
                    o90Var.f14302m.addView(b10, -1, -1);
                    ew0 c10 = o90Var.c();
                    o90Var.f14304o = c10;
                    o90Var.f14302m.addView(c10, -1, -1);
                    ew0 a10 = o90Var.a();
                    o90Var.f14303n = a10;
                    o90Var.f14302m.addView(a10, b6.c(-1.0f, -1));
                    k2Var.getParentActivity();
                    s4.a0 a0Var = new s4.a0();
                    uk0 uk0Var = new uk0(k2Var.getParentActivity(), null);
                    o90Var.f14305p = uk0Var;
                    uk0Var.setAdapter(o90Var.f14296f);
                    o90Var.f14305p.r1();
                    o90Var.f14305p.setLayoutManager(a0Var);
                    o90Var.f14305p.setOnItemClickListener(new ag.y0(o90Var, 9));
                    o90Var.f14305p.setOnScrollListener(o90Var.D);
                    a7.K(o90Var.f14305p, t6.f21021i6, k2Var.getResourceProvider());
                    o90Var.f14302m.addView(o90Var.f14305p, -1, -1);
                    s4.j jVar = new s4.j();
                    jVar.n(350L);
                    jVar.o(gr.h);
                    jVar.C = false;
                    jVar.f47938m = false;
                    o90Var.f14305p.setItemAnimator(jVar);
                }
                FrameLayout frameLayout2 = o90Var.f14302m;
                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                uk0 uk0Var2 = o90Var.f14305p;
                lVar2.getClass();
                lVar2.B(uk0Var2, t6.f20873a7, t6.f21207s8);
                o90Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            default:
                return super.createView(context);
        }
    }

    @Override
    public Context getContext() {
        switch (this.f11251a) {
            case 2:
                return ((ut) this.f11252b).f31083a.getContext();
            case 9:
                return ((e4) this.f11252b).getContext();
            case 11:
                return ((j3) this.f11252b).f49116b.getContext();
            case 13:
                return ((b4) this.f11252b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f11251a) {
            case 0:
                return this.currentAccount;
            case 2:
                return this.currentAccount;
            case 3:
                return this.currentAccount;
            case 4:
                return ((mx) this.f11252b).G.f31943c1;
            case 9:
                return this.currentAccount;
            case 11:
                return this.currentAccount;
            case 13:
                return this.currentAccount;
            default:
                return super.getCurrentAccount();
        }
    }

    @Override
    public View getFragmentView() {
        int i10 = this.f11251a;
        Object obj = this.f11252b;
        switch (i10) {
            case 0:
                return ((v1) obj).f21587b;
            case 1:
            case 2:
            default:
                return super.getFragmentView();
            case 3:
                cv cvVar = ((yu) obj).f32915y;
                Pattern pattern = cv.M1;
                return cvVar.f21587b;
            case 4:
                return ((mx) obj).G.f31987r;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        int i10 = this.f11251a;
        Object obj = this.f11252b;
        switch (i10) {
            case 0:
                return ((v1) obj).E2;
            case 1:
            case 2:
            default:
                return super.getLayoutContainer();
            case 3:
                cv cvVar = ((yu) obj).f32915y;
                Pattern pattern = cv.M1;
                return (FrameLayout) cvVar.f21587b;
            case 4:
                return ((mx) obj).G.f31987r;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f11251a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = ((v1) this.f11252b).f11304l2;
                if (k2Var == null) {
                    return null;
                }
                return k2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.k2) this.f11252b).getParentActivity();
            case 2:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
            default:
                return super.getParentActivity();
            case 7:
                return ((org.telegram.ui.web.z0) this.f11252b).W;
            case 8:
                g4 g4Var = (g4) this.f11252b;
                Activity ownerActivity = g4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.I1;
                }
                if (ownerActivity == null) {
                    return org.telegram.messenger.i0.W(g4Var.getContext());
                }
                return ownerActivity;
            case 9:
                for (Context context2 = ((e4) this.f11252b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                Activity W = org.telegram.messenger.i0.W(((z2) this.f11252b).getContext());
                if (W == null) {
                    return LaunchActivity.I1;
                }
                return W;
            case 12:
                return LaunchActivity.I1;
            case 13:
                return org.telegram.messenger.i0.W(((b4) this.f11252b).getContext());
        }
    }

    @Override
    public p6 getResourceProvider() {
        int i10 = this.f11251a;
        Object obj = this.f11252b;
        switch (i10) {
            case 1:
                return new x4(1, new th.b());
            case 2:
            case 5:
            case 6:
            case 9:
            default:
                return super.getResourceProvider();
            case 3:
                cv cvVar = ((yu) obj).f32915y;
                Pattern pattern = cv.M1;
                return cvVar.I0;
            case 4:
                return ((mx) obj).G.Z1;
            case 7:
                return new org.telegram.ui.web.a0(0, ((org.telegram.ui.web.z0) obj).e);
            case 8:
                return ((g4) obj).I0;
            case 10:
                return new org.telegram.ui.web.a0(1, ((z2) obj).f49739k0);
            case 11:
                return ((j3) obj).f49116b.f49690s;
            case 12:
                return new org.telegram.ui.web.a0(6, ((q3) obj).I0);
            case 13:
                return ((b4) obj).f50988p1;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f11251a) {
            case 2:
                return new tt(this, ((ut) this.f11252b).f31083a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f11251a) {
            case 1:
                return false;
            case 7:
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
    public boolean onBackPressed(boolean z10) {
        switch (this.f11251a) {
            case 6:
                oh.p pVar = ((o90) this.f11252b).f14308s;
                if (pVar != null) {
                    if (!z10) {
                        return false;
                    }
                    pVar.e(false);
                    return false;
                }
                return true;
            default:
                return super.onBackPressed(z10);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f11251a) {
            case 5:
                if (z10 && z11) {
                    ((fc0) this.f11252b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        switch (this.f11251a) {
            case 1:
                return false;
            case 10:
                o7 o7Var = ((z2) this.f11252b).f49769s0;
                if (o7Var != null) {
                    o7Var.V(k2Var);
                    return true;
                }
                return true;
            case 13:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f20390a = true;
                Q.showAsSheet(k2Var, obj);
                return true;
            default:
                return super.presentFragment(k2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f11251a) {
            case 0:
                dialog.show();
                return dialog;
            case 7:
                dialog.show();
                return dialog;
            case 9:
                dialog.show();
                return dialog;
            case 10:
                o7 o7Var = ((z2) this.f11252b).f49769s0;
                if (o7Var != null) {
                    o7Var.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public q1(long j10) {
        super(null);
        this.f11251a = 6;
        this.f11252b = new o90(this, this, getLayoutContainer(), j10);
    }

    public q1(org.telegram.ui.ActionBar.k2 k2Var) {
        super(null);
        this.f11251a = 1;
        this.f11252b = k2Var;
    }

    public q1(q3 q3Var) {
        super(null);
        this.f11251a = 12;
        this.f11252b = q3Var;
        this.currentAccount = q3Var.f21584a;
    }

    public q1(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.f11251a = 7;
        this.f11252b = z0Var;
        this.currentAccount = z0Var.M;
    }
}
