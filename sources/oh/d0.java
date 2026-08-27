package oh;

import ag.e2;
import android.content.Context;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k51;

public final class d0 extends g0 {
    public final j0 h;

    public d0(j0 j0Var, Context context) {
        super(j0Var, context);
        this.h = j0Var;
        AndroidUtilities.removeFromParent(this.f19487b);
        k51 k51Var = new k51(context, ((e3) j0Var).currentAccount, 0, false, new s(j0Var, 3), new t(j0Var, 2), null, ((e3) j0Var).resourcesProvider);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.f26942r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f19488c.addView(j0Var.C, z5.g());
        this.f19488c.addView(this.d, 0, z5.c(-1.0f, -1));
        this.f19488c.addView(j0Var.E, z5.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, ((e3) j0Var).resourcesProvider);
        this.f19486a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f19486a.setTitleColor(j0Var.getThemedColor(g6.G6));
        this.f19486a.C(j0Var.getThemedColor(g6.f23443z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f19486a;
        boolean z10 = j0Var.J;
        kVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.f19486a.D(j0Var.getThemedColor(g6.f23425y8), false);
        this.f19486a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f19486a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f19486a.setActionBarMenuOnItemClick(new e2(this, 10));
        this.f19488c.addView(this.f19486a, z5.e(-1, 56, 48));
        this.f19488c.addView(j0Var.A, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z zVarN = this.f19486a.n();
        zVarN.setGlassMode(true);
        zVarN.setTranslationX(-AndroidUtilities.dp(7.0f));
        zVarN.a(3, R.drawable.outline_header_search);
        lh.d dVar = new lh.d(getContext(), ((e3) j0Var).resourcesProvider, true);
        j0Var.f19503r = dVar;
        dVar.e();
        j0Var.f19503r.setText(LocaleController.getString(R.string.OK));
        j0Var.f19503r.setOnClickListener(new c5(this, 8));
        if (z10) {
            j0Var.f19503r.setVisibility(8);
        }
        this.f19488c.addView(j0Var.f19503r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return gf.m0.b(this.h.f19499c.f48497e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
