package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ji8 extends xh8 {
    public static ji8 N2;
    public final n8 L2;
    public final String M2;

    public ji8(d dVar, int i, TLRPC.User user, mu4 mu4Var, String str, boolean z, wjb wjbVar) {
        super(dVar, i, user, mu4Var, null, wjbVar);
        this.M2 = str;
        m21.a((FrameLayout) this.b, new oy((byte) 11));
        if (!z) {
            o39 o39Var = this.n1;
            int i2 = this.u0;
            o39Var.setPadding(i2, 0, i2, gl.L(68.0f));
            n8 n8Var = new n8(getContext(), this.J0);
            this.L2 = n8Var;
            n8Var.setOnClickListener(new fr7(this, (byte) 25));
            n8 n8Var2 = this.L2;
            n8Var2.e = true;
            u41 u41Var = n8Var2.a;
            u41Var.setEnabled(true);
            u41Var.i(k96.M0(2131749503, null), false, true);
            zkb.h(bkb.g5, n8Var2.c, n8Var2.b);
            this.b.addView(this.L2, nme.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        K();
    }

    @Override
    public final void I() {
        super.I();
        N2 = null;
    }

    @Override
    public final int a1() {
        return 6;
    }

    @Override
    public final void b1(View view) {
        ((h36) view).setSlug(this.M2);
    }

    @Override
    public final View c1(Context context, int i) {
        if (i == 6) {
            h36 h36Var = new h36(context, this.J0);
            h36Var.setPadding(0, 0, 0, gl.L(8.0f));
            return h36Var;
        }
        return null;
    }

    @Override
    public final void e1(boolean z) {
        super.e1(z);
        this.K2.setLineSpacing(gl.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = gl.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = gl.L(12.0f);
        this.K2.setText(gl.H2(gl.O2(k96.M0(2131749507, "GiftPremiumAboutThisLink"), bkb.Wc, 0, new hi8(this, (byte) 0), null), gl.T2(k96.M0(2131749506, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
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
