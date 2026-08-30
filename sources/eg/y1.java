package eg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kh.e6;
import lh.g5;
import n7.qa;
import nh.d4;
import nh.i9;
import nh.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.zx;
import org.telegram.ui.LaunchActivity;
import ph.c5;
import ph.l4;
public final class y1 extends org.telegram.ui.ActionBar.p2 {
    public final int f5582a;
    public final Object f5583b;

    public y1(Object obj, int i10) {
        super(null);
        this.f5582a = i10;
        this.f5583b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f5582a) {
            case 9:
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
        switch (this.f5582a) {
            case 3:
                return ((g5) this.f5583b).getContext();
            case 5:
                return ((m4) this.f5583b).f15607b.getContext();
            case 6:
                return ((bu) this.f5583b).f23749a.getContext();
            case 12:
                return ((c5) this.f5583b).getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f5582a) {
            case 0:
                return this.currentAccount;
            case 1:
            case 2:
            case 4:
            case 9:
            case 10:
            case 11:
            default:
                return super.getCurrentAccount();
            case 3:
                return this.currentAccount;
            case 5:
                return this.currentAccount;
            case 6:
                return this.currentAccount;
            case 7:
                return this.currentAccount;
            case 8:
                return ((zx) this.f5583b).B.Z0;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f5582a) {
            case 0:
                viewGroup = ((g3) ((e2) this.f5583b)).containerView;
                return viewGroup;
            case 7:
                viewGroup2 = ((g3) ((hv) this.f5583b).f25506x).containerView;
                return viewGroup2;
            case 8:
                return ((zx) this.f5583b).B.f26462r;
            default:
                return super.getFragmentView();
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f5582a) {
            case 0:
                return ((e2) this.f5583b).J0;
            case 7:
                viewGroup = ((g3) ((hv) this.f5583b).f25506x).containerView;
                return (FrameLayout) viewGroup;
            case 8:
                return ((zx) this.f5583b).B.f26462r;
            default:
                return super.getLayoutContainer();
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f5582a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = ((e2) this.f5583b).f5273q0;
                if (p2Var == null) {
                    return null;
                }
                return p2Var.getParentActivity();
            case 1:
                return ((org.telegram.ui.ActionBar.p2) this.f5583b).getParentActivity();
            case 2:
                e6 e6Var = (e6) this.f5583b;
                Activity ownerActivity = e6Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.D1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(e6Var.getContext());
                }
                return ownerActivity;
            case 3:
                for (Context context = ((g5) this.f5583b).getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 4:
                Activity findActivity = AndroidUtilities.findActivity(((d4) this.f5583b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.D1;
                }
                return findActivity;
            case 5:
            case 7:
            case 8:
            case 9:
            default:
                return super.getParentActivity();
            case 6:
                for (Context context2 = getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 10:
                return ((org.telegram.ui.web.a1) this.f5583b).T;
            case 11:
                return LaunchActivity.D1;
            case 12:
                return AndroidUtilities.findActivity(((c5) this.f5583b).getContext());
        }
    }

    @Override
    public f6 getResourceProvider() {
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        switch (this.f5582a) {
            case 1:
                return new qa(new nh.b());
            case 2:
                f6Var = ((g3) ((e6) this.f5583b)).resourcesProvider;
                return f6Var;
            case 3:
            case 6:
            case 9:
            default:
                return super.getResourceProvider();
            case 4:
                return new nh.m2(0, ((d4) this.f5583b).f15257y0);
            case 5:
                return ((m4) this.f5583b).f15607b.f15271s;
            case 7:
                f6Var2 = ((g3) ((hv) this.f5583b).f25506x).resourcesProvider;
                return f6Var2;
            case 8:
                return ((zx) this.f5583b).B.W1;
            case 10:
                return new nh.m2(5, ((org.telegram.ui.web.a1) this.f5583b).e);
            case 11:
                f6Var3 = ((g3) ((l4) this.f5583b)).resourcesProvider;
                return new nh.m2(6, f6Var3);
            case 12:
                return ((c5) this.f5583b).D1;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f5582a) {
            case 6:
                return new au(this, ((bu) this.f5583b).f23749a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f5582a) {
            case 1:
                return false;
            case 4:
                return false;
            case 10:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z4, boolean z10) {
        switch (this.f5582a) {
            case 9:
                if (z4 && z10) {
                    ((bd0) this.f5583b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z4, z10);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f5582a) {
            case 1:
                return false;
            case 4:
                i9 i9Var = ((d4) this.f5583b).G0;
                if (i9Var != null) {
                    i9Var.H(p2Var);
                    return true;
                }
                return true;
            case 12:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f20478a = true;
                R.showAsSheet(p2Var, obj);
                return true;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f5582a) {
            case 0:
                dialog.show();
                return dialog;
            case 3:
                dialog.show();
                return dialog;
            case 4:
                i9 i9Var = ((d4) this.f5583b).G0;
                if (i9Var != null) {
                    i9Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 11:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public y1(org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.f5582a = 1;
        this.f5583b = p2Var;
    }

    public y1(l4 l4Var) {
        super(null);
        int i10;
        this.f5582a = 11;
        this.f5583b = l4Var;
        i10 = ((g3) l4Var).currentAccount;
        this.currentAccount = i10;
    }

    public y1(org.telegram.ui.web.a1 a1Var) {
        super(null);
        this.f5582a = 10;
        this.f5583b = a1Var;
        this.currentAccount = a1Var.J;
    }
}
