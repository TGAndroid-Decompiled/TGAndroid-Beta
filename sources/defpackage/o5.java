package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
public final class o5 extends fy0 {
    public final List S1;
    public final gt4 T1;
    public l5c U1;

    public o5(Context context, wjb wjbVar, gt4 gt4Var, List list) {
        super(context, null, false, false, 2, wjbVar);
        this.T1 = gt4Var;
        this.S1 = list;
        this.u1 = 0.2f;
        this.F1 = false;
        this.E1 = gl.L(12.0f);
        this.o1.setTitle(J0());
        K();
        this.n1.setPadding(this.u0, gl.L(9.0f), this.u0, gl.L(64.0f));
        this.n1.setOnItemClickListener(new l5((byte) 0));
        this.n1.setOverScrollMode(2);
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.setOnClickListener(new j1(this, (byte) 2));
        u41Var.i(k96.M0(2131747638, null), false, true);
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(u41Var, d);
        this.U1.O(false);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 3), this.J0);
        this.U1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        List list = this.S1;
        if (list == null) {
            return null;
        }
        return k96.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
