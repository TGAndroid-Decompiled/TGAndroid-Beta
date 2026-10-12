package fi;

import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class f0 extends h0 {
    public final y9 h;
    public final j9 f9964n;
    public final k0 f9965r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.f9965r = k0Var;
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        c6Var = ((e3) k0Var).resourcesProvider;
        p71 p71Var = new p71(context, i10, 0, false, tVar, uVar, uVar2, c6Var);
        this.d = p71Var;
        p71Var.p1();
        p71 p71Var2 = this.d;
        p71Var2.W2.f26679r = false;
        p71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9972b);
        this.f9973c.addView(k0Var.F, w5.g());
        this.f9973c.addView(this.d, w5.g());
        this.f9973c.addView(k0Var.H, w5.g());
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f9971a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9971a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9971a.D(k0Var.getThemedColor(h6.f20966z8), false);
        this.f9971a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9971a.E(k0Var.getThemedColor(h6.f20948y8), false);
        this.f9971a.setTitle(DialogObject.getName(k0Var.f9991f));
        this.f9971a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9971a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        j9 j9Var = new j9(k0Var.f9991f);
        this.f9964n = j9Var;
        y9 y9Var = new y9(getContext());
        this.h = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        y9Var.e(k0Var.f9991f, j9Var);
        this.f9971a.addView(y9Var, w5.c(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9973c.addView(this.f9971a, w5.e(-1, 56, 48));
        this.f9973c.addView(k0Var.f9997y, w5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y p5 = this.f9971a.p();
        p5.setGlassMode(true);
        p5.setTranslationX(-AndroidUtilities.dp(7.0f));
        p5.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9991f)) {
            p5.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        c6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, c6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9991f)) {
            gr grVar = new gr(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(grVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9992n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9973c.addView(dVar, w5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9965r.f9988b.f16088e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9965r.f9997y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
