package ii;

import a8.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
public final class e0 extends g0 {
    public final y9 h;
    public final j9 f14336n;
    public final j0 f14337r;

    public e0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i10;
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        this.f14337r = j0Var;
        i10 = ((k3) j0Var).currentAccount;
        s sVar = new s(j0Var, 4);
        t tVar = new t(j0Var, 3);
        t tVar2 = new t(j0Var, 4);
        u6Var = ((k3) j0Var).resourcesProvider;
        r71 r71Var = new r71(context, i10, 0, false, sVar, tVar, tVar2, u6Var);
        this.d = r71Var;
        r71Var.u1();
        r71 r71Var2 = this.d;
        r71Var2.f32150g3.f29505r = false;
        r71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f14348b);
        this.f14349c.addView(j0Var.F, gb1.k());
        this.f14349c.addView(this.d, gb1.k());
        this.f14349c.addView(j0Var.H, gb1.k());
        u6Var2 = ((k3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var2);
        this.f14347a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f14347a;
        int i11 = y6.G6;
        u6Var3 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar2, 5, i11, u6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f14347a;
        int i12 = y6.f23767z8;
        u6Var4 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar3, 3, i12, u6Var4);
        this.f14347a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.f14347a;
        int i13 = y6.f23748y8;
        u6Var5 = ((k3) j0Var).resourcesProvider;
        f7.m(kVar4, 1, i13, u6Var5);
        this.f14347a.setTitle(DialogObject.getName(j0Var.f14360f));
        this.f14347a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f14347a.setActionBarMenuOnItemClick(new bh.m(this, 9));
        j9 j9Var = new j9(j0Var.f14360f);
        this.f14336n = j9Var;
        y9 y9Var = new y9(getContext());
        this.h = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        y9Var.f(j0Var.f14360f, j9Var);
        this.f14347a.addView(y9Var, gb1.f(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f14349c.addView(this.f14347a, gb1.i(-1, 56, 48));
        this.f14349c.addView(j0Var.f14366y, gb1.h(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z l4 = this.f14347a.l();
        l4.setGlassMode(true);
        l4.setTranslationX(-AndroidUtilities.dp(7.0f));
        l4.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(j0Var.f14360f)) {
            l4.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        u6Var6 = ((k3) j0Var).resourcesProvider;
        fi.d dVar = new fi.d(context2, u6Var6, true);
        dVar.f();
        if (ChatObject.canAddChatToCommunity(j0Var.f14360f)) {
            zq zqVar = new zq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        j0Var.f14361n = dVar;
        dVar.setOnClickListener(new ig.d0(this, 5));
        this.f14349c.addView(dVar, gb1.j(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return v0.a(this.f14337r.f14358b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f14337r.f14366y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
