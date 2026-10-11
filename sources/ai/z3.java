package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.yu;
import org.telegram.ui.LaunchActivity;
public final class z3 extends org.telegram.ui.ActionBar.m2 {
    public final int f2002a;
    public final Object f2003b;

    public z3(Object obj, int i10) {
        super(null);
        this.f2002a = i10;
        this.f2003b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f2002a) {
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
    public Context getContext() {
        switch (this.f2002a) {
            case 1:
                return ((t6) this.f2003b).f1737b.getContext();
            case 3:
                return ((ci.q6) this.f2003b).getContext();
            case 4:
                return ((yu) this.f2003b).f33461a.getContext();
            case 12:
                return ((yh.s3) this.f2003b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f2002a) {
            case 1:
                return this.currentAccount;
            case 2:
            case 7:
            case 8:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 4:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return ((sy) this.f2003b).E.f24731c1;
            case 9:
                return this.currentAccount;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f2002a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((ew) this.f2003b).f26225x).containerView;
                return viewGroup;
            case 6:
                return ((sy) this.f2003b).E.f24776r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((rg.l1) this.f2003b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f2002a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((ew) this.f2003b).f26225x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((sy) this.f2003b).E.f24776r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((rg.l1) this.f2003b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f2002a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((f6) this.f2003b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.G1;
                }
                return findActivity;
            case 1:
            case 5:
            case 6:
            case 7:
            default:
                return super.getParentActivity();
            case 2:
                return LaunchActivity.G1;
            case 3:
                return AndroidUtilities.findActivity(((ci.q6) this.f2003b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.b1) this.f2003b).W;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = ((rg.l1) this.f2003b).f47463t0;
                if (m2Var == null) {
                    return null;
                }
                return m2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.m2) this.f2003b).getParentActivity();
            case 11:
                xh.z4 z4Var = (xh.z4) this.f2003b;
                Activity ownerActivity = z4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(z4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((yh.s3) this.f2003b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        switch (this.f2002a) {
            case 0:
                return new y3(0, ((f6) this.f2003b).B0);
            case 1:
                return ((t6) this.f2003b).f1737b.f1341s;
            case 2:
                d6Var = ((org.telegram.ui.ActionBar.e3) ((ci.y5) this.f2003b)).resourcesProvider;
                return new y3(5, d6Var);
            case 3:
                return ((ci.q6) this.f2003b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                d6Var2 = ((org.telegram.ui.ActionBar.e3) ((ew) this.f2003b).f26225x).resourcesProvider;
                return d6Var2;
            case 6:
                return ((sy) this.f2003b).E.Z1;
            case 8:
                return new y3(9, ((org.telegram.ui.web.b1) this.f2003b).f43467e);
            case 10:
                return new n7.z0(new d());
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.e3) ((xh.z4) this.f2003b)).resourcesProvider;
                return d6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f2002a) {
            case 4:
                return new xu(this, ((yu) this.f2003b).f33461a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f2002a) {
            case 0:
                return false;
            case 2:
                return false;
            case 8:
                return false;
            case 10:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f2002a) {
            case 7:
                if (z10 && z11) {
                    ((be0) this.f2003b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.m2 m2Var) {
        switch (this.f2002a) {
            case 0:
                kc kcVar = ((f6) this.f2003b).J0;
                if (kcVar != null) {
                    kcVar.H(m2Var);
                    return true;
                }
                return true;
            case 3:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f21349a = true;
                R.showAsSheet(m2Var, obj);
                return true;
            case 10:
                return false;
            default:
                return super.presentFragment(m2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f2002a) {
            case 0:
                kc kcVar = ((f6) this.f2003b).J0;
                if (kcVar != null) {
                    kcVar.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 2:
                dialog.show();
                return dialog;
            case 8:
                dialog.show();
                return dialog;
            case 9:
                dialog.show();
                return dialog;
            case 12:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public z3(org.telegram.ui.ActionBar.m2 m2Var) {
        super(null);
        this.f2002a = 10;
        this.f2003b = m2Var;
    }

    public z3(ci.y5 y5Var) {
        super(null);
        int i10;
        this.f2002a = 2;
        this.f2003b = y5Var;
        i10 = ((org.telegram.ui.ActionBar.e3) y5Var).currentAccount;
        this.currentAccount = i10;
    }

    public z3(org.telegram.ui.web.b1 b1Var) {
        super(null);
        this.f2002a = 8;
        this.f2003b = b1Var;
        this.currentAccount = b1Var.M;
    }
}
