package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class wl8 extends kl8 {
    public static wl8 N2;
    public final o8 L2;
    public final String M2;

    public wl8(e eVar, int i, TLRPC.User user, pw4 pw4Var, String str, boolean z, vnb vnbVar) {
        super(eVar, i, user, pw4Var, null, vnbVar);
        this.M2 = str;
        v21.a((FrameLayout) this.b, new py((byte) 11));
        if (!z) {
            d79 d79Var = this.n1;
            int i2 = this.u0;
            d79Var.setPadding(i2, 0, i2, hl.L(68.0f));
            o8 o8Var = new o8(getContext(), this.J0);
            this.L2 = o8Var;
            o8Var.setOnClickListener(new am7(this, (byte) 27));
            o8 o8Var2 = this.L2;
            o8Var2.e = true;
            c51 c51Var = o8Var2.a;
            c51Var.setEnabled(true);
            c51Var.i(ob6.M0(2131749464, null), false, true);
            yob.h(aob.h5, o8Var2.c, o8Var2.b);
            this.b.addView(this.L2, tre.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        J();
    }

    @Override
    public final void H() {
        super.H();
        N2 = null;
    }

    @Override
    public final int b1() {
        return 6;
    }

    @Override
    public final void c1(View view) {
        ((k56) view).setSlug(this.M2);
    }

    @Override
    public final View d1(Context context, int i) {
        if (i == 6) {
            k56 k56Var = new k56(context, this.J0);
            k56Var.setPadding(0, 0, 0, hl.L(8.0f));
            return k56Var;
        }
        return null;
    }

    @Override
    public final void f1(boolean z) {
        super.f1(z);
        this.K2.setLineSpacing(hl.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = hl.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = hl.L(12.0f);
        this.K2.setText(hl.G2(hl.N2(ob6.M0(2131749468, "GiftPremiumAboutThisLink"), aob.Xc, 0, new ul8(this, (byte) 0), null), hl.S2(ob6.M0(2131749467, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void g1() {
        int i = this.a2;
        this.b2 = i;
        this.c2 = i + 1;
        int i2 = i + 2;
        this.a2 = i2;
        this.d2 = i2;
        this.e2 = i2;
        int size = this.S1.size() + i2;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
    }
}
