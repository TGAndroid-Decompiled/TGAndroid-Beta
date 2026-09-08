package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.mv;
import org.telegram.ui.LaunchActivity;
public final class l3 extends org.telegram.ui.ActionBar.n2 {
    public final int f3266a;
    public final Object f3267b;

    public l3(Object obj, int i10) {
        super(null);
        this.f3266a = i10;
        this.f3267b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f3266a) {
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
        switch (this.f3266a) {
            case 1:
                return ((b6) this.f3267b).f2826b.getContext();
            case 3:
                return ((di.q6) this.f3267b).getContext();
            case 4:
                return ((fu) this.f3267b).f26210a.getContext();
            case 12:
                return ((zh.w3) this.f3267b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3266a) {
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
                return ((cy) this.f3267b).E.f27959c1;
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
        switch (this.f3266a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((mv) this.f3267b).f28573x).containerView;
                return viewGroup;
            case 6:
                return ((cy) this.f3267b).E.f28004r;
            case 7:
            case 8:
            default:
                return super.getFragmentView();
            case 9:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((sg.o1) this.f3267b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f3266a) {
            case 5:
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((mv) this.f3267b).f28573x).containerView;
                return (FrameLayout) viewGroup;
            case 6:
                return ((cy) this.f3267b).E.f28004r;
            case 7:
            case 8:
            default:
                return super.getLayoutContainer();
            case 9:
                return ((sg.o1) this.f3267b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3266a) {
            case 0:
                Activity findActivity = AndroidUtilities.findActivity(((o5) this.f3267b).getContext());
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
                return AndroidUtilities.findActivity(((di.q6) this.f3267b).getContext());
            case 4:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 8:
                return ((org.telegram.ui.web.d1) this.f3267b).W;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = ((sg.o1) this.f3267b).f46240t0;
                if (n2Var == null) {
                    return null;
                }
                return n2Var.getParentActivity();
            case 10:
                return ((org.telegram.ui.ActionBar.n2) this.f3267b).getParentActivity();
            case 11:
                yh.x4 x4Var = (yh.x4) this.f3267b;
                Activity ownerActivity = x4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(x4Var.getContext());
                }
                return ownerActivity;
            case 12:
                for (Context context2 = ((zh.w3) this.f3267b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
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
        switch (this.f3266a) {
            case 0:
                return new k3(0, ((o5) this.f3267b).B0);
            case 1:
                return ((b6) this.f3267b).f2826b.f3724s;
            case 2:
                f6Var = ((org.telegram.ui.ActionBar.f3) ((di.z5) this.f3267b)).resourcesProvider;
                return new k3(5, f6Var);
            case 3:
                return ((di.q6) this.f3267b).G1;
            case 4:
            case 7:
            case 9:
            default:
                return super.getResourceProvider();
            case 5:
                f6Var2 = ((org.telegram.ui.ActionBar.f3) ((mv) this.f3267b).f28573x).resourcesProvider;
                return f6Var2;
            case 6:
                return ((cy) this.f3267b).E.Z1;
            case 8:
                return new k3(9, ((org.telegram.ui.web.d1) this.f3267b).f42069e);
            case 10:
                return new o0.a(new b());
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.f3) ((yh.x4) this.f3267b)).resourcesProvider;
                return f6Var3;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3266a) {
            case 4:
                return new eu(this, ((fu) this.f3267b).f26210a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3266a) {
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
        switch (this.f3266a) {
            case 7:
                if (z10 && z11) {
                    ((ad0) this.f3267b).dismiss();
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
        switch (this.f3266a) {
            case 0:
                pb pbVar = ((o5) this.f3267b).J0;
                if (pbVar != null) {
                    pbVar.H(n2Var);
                    return true;
                }
                return true;
            case 3:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f21169a = true;
                R.showAsSheet(n2Var, obj);
                return true;
            case 10:
                return false;
            default:
                return super.presentFragment(n2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f3266a) {
            case 0:
                pb pbVar = ((o5) this.f3267b).J0;
                if (pbVar != null) {
                    pbVar.showDialog(dialog);
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

    public l3(org.telegram.ui.ActionBar.n2 n2Var) {
        super(null);
        this.f3266a = 10;
        this.f3267b = n2Var;
    }

    public l3(di.z5 z5Var) {
        super(null);
        int i10;
        this.f3266a = 2;
        this.f3267b = z5Var;
        i10 = ((org.telegram.ui.ActionBar.f3) z5Var).currentAccount;
        this.currentAccount = i10;
    }

    public l3(org.telegram.ui.web.d1 d1Var) {
        super(null);
        this.f3266a = 8;
        this.f3267b = d1Var;
        this.currentAccount = d1Var.M;
    }
}
