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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class f0 extends h0 {
    public final w9 h;
    public final h9 f9090n;
    public final k0 f9091r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        this.f9091r = k0Var;
        i10 = ((g3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        e6Var = ((g3) k0Var).resourcesProvider;
        t61 t61Var = new t61(context, i10, 0, false, tVar, uVar, uVar2, e6Var);
        this.d = t61Var;
        t61Var.q1();
        t61 t61Var2 = this.d;
        t61Var2.Y2.f25959r = false;
        t61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9098b);
        this.f9099c.addView(k0Var.F, y5.g());
        this.f9099c.addView(this.d, y5.g());
        this.f9099c.addView(k0Var.H, y5.g());
        e6Var2 = ((g3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, e6Var2);
        this.f9097a = lVar;
        lVar.setOccupyStatusBar(false);
        this.f9097a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.f9097a.B(k0Var.getThemedColor(i6.f19463z8), false);
        this.f9097a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9097a.E(k0Var.getThemedColor(i6.f19444y8), false);
        this.f9097a.setTitle(DialogObject.getName(k0Var.f9114f));
        this.f9097a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9097a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        h9 h9Var = new h9(k0Var.f9114f);
        this.f9090n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f9114f, h9Var);
        this.f9097a.addView(w9Var, y5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9099c.addView(this.f9097a, y5.e(-1, 56, 48));
        this.f9099c.addView(k0Var.f9120y, y5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 o9 = this.f9097a.o();
        o9.setGlassMode(true);
        o9.setTranslationX(-AndroidUtilities.dp(7.0f));
        o9.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9114f)) {
            o9.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        e6Var3 = ((g3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, e6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9114f)) {
            qq qqVar = new qq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(qqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9115n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9099c.addView(dVar, y5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9091r.f9112b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9091r.f9120y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
