package bg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;
public final class a0 extends org.telegram.ui.ActionBar.f3 {
    public static a0 f1690e;
    public final w f1691b;
    public final q2 f1692c;
    public boolean d;

    public a0(Activity activity, h1 h1Var, q2 q2Var, b6 b6Var, boolean z10) {
        super(activity, b6Var, true, false);
        boolean z11;
        this.f1692c = q2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        if (i0.a.f(f6.v0(f6.f23072h5, this.resourcesProvider)) > 0.699999988079071d) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.setLightStatusBar(this, z11);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        w wVar = new w(this, getContext(), q2Var, b6Var, h1Var);
        this.f1691b = wVar;
        wVar.setOverScrollMode(2);
        wVar.setClipToPadding(false);
        wVar.setAdapter(new x(h1Var, q2Var));
        wVar.setPosition(0);
        setCustomView(wVar);
        h1Var.f1822p0 = new v(this, 0);
        h1Var.f1820n0 = new we.b(9, this, q2Var);
        q2Var.f1938q0 = new y(this, h1Var, b6Var);
        q2Var.f1936o0 = new v(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        gc.a(this.container, new z(0));
    }

    public static void m(org.telegram.ui.ActionBar.o2 o2Var, b6 b6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        org.telegram.ui.ActionBar.o2 o2Var2;
        if (f1690e != null) {
            return;
        }
        boolean z10 = b6Var instanceof ih.b;
        if (z10) {
            o2Var2 = new i1(o2Var);
        } else {
            o2Var2 = o2Var;
        }
        a0 a0Var = new a0(o2Var.getParentActivity(), new h1(o2Var2, j10, prepaidGiveaway), new q2(o2Var2, j10), o2Var2.getResourceProvider(), z10);
        a0Var.show();
        f1690e = a0Var;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f1690e = null;
    }

    @Override
    public final void onBackPressed() {
        w wVar = this.f1691b;
        if (wVar.getCurrentPosition() > 0) {
            q2 q2Var = this.f1692c;
            if (q2Var.R()) {
                return;
            }
            if (isKeyboardVisible()) {
                AndroidUtilities.hideKeyboard(q2Var.getContainerView());
            }
            wVar.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        this.f1692c.onConfigurationChanged(configuration);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        super.onConfigurationChanged(configuration);
    }
}
