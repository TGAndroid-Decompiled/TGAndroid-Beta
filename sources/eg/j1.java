package eg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.fy;
public final class j1 extends cg.f2 {
    public static j1 O0;
    public final gg.a M0;
    public final String N0;

    public j1(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, cg.n nVar, String str, boolean z10, c6 c6Var) {
        super(o2Var, i10, user, nVar, null, c6Var);
        this.N0 = str;
        mc.a((FrameLayout) this.containerView, new x(2));
        if (!z10) {
            jl0 jl0Var = this.d;
            int i11 = this.backgroundPaddingLeft;
            jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
            gg.a aVar = new gg.a(getContext(), this.resourcesProvider);
            this.M0 = aVar;
            aVar.setOnClickListener(new ag.o(this, 7));
            gg.a aVar2 = this.M0;
            aVar2.f7279e = true;
            nh.d dVar = aVar2.f7276a;
            dVar.setEnabled(true);
            dVar.g(LocaleController.getString(R.string.GiftPremiumActivateForFree), false, true);
            aVar2.f7277b.setBackgroundColor(g6.v0(g6.f23133h5, aVar2.f7278c));
            this.containerView.addView(this.M0, f6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fixNavigationBar();
    }

    public static void c0(j1 j1Var, TLRPC.TL_error tL_error) {
        j1Var.M0.b(false);
        s.c(tL_error, (FrameLayout) j1Var.containerView, j1Var.resourcesProvider, new h1(j1Var, 0));
    }

    public static void d0(j1 j1Var) {
        cg.f2 f2Var = new cg.f2(j1Var.f34662n, UserConfig.selectedAccount, null, null, null, j1Var.resourcesProvider);
        f2Var.F0 = true;
        f2Var.G0 = true;
        f2Var.Y = true;
        j1Var.f34662n.showDialog(f2Var);
    }

    public static void e0(j1 j1Var) {
        fy fyVar = new fy(x3.e(3, "onlySelect", "dialogsType", true));
        fyVar.f38379y2 = new a9.s(15, j1Var, "https://t.me/giftcode/" + j1Var.N0);
        j1Var.f34662n.presentFragment(fyVar);
        j1Var.dismiss();
    }

    @Override
    public final int X() {
        return 6;
    }

    @Override
    public final void Y(View view) {
        ((gg.v) view).setSlug(this.N0);
    }

    @Override
    public final View Z(Context context, int i10) {
        if (i10 == 6) {
            gg.v vVar = new gg.v(context, this.resourcesProvider);
            vVar.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
            return vVar;
        }
        return null;
    }

    @Override
    public final void a0(boolean z10) {
        super.a0(z10);
        this.L0.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).bottomMargin = AndroidUtilities.dp(14.0f);
        ((ViewGroup.MarginLayoutParams) this.L0.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
        this.L0.setText(AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumAboutThisLink", R.string.GiftPremiumAboutThisLink), g6.gc, 0, new h1(this, 0)), AndroidUtilities.replaceTags(LocaleController.getString("GiftPremiumAboutThisLinkEnd", R.string.GiftPremiumAboutThisLinkEnd))));
    }

    @Override
    public final void b0() {
        int i10 = this.f3123b0;
        this.f3124c0 = i10;
        this.f3125d0 = i10 + 1;
        int i11 = i10 + 2;
        this.f3123b0 = i11;
        this.f3126e0 = i11;
        this.f3127f0 = i11;
        int size = this.T.size() + i11;
        this.f3128g0 = size;
        this.f3123b0 = size + 1;
        this.f3129h0 = size;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        O0 = null;
    }
}
