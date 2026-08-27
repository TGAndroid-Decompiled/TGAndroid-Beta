package cg;

import android.app.Activity;
import android.content.res.Configuration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ec;

public final class x extends e3 {

    public static x f2850e;

    public final t f2851b;

    public final i2 f2852c;
    public boolean d;

    public x(Activity activity, d1 d1Var, i2 i2Var, c6 c6Var, boolean z10) {
        super(activity, c6Var, true, false);
        this.f2852c = i2Var;
        setApplyBottomPadding(false);
        setApplyTopPadding(false);
        this.useBackgroundTopPadding = false;
        setBackgroundColor(0);
        fixNavigationBar();
        AndroidUtilities.setLightStatusBar(this, i0.b.f(g6.v0(g6.f23124h5, this.resourcesProvider)) > 0.699999988079071d);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        t tVar = new t(this, getContext(), i2Var, c6Var, d1Var);
        this.f2851b = tVar;
        tVar.setOverScrollMode(2);
        tVar.setClipToPadding(false);
        tVar.setAdapter(new u(d1Var, i2Var));
        tVar.setPosition(0);
        setCustomView(tVar);
        d1Var.f2648p0 = new s(this, 0);
        d1Var.f2646n0 = new xe.b(10, this, i2Var);
        i2Var.f2724q0 = new v(this, d1Var, c6Var);
        i2Var.f2722o0 = new s(this, 1);
        if (!z10) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().R();
        }
        ec.a(this.container, new w(0));
    }

    public static void m(org.telegram.ui.ActionBar.n2 n2Var, c6 c6Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        if (f2850e != null) {
            return;
        }
        boolean z10 = c6Var instanceof jh.b;
        org.telegram.ui.ActionBar.n2 r2Var = z10 ? new ag.r2(n2Var) : n2Var;
        x xVar = new x(n2Var.getParentActivity(), new d1(r2Var, j10, prepaidGiveaway), new i2(r2Var, j10), r2Var.getResourceProvider(), z10);
        xVar.show();
        f2850e = xVar;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        f2850e = null;
    }

    @Override
    public final void onBackPressed() {
        t tVar = this.f2851b;
        if (tVar.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        i2 i2Var = this.f2852c;
        if (i2Var.S()) {
            return;
        }
        if (isKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(i2Var.getContainerView());
        }
        tVar.D(0);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2852c.onConfigurationChanged(configuration);
        this.d = getContext().getResources().getConfiguration().orientation == 2;
        super.onConfigurationChanged(configuration);
    }
}
