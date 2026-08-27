package oh;

import ag.e2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import h7.z5;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

public final class e0 extends g0 {
    public final n9 h;

    public final y8 f19475n;

    public final j0 f19476r;

    public e0(j0 j0Var, Context context) {
        super(j0Var, context);
        this.f19476r = j0Var;
        k51 k51Var = new k51(context, ((e3) j0Var).currentAccount, 0, false, new s(j0Var, 4), new t(j0Var, 3), new t(j0Var, 4), ((e3) j0Var).resourcesProvider);
        this.d = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.d;
        k51Var2.U2.f26942r = false;
        k51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.f19487b);
        this.f19488c.addView(j0Var.B, z5.g());
        this.f19488c.addView(this.d, z5.g());
        this.f19488c.addView(j0Var.D, z5.g());
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, ((e3) j0Var).resourcesProvider);
        this.f19486a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f19486a.setTitleColor(j0Var.getThemedColor(g6.G6));
        this.f19486a.C(j0Var.getThemedColor(g6.f23443z8), false);
        this.f19486a.setBackButtonImage(R.drawable.ic_ab_back);
        this.f19486a.D(j0Var.getThemedColor(g6.f23425y8), false);
        this.f19486a.setTitle(DialogObject.getName(j0Var.f19501f));
        this.f19486a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.f19486a.setActionBarMenuOnItemClick(new e2(this, 11));
        y8 y8Var = new y8(j0Var.f19501f);
        this.f19475n = y8Var;
        n9 n9Var = new n9(getContext());
        this.h = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        n9Var.e(j0Var.f19501f, y8Var);
        this.f19486a.addView(n9Var, z5.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f19488c.addView(this.f19486a, z5.e(-1, 56, 48));
        this.f19488c.addView(j0Var.f19507y, z5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z zVarN = this.f19486a.n();
        zVarN.setGlassMode(true);
        zVarN.setTranslationX(-AndroidUtilities.dp(7.0f));
        zVarN.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(j0Var.f19501f)) {
            zVarN.a(2, R.drawable.msg_download_settings);
        }
        lh.d dVar = new lh.d(getContext(), ((e3) j0Var).resourcesProvider, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(j0Var.f19501f)) {
            cq cqVar = new cq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        j0Var.f19502n = dVar;
        dVar.setOnClickListener(new c5(this, 9));
        this.f19488c.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override
    public final float b() {
        return gf.m0.b(this.f19476r.f19498b.f48497e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f19476r.f19507y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
