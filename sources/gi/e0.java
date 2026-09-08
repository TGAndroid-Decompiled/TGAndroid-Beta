package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import w7.x5;
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
        AndroidUtilities.removeFromParent(this.f10721b);
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 3);
        u uVar = new u(k0Var, 2);
        f6Var = ((f3) k0Var).resourcesProvider;
        d61 d61Var = new d61(context, i10, 0, false, tVar, uVar, null, f6Var);
        this.d = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.d;
        d61Var2.Y2.f31162r = false;
        d61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f10722c.addView(k0Var.G, x5.g());
        this.f10722c.addView(this.d, 0, x5.c(-1.0f, -1));
        this.f10722c.addView(k0Var.I, x5.g());
        f6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f10720a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f10720a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.f10720a.B(k0Var.getThemedColor(j6.f21090z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f10720a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i11);
        this.f10720a.C(k0Var.getThemedColor(j6.f21071y8), false);
        this.f10720a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f10720a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10720a.setActionBarMenuOnItemClick(new ah.t(this, 7));
        this.f10722c.addView(this.f10720a, x5.e(-1, 56, 48));
        this.f10722c.addView(k0Var.E, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f10720a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        f6Var3 = ((f3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context2, f6Var3, true);
        k0Var.f10742r = dVar;
        dVar.e();
        k0Var.f10742r.setText(LocaleController.getString(R.string.OK));
        k0Var.f10742r.setOnClickListener(new ah.h0(this, 19));
        if (z10) {
            k0Var.f10742r.setVisibility(8);
        }
        this.f10722c.addView(k0Var.f10742r, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.f0.b(this.h.f10738c.f15395e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
