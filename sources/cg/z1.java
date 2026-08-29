package cg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.e6;
import jh.h5;
import lh.d4;
import lh.i9;
import lh.m4;
import nh.c5;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
public final class z1 extends org.telegram.ui.ActionBar.o2 {
    public final int f3471a;
    public final Object f3472b;

    public z1(Object obj, int i10) {
        super(null);
        this.f3471a = i10;
        this.f3472b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f3471a) {
            case 11:
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
    public Context getContext() {
        switch (this.f3471a) {
            case 3:
                return ((h5) this.f3472b).getContext();
            case 4:
            case 6:
            default:
                return super.getContext();
            case 5:
                return ((m4) this.f3472b).f15925b.getContext();
            case 7:
                return ((t5) this.f3472b).getContext();
            case 8:
                return ((yt) this.f3472b).f35130a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3471a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return this.currentAccount;
            case 9:
                return this.currentAccount;
            case 10:
                return ((vx) this.f3472b).A.Y0;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f3471a) {
            case 0:
                viewGroup = ((f3) ((f2) this.f3472b)).containerView;
                return viewGroup;
            case 9:
                viewGroup2 = ((f3) ((ev) this.f3472b).f28192x).containerView;
                return viewGroup2;
            case 10:
                return ((vx) this.f3472b).A.f28628r;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f3471a) {
            case 0:
                return ((f2) this.f3472b).I0;
            case 9:
                viewGroup = ((f3) ((ev) this.f3472b).f28192x).containerView;
                return (FrameLayout) viewGroup;
            case 10:
                return ((vx) this.f3472b).A.f28628r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3471a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = ((f2) this.f3472b).f3136p0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.o2) this.f3472b).getParentActivity();
            case 2:
                e6 e6Var = (e6) this.f3472b;
                Activity ownerActivity = e6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(e6Var.getContext());
                }
                return ownerActivity;
            case 3:
                for (Context context = ((h5) this.f3472b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity findActivity = AndroidUtilities.findActivity(((d4) this.f3472b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.C1;
                }
                return findActivity;
            case 5:
            case 9:
            case 10:
            case 11:
            default:
                return super.getParentActivity();
            case 6:
                return LaunchActivity.C1;
            case 7:
                return AndroidUtilities.findActivity(((t5) this.f3472b).getContext());
            case 8:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 12:
                return ((org.telegram.ui.web.z0) this.f3472b).S;
        }
    }

    @Override
    public c6 getResourceProvider() {
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        switch (this.f3471a) {
            case 1:
                return new oc.i(new lh.b());
            case 2:
                c6Var = ((f3) ((e6) this.f3472b)).resourcesProvider;
                return c6Var;
            case 3:
            case 8:
            case 11:
            default:
                return super.getResourceProvider();
            case 4:
                return new lh.l2(0, ((d4) this.f3472b).f15539x0);
            case 5:
                return ((m4) this.f3472b).f15925b.f15439s;
            case 6:
                c6Var2 = ((f3) ((c5) this.f3472b)).resourcesProvider;
                return new lh.l2(5, c6Var2);
            case 7:
                return ((t5) this.f3472b).C1;
            case 9:
                c6Var3 = ((f3) ((ev) this.f3472b).f28192x).resourcesProvider;
                return c6Var3;
            case 10:
                return ((vx) this.f3472b).A.V1;
            case 12:
                return new lh.l2(9, ((org.telegram.ui.web.z0) this.f3472b).f44267e);
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3471a) {
            case 8:
                return new xt(this, ((yt) this.f3472b).f35130a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3471a) {
            case 1:
                return false;
            case 4:
                return false;
            case 6:
                return false;
            case 12:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f3471a) {
            case 11:
                if (z10 && z11) {
                    ((vc0) this.f3472b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.o2 o2Var) {
        switch (this.f3471a) {
            case 1:
                return false;
            case 4:
                i9 i9Var = ((d4) this.f3472b).F0;
                if (i9Var != null) {
                    i9Var.H(o2Var);
                    return true;
                }
                return true;
            case 7:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f23673a = true;
                R.showAsSheet(o2Var, obj);
                return true;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f3471a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((d4) this.f3472b).F0;
                if (i9Var != null) {
                    i9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 6:
                dialog.show();
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public z1(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f3471a = 1;
        this.f3472b = o2Var;
    }

    public z1(c5 c5Var) {
        super(null);
        int i10;
        this.f3471a = 6;
        this.f3472b = c5Var;
        i10 = ((f3) c5Var).currentAccount;
        this.currentAccount = i10;
    }

    public z1(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.f3471a = 12;
        this.f3472b = z0Var;
        this.currentAccount = z0Var.I;
    }
}
