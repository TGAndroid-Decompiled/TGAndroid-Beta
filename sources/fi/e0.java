package fi;

import ai.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.p71;
import w7.w5;
public final class e0 extends h0 {
    public final k0 h;

    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        int i11;
        c6 c6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.f9972b);
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        c6Var = ((e3) k0Var).resourcesProvider;
        p71 p71Var = new p71(context, i10, 0, false, tVar, uVar, null, c6Var);
        this.d = p71Var;
        p71Var.p1();
        p71 p71Var2 = this.d;
        p71Var2.W2.f26679r = false;
        p71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f9973c.addView(k0Var.G, w5.g());
        this.f9973c.addView(this.d, 0, w5.d(-1.0f, -1));
        this.f9973c.addView(k0Var.I, w5.g());
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f9971a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9971a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9971a.D(k0Var.getThemedColor(h6.f20966z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9971a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f9971a.E(k0Var.getThemedColor(h6.f20948y8), false);
        this.f9971a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f9971a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9971a.setActionBarMenuOnItemClick(new ei.t(this, 6));
        this.f9973c.addView(this.f9971a, w5.e(-1, 56, 48));
        this.f9973c.addView(k0Var.E, w5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y p5 = this.f9971a.p();
        p5.setGlassMode(true);
        p5.setTranslationX(-AndroidUtilities.dp(7.0f));
        p5.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, c6Var3, true);
        k0Var.f9993r = dVar;
        dVar.e();
        k0Var.f9993r.setText(LocaleController.getString(R.string.OK));
        k0Var.f9993r.setOnClickListener(new v0(this, 18));
        if (z10) {
            k0Var.f9993r.setVisibility(8);
        }
        this.f9973c.addView(k0Var.f9993r, w5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.h.f9989c.f16088e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
