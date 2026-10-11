package fi;

import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class f0 extends h0 {
    public final y9 h;
    public final j9 f9965n;
    public final k0 f9966r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.f9966r = k0Var;
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        d6Var = ((e3) k0Var).resourcesProvider;
        m71 m71Var = new m71(context, i10, 0, false, tVar, uVar, uVar2, d6Var);
        this.d = m71Var;
        m71Var.p1();
        m71 m71Var2 = this.d;
        m71Var2.W2.f25890r = false;
        m71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9973b);
        this.f9974c.addView(k0Var.F, x5.g());
        this.f9974c.addView(this.d, x5.g());
        this.f9974c.addView(k0Var.H, x5.g());
        d6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9972a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9972a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9972a.C(k0Var.getThemedColor(h6.f21191z8), false);
        this.f9972a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9972a.D(k0Var.getThemedColor(h6.f21173y8), false);
        this.f9972a.setTitle(DialogObject.getName(k0Var.f9992f));
        this.f9972a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9972a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        j9 j9Var = new j9(k0Var.f9992f);
        this.f9965n = j9Var;
        y9 y9Var = new y9(getContext());
        this.h = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        y9Var.e(k0Var.f9992f, j9Var);
        this.f9972a.addView(y9Var, x5.c(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9974c.addView(this.f9972a, x5.e(-1, 56, 48));
        this.f9974c.addView(k0Var.f9998y, x5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y o9 = this.f9972a.o();
        o9.setGlassMode(true);
        o9.setTranslationX(-AndroidUtilities.dp(7.0f));
        o9.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9992f)) {
            o9.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        d6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, d6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9992f)) {
            er erVar = new er(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(erVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9993n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9974c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9966r.f9989b.f16365e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9966r.f9998y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
