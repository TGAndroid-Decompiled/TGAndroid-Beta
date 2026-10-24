package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.LaunchActivity;
public final class a5 extends org.telegram.ui.ActionBar.o2 {
    public final int f957a;
    public final Object f958b;

    public a5(Object obj, int i10) {
        super(null);
        this.f957a = i10;
        this.f958b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f957a) {
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
        switch (this.f957a) {
            case 0:
                return ((l7) this.f958b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((ci.c5) this.f958b).f5221b.getContext();
            case 4:
                return ((ei.f6) this.f958b).getContext();
            case 5:
                return ((mu) this.f958b).f28697a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f957a) {
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
                return ((hy) this.f958b).G.f30310c1;
            case 10:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f957a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((tv) this.f958b).f30899x).containerView;
                return viewGroup;
            case 7:
                return ((hy) this.f958b).G.f30354r;
            case 8:
            case 9:
            default:
                return super.getFragmentView();
            case 10:
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) ((sg.m1) this.f958b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f957a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((tv) this.f958b).f30899x).containerView;
                return (FrameLayout) viewGroup;
            case 7:
                return ((hy) this.f958b).G.f30354r;
            case 8:
            case 9:
            default:
                return super.getLayoutContainer();
            case 10:
                return ((sg.m1) this.f958b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f957a) {
            case 0:
                for (Context context = ((l7) this.f958b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(((ci.p4) this.f958b).getContext());
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
                return AndroidUtilities.findActivity(((ei.f6) this.f958b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 9:
                return ((org.telegram.ui.web.b1) this.f958b).W;
            case 10:
                org.telegram.ui.ActionBar.o2 o2Var = ((sg.m1) this.f958b).f46772t0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
            case 11:
                return ((org.telegram.ui.ActionBar.o2) this.f958b).getParentActivity();
            case 12:
                yh.x4 x4Var = (yh.x4) this.f958b;
                Activity ownerActivity = x4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.I1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(x4Var.getContext());
                }
                return ownerActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        switch (this.f957a) {
            case 1:
                return new ci.s2(0, ((ci.p4) this.f958b).B0);
            case 2:
                return ((ci.c5) this.f958b).f5221b.f5959s;
            case 3:
                g6Var = ((org.telegram.ui.ActionBar.h3) ((ei.o5) this.f958b)).resourcesProvider;
                return new ci.s2(5, g6Var);
            case 4:
                return ((ei.f6) this.f958b).G1;
            case 5:
            case 8:
            case 10:
            default:
                return super.getResourceProvider();
            case 6:
                g6Var2 = ((org.telegram.ui.ActionBar.h3) ((tv) this.f958b).f30899x).resourcesProvider;
                return g6Var2;
            case 7:
                return ((hy) this.f958b).G.Z1;
            case 9:
                return new ci.s2(9, ((org.telegram.ui.web.b1) this.f958b).e);
            case 11:
                return new org.telegram.ui.ActionBar.f5(new ci.b());
            case 12:
                g6Var3 = ((org.telegram.ui.ActionBar.h3) ((yh.x4) this.f958b)).resourcesProvider;
                return g6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f957a) {
            case 5:
                return new lu(this, ((mu) this.f958b).f28697a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f957a) {
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
        switch (this.f957a) {
            case 8:
                if (z10 && z11) {
                    ((ud0) this.f958b).dismiss();
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
        switch (this.f957a) {
            case 1:
                ci.z9 z9Var = ((ci.p4) this.f958b).J0;
                if (z9Var != null) {
                    z9Var.H(o2Var);
                    return true;
                }
                return true;
            case 4:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f21637a = true;
                R.showAsSheet(o2Var, obj);
                return true;
            case 11:
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f957a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                ci.z9 z9Var = ((ci.p4) this.f958b).J0;
                if (z9Var != null) {
                    z9Var.showDialog(dialog);
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

    public a5(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f957a = 11;
        this.f958b = o2Var;
    }

    public a5(ei.o5 o5Var) {
        super(null);
        int i10;
        this.f957a = 3;
        this.f958b = o5Var;
        i10 = ((org.telegram.ui.ActionBar.h3) o5Var).currentAccount;
        this.currentAccount = i10;
    }

    public a5(org.telegram.ui.web.b1 b1Var) {
        super(null);
        this.f957a = 9;
        this.f958b = b1Var;
        this.currentAccount = b1Var.M;
    }
}
