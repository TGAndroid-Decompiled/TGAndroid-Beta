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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class f0 extends h0 {
    public final u9 h;
    public final f9 f9098n;
    public final k0 f9099r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        this.f9099r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        e6Var = ((f3) k0Var).resourcesProvider;
        e61 e61Var = new e61(context, i10, 0, false, tVar, uVar, uVar2, e6Var);
        this.d = e61Var;
        e61Var.p1();
        e61 e61Var2 = this.d;
        e61Var2.Y2.f29613r = false;
        e61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f9106b);
        this.f9107c.addView(k0Var.F, x5.g());
        this.f9107c.addView(this.d, x5.g());
        this.f9107c.addView(k0Var.H, x5.g());
        e6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var2);
        this.f9105a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f9105a.setTitleColor(k0Var.getThemedColor(i6.G6));
        this.f9105a.A(k0Var.getThemedColor(i6.f19239z8), false);
        this.f9105a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f9105a.B(k0Var.getThemedColor(i6.f19220y8), false);
        this.f9105a.setTitle(DialogObject.getName(k0Var.f9122f));
        this.f9105a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f9105a.setActionBarMenuOnItemClick(new ei.t(this, 7));
        f9 f9Var = new f9(k0Var.f9122f);
        this.f9098n = f9Var;
        u9 u9Var = new u9(getContext());
        this.h = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        u9Var.e(k0Var.f9122f, f9Var);
        this.f9105a.addView(u9Var, x5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f9107c.addView(this.f9105a, x5.e(-1, 56, 48));
        this.f9107c.addView(k0Var.f9128y, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f9105a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f9122f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        e6Var3 = ((f3) k0Var).resourcesProvider;
        ci.d dVar = new ci.d(context2, e6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f9122f)) {
            oq oqVar = new oq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f9123n = dVar;
        dVar.setOnClickListener(new v0(this, 19));
        this.f9107c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.e0.b(this.f9099r.f9120b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f9099r.f9128y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
