package fi;

import ai.v0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v9;
import w7.y5;
public final class f0 extends h0 {
    public final v9 h;
    public final g9 f9103n;
    public final k0 f9104r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.f9104r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        f6Var = ((f3) k0Var).resourcesProvider;
        s61 s61Var = new s61(context, i10, 0, false, tVar, uVar, uVar2, f6Var);
        this.d = s61Var;
        s61Var.q1();
        s61 s61Var2 = this.d;
        s61Var2.Y2.f25678r = false;
        s61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9111b);
        this.f9112c.addView(k0Var.F, y5.g());
        this.f9112c.addView(this.d, y5.g());
        this.f9112c.addView(k0Var.H, y5.g());
        f6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f9110a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9110a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.f9110a.A(k0Var.getThemedColor(j6.f19498z8), false);
        this.f9110a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9110a.B(k0Var.getThemedColor(j6.f19479y8), false);
        this.f9110a.setTitle(DialogObject.getName(k0Var.f9127f));
        this.f9110a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9110a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        g9 g9Var = new g9(k0Var.f9127f);
        this.f9103n = g9Var;
        v9 v9Var = new v9(getContext());
        this.h = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        v9Var.e(k0Var.f9127f, g9Var);
        this.f9110a.addView(v9Var, y5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9112c.addView(this.f9110a, y5.e(-1, 56, 48));
        this.f9112c.addView(k0Var.f9133y, y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9110a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9127f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        f6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, f6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9127f)) {
            oq oqVar = new oq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9128n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9112c.addView(dVar, y5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9104r.f9125b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9104r.f9133y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
