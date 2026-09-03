package gg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.qy;
public final class i1 extends eg.e2 {
    public static i1 P0;
    public final ig.a N0;
    public final String O0;

    public i1(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, eg.n nVar, String str, boolean z4, f6 f6Var) {
        super(p2Var, i10, user, nVar, null, f6Var);
        this.O0 = str;
        ic.a((FrameLayout) this.containerView, new w(2));
        if (!z4) {
            rl0 rl0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            rl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            ig.a aVar = new ig.a(getContext(), this.resourcesProvider);
            this.N0 = aVar;
            aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 7));
            ig.a aVar2 = this.N0;
            aVar2.e = true;
            ph.d dVar = aVar2.f7470a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f7471b.setBackgroundColor(j6.v0(j6.f19952h5, aVar2.f7472c));
            this.containerView.addView(this.N0, b6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(i1 i1Var, TLRPC.TL_error tL_error) {
        i1Var.N0.b(false);
        r.c(tL_error, (FrameLayout) i1Var.containerView, i1Var.resourcesProvider, new g1(i1Var, 0));
    }

    public static void d0(i1 i1Var) {
        eg.e2 e2Var = new eg.e2(i1Var.f28701n, UserConfig.selectedAccount, null, null, null, i1Var.resourcesProvider);
        e2Var.G0 = true;
        e2Var.H0 = true;
        e2Var.Z = true;
        i1Var.f28701n.showDialog(e2Var);
    }

    public static void e0(i1 i1Var) {
        qy qyVar = new qy(y3.e(3, "onlySelect", "dialogsType", true));
        qyVar.f37649z2 = new c1.b(16, i1Var, "https://t.me/giftcode/" + i1Var.O0);
        i1Var.f28701n.presentFragment(qyVar);
        i1Var.dismiss();
    }

    @Override
    public final int X() {
        return 6;
    }

    @Override
    public final void Y(View view) {
        ((ig.v) view).setSlug(this.O0);
    }

    @Override
    public final View Z(Context context, int i10) {
        if (i10 == 6) {
            ig.v vVar = new ig.v(context, this.resourcesProvider);
            vVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return vVar;
        }
        return null;
    }

    @Override
    public final void a0(boolean z4) {
        super.a0(z4);
        this.M0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.M0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.M0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), j6.f19941gc, 0, new g1(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f5249c0;
        this.f5250d0 = i10;
        this.f5251e0 = i10 + 1;
        int i11 = i10 + 2;
        this.f5249c0 = i11;
        this.f5252f0 = i11;
        this.f5253g0 = i11;
        int size = this.U.size() + i11;
        this.f5254h0 = size;
        this.f5249c0 = size + 1;
        this.f5255i0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        P0 = null;
    }
}
