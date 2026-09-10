package bi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.ku;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.rv;
import org.telegram.ui.LaunchActivity;
public final class o1 extends org.telegram.ui.ActionBar.p2 {
    public final int f3297a;
    public final Object f3298b;

    public o1(Object obj, int i10) {
        super(null);
        this.f3297a = i10;
        this.f3298b = obj;
    }

    @Override
    public View createView(Context context) {
        switch (this.f3297a) {
            case 5:
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
        switch (this.f3297a) {
            case 1:
                return ((r7) this.f3298b).getContext();
            case 2:
                return ((lu) this.f3298b).f25112a.getContext();
            case 10:
                return ((xh.x3) this.f3298b).getContext();
            case 12:
                return ((zh.k3) this.f3298b).f48586b.getContext();
            default:
                return super.getContext();
        }
    }

    @Override
    public int getCurrentAccount() {
        switch (this.f3297a) {
            case 1:
                return this.currentAccount;
            case 2:
                return this.currentAccount;
            case 3:
                return this.currentAccount;
            case 4:
                return ((iy) this.f3298b).E.f26805c1;
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            default:
                return super.getCurrentAccount();
            case 7:
                return this.currentAccount;
            case 10:
                return this.currentAccount;
            case 12:
                return this.currentAccount;
        }
    }

    @Override
    public View getFragmentView() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        switch (this.f3297a) {
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((rv) this.f3298b).f26770x).containerView;
                return viewGroup;
            case 4:
                return ((iy) this.f3298b).E.f26849r;
            case 5:
            case 6:
            default:
                return super.getFragmentView();
            case 7:
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) ((qg.m1) this.f3298b)).containerView;
                return viewGroup2;
        }
    }

    @Override
    public FrameLayout getLayoutContainer() {
        ViewGroup viewGroup;
        switch (this.f3297a) {
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((rv) this.f3298b).f26770x).containerView;
                return (FrameLayout) viewGroup;
            case 4:
                return ((iy) this.f3298b).E.f26849r;
            case 5:
            case 6:
            default:
                return super.getLayoutContainer();
            case 7:
                return ((qg.m1) this.f3298b).M0;
        }
    }

    @Override
    public Activity getParentActivity() {
        switch (this.f3297a) {
            case 0:
                return LaunchActivity.G1;
            case 1:
                return AndroidUtilities.findActivity(((r7) this.f3298b).getContext());
            case 2:
                for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        return (Activity) context;
                    }
                }
                return null;
            case 3:
            case 4:
            case 5:
            default:
                return super.getParentActivity();
            case 6:
                return ((org.telegram.ui.web.c1) this.f3298b).W;
            case 7:
                org.telegram.ui.ActionBar.p2 p2Var = ((qg.m1) this.f3298b).f40830t0;
                if (p2Var == null) {
                    return null;
                }
                return p2Var.getParentActivity();
            case 8:
                return ((org.telegram.ui.ActionBar.p2) this.f3298b).getParentActivity();
            case 9:
                wh.y4 y4Var = (wh.y4) this.f3298b;
                Activity ownerActivity = y4Var.getOwnerActivity();
                if (ownerActivity == null) {
                    ownerActivity = LaunchActivity.G1;
                }
                if (ownerActivity == null) {
                    return AndroidUtilities.findActivity(y4Var.getContext());
                }
                return ownerActivity;
            case 10:
                for (Context context2 = ((xh.x3) this.f3298b).getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        return (Activity) context2;
                    }
                }
                return null;
            case 11:
                Activity findActivity = AndroidUtilities.findActivity(((zh.a3) this.f3298b).getContext());
                if (findActivity == null) {
                    return LaunchActivity.G1;
                }
                return findActivity;
        }
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        switch (this.f3297a) {
            case 0:
                f6Var = ((org.telegram.ui.ActionBar.h3) ((y6) this.f3298b)).resourcesProvider;
                return new n1(0, f6Var);
            case 1:
                return ((r7) this.f3298b).G1;
            case 2:
            case 5:
            case 7:
            case 10:
            default:
                return super.getResourceProvider();
            case 3:
                f6Var2 = ((org.telegram.ui.ActionBar.h3) ((rv) this.f3298b).f26770x).resourcesProvider;
                return f6Var2;
            case 4:
                return ((iy) this.f3298b).E.Z1;
            case 6:
                return new n1(4, ((org.telegram.ui.web.c1) this.f3298b).e);
            case 8:
                return new n7.a1(new zh.b());
            case 9:
                f6Var3 = ((org.telegram.ui.ActionBar.h3) ((wh.y4) this.f3298b)).resourcesProvider;
                return f6Var3;
            case 11:
                return new n1(5, ((zh.a3) this.f3298b).B0);
            case 12:
                return ((zh.k3) this.f3298b).f48586b.f49143s;
        }
    }

    @Override
    public Dialog getVisibleDialog() {
        switch (this.f3297a) {
            case 2:
                return new ku(this, ((lu) this.f3298b).f25112a.getContext());
            default:
                return super.getVisibleDialog();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        switch (this.f3297a) {
            case 0:
                return false;
            case 6:
                return false;
            case 8:
                return false;
            case 11:
                return false;
            default:
                return super.isLightStatusBar();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z10, boolean z11) {
        switch (this.f3297a) {
            case 5:
                if (z10 && z11) {
                    ((id0) this.f3298b).dismiss();
                    return;
                }
                return;
            default:
                super.onTransitionAnimationEnd(z10, z11);
                return;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f3297a) {
            case 1:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R == 0) {
                    return false;
                }
                ?? obj = new Object();
                obj.f18485a = true;
                R.showAsSheet(p2Var, obj);
                return true;
            case 8:
                return false;
            case 11:
                zh.u7 u7Var = ((zh.a3) this.f3298b).J0;
                if (u7Var != null) {
                    u7Var.H(p2Var);
                    return true;
                }
                return true;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f3297a) {
            case 0:
                dialog.show();
                return dialog;
            case 6:
                dialog.show();
                return dialog;
            case 7:
                dialog.show();
                return dialog;
            case 10:
                dialog.show();
                return dialog;
            case 11:
                zh.u7 u7Var = ((zh.a3) this.f3298b).J0;
                if (u7Var != null) {
                    u7Var.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }

    public o1(org.telegram.ui.ActionBar.p2 p2Var) {
        super(null);
        this.f3297a = 8;
        this.f3298b = p2Var;
    }

    public o1(y6 y6Var) {
        super(null);
        int i10;
        this.f3297a = 0;
        this.f3298b = y6Var;
        i10 = ((org.telegram.ui.ActionBar.h3) y6Var).currentAccount;
        this.currentAccount = i10;
    }

    public o1(org.telegram.ui.web.c1 c1Var) {
        super(null);
        this.f3297a = 6;
        this.f3298b = c1Var;
        this.currentAccount = c1Var.M;
    }
}
