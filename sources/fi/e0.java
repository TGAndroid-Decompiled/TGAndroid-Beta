package fi;

import ai.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m71;
import w7.x5;
public final class e0 extends h0 {
    public final k0 h;

    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        int i11;
        d6 d6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.f9973b);
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        d6Var = ((e3) k0Var).resourcesProvider;
        m71 m71Var = new m71(context, i10, 0, false, tVar, uVar, null, d6Var);
        this.d = m71Var;
        m71Var.p1();
        m71 m71Var2 = this.d;
        m71Var2.W2.f25890r = false;
        m71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f9974c.addView(k0Var.G, x5.g());
        this.f9974c.addView(this.d, 0, x5.d(-1.0f, -1));
        this.f9974c.addView(k0Var.I, x5.g());
        d6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9972a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9972a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9972a.C(k0Var.getThemedColor(h6.f21191z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9972a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f9972a.D(k0Var.getThemedColor(h6.f21173y8), false);
        this.f9972a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f9972a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9972a.setActionBarMenuOnItemClick(new ei.t(this, 6));
        this.f9974c.addView(this.f9972a, x5.e(-1, 56, 48));
        this.f9974c.addView(k0Var.E, x5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y o9 = this.f9972a.o();
        o9.setGlassMode(true);
        o9.setTranslationX(-AndroidUtilities.dp(7.0f));
        o9.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        d6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, d6Var3, true);
        k0Var.f9994r = dVar;
        dVar.e();
        k0Var.f9994r.setText(LocaleController.getString(R.string.OK));
        k0Var.f9994r.setOnClickListener(new v0(this, 18));
        if (z10) {
            k0Var.f9994r.setVisibility(8);
        }
        this.f9974c.addView(k0Var.f9994r, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.h.f9990c.f16365e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
