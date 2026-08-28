package nh;

import android.content.Context;
import fh.w4;
import g7.e6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
public final class d0 extends g0 {
    public final j0 h;

    public d0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i9;
        b6 b6Var;
        b6 b6Var2;
        int i10;
        b6 b6Var3;
        this.h = j0Var;
        AndroidUtilities.removeFromParent(this.f18638b);
        i9 = ((f3) j0Var).currentAccount;
        s sVar = new s(j0Var, 3);
        t tVar = new t(j0Var, 2);
        b6Var = ((f3) j0Var).resourcesProvider;
        i51 i51Var = new i51(context, i9, 0, false, sVar, tVar, null, b6Var);
        this.d = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.d;
        i51Var2.U2.f35188r = false;
        i51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f18639c.addView(j0Var.C, e6.g());
        this.f18639c.addView(this.d, 0, e6.c(-1.0f, -1));
        this.f18639c.addView(j0Var.E, e6.g());
        b6Var2 = ((f3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var2);
        this.f18637a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f18637a.setTitleColor(j0Var.getThemedColor(f6.G6));
        this.f18637a.A(j0Var.getThemedColor(f6.f23388z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.f18637a;
        boolean z10 = j0Var.J;
        if (z10) {
            i10 = R.drawable.ic_ab_close;
        } else {
            i10 = R.drawable.ic_ab_back;
        }
        kVar2.setBackButtonImage(i10);
        this.f18637a.C(j0Var.getThemedColor(f6.f23371y8), false);
        this.f18637a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f18637a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f18637a.setActionBarMenuOnItemClick(new w4(this, 9));
        this.f18639c.addView(this.f18637a, e6.e(-1, 56, 48));
        this.f18639c.addView(j0Var.A, e6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f18637a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        b6Var3 = ((f3) j0Var).resourcesProvider;
        kh.d dVar = new kh.d(context2, b6Var3, true);
        j0Var.f18654r = dVar;
        dVar.e();
        j0Var.f18654r.setText(LocaleController.getString(R.string.OK));
        j0Var.f18654r.setOnClickListener(new x8(this, 6));
        if (z10) {
            j0Var.f18654r.setVisibility(8);
        }
        this.f18639c.addView(j0Var.f18654r, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return ff.m0.b(this.h.f18650c.f47775e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
