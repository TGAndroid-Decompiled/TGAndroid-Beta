package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import w7.z5;
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
        AndroidUtilities.removeFromParent(this.f12156b);
        i10 = ((f3) k0Var).currentAccount;
        s sVar = new s(k0Var, 3);
        u uVar = new u(k0Var, 2);
        d6Var = ((f3) k0Var).resourcesProvider;
        b71 b71Var = new b71(context, i10, 0, false, sVar, uVar, null, d6Var);
        this.d = b71Var;
        b71Var.p1();
        b71 b71Var2 = this.d;
        b71Var2.W2.f30438r = false;
        b71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f12157c.addView(k0Var.G, z5.g());
        this.f12157c.addView(this.d, 0, z5.c(-1.0f, -1));
        this.f12157c.addView(k0Var.I, z5.g());
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f12155a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f12155a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f12155a.B(k0Var.getThemedColor(h6.f21396z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f12155a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f12155a.C(k0Var.getThemedColor(h6.f21379y8), false);
        this.f12155a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f12155a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12155a.setActionBarMenuOnItemClick(new ah.s(this, 8));
        this.f12157c.addView(this.f12155a, z5.e(-1, 56, 48));
        this.f12157c.addView(k0Var.E, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y n10 = this.f12155a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, d6Var3, true);
        k0Var.f12174r = dVar;
        dVar.e();
        k0Var.f12174r.setText(LocaleController.getString(R.string.OK));
        k0Var.f12174r.setOnClickListener(new hg.r0(this, 3));
        if (z10) {
            k0Var.f12174r.setVisibility(8);
        }
        this.f12157c.addView(k0Var.f12174r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.h.f12171c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
