package bg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import fh.u6;
import gh.k5;
import ih.i4;
import ih.m9;
import ih.q4;
import kh.g6;
import kh.p5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gc0;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yu;
import org.telegram.ui.LaunchActivity;
public final class i1 extends org.telegram.ui.ActionBar.o2 {
    public final int f1835a;
    public final Object f1836b;

    public i1(Object obj, int i9) {
        super(null);
        this.f1835a = i9;
        this.f1836b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f1835a) {
            case 10:
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
        switch (this.f1835a) {
            case 2:
                return ((k5) this.f1836b).getContext();
            case 3:
            case 5:
            default:
                return super.getContext();
            case 4:
                return ((q4) this.f1836b).f12001b.getContext();
            case 6:
                return ((g6) this.f1836b).getContext();
            case 7:
                return ((st) this.f1836b).f32551a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f1835a) {
            case 2:
                return this.currentAccount;
            case 3:
            case 5:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 4:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return this.currentAccount;
            case 9:
                return ((nx) this.f1836b).A.Y0;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f1835a) {
            case 8:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((yu) this.f1836b).f35078x).containerView;
                return viewGroup;
            case 9:
                return ((nx) this.f1836b).A.f34437r;
            case 10:
            case 11:
            default:
                return super.getFragmentView();
            case 12:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((zf.k1) this.f1836b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f1835a) {
            case 8:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((yu) this.f1836b).f35078x).containerView;
                return (FrameLayout) viewGroup;
            case 9:
                return ((nx) this.f1836b).A.f34437r;
            case 10:
            case 11:
            default:
                return super.getLayoutContainer();
            case 12:
                return ((zf.k1) this.f1836b).I0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f1835a) {
            case 0:
                return ((org.telegram.ui.ActionBar.o2) this.f1836b).getParentActivity();
            case 1:
                u6 u6Var = (u6) this.f1836b;
                Activity ownerActivity = u6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(u6Var.getContext());
                }
                return ownerActivity;
            case 2:
                for (Context context = ((k5) this.f1836b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
                Activity findActivity = AndroidUtilities.findActivity(((i4) this.f1836b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.C1;
                }
                return findActivity;
            case 4:
            case 8:
            case 9:
            case 10:
            default:
                return super.getParentActivity();
            case 5:
                return LaunchActivity.C1;
            case 6:
                return AndroidUtilities.findActivity(((g6) this.f1836b).getContext());
            case 7:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                return ((org.telegram.ui.web.y0) this.f1836b).S;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var = ((zf.k1) this.f1836b).f50581p0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
        }
    }

    @Override
    public b6 getResourceProvider() {
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        switch (this.f1835a) {
            case 0:
                return new org.telegram.ui.Cells.e3(new ih.b());
            case 1:
                b6Var = ((org.telegram.ui.ActionBar.f3) ((u6) this.f1836b)).resourcesProvider;
                return b6Var;
            case 2:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                return new ih.n2(0, ((i4) this.f1836b).f11603x0);
            case 4:
                return ((q4) this.f1836b).f12001b.f11482s;
            case 5:
                b6Var2 = ((org.telegram.ui.ActionBar.f3) ((p5) this.f1836b)).resourcesProvider;
                return new ih.n2(5, b6Var2);
            case 6:
                return ((g6) this.f1836b).C1;
            case 8:
                b6Var3 = ((org.telegram.ui.ActionBar.f3) ((yu) this.f1836b).f35078x).resourcesProvider;
                return b6Var3;
            case 9:
                return ((nx) this.f1836b).A.V1;
            case 11:
                return new ih.n2(9, ((org.telegram.ui.web.y0) this.f1836b).f44077e);
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f1835a) {
            case 7:
                return new rt(this, ((st) this.f1836b).f32551a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f1835a) {
            case 0:
                return false;
            case 3:
                return false;
            case 5:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f1835a) {
            case 10:
                if (z10 && z11) {
                    ((gc0) this.f1836b).dismiss();
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
        switch (this.f1835a) {
            case 0:
                return false;
            case 3:
                m9 m9Var = ((i4) this.f1836b).F0;
                if (m9Var != null) {
                    m9Var.H(o2Var);
                    return true;
                }
                return true;
            case 6:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f23653a = true;
                R.showAsSheet(o2Var, obj);
                return true;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f1835a) {
            case 2:
                dialog.show();
                return dialog;
            case 3:
                m9 m9Var = ((i4) this.f1836b).F0;
                if (m9Var != null) {
                    m9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 5:
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

    public i1(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f1835a = 0;
        this.f1836b = o2Var;
    }

    public i1(p5 p5Var) {
        super(null);
        int i9;
        this.f1835a = 5;
        this.f1836b = p5Var;
        i9 = ((org.telegram.ui.ActionBar.f3) p5Var).currentAccount;
        this.currentAccount = i9;
    }

    public i1(org.telegram.ui.web.y0 y0Var) {
        super(null);
        this.f1835a = 11;
        this.f1836b = y0Var;
        this.currentAccount = y0Var.I;
    }
}
