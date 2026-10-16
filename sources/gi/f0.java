package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.z5;
public final class f0 extends h0 {
    public final z9 h;
    public final k9 f10182n;
    public final k0 f10183r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.f10183r = k0Var;
        i10 = ((e3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        c6Var = ((e3) k0Var).resourcesProvider;
        i71 i71Var = new i71(context, i10, 0, false, tVar, uVar, uVar2, c6Var);
        this.d = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.d;
        i71Var2.W2.f23145r = false;
        i71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f10190b);
        this.f10191c.addView(k0Var.F, z5.g());
        this.f10191c.addView(this.d, z5.g());
        this.f10191c.addView(k0Var.H, z5.g());
        c6Var2 = ((e3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var2);
        this.f10189a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f10189a.setTitleColor(k0Var.getThemedColor(g6.G6));
        this.f10189a.C(k0Var.getThemedColor(g6.f20007z8), false);
        this.f10189a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f10189a.D(k0Var.getThemedColor(g6.f19990y8), false);
        this.f10189a.setTitle(DialogObject.getName(k0Var.f10206f));
        this.f10189a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10189a.setActionBarMenuOnItemClick(new ah.s(this, 8));
        k9 k9Var = new k9(k0Var.f10206f);
        this.f10182n = k9Var;
        z9 z9Var = new z9(getContext());
        this.h = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        z9Var.e(k0Var.f10206f, k9Var);
        this.f10189a.addView(z9Var, z5.c(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f10191c.addView(this.f10189a, z5.e(-1, 56, 48));
        this.f10191c.addView(k0Var.f10212y, z5.a(40.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 48));
        org.telegram.ui.ActionBar.y n10 = this.f10189a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f10206f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        c6Var3 = ((e3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context2, c6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f10206f)) {
            br brVar = new br(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f10207n = dVar;
        dVar.setOnClickListener(new ah.g0(this, 20));
        this.f10191c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.f10183r.f10204b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f10183r.f10212y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
