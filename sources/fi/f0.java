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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w9;
import w7.d9;
import w7.z5;
public final class f0 extends h0 {
    public final w9 h;
    public final h9 f9890n;
    public final k0 f9891r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.f9891r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        d6Var = ((f3) k0Var).resourcesProvider;
        c71 c71Var = new c71(context, i10, 0, false, tVar, uVar, uVar2, d6Var);
        this.d = c71Var;
        c71Var.s1();
        c71 c71Var2 = this.d;
        c71Var2.f25245f3.f31307r = false;
        c71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9898b);
        this.f9899c.addView(k0Var.F, z5.g());
        this.f9899c.addView(this.d, z5.g());
        this.f9899c.addView(k0Var.H, z5.g());
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f9897a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9897a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.f9897a.A(k0Var.getThemedColor(i6.f21226z8), false);
        this.f9897a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9897a.B(k0Var.getThemedColor(i6.f21207y8), false);
        this.f9897a.setTitle(DialogObject.getName(k0Var.f9917f));
        this.f9897a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9897a.setActionBarMenuOnItemClick(new ei.u(this, 7));
        h9 h9Var = new h9(k0Var.f9917f);
        this.f9890n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f9917f, h9Var);
        this.f9897a.addView(w9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9899c.addView(this.f9897a, z5.e(-1, 56, 48));
        this.f9899c.addView(k0Var.f9923y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9897a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9917f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, d6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9917f)) {
            rq rqVar = new rq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9918n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9899c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return d9.a(this.f9891r.f9914b.f15435e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9891r.f9923y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
