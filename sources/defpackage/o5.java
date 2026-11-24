package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
public final class o5 extends mz0 {
    public final List S1;
    public final hv4 T1;
    public l7c U1;

    public o5(Context context, ylb ylbVar, hv4 hv4Var, List list) {
        super(context, null, false, false, 2, ylbVar);
        this.T1 = hv4Var;
        this.S1 = list;
        this.u1 = 0.2f;
        this.F1 = false;
        this.E1 = gm.L(12.0f);
        this.o1.setTitle(J0());
        J();
        this.n1.setPadding(this.u0, gm.L(9.0f), this.u0, gm.L(64.0f));
        this.n1.setOnItemClickListener(new l5((byte) 0));
        this.n1.setOverScrollMode(2);
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setOnClickListener(new j1(this, (byte) 2));
        b61Var.i(jb6.M0(2131747564, null), false, true);
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(b61Var, d);
        this.U1.O(false);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 3), this.J0);
        this.U1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        List list = this.S1;
        if (list == null) {
            return null;
        }
        return jb6.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
