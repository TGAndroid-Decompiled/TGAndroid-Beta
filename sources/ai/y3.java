package ai;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.LaunchActivity;
public final class y3 extends org.telegram.ui.ActionBar.o2 {
    public final int f1748a;
    public final Object f1749b;

    public y3(Object obj, int i10) {
        super(null);
        this.f1748a = i10;
        this.f1749b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f1748a) {
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
        switch (this.f1748a) {
            case 1:
                return ((s6) this.f1749b).f1507b.getContext();
            case 3:
                return ((ci.r6) this.f1749b).getContext();
            case 4:
                return ((hu) this.f1749b).f24738a.getContext();
            case 12:
                return ((yh.a4) this.f1749b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f1748a) {
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
                return ((ay) this.f1749b).E.f25713c1;
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
        switch (this.f1748a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.g3) ((nv) this.f1749b).f26552x).containerView;
                return viewGroup;
            case 6:
                return ((ay) this.f1749b).E.f25757r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) ((rg.k1) this.f1749b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f1748a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.g3) ((nv) this.f1749b).f26552x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((ay) this.f1749b).E.f25757r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((rg.k1) this.f1749b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f1748a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((f6) this.f1749b).getContext());
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
                return AndroidUtilities.findActivity(((ci.r6) this.f1749b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.d1) this.f1749b).W;
            case 9:
                org.telegram.ui.ActionBar.o2 o2Var = ((rg.k1) this.f1749b).f42384t0;
                if (o2Var == null) {
                    return null;
                }
                return o2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.o2) this.f1749b).getParentActivity();
            case 11:
                xh.y4 y4Var = (xh.y4) this.f1749b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(y4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((yh.a4) this.f1749b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        switch (this.f1748a) {
            case 0:
                return new x3(0, ((f6) this.f1749b).B0);
            case 1:
                return ((s6) this.f1749b).f1507b.f1053s;
            case 2:
                f6Var = ((org.telegram.ui.ActionBar.g3) ((ci.z5) this.f1749b)).resourcesProvider;
                return new x3(5, f6Var);
            case 3:
                return ((ci.r6) this.f1749b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                f6Var2 = ((org.telegram.ui.ActionBar.g3) ((nv) this.f1749b).f26552x).resourcesProvider;
                return f6Var2;
            case 6:
                return ((ay) this.f1749b).E.Z1;
            case 8:
                return new x3(9, ((org.telegram.ui.web.d1) this.f1749b).e);
            case 10:
                return new o0.a(new d());
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.g3) ((xh.y4) this.f1749b)).resourcesProvider;
                return f6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f1748a) {
            case 4:
                return new gu(this, ((hu) this.f1749b).f24738a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f1748a) {
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
        switch (this.f1748a) {
            case 7:
                if (z10 && z11) {
                    ((zc0) this.f1749b).dismiss();
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
        switch (this.f1748a) {
            case 0:
                jc jcVar = ((f6) this.f1749b).J0;
                if (jcVar != null) {
                    jcVar.H(o2Var);
                    return true;
                }
                return true;
            case 3:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f19397a = true;
                R.showAsSheet(o2Var, obj);
                return true;
            case 10:
                return false;
            default:
                return super.presentFragment(o2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f1748a) {
            case 0:
                jc jcVar = ((f6) this.f1749b).J0;
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

    public y3(org.telegram.ui.ActionBar.o2 o2Var) {
        super(null);
        this.f1748a = 10;
        this.f1749b = o2Var;
    }

    public y3(ci.z5 z5Var) {
        super(null);
        int i10;
        this.f1748a = 2;
        this.f1749b = z5Var;
        i10 = ((org.telegram.ui.ActionBar.g3) z5Var).currentAccount;
        this.currentAccount = i10;
    }

    public y3(org.telegram.ui.web.d1 d1Var) {
        super(null);
        this.f1748a = 8;
        this.f1749b = d1Var;
        this.currentAccount = d1Var.M;
    }
}
