package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vv;
import org.telegram.ui.LaunchActivity;
public final class a5 extends org.telegram.ui.ActionBar.n2 {
    public final int f956a;
    public final Object f957b;

    public a5(Object obj, int i10) {
        super(null);
        this.f956a = i10;
        this.f957b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f956a) {
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
        switch (this.f956a) {
            case 0:
                return ((l7) this.f957b).getContext();
            case 1:
            case 3:
            default:
                return super.getContext();
            case 2:
                return ((ci.d5) this.f957b).f5319b.getContext();
            case 4:
                return ((ei.f6) this.f957b).getContext();
            case 5:
                return ((ou) this.f957b).f29141a.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f956a) {
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
                return ((jy) this.f957b).E.f30722c1;
            case 10:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f956a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((vv) this.f957b).f31877x).containerView;
                return viewGroup;
            case 7:
                return ((jy) this.f957b).E.f30766r;
            case 8:
            case 9:
            default:
                return super.getFragmentView();
            case 10:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((sg.m1) this.f957b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f956a) {
            case 6:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((vv) this.f957b).f31877x).containerView;
                return (FrameLayout) viewGroup;
            case 7:
                return ((jy) this.f957b).E.f30766r;
            case 8:
            case 9:
            default:
                return super.getLayoutContainer();
            case 10:
                return ((sg.m1) this.f957b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f956a) {
            case 0:
                for (Context context = ((l7) this.f957b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 1:
                Activity findActivity = AndroidUtilities.findActivity(((ci.q4) this.f957b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.H1;
                }
                return findActivity;
            case 2:
            case 6:
            case 7:
            case 8:
            default:
                return super.getParentActivity();
            case 3:
                return LaunchActivity.H1;
            case 4:
                return AndroidUtilities.findActivity(((ei.f6) this.f957b).getContext());
            case 5:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 9:
                return ((org.telegram.ui.web.a1) this.f957b).W;
            case 10:
                org.telegram.ui.ActionBar.n2 n2Var = ((sg.m1) this.f957b).f46345t0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 11:
                return ((org.telegram.ui.ActionBar.n2) this.f957b).getParentActivity();
            case 12:
                yh.x4 x4Var = (yh.x4) this.f957b;
                Activity ownerActivity = x4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.H1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(x4Var.getContext());
                }
                return ownerActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        switch (this.f956a) {
            case 1:
                return new ci.t2(0, ((ci.q4) this.f957b).B0);
            case 2:
                return ((ci.d5) this.f957b).f5319b.f6052s;
            case 3:
                d6Var = ((org.telegram.ui.ActionBar.f3) ((ei.o5) this.f957b)).resourcesProvider;
                return new ci.t2(5, d6Var);
            case 4:
                return ((ei.f6) this.f957b).G1;
            case 5:
            case 8:
            case 10:
            default:
                return super.getResourceProvider();
            case 6:
                d6Var2 = ((org.telegram.ui.ActionBar.f3) ((vv) this.f957b).f31877x).resourcesProvider;
                return d6Var2;
            case 7:
                return ((jy) this.f957b).E.Z1;
            case 9:
                return new ci.t2(9, ((org.telegram.ui.web.a1) this.f957b).e);
            case 11:
                return new mi.q((org.telegram.ui.ActionBar.d6) new ci.b());
            case 12:
                d6Var3 = ((org.telegram.ui.ActionBar.f3) ((yh.x4) this.f957b)).resourcesProvider;
                return d6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f956a) {
            case 5:
                return new nu(this, ((ou) this.f957b).f29141a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f956a) {
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
        switch (this.f956a) {
            case 8:
                if (z10 && z11) {
                    ((td0) this.f957b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.n2 n2Var) {
        switch (this.f956a) {
            case 1:
                ci.aa aaVar = ((ci.q4) this.f957b).J0;
                if (aaVar != null) {
                    aaVar.H(n2Var);
                    return true;
                }
                return true;
            case 4:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f21556a = true;
                R.showAsSheet(n2Var, obj);
                return true;
            case 11:
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f956a) {
            case 0:
                dialog.show();
                return dialog;
            case 1:
                ci.aa aaVar = ((ci.q4) this.f957b).J0;
                if (aaVar != null) {
                    aaVar.showDialog(dialog);
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

    public a5(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.f956a = 11;
        this.f957b = n2Var;
    }

    public a5(ei.o5 o5Var) {
        super(null);
        int i10;
        this.f956a = 3;
        this.f957b = o5Var;
        i10 = ((org.telegram.ui.ActionBar.f3) o5Var).currentAccount;
        this.currentAccount = i10;
    }

    public a5(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.f956a = 9;
        this.f957b = a1Var;
        this.currentAccount = a1Var.M;
    }
}
