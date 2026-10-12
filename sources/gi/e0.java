package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import w7.a6;
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
        AndroidUtilities.removeFromParent(this.f10186b);
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        c6Var = ((e3) k0Var).resourcesProvider;
        h71 h71Var = new h71(context, i10, 0, false, tVar, uVar, null, c6Var);
        this.d = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.d;
        h71Var2.W2.f31780r = false;
        h71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f10187c.addView(k0Var.G, a6.g());
        this.f10187c.addView(this.d, 0, a6.d(-1.0f, -1));
        this.f10187c.addView(k0Var.I, a6.g());
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f10185a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f10185a.setTitleColor(k0Var.getThemedColor(g6.G6));
        this.f10185a.B(k0Var.getThemedColor(g6.f20307z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f10185a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f10185a.D(k0Var.getThemedColor(g6.f20290y8), false);
        this.f10185a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f10185a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10185a.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.f10187c.addView(this.f10185a, a6.e(-1, 56, 48));
        this.f10187c.addView(k0Var.E, a6.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y n10 = this.f10185a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((e3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context2, c6Var3, true);
        k0Var.f10204r = dVar;
        dVar.e();
        k0Var.f10204r.setText(LocaleController.getString(R.string.OK));
        k0Var.f10204r.setOnClickListener(new ah.g0(this, 19));
        if (z10) {
            k0Var.f10204r.setVisibility(8);
        }
        this.f10187c.addView(k0Var.f10204r, a6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.h.f10201c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
