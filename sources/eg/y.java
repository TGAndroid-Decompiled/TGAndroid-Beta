package eg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
public final class y extends f3 {
    public static y f6190e;
    public final u f6191b;
    public final g2 f6192c;
    public boolean d;

    public y(Activity activity, c1 c1Var, g2 g2Var, c6 c6Var, boolean z10) {
        super(activity, c6Var, true, false);
        boolean z11;
        this.f6192c = g2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(g6.v0(g6.f23133h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        u uVar = new u(this, getContext(), g2Var, c6Var, c1Var);
        this.f6191b = uVar;
        uVar.setOverScrollMode(2);
        uVar.setClipToPadding(false);
        uVar.setAdapter(new v(c1Var, g2Var));
        uVar.setPosition(0);
        setCustomView(uVar);
        c1Var.f5949p0 = new t(this, 0);
        c1Var.f5947n0 = new ze.b(this, g2Var, false);
        g2Var.f6018q0 = new w(this, c1Var, c6Var);
        g2Var.f6016o0 = new t(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        mc.a(this.container, new x(0));
    }

    public static void m(org.telegram.ui.ActionBar.o2 o2Var, c6 c6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        org.telegram.ui.ActionBar.o2 o2Var2;
        if (f6190e != null) {
            return;
        }
        boolean z10 = c6Var instanceof lh.b;
        if (z10) {
            o2Var2 = new cg.z1(o2Var);
        } else {
            o2Var2 = o2Var;
        }
        y yVar = new y(o2Var.getParentActivity(), new c1(o2Var2, j10, prepaidGiveaway), new g2(o2Var2, j10), o2Var2.getResourceProvider(), z10);
        yVar.show();
        f6190e = yVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f6190e = null;
    }

    @Override
    public final void onBackPressed() {
        u uVar = this.f6191b;
        if (uVar.getCurrentPosition() > 0) {
            g2 g2Var = this.f6192c;
            if (g2Var.S()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(g2Var.getContainerView());
            }
            uVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f6192c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
