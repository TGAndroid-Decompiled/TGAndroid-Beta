package nh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import fh.w4;
import g7.e6;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
public final class e0 extends g0 {
    public final o9 h;
    public final z8 f18626n;
    public final j0 f18627r;

    public e0(j0 j0Var, Context context) {
        super(j0Var, context);
        int i9;
        b6 b6Var;
        b6 b6Var2;
        b6 b6Var3;
        this.f18627r = j0Var;
        i9 = ((f3) j0Var).currentAccount;
        s sVar = new s(j0Var, 4);
        t tVar = new t(j0Var, 3);
        t tVar2 = new t(j0Var, 4);
        b6Var = ((f3) j0Var).resourcesProvider;
        i51 i51Var = new i51(context, i9, 0, false, sVar, tVar, tVar2, b6Var);
        this.d = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.d;
        i51Var2.U2.f35188r = false;
        i51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f18638b);
        this.f18639c.addView(j0Var.B, e6.g());
        this.f18639c.addView(this.d, e6.g());
        this.f18639c.addView(j0Var.D, e6.g());
        b6Var2 = ((f3) j0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, b6Var2);
        this.f18637a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f18637a.setTitleColor(j0Var.getThemedColor(f6.G6));
        this.f18637a.A(j0Var.getThemedColor(f6.f23388z8), false);
        this.f18637a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f18637a.C(j0Var.getThemedColor(f6.f23371y8), false);
        this.f18637a.setTitle(DialogObject.getName(j0Var.f18652f));
        this.f18637a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f18637a.setActionBarMenuOnItemClick(new w4(this, 10));
        z8 z8Var = new z8(j0Var.f18652f);
        this.f18626n = z8Var;
        o9 o9Var = new o9(getContext());
        this.h = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        o9Var.e(j0Var.f18652f, z8Var);
        this.f18637a.addView(o9Var, e6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f18639c.addView(this.f18637a, e6.e(-1, 56, 48));
        this.f18639c.addView(j0Var.f18658y, e6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f18637a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(j0Var.f18652f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        b6Var3 = ((f3) j0Var).resourcesProvider;
        kh.d dVar = new kh.d(context2, b6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(j0Var.f18652f)) {
            eq eqVar = new eq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        j0Var.f18653n = dVar;
        dVar.setOnClickListener(new x8(this, 7));
        this.f18639c.addView(dVar, e6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return ff.m0.b(this.f18627r.f18649b.f47775e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f18627r.f18658y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
