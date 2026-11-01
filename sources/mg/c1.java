package mg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.zx;
import w7.b6;
public final class c1 extends kg.v1 {
    public static c1 K2;
    public final og.a I2;
    public final String J2;

    public c1(k2 k2Var, int i10, TLRPC.User user, kg.m mVar, String str, boolean z10, p6 p6Var) {
        super(k2Var, i10, user, mVar, null, p6Var);
        this.J2 = str;
        wb.a((FrameLayout) this.f21587b, new u(2));
        if (!z10) {
            uk0 uk0Var = this.f26724k1;
            int i11 = this.f21616t0;
            uk0Var.setPadding(i11, 0, i11, org.telegram.messenger.i0.L(68.0f));
            og.a aVar = new og.a(getContext(), this.I0);
            this.I2 = aVar;
            aVar.setOnClickListener(new ag.g(this, 13));
            og.a aVar2 = this.I2;
            aVar2.e = true;
            vh.d dVar = aVar2.f14166a;
            dVar.setEnabled(true);
            dVar.i(dd.L0(2131749684, null), false, true);
            a7.i(t6.f21002h5, aVar2.f14167b, aVar2.f14168c);
            this.f21587b.addView(this.I2, b6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        O();
    }

    public static void l1(c1 c1Var) {
        zx zxVar = new zx(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
        zxVar.C2 = new zf.j0(c1Var, "https://t.me/giftcode/" + c1Var.J2);
        c1Var.f26727o1.presentFragment(zxVar);
        c1Var.dismiss();
    }

    @Override
    public final void L() {
        super.L();
        K2 = null;
    }

    @Override
    public final int f1() {
        return 6;
    }

    @Override
    public final void g1(View view) {
        ((og.v) view).setSlug(this.J2);
    }

    @Override
    public final View h1(Context context, int i10) {
        if (i10 == 6) {
            og.v vVar = new og.v(context, this.I0);
            vVar.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
            return vVar;
        }
        return null;
    }

    @Override
    public final void j1(boolean z10) {
        super.j1(z10);
        this.H2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.H2.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f);
        this.H2.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.R2(dd.L0(2131749688, "GiftPremiumAboutThisLink"), t6.Uc, 0, new a1(this, 0), null), org.telegram.messenger.i0.W2(dd.L0(2131749687, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void k1() {
        int i10 = this.X1;
        this.Y1 = i10;
        this.Z1 = i10 + 1;
        int i11 = i10 + 2;
        this.X1 = i11;
        this.a2 = i11;
        this.f11294b2 = i11;
        int size = this.P1.size() + i11;
        this.f11295c2 = size;
        this.X1 = size + 1;
        this.f11296d2 = size;
    }
}
