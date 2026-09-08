package gi;

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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class f0 extends h0 {
    public final x9 h;
    public final i9 f10713n;
    public final k0 f10714r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.f10714r = k0Var;
        i10 = ((f3) k0Var).currentAccount;
        t tVar = new t(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        f6Var = ((f3) k0Var).resourcesProvider;
        d61 d61Var = new d61(context, i10, 0, false, tVar, uVar, uVar2, f6Var);
        this.d = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.d;
        d61Var2.Y2.f31162r = false;
        d61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f10721b);
        this.f10722c.addView(k0Var.F, x5.g());
        this.f10722c.addView(this.d, x5.g());
        this.f10722c.addView(k0Var.H, x5.g());
        f6Var2 = ((f3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.f10720a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f10720a.setTitleColor(k0Var.getThemedColor(j6.G6));
        this.f10720a.B(k0Var.getThemedColor(j6.f21090z8), false);
        this.f10720a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f10720a.C(k0Var.getThemedColor(j6.f21071y8), false);
        this.f10720a.setTitle(DialogObject.getName(k0Var.f10740f));
        this.f10720a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f10720a.setActionBarMenuOnItemClick(new ah.t(this, 8));
        i9 i9Var = new i9(k0Var.f10740f);
        this.f10713n = i9Var;
        x9 x9Var = new x9(getContext());
        this.h = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        x9Var.e(k0Var.f10740f, i9Var);
        this.f10720a.addView(x9Var, x5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f10722c.addView(this.f10720a, x5.e(-1, 56, 48));
        this.f10722c.addView(k0Var.f10746y, x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.f10720a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f10740f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        f6Var3 = ((f3) k0Var).resourcesProvider;
        di.d dVar = new di.d(context2, f6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(k0Var.f10740f)) {
            nq nqVar = new nq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f10741n = dVar;
        dVar.setOnClickListener(new ah.h0(this, 20));
        this.f10722c.addView(dVar, x5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return yf.f0.b(this.f10714r.f10737b.f15395e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f10714r.f10746y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
