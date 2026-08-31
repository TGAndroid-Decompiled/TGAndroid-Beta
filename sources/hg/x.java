package hg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
public final class x extends h3 {
    public static x f7660e;
    public final t f7661b;
    public final f2 f7662c;
    public boolean d;

    public x(Activity activity, b1 b1Var, f2 f2Var, g6 g6Var, boolean z4) {
        super(activity, g6Var, true, false);
        boolean z10;
        this.f7662c = f2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(k6.v0(k6.f21731h5, this.resourcesProvider)) > 0.699999988079071d) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z10);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        t tVar = new t(this, getContext(), f2Var, g6Var, b1Var);
        this.f7661b = tVar;
        tVar.setOverScrollMode(2);
        tVar.setClipToPadding(false);
        tVar.setAdapter(new u(b1Var, f2Var));
        tVar.setPosition(0);
        setCustomView(tVar);
        b1Var.f7417q0 = new s(this, 0);
        b1Var.f7415o0 = new f7.b(this, f2Var, false, 9);
        f2Var.f7486r0 = new v(this, b1Var, g6Var);
        f2Var.f7484p0 = new s(this, 1);
        if (!z4) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        ic.a(this.container, new w(0));
    }

    public static void m(org.telegram.ui.ActionBar.p2 p2Var, g6 g6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        org.telegram.ui.ActionBar.p2 p2Var2;
        if (f7660e != null) {
            return;
        }
        boolean z4 = g6Var instanceof oh.b;
        if (z4) {
            p2Var2 = new fg.x1(p2Var);
        } else {
            p2Var2 = p2Var;
        }
        x xVar = new x(p2Var.getParentActivity(), new b1(p2Var2, j10, prepaidGiveaway), new f2(p2Var2, j10), p2Var2.getResourceProvider(), z4);
        xVar.show();
        f7660e = xVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f7660e = null;
    }

    @Override
    public final void onBackPressed() {
        t tVar = this.f7661b;
        if (tVar.getCurrentPosition() > 0) {
            f2 f2Var = this.f7662c;
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
        this.f7662c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        super.onConfigurationChanged(configuration);
    }
}
