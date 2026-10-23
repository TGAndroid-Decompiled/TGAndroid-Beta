package hi;

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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;
public final class f0 extends h0 {
    public final w9 h;
    public final h9 f12146n;
    public final k0 f12147r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        d6 d6Var;
        d6 d6Var2;
        d6 d6Var3;
        this.f12147r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        s sVar = new s(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        d6Var = ((f3) k0Var).resourcesProvider;
        c71 c71Var = new c71(context, i10, 0, false, sVar, uVar, uVar2, d6Var);
        this.d = c71Var;
        c71Var.p1();
        c71 c71Var2 = this.d;
        c71Var2.W2.f30865r = false;
        c71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f12154b);
        this.f12155c.addView(k0Var.F, z5.g());
        this.f12155c.addView(this.d, z5.g());
        this.f12155c.addView(k0Var.H, z5.g());
        d6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var2);
        this.f12153a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f12153a.setTitleColor(k0Var.getThemedColor(h6.G6));
        this.f12153a.B(k0Var.getThemedColor(h6.f21401z8), false);
        this.f12153a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f12153a.C(k0Var.getThemedColor(h6.f21384y8), false);
        this.f12153a.setTitle(DialogObject.getName(k0Var.f12170f));
        this.f12153a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12153a.setActionBarMenuOnItemClick(new ah.s(this, 9));
        h9 h9Var = new h9(k0Var.f12170f);
        this.f12146n = h9Var;
        w9 w9Var = new w9(getContext());
        this.h = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        w9Var.e(k0Var.f12170f, h9Var);
        this.f12153a.addView(w9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f12155c.addView(this.f12153a, z5.e(-1, 56, 48));
        this.f12155c.addView(k0Var.f12176y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y n10 = this.f12153a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f12170f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        d6Var3 = ((f3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, d6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f12170f)) {
            yq yqVar = new yq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f12171n = dVar;
        dVar.setOnClickListener(new hg.r0(this, 4));
        this.f12155c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.f12147r.f12168b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f12147r.f12176y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
