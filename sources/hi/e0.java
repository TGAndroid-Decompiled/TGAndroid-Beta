package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j71;
import w7.z5;
public final class e0 extends h0 {
    public final k0 h;

    public e0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        int i11;
        g6 g6Var5;
        g6 g6Var6;
        this.h = k0Var;
        AndroidUtilities.removeFromParent(this.f12185b);
        i10 = ((h3) k0Var).currentAccount;
        s sVar = new s(k0Var, 3);
        u uVar = new u(k0Var, 2);
        g6Var = ((h3) k0Var).resourcesProvider;
        j71 j71Var = new j71(context, i10, 0, false, sVar, uVar, null, g6Var);
        this.d = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.d;
        j71Var2.Z2.f24972r = false;
        j71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.f12186c.addView(k0Var.G, z5.g());
        this.f12186c.addView(this.d, 0, z5.c(-1.0f, -1));
        this.f12186c.addView(k0Var.I, z5.g());
        g6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.f12184a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f12184a;
        int i12 = k6.G6;
        g6Var3 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar2, 5, i12, g6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f12184a;
        int i13 = k6.f21590z8;
        g6Var4 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar3, 3, i13, g6Var4);
        org.telegram.ui.ActionBar.k kVar4 = this.f12184a;
        boolean z10 = k0Var.N;
        if (z10) {
            i11 = R.drawable.ic_ab_close;
        } else {
            i11 = R.drawable.ic_ab_back;
        }
        kVar4.setBackButtonImage(i11);
        org.telegram.ui.ActionBar.k kVar5 = this.f12184a;
        int i14 = k6.f21573y8;
        g6Var5 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar5, 1, i14, g6Var5);
        this.f12184a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.f12184a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12184a.setActionBarMenuOnItemClick(new ah.s(this, 8));
        this.f12186c.addView(this.f12184a, z5.e(-1, 56, 48));
        this.f12186c.addView(k0Var.E, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y m10 = this.f12184a.m();
        m10.setGlassMode(true);
        m10.setTranslationX(-AndroidUtilities.dp(7.0f));
        m10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        g6Var6 = ((h3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, g6Var6, true);
        k0Var.f12203r = dVar;
        dVar.f();
        k0Var.f12203r.setText(LocaleController.getString(R.string.OK));
        k0Var.f12203r.setOnClickListener(new hg.r0(this, 3));
        if (z10) {
            k0Var.f12203r.setVisibility(8);
        }
        this.f12186c.addView(k0Var.f12203r, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.h.f12200c.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.h.E.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
