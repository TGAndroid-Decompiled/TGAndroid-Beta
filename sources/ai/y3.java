package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ov;
import org.telegram.ui.LaunchActivity;
public final class y3 extends org.telegram.ui.ActionBar.m2 {
    public final int f1743a;
    public final Object f1744b;

    public y3(Object obj, int i10) {
        super(null);
        this.f1743a = i10;
        this.f1744b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f1743a) {
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
        switch (this.f1743a) {
            case 1:
                return ((s6) this.f1744b).f1497b.getContext();
            case 3:
                return ((ci.q6) this.f1744b).getContext();
            case 4:
                return ((iu) this.f1744b).f25171a.getContext();
            case 12:
                return ((yh.x3) this.f1744b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f1743a) {
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
                return ((dy) this.f1744b).E.f26236c1;
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
        switch (this.f1743a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((ov) this.f1744b).f27205x).containerView;
                return viewGroup;
            case 6:
                return ((dy) this.f1744b).E.f26280r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((rg.k1) this.f1744b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f1743a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((ov) this.f1744b).f27205x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((dy) this.f1744b).E.f26280r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((rg.k1) this.f1744b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f1743a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((e6) this.f1744b).getContext());
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
                return AndroidUtilities.findActivity(((ci.q6) this.f1744b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.b1) this.f1744b).W;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = ((rg.k1) this.f1744b).f42646t0;
                if (m2Var == null) {
                    return null;
                }
                return m2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.m2) this.f1744b).getParentActivity();
            case 11:
                xh.z4 z4Var = (xh.z4) this.f1744b;
                Activity ownerActivity = z4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(z4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((yh.x3) this.f1744b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
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
        switch (this.f1743a) {
            case 0:
                return new x3(0, ((e6) this.f1744b).B0);
            case 1:
                return ((s6) this.f1744b).f1497b.f1134s;
            case 2:
                d6Var = ((org.telegram.ui.ActionBar.e3) ((ci.y5) this.f1744b)).resourcesProvider;
                return new x3(5, d6Var);
            case 3:
                return ((ci.q6) this.f1744b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                d6Var2 = ((org.telegram.ui.ActionBar.e3) ((ov) this.f1744b).f27205x).resourcesProvider;
                return d6Var2;
            case 6:
                return ((dy) this.f1744b).E.Z1;
            case 8:
                return new x3(9, ((org.telegram.ui.web.b1) this.f1744b).e);
            case 10:
                return new o0.a(new d());
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.e3) ((xh.z4) this.f1744b)).resourcesProvider;
                return d6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f1743a) {
            case 4:
                return new hu(this, ((iu) this.f1744b).f25171a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f1743a) {
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
        switch (this.f1743a) {
            case 7:
                if (z10 && z11) {
                    ((kd0) this.f1744b).dismiss();
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
        switch (this.f1743a) {
            case 0:
                jc jcVar = ((e6) this.f1744b).J0;
                if (jcVar != null) {
                    jcVar.H(m2Var);
                    return true;
                }
                return true;
            case 3:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f19581a = true;
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
        switch (this.f1743a) {
            case 0:
                jc jcVar = ((e6) this.f1744b).J0;
                if (jcVar != null) {
                    jcVar.showDialog(dialog);
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

    public y3(org.telegram.ui.ActionBar.m2 m2Var) {
        super(null);
        this.f1743a = 10;
        this.f1744b = m2Var;
    }

    public y3(ci.y5 y5Var) {
        super(null);
        int i10;
        this.f1743a = 2;
        this.f1744b = y5Var;
        i10 = ((org.telegram.ui.ActionBar.e3) y5Var).currentAccount;
        this.currentAccount = i10;
    }

    public y3(org.telegram.ui.web.b1 b1Var) {
        super(null);
        this.f1743a = 8;
        this.f1744b = b1Var;
        this.currentAccount = b1Var.M;
    }
}
