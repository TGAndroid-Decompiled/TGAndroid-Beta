package fi;

import ai.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.u61;
import w7.y5;
public final class e0 extends h0 {
    public final k0 h;

    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        int i11;
        f6 f6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.f9111b);
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        f6Var = ((f3) k0Var).resourcesProvider;
        u61 u61Var = new u61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = u61Var;
        u61Var.q1();
        u61 u61Var2 = this.d;
        u61Var2.Y2.f26342r = false;
        u61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f9112c.addView(k0Var.G, y5.g());
        this.f9112c.addView(this.d, 0, y5.c(-1.0f, -1));
        this.f9112c.addView(k0Var.I, y5.g());
        f6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f9110a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9110a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.f9110a.A(k0Var.getThemedColor(j6.f19513z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9110a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f9110a.B(k0Var.getThemedColor(j6.f19494y8), false);
        this.f9110a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f9110a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9110a.setActionBarMenuOnItemClick(new ei.t(this, 6));
        this.f9112c.addView(this.f9110a, y5.e(-1, 56, 48));
        this.f9112c.addView(k0Var.E, y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9110a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        f6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, f6Var3, true);
        k0Var.f9129r = dVar;
        dVar.e();
        k0Var.f9129r.setText(LocaleController.getString(R.string.OK));
        k0Var.f9129r.setOnClickListener(new v0(this, 18));
        if (z10) {
            k0Var.f9129r.setVisibility(8);
        }
        this.f9112c.addView(k0Var.f9129r, y5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.h.f9126c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
