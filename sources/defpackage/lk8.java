package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class lk8 extends yj8 {
    public static lk8 N2;
    public final n8 L2;
    public final String M2;

    public lk8(d dVar, int i, TLRPC.User user, nw4 nw4Var, String str, boolean z, ylb ylbVar) {
        super(dVar, i, user, nw4Var, null, ylbVar);
        this.M2 = str;
        u31.a((FrameLayout) this.b, new oz((byte) 11));
        if (!z) {
            r59 r59Var = this.n1;
            int i2 = this.u0;
            r59Var.setPadding(i2, 0, i2, gm.L(68.0f));
            n8 n8Var = new n8(getContext(), this.J0);
            this.L2 = n8Var;
            n8Var.setOnClickListener(new m67(this, (byte) 28));
            n8 n8Var2 = this.L2;
            n8Var2.e = true;
            b61 b61Var = n8Var2.a;
            b61Var.setEnabled(true);
            b61Var.i(jb6.M0(2131749452, null), false, true);
            anb.h(cmb.g5, n8Var2.c, n8Var2.b);
            this.b.addView(this.L2, qoe.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        J();
    }

    @Override
    public final void H() {
        super.H();
        N2 = null;
    }

    @Override
    public final int a1() {
        return 6;
    }

    @Override
    public final void b1(View view) {
        ((h56) view).setSlug(this.M2);
    }

    @Override
    public final View c1(Context context, int i) {
        if (i == 6) {
            h56 h56Var = new h56(context, this.J0);
            h56Var.setPadding(0, 0, 0, gm.L(8.0f));
            return h56Var;
        }
        return null;
    }

    @Override
    public final void e1(boolean z) {
        super.e1(z);
        this.K2.setLineSpacing(gm.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = gm.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = gm.L(12.0f);
        this.K2.setText(gm.G2(gm.N2(jb6.M0(2131749456, "GiftPremiumAboutThisLink"), cmb.Wc, 0, new jk8(this, (byte) 0), null), gm.S2(jb6.M0(2131749455, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override
    public final void f1() {
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
