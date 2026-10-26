package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.LaunchActivity;
public final class v4 extends org.telegram.ui.ActionBar.r2 {
    public final int f5552a;
    public final Object f5553b;

    public v4(Object obj, int i10) {
        super(null);
        this.f5552a = i10;
        this.f5553b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f5552a) {
            case 8:
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
        switch (this.f5552a) {
            case 0:
                return ((h7) this.f5553b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((di.c5) this.f5553b).f8456b.getContext();
            case 4:
                return ((fi.e6) this.f5553b).getContext();
            case 5:
                return ((pu) this.f5553b).f31704a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f5552a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 3:
            case 8:
            case 9:
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
                return ((iy) this.f5553b).G.f32719c1;
            case 10:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f5552a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((vv) this.f5553b).f34272x).containerView;
                return viewGroup;
            case 7:
                return ((iy) this.f5553b).G.f32763r;
            case 8:
            case 9:
            default:
                return super.getFragmentView();
            case 10:
                viewGroup2 = ((org.telegram.ui.ActionBar.k3) ((tg.m1) this.f5553b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f5552a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.k3) ((vv) this.f5553b).f34272x).containerView;
                return (FrameLayout) viewGroup;
            case 7:
                return ((iy) this.f5553b).G.f32763r;
            case 8:
            case 9:
            default:
                return super.getLayoutContainer();
            case 10:
                return ((tg.m1) this.f5553b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f5552a) {
            case 0:
                for (Context context = ((h7) this.f5553b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(((di.q4) this.f5553b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.I1;
                }
                return findActivity;
            case 2:
            case 6:
            case 7:
            case 8:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.I1;
            case 4:
                return AndroidUtilities.findActivity(((fi.e6) this.f5553b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 9:
                return ((org.telegram.ui.web.a1) this.f5553b).W;
            case 10:
                org.telegram.ui.ActionBar.r2 r2Var = ((tg.m1) this.f5553b).f48951t0;
                if (r2Var == null) {
                    return null;
                }
                return r2Var.getParentActivity();
            case 11:
                return ((org.telegram.ui.ActionBar.r2) this.f5553b).getParentActivity();
            case 12:
                zh.y4 y4Var = (zh.y4) this.f5553b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.I1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(y4Var.getContext());
                }
                return ownerActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        switch (this.f5552a) {
            case 1:
                return new di.s2(0, ((di.q4) this.f5553b).f9015q0);
            case 2:
                return ((di.c5) this.f5553b).f8456b.f9197s;
            case 3:
                u6Var = ((org.telegram.ui.ActionBar.k3) ((fi.n5) this.f5553b)).resourcesProvider;
                return new di.s2(5, u6Var);
            case 4:
                return ((fi.e6) this.f5553b).f10819v1;
            case 5:
            case 8:
            case 10:
            default:
                return super.getResourceProvider();
            case 6:
                u6Var2 = ((org.telegram.ui.ActionBar.k3) ((vv) this.f5553b).f34272x).resourcesProvider;
                return u6Var2;
            case 7:
                return ((iy) this.f5553b).G.Z1;
            case 9:
                return new di.s2(9, ((org.telegram.ui.web.a1) this.f5553b).e);
            case 11:
                return new org.telegram.ui.ActionBar.h5(new di.b());
            case 12:
                u6Var3 = ((org.telegram.ui.ActionBar.k3) ((zh.y4) this.f5553b)).resourcesProvider;
                return u6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f5552a) {
            case 5:
                return new ou(this, ((pu) this.f5553b).f31704a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f5552a) {
            case 1:
                return false;
            case 3:
                return false;
            case 9:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f5552a) {
            case 8:
                if (z10 && z11) {
                    ((sd0) this.f5553b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.r2 r2Var) {
        switch (this.f5552a) {
            case 1:
                di.y9 y9Var = ((di.q4) this.f5553b).f9047y0;
                if (y9Var != null) {
                    y9Var.H(r2Var);
                    return true;
                }
                return true;
            case 4:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f22928a = true;
                R.showAsSheet(r2Var, obj);
                return true;
            case 11:
                return false;
            default:
                return super.presentFragment(r2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5552a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                di.y9 y9Var = ((di.q4) this.f5553b).f9047y0;
                if (y9Var != null) {
                    y9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 9:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public v4(org.telegram.ui.ActionBar.r2 r2Var) {
        super(null);
        this.f5552a = 11;
        this.f5553b = r2Var;
    }

    public v4(fi.n5 n5Var) {
        super(null);
        int i10;
        this.f5552a = 3;
        this.f5553b = n5Var;
        i10 = ((org.telegram.ui.ActionBar.k3) n5Var).currentAccount;
        this.currentAccount = i10;
    }

    public v4(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.f5552a = 9;
        this.f5553b = a1Var;
        this.currentAccount = a1Var.M;
    }
}
