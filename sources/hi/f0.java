package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
import w7.z5;
public final class f0 extends h0 {
    public final u9 h;
    public final f9 f12177n;
    public final k0 f12178r;

    public f0(k0 k0Var, Context context) {
        super(k0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        this.f12178r = k0Var;
        i10 = ((h3) k0Var).currentAccount;
        s sVar = new s(k0Var, 4);
        u uVar = new u(k0Var, 3);
        u uVar2 = new u(k0Var, 4);
        g6Var = ((h3) k0Var).resourcesProvider;
        i71 i71Var = new i71(context, i10, 0, false, sVar, uVar, uVar2, g6Var);
        this.d = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.d;
        i71Var2.Z2.f24646r = false;
        i71Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f12185b);
        this.f12186c.addView(k0Var.F, z5.g());
        this.f12186c.addView(this.d, z5.g());
        this.f12186c.addView(k0Var.H, z5.g());
        g6Var2 = ((h3) k0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.f12184a = kVar;
        kVar.setOccupyStatusBar(false);
        org.telegram.ui.ActionBar.k kVar2 = this.f12184a;
        int i11 = k6.G6;
        g6Var3 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar2, 5, i11, g6Var3);
        org.telegram.ui.ActionBar.k kVar3 = this.f12184a;
        int i12 = k6.f21591z8;
        g6Var4 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar3, 3, i12, g6Var4);
        this.f12184a.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar4 = this.f12184a;
        int i13 = k6.f21574y8;
        g6Var5 = ((h3) k0Var).resourcesProvider;
        r6.m(kVar4, 1, i13, g6Var5);
        this.f12184a.setTitle(DialogObject.getName(k0Var.f12201f));
        this.f12184a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f12184a.setActionBarMenuOnItemClick(new ah.s(this, 9));
        f9 f9Var = new f9(k0Var.f12201f);
        this.f12177n = f9Var;
        u9 u9Var = new u9(getContext());
        this.h = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        u9Var.e(k0Var.f12201f, f9Var);
        this.f12184a.addView(u9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f12186c.addView(this.f12184a, z5.e(-1, 56, 48));
        this.f12186c.addView(k0Var.f12207y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y m10 = this.f12184a.m();
        m10.setGlassMode(true);
        m10.setTranslationX(-AndroidUtilities.dp(7.0f));
        m10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(k0Var.f12201f)) {
            m10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        g6Var6 = ((h3) k0Var).resourcesProvider;
        ei.d dVar = new ei.d(context2, g6Var6, true);
        dVar.f();
        if (ChatObject.canAddChatToCommunity(k0Var.f12201f)) {
            vq vqVar = new vq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        k0Var.f12202n = dVar;
        dVar.setOnClickListener(new hg.r0(this, 4));
        this.f12186c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return zf.f0.b(this.f12178r.f12199b.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f12178r.f12207y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
