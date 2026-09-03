package gg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
public final class x extends g3 {
    public static x e;
    public final t f6791b;
    public final f2 f6792c;
    public boolean d;

    public x(Activity activity, b1 b1Var, f2 f2Var, f6 f6Var, boolean z4) {
        super(activity, f6Var, true, false);
        boolean z10;
        this.f6792c = f2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(j6.v0(j6.f19952h5, this.resourcesProvider)) > 0.699999988079071d) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z10);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        t tVar = new t(this, getContext(), f2Var, f6Var, b1Var);
        this.f6791b = tVar;
        tVar.setOverScrollMode(2);
        tVar.setClipToPadding(false);
        tVar.setAdapter(new u(b1Var, f2Var));
        tVar.setPosition(0);
        setCustomView(tVar);
        b1Var.f6565q0 = new s(this, 0);
        b1Var.f6563o0 = new f7.b(this, f2Var, false, 8);
        f2Var.f6629r0 = new v(this, b1Var, f6Var);
        f2Var.f6627p0 = new s(this, 1);
        if (!z4) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        ic.a(this.container, new w(0));
    }

    public static void m(org.telegram.ui.ActionBar.p2 p2Var, f6 f6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        org.telegram.ui.ActionBar.p2 p2Var2;
        if (e != null) {
            return;
        }
        boolean z4 = f6Var instanceof nh.b;
        if (z4) {
            p2Var2 = new eg.y1(p2Var);
        } else {
            p2Var2 = p2Var;
        }
        x xVar = new x(p2Var.getParentActivity(), new b1(p2Var2, j10, prepaidGiveaway), new f2(p2Var2, j10), p2Var2.getResourceProvider(), z4);
        xVar.show();
        e = xVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        e = null;
    }

    @Override
    public final void onBackPressed() {
        t tVar = this.f6791b;
        if (tVar.getCurrentPosition() > 0) {
            f2 f2Var = this.f6792c;
            if (f2Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(f2Var.getContainerView());
            }
            tVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z4;
        this.f6792c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        super.onConfigurationChanged(configuration);
    }
}
