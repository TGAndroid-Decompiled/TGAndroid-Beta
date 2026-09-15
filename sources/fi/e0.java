package fi;

import ai.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import w7.x5;
public final class e0 extends h0 {
    public final k0 h;

    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        int i11;
        e6 e6Var3;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.f9106b);
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        e6Var = ((f3) k0Var).resourcesProvider;
        e61 e61Var = new e61(context, i10, 0, false, tVar, uVar, null, e6Var);
        this.d = e61Var;
        e61Var.p1();
        e61 e61Var2 = this.d;
        e61Var2.Y2.f29613r = false;
        e61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f9107c.addView(k0Var.G, x5.g());
        this.f9107c.addView(this.d, 0, x5.c(-1.0f, -1));
        this.f9107c.addView(k0Var.I, x5.g());
        e6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var2);
        this.f9105a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9105a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.f9105a.A(k0Var.getThemedColor(i6.f19239z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f9105a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f9105a.B(k0Var.getThemedColor(i6.f19220y8), false);
        this.f9105a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f9105a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9105a.setActionBarMenuOnItemClick(new ei.t(this, 6));
        this.f9107c.addView(this.f9105a, x5.e(-1, 56, 48));
        this.f9107c.addView(k0Var.E, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9105a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        e6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, e6Var3, true);
        k0Var.f9124r = dVar;
        dVar.e();
        k0Var.f9124r.setText(LocaleController.getString(R.string.OK));
        k0Var.f9124r.setOnClickListener(new v0(this, 18));
        if (z10) {
            k0Var.f9124r.setVisibility(8);
        }
        this.f9107c.addView(k0Var.f9124r, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.h.f9121c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
