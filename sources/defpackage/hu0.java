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
public final class hu0 extends d {
    public final byte a;
    public final Object b;

    public hu0(long j) {
        super(null);
        this.a = (byte) 6;
        this.b = new my6(this, this, getLayoutContainer(), j);
    }

    public static a Y(hu0 hu0Var) {
        return hu0Var.actionBar;
    }

    @Override
    public final View createView(Context context) {
        int i;
        switch (this.a) {
            case 6:
                this.actionBar.setAllowOverlayTitle(true);
                this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 9));
                this.actionBar.setBackButtonImage(2131231243);
                a aVar = this.actionBar;
                my6 my6Var = (my6) this.b;
                if (my6Var.a) {
                    i = 2131744195;
                } else {
                    i = 2131748443;
                }
                aVar.setTitle(k96.M0(i, null));
                r7 a = this.actionBar.t().a(0, 2131232491);
                a.N();
                a.I = new q10(this, (byte) 16);
                a.setSearchFieldHint(k96.M0(2131745644, null));
                a.setVisibility(8);
                d dVar = my6Var.g;
                if (my6Var.m == null) {
                    FrameLayout frameLayout = new FrameLayout(dVar.getParentActivity());
                    my6Var.m = frameLayout;
                    zkb.h(bkb.Z6, dVar.getResourceProvider(), frameLayout);
                    pi4 b = my6Var.b();
                    my6Var.q = b;
                    my6Var.m.addView(b, -1, -1);
                    zya c = my6Var.c();
                    my6Var.o = c;
                    my6Var.m.addView(c, -1, -1);
                    zya a2 = my6Var.a();
                    my6Var.n = a2;
                    my6Var.m.addView(a2, nme.c(-1.0f, -1));
                    dVar.getParentActivity();
                    t26 t26Var = new t26();
                    o39 o39Var = new o39(dVar.getParentActivity(), null);
                    my6Var.p = o39Var;
                    o39Var.setAdapter(my6Var.f);
                    my6Var.p.r1();
                    my6Var.p.setLayoutManager(t26Var);
                    my6Var.p.setOnItemClickListener(new bf4(my6Var, (byte) 11));
                    my6Var.p.setOnScrollListener(my6Var.D);
                    zkb.J(my6Var.p, bkb.h6, dVar.getResourceProvider());
                    my6Var.m.addView(my6Var.p, -1, -1);
                    gb3 gb3Var = new gb3();
                    gb3Var.n(350L);
                    gb3Var.o(s33.h);
                    gb3Var.C = false;
                    gb3Var.m = false;
                    my6Var.p.setItemAnimator(gb3Var);
                }
                FrameLayout frameLayout2 = my6Var.m;
                a aVar2 = this.actionBar;
                o39 o39Var2 = my6Var.p;
                aVar2.getClass();
                aVar2.F(o39Var2, bkb.Z6, bkb.r8);
                my6Var.e();
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
                return ((pt3) obj).a.getContext();
            case 8:
                return ((wt7) obj).getContext();
            case 11:
                return ((rz9) obj).b.getContext();
            case 13:
                return ((vqa) obj).getContext();
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
                return ((l04) this.b).H.d1;
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
                qx3 qx3Var = ((mx3) obj).y;
                Pattern pattern = qx3.P1;
                return qx3Var.b;
            case 5:
                return ((l04) obj).H.r;
            case 10:
                return ((xh8) obj).b;
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
                qx3 qx3Var = ((mx3) obj).y;
                Pattern pattern = qx3.P1;
                return (FrameLayout) qx3Var.b;
            case 5:
                return ((l04) obj).H.r;
            case 10:
                return ((xh8) obj).H2;
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
                return ((hv0) obj).a0;
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
                return gl.W(((wt7) obj).getContext());
            case 9:
                Activity W = gl.W(((y28) obj).getContext());
                if (W == null) {
                    return LaunchActivity.H1;
                }
                return W;
            case 10:
                d dVar = ((xh8) obj).o2;
                if (dVar == null) {
                    return null;
                }
                return dVar.getParentActivity();
            case 12:
                h1a h1aVar = (h1a) obj;
                Activity ownerActivity = h1aVar.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return gl.W(h1aVar.getContext());
                }
                return ownerActivity;
            case 13:
                for (Context context2 = ((vqa) obj).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override
    public final wjb getResourceProvider() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new gu0(((hv0) obj).e, (byte) 0);
            case 1:
                return new si5((wjb) new f53());
            case 2:
            case 6:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                return new gu0(((mt7) obj).J0, (byte) 1);
            case 4:
                qx3 qx3Var = ((mx3) obj).y;
                Pattern pattern = qx3.P1;
                return qx3Var.J0;
            case 5:
                return ((l04) obj).H.a2;
            case 8:
                return ((wt7) obj).w1;
            case 9:
                return new gu0(((y28) obj).r0, (byte) 3);
            case 11:
                return ((rz9) obj).b.s;
            case 12:
                return ((h1a) obj).J0;
        }
    }

    @Override
    public final Dialog getVisibleDialog() {
        switch (this.a) {
            case 2:
                return new ot3(this, ((pt3) this.b).a.getContext());
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
                wy6 wy6Var = ((my6) this.b).s;
                if (wy6Var != null) {
                    if (!z) {
                        return false;
                    }
                    wy6Var.e(false);
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
                    ((gr7) this.b).dismiss();
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
                m8b m8bVar = ((y28) this.b).z0;
                if (m8bVar != null) {
                    m8bVar.L(dVar);
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
                m8b m8bVar = ((y28) this.b).z0;
                if (m8bVar != null) {
                    m8bVar.u(dialog);
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

    public hu0(Object obj, byte b) {
        super(null);
        this.a = b;
        this.b = obj;
    }

    public hu0(d dVar) {
        super(null);
        this.a = (byte) 1;
        this.b = dVar;
    }

    public hu0(mt7 mt7Var) {
        super(null);
        this.a = (byte) 3;
        this.b = mt7Var;
        this.currentAccount = mt7Var.a;
    }

    public hu0(hv0 hv0Var) {
        super(null);
        this.a = (byte) 0;
        this.b = hv0Var;
        this.currentAccount = hv0Var.N;
    }
}
