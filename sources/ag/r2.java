package ag;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import gh.m6;
import hh.i5;
import jh.e4;
import jh.i9;
import jh.m4;
import lh.f6;
import lh.o5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.xu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i6;

public final class r2 extends org.telegram.ui.ActionBar.n2 {

    public final int f636a;

    public final Object f637b;

    public r2(Object obj, int i10) {
        super(null);
        this.f636a = i10;
        this.f637b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f636a) {
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
        switch (this.f636a) {
            case 3:
                return ((i5) this.f637b).getContext();
            case 4:
            case 6:
            default:
                return super.getContext();
            case 5:
                return ((m4) this.f637b).f13655b.getContext();
            case 7:
                return ((f6) this.f637b).getContext();
            case 8:
                return ((rt) this.f637b).f32264a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f636a) {
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
                return ((ox) this.f637b).A.Y0;
        }
    }

    @Override
    public View getFragmentView() {
        switch (this.f636a) {
            case 0:
                return ((org.telegram.ui.ActionBar.e3) ((y2) this.f637b)).containerView;
            case 9:
                return ((org.telegram.ui.ActionBar.e3) ((xu) this.f637b).f34720x).containerView;
            case 10:
                return ((ox) this.f637b).A.f35030r;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        switch (this.f636a) {
            case 0:
                return ((y2) this.f637b).I0;
            case 9:
                return (FrameLayout) ((org.telegram.ui.ActionBar.e3) ((xu) this.f637b).f34720x).containerView;
            case 10:
                return ((ox) this.f637b).A.f35030r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f636a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = ((y2) this.f637b).f722p0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.n2) this.f637b).getParentActivity();
            case 2:
                m6 m6Var = (m6) this.f637b;
                Activity ownerActivity = m6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.C1;
                }
                return ownerActivity == null ? AndroidUtilities.findActivity(m6Var.getContext()) : ownerActivity;
            case 3:
                for (Context context = ((i5) this.f637b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity activityFindActivity = AndroidUtilities.findActivity(((e4) this.f637b).getContext());
                return activityFindActivity == null ? LaunchActivity.C1 : activityFindActivity;
            case 5:
            case 9:
            case 10:
            case 11:
            default:
                return super.getParentActivity();
            case 6:
                return LaunchActivity.C1;
            case 7:
                return AndroidUtilities.findActivity(((f6) this.f637b).getContext());
            case 8:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 12:
                return ((org.telegram.ui.web.z0) this.f637b).S;
        }
    }

    @Override
    public c6 getResourceProvider() {
        switch (this.f636a) {
            case 1:
                return new i6(new jh.b());
            case 2:
                return ((org.telegram.ui.ActionBar.e3) ((m6) this.f637b)).resourcesProvider;
            case 3:
            case 8:
            case 11:
            default:
                return super.getResourceProvider();
            case 4:
                return new jh.m2(0, ((e4) this.f637b).f13290x0);
            case 5:
                return ((m4) this.f637b).f13655b.f13157s;
            case 6:
                return new jh.m2(5, ((org.telegram.ui.ActionBar.e3) ((o5) this.f637b)).resourcesProvider);
            case 7:
                return ((f6) this.f637b).C1;
            case 9:
                return ((org.telegram.ui.ActionBar.e3) ((xu) this.f637b).f34720x).resourcesProvider;
            case 10:
                return ((ox) this.f637b).A.V1;
            case 12:
                return new jh.m2(9, ((org.telegram.ui.web.z0) this.f637b).f44064e);
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f636a) {
            case 8:
                return new qt(this, ((rt) this.f637b).f32264a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f636a) {
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
        switch (this.f636a) {
            case 11:
                if (z10 && z11) {
                    ((kc0) this.f637b).dismiss();
                    break;
                }
                break;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                break;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f636a) {
            case 1:
                return false;
            case 4:
                i9 i9Var = ((e4) this.f637b).F0;
                if (i9Var == null) {
                    return true;
                }
                i9Var.H(n2Var);
                return true;
            case 7:
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR == null) {
                    return false;
                }
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.f23619a = true;
                n2VarR.showAsSheet(n2Var, l2Var);
                return true;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f636a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((e4) this.f637b).F0;
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

    public r2(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.f636a = 1;
        this.f637b = n2Var;
    }

    public r2(o5 o5Var) {
        super(null);
        this.f636a = 6;
        this.f637b = o5Var;
        this.currentAccount = ((org.telegram.ui.ActionBar.e3) o5Var).currentAccount;
    }

    public r2(org.telegram.ui.web.z0 z0Var) {
        super(null);
        this.f636a = 12;
        this.f637b = z0Var;
        this.currentAccount = z0Var.I;
    }
}
