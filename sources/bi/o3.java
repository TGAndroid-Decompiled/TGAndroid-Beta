package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.Components.zv;
import org.telegram.ui.LaunchActivity;
public final class o3 extends org.telegram.ui.ActionBar.m2 {
    public final int f3409a;
    public final Object f3410b;

    public o3(Object obj, int i10) {
        super(null);
        this.f3409a = i10;
        this.f3410b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f3409a) {
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
        switch (this.f3409a) {
            case 1:
                return ((e6) this.f3410b).f2991b.getContext();
            case 3:
                return ((di.o6) this.f3410b).getContext();
            case 4:
                return ((tu) this.f3410b).f29192a.getContext();
            case 12:
                return ((zh.r3) this.f3410b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3409a) {
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
                return ((ny) this.f3410b).E.f30707c1;
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
        switch (this.f3409a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((zv) this.f3410b).f31697x).containerView;
                return viewGroup;
            case 6:
                return ((ny) this.f3410b).E.f30751r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((sg.m1) this.f3410b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f3409a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.e3) ((zv) this.f3410b).f31697x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((ny) this.f3410b).E.f30751r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((sg.m1) this.f3410b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3409a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((q5) this.f3410b).getContext());
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
                return AndroidUtilities.findActivity(((di.o6) this.f3410b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.c1) this.f3410b).W;
            case 9:
                org.telegram.ui.ActionBar.m2 m2Var = ((sg.m1) this.f3410b).f45270t0;
                if (m2Var == null) {
                    return null;
                }
                return m2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.m2) this.f3410b).getParentActivity();
            case 11:
                yh.x4 x4Var = (yh.x4) this.f3410b;
                Activity ownerActivity = x4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(x4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((zh.r3) this.f3410b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
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
        switch (this.f3409a) {
            case 0:
                return new n3(0, ((q5) this.f3410b).B0);
            case 1:
                return ((e6) this.f3410b).f2991b.f3910s;
            case 2:
                c6Var = ((org.telegram.ui.ActionBar.e3) ((di.x5) this.f3410b)).resourcesProvider;
                return new n3(5, c6Var);
            case 3:
                return ((di.o6) this.f3410b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                c6Var2 = ((org.telegram.ui.ActionBar.e3) ((zv) this.f3410b).f31697x).resourcesProvider;
                return c6Var2;
            case 6:
                return ((ny) this.f3410b).E.Z1;
            case 8:
                return new n3(9, ((org.telegram.ui.web.c1) this.f3410b).e);
            case 10:
                return new m2.t((org.telegram.ui.ActionBar.c6) new b());
            case 11:
                c6Var3 = ((org.telegram.ui.ActionBar.e3) ((yh.x4) this.f3410b)).resourcesProvider;
                return c6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3409a) {
            case 4:
                return new su(this, ((tu) this.f3410b).f29192a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3409a) {
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
        switch (this.f3409a) {
            case 7:
                if (z10 && z11) {
                    ((zd0) this.f3410b).dismiss();
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
        switch (this.f3409a) {
            case 0:
                sb sbVar = ((q5) this.f3410b).J0;
                if (sbVar != null) {
                    sbVar.H(m2Var);
                    return true;
                }
                return true;
            case 3:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f20169a = true;
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
        switch (this.f3409a) {
            case 0:
                sb sbVar = ((q5) this.f3410b).J0;
                if (sbVar != null) {
                    sbVar.showDialog(dialog);
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

    public o3(org.telegram.ui.ActionBar.m2 m2Var) {
        super(null);
        this.f3409a = 10;
        this.f3410b = m2Var;
    }

    public o3(di.x5 x5Var) {
        super(null);
        int i10;
        this.f3409a = 2;
        this.f3410b = x5Var;
        i10 = ((org.telegram.ui.ActionBar.e3) x5Var).currentAccount;
        this.currentAccount = i10;
    }

    public o3(org.telegram.ui.web.c1 c1Var) {
        super(null);
        this.f3409a = 8;
        this.f3410b = c1Var;
        this.currentAccount = c1Var.M;
    }
}
