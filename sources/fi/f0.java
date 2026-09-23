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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w9;
import w7.x5;
public final class f0 extends h0 {
    public final w9 h;
    public final h9 f9086n;
    public final k0 f9087r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.f9087r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        d6Var = ((f3) k0Var).resourcesProvider;
        d61 d61Var = new d61(context, i10, 0, false, tVar, uVar, uVar2, d6Var);
        this.d = d61Var;
        d61Var.p1();
        d61 d61Var2 = this.d;
        d61Var2.Y2.f28662r = false;
        d61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9094b);
        this.f9095c.addView(k0Var.F, x5.g());
        this.f9095c.addView(this.d, x5.g());
        this.f9095c.addView(k0Var.H, x5.g());
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9093a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9093a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f9093a.A(k0Var.getThemedColor(h6.f19191z8), false);
        this.f9093a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9093a.B(k0Var.getThemedColor(h6.f19172y8), false);
        this.f9093a.setTitle(DialogObject.getName(k0Var.f9110f));
        this.f9093a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9093a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        h9 h9Var = new h9(k0Var.f9110f);
        this.f9086n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f9110f, h9Var);
        this.f9093a.addView(w9Var, x5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9095c.addView(this.f9093a, x5.e(-1, 56, 48));
        this.f9095c.addView(k0Var.f9116y, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9093a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9110f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, d6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9110f)) {
            pq pqVar = new pq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9111n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9095c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9087r.f9108b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9087r.f9116y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
