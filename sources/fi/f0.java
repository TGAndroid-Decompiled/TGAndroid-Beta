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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class f0 extends h0 {
    public final w9 h;
    public final h9 f9097n;
    public final k0 f9098r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.f9098r = k0Var;
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        d6Var = ((e3) k0Var).resourcesProvider;
        u61 u61Var = new u61(context, i10, 0, false, tVar, uVar, uVar2, d6Var);
        this.d = u61Var;
        u61Var.s1();
        u61 u61Var2 = this.d;
        u61Var2.f28778f3.f26223r = false;
        u61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9105b);
        this.f9106c.addView(k0Var.F, y5.g());
        this.f9106c.addView(this.d, y5.g());
        this.f9106c.addView(k0Var.H, y5.g());
        d6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9104a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9104a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9104a.A(k0Var.getThemedColor(h6.f19480z8), false);
        this.f9104a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9104a.B(k0Var.getThemedColor(h6.f19461y8), false);
        this.f9104a.setTitle(DialogObject.getName(k0Var.f9121f));
        this.f9104a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9104a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        h9 h9Var = new h9(k0Var.f9121f);
        this.f9097n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f9121f, h9Var);
        this.f9104a.addView(w9Var, y5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9106c.addView(this.f9104a, y5.e(-1, 56, 48));
        this.f9106c.addView(k0Var.f9127y, y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y n10 = this.f9104a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9121f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        d6Var3 = ((e3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, d6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9121f)) {
            rq rqVar = new rq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9122n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9106c.addView(dVar, y5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9098r.f9119b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9098r.f9127y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
