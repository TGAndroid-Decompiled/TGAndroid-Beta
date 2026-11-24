package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class qv0 extends d {
    public final byte a;
    public final Object b;

    public qv0(long j) {
        super(null);
        this.a = (byte) 6;
        this.b = new m07(this, this, getLayoutContainer(), j);
    }

    public static a Z(qv0 qv0Var) {
        return qv0Var.actionBar;
    }

    @Override
    public final View createView(Context context) {
        int i;
        switch (this.a) {
            case 6:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 10));
                this.actionBar.setBackButtonImage(2131231244);
                a aVar = this.actionBar;
                m07 m07Var = (m07) this.b;
                if (m07Var.a) {
                    i = 2131744121;
                } else {
                    i = 2131748392;
                }
                aVar.setTitle(jb6.M0(i, null));
                r7 a = this.actionBar.t().a(0, 2131232503);
                a.N();
                a.I = new q20(this, (byte) 16);
                a.setSearchFieldHint(jb6.M0(2131745570, null));
                a.setVisibility(8);
                d dVar = m07Var.g;
                if (m07Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(dVar.getParentActivity());
                    m07Var.m = frameLayout;
                    anb.h(cmb.Z6, dVar.getResourceProvider(), frameLayout);
                    tk4 b = m07Var.b();
                    m07Var.q = b;
                    m07Var.m.addView(b, -1, -1);
                    a1b c = m07Var.c();
                    m07Var.o = c;
                    m07Var.m.addView(c, -1, -1);
                    a1b a2 = m07Var.a();
                    m07Var.n = a2;
                    m07Var.m.addView(a2, qoe.c(-1.0f, -1));
                    dVar.getParentActivity();
                    u46 u46Var = new u46();
                    r59 r59Var = new r59(dVar.getParentActivity(), null);
                    m07Var.p = r59Var;
                    r59Var.setAdapter(m07Var.f);
                    m07Var.p.r1();
                    m07Var.p.setLayoutManager(u46Var);
                    m07Var.p.setOnItemClickListener(new kg4(m07Var, (byte) 12));
                    m07Var.p.setOnScrollListener(m07Var.D);
                    anb.J(m07Var.p, cmb.h6, dVar.getResourceProvider());
                    m07Var.m.addView(m07Var.p, -1, -1);
                    sc3 sc3Var = new sc3();
                    sc3Var.n(350L);
                    sc3Var.o(d53.h);
                    sc3Var.C = false;
                    sc3Var.m = false;
                    m07Var.p.setItemAnimator(sc3Var);
                }
                FrameLayout frameLayout2 = m07Var.m;
                a aVar2 = this.actionBar;
                r59 r59Var2 = m07Var.p;
                aVar2.getClass();
                aVar2.F(r59Var2, cmb.Z6, cmb.r8);
                m07Var.e();
                this.fragmentView = frameLayout2;
                return frameLayout2;
            case 7:
                this.hasOwnBackground = true;
                this.actionBar.setAddToContainer(false);
                View view = new View(context);
                view.setBackgroundColor(0);
                return view;
            default:
                return super.createView(context);
        }
    }

    @Override
    public final Context getContext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                return ((av3) obj).a.getContext();
            case 8:
                return ((xv7) obj).getContext();
            case 11:
                return ((t1a) obj).b.getContext();
            case 13:
                return ((wsa) obj).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public final int getCurrentAccount() {
        switch (this.a) {
            case 2:
                return this.currentAccount;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            default:
                return super.getCurrentAccount();
            case 4:
                return this.currentAccount;
            case 5:
                return ((w14) this.b).H.d1;
            case 8:
                return this.currentAccount;
            case 10:
                return this.currentAccount;
            case 11:
                return this.currentAccount;
            case 13:
                return this.currentAccount;
        }
    }

    @Override
    public final View getFragmentView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                az3 az3Var = ((wy3) obj).y;
                Pattern pattern = az3.P1;
                return az3Var.b;
            case 5:
                return ((w14) obj).H.r;
            case 10:
                return ((yj8) obj).b;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public final FrameLayout getLayoutContainer() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                az3 az3Var = ((wy3) obj).y;
                Pattern pattern = az3.P1;
                return (FrameLayout) az3Var.b;
            case 5:
                return ((w14) obj).H.r;
            case 10:
                return ((yj8) obj).H2;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public final Activity getParentActivity() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((qw0) obj).a0;
            case 1:
                return ((d) obj).getParentActivity();
            case 2:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
                return LaunchActivity.H1;
            case 4:
            case 5:
            case 6:
            case 7:
            case 11:
            default:
                return super.getParentActivity();
            case 8:
                return gm.W(((xv7) obj).getContext());
            case 9:
                Activity W = gm.W(((a58) obj).getContext());
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            case 10:
                d dVar = ((yj8) obj).o2;
                if (dVar == null) {
                    return null;
                }
                return dVar.getParentActivity();
            case 12:
                j3a j3aVar = (j3a) obj;
                Activity ownerActivity = j3aVar.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return gm.W(j3aVar.getContext());
                }
                return ownerActivity;
            case 13:
                for (Context context2 = ((wsa) obj).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override
    public final ylb getResourceProvider() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new pv0(((qw0) obj).e, (byte) 0);
            case 1:
                return new rk5((ylb) new r63());
            case 2:
            case 6:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                return new pv0(((nv7) obj).J0, (byte) 1);
            case 4:
                az3 az3Var = ((wy3) obj).y;
                Pattern pattern = az3.P1;
                return az3Var.J0;
            case 5:
                return ((w14) obj).H.a2;
            case 8:
                return ((xv7) obj).w1;
            case 9:
                return new pv0(((a58) obj).r0, (byte) 3);
            case 11:
                return ((t1a) obj).b.s;
            case 12:
                return ((j3a) obj).J0;
        }
    }

    @Override
    public final Dialog getVisibleDialog() {
        switch (this.a) {
            case 2:
                return new zu3(this, ((av3) this.b).a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.a) {
            case 0:
            case 1:
            case 3:
            case 9:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        switch (this.a) {
            case 6:
                w07 w07Var = ((m07) this.b).s;
                if (w07Var != null) {
                    if (!z) {
                        return false;
                    }
                    w07Var.e(false);
                    return false;
                }
                return true;
            default:
                return super.onBackPressed(z);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        switch (this.a) {
            case 7:
                if (z && z2) {
                    ((ht7) this.b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z, z2);
                return;
        }
    }

    @Override
    public final boolean presentFragment(d dVar) {
        switch (this.a) {
            case 1:
                return false;
            case 8:
                d Q = LaunchActivity.Q();
                if (Q == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.a = true;
                Q.showAsSheet(dVar, obj);
                return true;
            case 9:
                oab oabVar = ((a58) this.b).z0;
                if (oabVar != null) {
                    oabVar.L(dVar);
                }
                return true;
            default:
                return super.presentFragment(dVar);
        }
    }

    @Override
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 9:
                oab oabVar = ((a58) this.b).z0;
                if (oabVar != null) {
                    oabVar.t(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 13:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public qv0(Object obj, byte b) {
        super(null);
        this.a = b;
        this.b = obj;
    }

    public qv0(d dVar) {
        super(null);
        this.a = (byte) 1;
        this.b = dVar;
    }

    public qv0(nv7 nv7Var) {
        super(null);
        this.a = (byte) 3;
        this.b = nv7Var;
        this.currentAccount = nv7Var.a;
    }

    public qv0(qw0 qw0Var) {
        super(null);
        this.a = (byte) 0;
        this.b = qw0Var;
        this.currentAccount = qw0Var.N;
    }
}
