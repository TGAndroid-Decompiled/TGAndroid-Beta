package cg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.gy;

public final class k1 extends ag.y2 {
    public static k1 O0;
    public final eg.a M0;
    public final String N0;

    public k1(org.telegram.ui.ActionBar.n2 n2Var, int i10, TLRPC.User user, ag.p pVar, String str, boolean z10, c6 c6Var) {
        super(n2Var, i10, user, pVar, null, c6Var);
        this.N0 = str;
        ec.a((FrameLayout) this.containerView, new w(2));
        if (!z10) {
            zk0 zk0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            zk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            eg.a aVar = new eg.a(getContext(), this.resourcesProvider);
            this.M0 = aVar;
            aVar.setOnClickListener(new ag.w0(this, 3));
            eg.a aVar2 = this.M0;
            aVar2.f5385e = true;
            lh.d dVar = aVar2.f5382a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f5383b.setBackgroundColor(g6.v0(g6.f23124h5, aVar2.f5384c));
            this.containerView.addView(this.M0, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(k1 k1Var, TLRPC.TL_error tL_error) {
        k1Var.M0.b(false);
        r.c(tL_error, (FrameLayout) k1Var.containerView, k1Var.resourcesProvider, new i1(k1Var, 0));
    }

    public static void d0(k1 k1Var) {
        ag.y2 y2Var = new ag.y2(k1Var.f31855n, UserConfig.selectedAccount, null, null, null, k1Var.resourcesProvider);
        y2Var.F0 = true;
        y2Var.G0 = true;
        y2Var.Y = true;
        k1Var.f31855n.showDialog(y2Var);
    }

    public static void e0(k1 k1Var) {
        String str = "https://t.me/giftcode/" + k1Var.N0;
        gy gyVar = new gy(org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true));
        gyVar.f38621y2 = new ag.h0(10, k1Var, str);
        k1Var.f31855n.presentFragment(gyVar);
        k1Var.dismiss();
    }

    @Override
    public final int X() {
        return 6;
    }

    @Override
    public final void Y(View view) {
        ((eg.w) view).setSlug(this.N0);
    }

    @Override
    public final View Z(Context context, int i10) {
        if (i10 != 6) {
            return null;
        }
        eg.w wVar = new eg.w(context, this.resourcesProvider);
        wVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        return wVar;
    }

    @Override
    public final void a0(boolean z10) {
        super.a0(z10);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.L0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), g6.gc, 0, new i1(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f709b0;
        this.f710c0 = i10;
        this.f711d0 = i10 + 1;
        int i11 = i10 + 2;
        this.f709b0 = i11;
        this.f712e0 = i11;
        this.f713f0 = i11;
        int size = this.T.size() + i11;
        this.f714g0 = size;
        this.f709b0 = size + 1;
        this.f715h0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        O0 = null;
    }
}
