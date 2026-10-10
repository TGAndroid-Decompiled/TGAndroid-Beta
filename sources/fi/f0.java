package fi;

import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class f0 extends h0 {
    public final y9 h;
    public final j9 f9966n;
    public final k0 f9967r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        this.f9967r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        e6Var = ((f3) k0Var).resourcesProvider;
        l71 l71Var = new l71(context, i10, 0, false, tVar, uVar, uVar2, e6Var);
        this.d = l71Var;
        l71Var.p1();
        l71 l71Var2 = this.d;
        l71Var2.W2.f25587r = false;
        l71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9974b);
        this.f9975c.addView(k0Var.F, x5.g());
        this.f9975c.addView(this.d, x5.g());
        this.f9975c.addView(k0Var.H, x5.g());
        e6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var2);
        this.f9973a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9973a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.f9973a.C(k0Var.getThemedColor(i6.f21205z8), false);
        this.f9973a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9973a.D(k0Var.getThemedColor(i6.f21187y8), false);
        this.f9973a.setTitle(DialogObject.getName(k0Var.f9993f));
        this.f9973a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9973a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        j9 j9Var = new j9(k0Var.f9993f);
        this.f9966n = j9Var;
        y9 y9Var = new y9(getContext());
        this.h = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        y9Var.e(k0Var.f9993f, j9Var);
        this.f9973a.addView(y9Var, x5.c(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9975c.addView(this.f9973a, x5.e(-1, 56, 48));
        this.f9975c.addView(k0Var.f9999y, x5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.z o9 = this.f9973a.o();
        o9.setGlassMode(true);
        o9.setTranslationX(-AndroidUtilities.dp(7.0f));
        o9.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9993f)) {
            o9.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        e6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, e6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9993f)) {
            er erVar = new er(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9994n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9975c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9967r.f9990b.f16341e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9967r.f9999y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
