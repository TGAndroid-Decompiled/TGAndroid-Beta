package bg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.dy;
public final class p1 extends zf.k1 {
    public static p1 O0;
    public final dg.a M0;
    public final String N0;

    public p1(org.telegram.ui.ActionBar.o2 o2Var, int i9, TLRPC.User user, zf.k kVar, String str, boolean z10, b6 b6Var) {
        super(o2Var, i9, user, kVar, null, b6Var);
        this.N0 = str;
        gc.a((FrameLayout) this.containerView, new z(2));
        if (!z10) {
            wk0 wk0Var = this.d;
            int i10 = this.backgroundPaddingLeft;
            wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f));
            dg.a aVar = new dg.a(getContext(), this.resourcesProvider);
            this.M0 = aVar;
            aVar.setOnClickListener(new androidx.mediarouter.app.c(this, 1));
            dg.a aVar2 = this.M0;
            aVar2.f4486e = true;
            kh.d dVar = aVar2.f4483a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f4484b.setBackgroundColor(f6.v0(f6.f23072h5, aVar2.f4485c));
            this.containerView.addView(this.M0, e6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void b0(p1 p1Var, TLRPC.TL_error tL_error) {
        p1Var.M0.b(false);
        u.c(tL_error, (FrameLayout) p1Var.containerView, p1Var.resourcesProvider, new n1(p1Var, 0));
    }

    public static void c0(p1 p1Var) {
        zf.k1 k1Var = new zf.k1(p1Var.f32410n, UserConfig.selectedAccount, null, null, null, p1Var.resourcesProvider);
        k1Var.F0 = true;
        k1Var.G0 = true;
        k1Var.Y = true;
        p1Var.f32410n.showDialog(k1Var);
    }

    public static void d0(p1 p1Var) {
        dy dyVar = new dy(org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true));
        dyVar.f37752y2 = new b5.d(6, p1Var, "https://t.me/giftcode/" + p1Var.N0);
        p1Var.f32410n.presentFragment(dyVar);
        p1Var.dismiss();
    }

    @Override
    public final int W() {
        return 6;
    }

    @Override
    public final void X(View view) {
        ((dg.x) view).setSlug(this.N0);
    }

    @Override
    public final View Y(Context context, int i9) {
        if (i9 == 6) {
            dg.x xVar = new dg.x(context, this.resourcesProvider);
            xVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return xVar;
        }
        return null;
    }

    @Override
    public final void Z(boolean z10) {
        super.Z(z10);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.L0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), f6.f23061gc, 0, new n1(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void a0() {
        int i9 = this.f50568b0;
        this.f50569c0 = i9;
        this.f50570d0 = i9 + 1;
        int i10 = i9 + 2;
        this.f50568b0 = i10;
        this.f50571e0 = i10;
        this.f50572f0 = i10;
        int size = this.T.size() + i10;
        this.f50573g0 = size;
        this.f50568b0 = size + 1;
        this.f50574h0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        O0 = null;
    }
}
