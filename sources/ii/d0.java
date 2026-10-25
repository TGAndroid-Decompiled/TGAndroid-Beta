package ii;

import a8.v0;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.r71;
public final class d0 extends g0 {
    public final j0 h;

    public d0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        int i11;
        u6 u6Var5;
        u6 u6Var6;
        this.h = j0Var;
        AndroidUtilities.removeFromParent(this.f14348b);
        i10 = ((k3) j0Var).currentAccount;
        s sVar = new s(j0Var, 3);
        t tVar = new t(j0Var, 2);
        u6Var = ((k3) j0Var).resourcesProvider;
        r71 r71Var = new r71(context, i10, 0, false, sVar, tVar, null, u6Var);
        this.d = r71Var;
        r71Var.u1();
        r71 r71Var2 = this.d;
        r71Var2.f32150g3.f29505r = false;
        r71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f14349c.addView(j0Var.G, gb1.k());
        this.f14349c.addView(this.d, 0, gb1.g(-1.0f, -1));
        this.f14349c.addView(j0Var.I, gb1.k());
        u6Var2 = ((k3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var2);
        this.f14347a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f14347a;
        int i12 = y6.G6;
        u6Var3 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar2, 5, i12, u6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f14347a;
        int i13 = y6.f23767z8;
        u6Var4 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar3, 3, i13, u6Var4);
        org.telegram.ui.ActionBar.k kVar4 = this.f14347a;
        boolean z10 = j0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar4.setBackButtonImage(i11);
        org.telegram.ui.ActionBar.k kVar5 = this.f14347a;
        int i14 = y6.f23748y8;
        u6Var5 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar5, 1, i14, u6Var5);
        this.f14347a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f14347a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f14347a.setActionBarMenuOnItemClick(new bh.m(this, 8));
        this.f14349c.addView(this.f14347a, gb1.i(-1, 56, 48));
        this.f14349c.addView(j0Var.E, gb1.h(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z l4 = this.f14347a.l();
        l4.setGlassMode(true);
        l4.setTranslationX(-AndroidUtilities.dp(7.0f));
        l4.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        u6Var6 = ((k3) j0Var).resourcesProvider;
        fi.d dVar = new fi.d(context2, u6Var6, true);
        j0Var.f14362r = dVar;
        dVar.f();
        j0Var.f14362r.setText(LocaleController.getString(R.string.OK));
        j0Var.f14362r.setOnClickListener(new ig.d0(this, 4));
        if (z10) {
            j0Var.f14362r.setVisibility(8);
        }
        this.f14349c.addView(j0Var.f14362r, gb1.j(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return v0.a(this.h.f14359c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
