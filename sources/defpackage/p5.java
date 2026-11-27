package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
public final class p5 extends ny0 {
    public final List S1;
    public final kv4 T1;
    public l9c U1;

    public p5(Context context, vnb vnbVar, kv4 kv4Var, List list) {
        super(context, null, false, false, 2, vnbVar);
        this.T1 = kv4Var;
        this.S1 = list;
        this.u1 = 0.2f;
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        this.o1.setTitle(K0());
        J();
        this.n1.setPadding(this.u0, hl.L(9.0f), this.u0, hl.L(64.0f));
        this.n1.setOnItemClickListener(new m5((byte) 0));
        this.n1.setOverScrollMode(2);
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.setOnClickListener(new k1(this, (byte) 2));
        c51Var.i(ob6.M0(2131747558, null), false, true);
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(c51Var, d);
        this.U1.O(false);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new c(this, (byte) 3), this.J0);
        this.U1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        List list = this.S1;
        if (list == null) {
            return null;
        }
        return ob6.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
