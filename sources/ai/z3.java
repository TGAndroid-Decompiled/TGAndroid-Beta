package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.gw;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
public final class z3 extends org.telegram.ui.ActionBar.m2 {
    public final int f2000a;
    public final Object f2001b;

    public z3(Object obj, int i10) {
        super(null);
        this.f2000a = i10;
        this.f2001b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f2000a) {
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
        switch (this.f2000a) {
            case 1:
                return ((t6) this.f2001b).f1735b.getContext();
            case 3:
                return ((ci.q6) this.f2001b).getContext();
            case 4:
                return ((av) this.f2001b).f24481a.getContext();
            case 12:
                return ((yh.s3) this.f2001b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f2000a) {
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
                return ((uy) this.f2001b).E.f25072c1;
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
        switch (this.f2000a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((gw) this.f2001b).f26542x).containerView;
                return viewGroup;
            case 6:
                return ((uy) this.f2001b).E.f25117r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((rg.l1) this.f2001b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f2000a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((gw) this.f2001b).f26542x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((uy) this.f2001b).E.f25117r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((rg.l1) this.f2001b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f2000a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((f6) this.f2001b).getContext());
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
                return AndroidUtilities.findActivity(((ci.q6) this.f2001b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.b1) this.f2001b).W;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = ((rg.l1) this.f2001b).f47561t0;
                if (m2Var == null) {
                    return null;
                }
                return m2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.m2) this.f2001b).getParentActivity();
            case 11:
                xh.y4 y4Var = (xh.y4) this.f2001b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(y4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((yh.s3) this.f2001b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        switch (this.f2000a) {
            case 0:
                return new y3(0, ((f6) this.f2001b).B0);
            case 1:
                return ((t6) this.f2001b).f1735b.f1339s;
            case 2:
                c6Var = ((org.telegram.ui.ActionBar.e3) ((ci.y5) this.f2001b)).resourcesProvider;
                return new y3(5, c6Var);
            case 3:
                return ((ci.q6) this.f2001b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                c6Var2 = ((org.telegram.ui.ActionBar.e3) ((gw) this.f2001b).f26542x).resourcesProvider;
                return c6Var2;
            case 6:
                return ((uy) this.f2001b).E.Z1;
            case 8:
                return new y3(9, ((org.telegram.ui.web.b1) this.f2001b).f43188e);
            case 10:
                return new n7.z0(new d());
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.e3) ((xh.y4) this.f2001b)).resourcesProvider;
                return c6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f2000a) {
            case 4:
                return new zu(this, ((av) this.f2001b).f24481a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f2000a) {
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
        switch (this.f2000a) {
            case 7:
                if (z10 && z11) {
                    ((ee0) this.f2001b).dismiss();
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
        switch (this.f2000a) {
            case 0:
                kc kcVar = ((f6) this.f2001b).J0;
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
                obj.f21088a = true;
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
        switch (this.f2000a) {
            case 0:
                kc kcVar = ((f6) this.f2001b).J0;
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
        this.f2000a = 10;
        this.f2001b = m2Var;
    }

    public z3(ci.y5 y5Var) {
        super(null);
        int i10;
        this.f2000a = 2;
        this.f2001b = y5Var;
        i10 = ((org.telegram.ui.ActionBar.e3) y5Var).currentAccount;
        this.currentAccount = i10;
    }

    public z3(org.telegram.ui.web.b1 b1Var) {
        super(null);
        this.f2000a = 8;
        this.f2001b = b1Var;
        this.currentAccount = b1Var.M;
    }
}
