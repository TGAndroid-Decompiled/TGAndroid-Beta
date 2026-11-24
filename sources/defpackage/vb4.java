package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class vb4 extends r35 {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final o39 V;
    public boolean W;
    public boolean X;

    public vb4(int i, r65 r65Var) {
        super(i, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = r65Var;
        this.U = 0;
    }

    public boolean A1() {
        return true;
    }

    @Override
    public final void P() {
        this.Q.clear();
        z1();
    }

    @Override
    public final void U(RecyclerView recyclerView, int i, int i2) {
        super.U(recyclerView, i, i2);
        z1();
    }

    @Override
    public final void V(RecyclerView recyclerView) {
        this.Q.clear();
        z1();
        super.V(recyclerView);
    }

    @Override
    public final void W(RecyclerView recyclerView, int i, int i2) {
        super.W(recyclerView, i, i2);
        z1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i, int i2) {
        super.X(recyclerView, i, i2);
        z1();
    }

    @Override
    public final void Y() {
        z1();
    }

    @Override
    public final void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.Z(recyclerView, i, i2, obj);
        z1();
    }

    @Override
    public final void c0(wg2 wg2Var, p49 p49Var, int i, int i2) {
        int i3 = this.S;
        this.T = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.S = size;
        if (i3 != size) {
            z1();
        }
        super.c0(wg2Var, p49Var, i, i2);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void v1(int i, View view, boolean z) {
        if (this.V.G(view).b() == A() - 1) {
            ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.v1(i, view, z);
    }

    public final void z1() {
        o39 o39Var;
        w39 adapter;
        int i;
        o39 o39Var2;
        if (this.S > 0 && A1() && (adapter = (o39Var = this.V).getAdapter()) != null) {
            int i2 = this.J;
            boolean z = true;
            int b = adapter.b() - 1;
            yo yoVar = this.O;
            boolean z2 = true;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = this.U;
                if (i3 < b) {
                    int i6 = yoVar.i(i3);
                    i4 += i6;
                    if (i6 == i2 || i4 > i2) {
                        z2 = z;
                        i4 = i6;
                    }
                    if (!z2) {
                        o39Var2 = o39Var;
                    } else {
                        int d = adapter.d(i3);
                        SparseArray sparseArray = this.Q;
                        s49 s49Var = (s49) sparseArray.get(d, null);
                        if (s49Var == null) {
                            s49Var = adapter.a(o39Var, d);
                            View view = s49Var.a;
                            sparseArray.put(d, s49Var);
                            if (view.getLayoutParams() == null) {
                                view.setLayoutParams(n());
                            }
                        }
                        View view2 = s49Var.a;
                        if (this.W) {
                            adapter.t(s49Var, i3);
                        }
                        e49 e49Var = (e49) view2.getLayoutParams();
                        o39Var2 = o39Var;
                        view2.measure(d49.s(d(), this.T, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin + ((ViewGroup.MarginLayoutParams) e49Var).rightMargin, ((ViewGroup.MarginLayoutParams) e49Var).width), d49.s(this.X, this.S, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) e49Var).topMargin + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin, ((ViewGroup.MarginLayoutParams) e49Var).height));
                        i5 += view2.getMeasuredHeight();
                        if (i5 >= (this.S - i) - o39Var2.getPaddingBottom()) {
                            break;
                        }
                        z2 = false;
                    }
                    i3++;
                    o39Var = o39Var2;
                    z = true;
                } else {
                    o39Var2 = o39Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i5) - i) - o39Var2.getPaddingBottom());
        }
    }

    public vb4(int i, int i2, o39 o39Var) {
        super(i);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = o39Var;
        this.U = i2;
    }
}
