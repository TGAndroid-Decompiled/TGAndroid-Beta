package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class wb4 extends t26 {
    public final SparseArray I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final o39 N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final boolean T;

    public wb4(int i, int i2, o39 o39Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = o39Var;
        this.M = i;
    }

    @Override
    public final void O(View view) {
        s49 T;
        if (this.T) {
            o39 o39Var = this.N;
            View F = o39Var.F(view);
            if (F == null) {
                T = null;
            } else {
                T = o39Var.T(F);
            }
            if (T.b() == A() - 1) {
                ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).height = Math.max(this.J, 0);
            }
        }
        super.O(view);
    }

    @Override
    public final void P() {
        this.I.clear();
        o1();
    }

    @Override
    public final void U(RecyclerView recyclerView, int i, int i2) {
        o1();
    }

    @Override
    public final void V(RecyclerView recyclerView) {
        this.I.clear();
        o1();
    }

    @Override
    public final void W(RecyclerView recyclerView, int i, int i2) {
        o1();
    }

    @Override
    public final void X(RecyclerView recyclerView, int i, int i2) {
        o1();
    }

    @Override
    public final void Y() {
        o1();
    }

    @Override
    public final void Z(RecyclerView recyclerView, int i, int i2, Object obj) {
        o1();
        o1();
    }

    @Override
    public final void c0(wg2 wg2Var, p49 p49Var, int i, int i2) {
        int i3 = this.K;
        this.L = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.K = size;
        if (i3 != size) {
            o1();
        }
        super.c0(wg2Var, p49Var, i, i2);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void o1() {
        o39 o39Var;
        w39 adapter;
        if (this.K <= 0 || (adapter = (o39Var = this.N).getAdapter()) == null) {
            return;
        }
        int b = adapter.b() - 1;
        int i = 0;
        int i2 = 0;
        for (int i3 = this.O; i3 < b; i3++) {
            int d = adapter.d(i3);
            SparseArray sparseArray = this.I;
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
            if (this.P) {
                adapter.t(s49Var, i3);
            }
            e49 e49Var = (e49) view2.getLayoutParams();
            view2.measure(d49.s(d(), this.L, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) e49Var).leftMargin + ((ViewGroup.MarginLayoutParams) e49Var).rightMargin, ((ViewGroup.MarginLayoutParams) e49Var).width), d49.s(this.Q, this.K, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) e49Var).topMargin + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin, ((ViewGroup.MarginLayoutParams) e49Var).height));
            i += view2.getMeasuredHeight();
            if (i3 == 0) {
                i2 = view2.getMeasuredHeight();
            }
            boolean z = this.R;
            int i4 = this.K;
            if (z) {
                if (i >= i4 + i2) {
                    break;
                }
            } else if (i >= i4) {
                break;
            }
        }
        boolean z2 = this.R;
        int i5 = this.S;
        int i6 = this.K - i;
        if (z2) {
            this.J = Math.max(i5, ((i6 - this.M) - o39Var.getPaddingBottom()) + i2);
        } else {
            this.J = Math.max(i5, (i6 - this.M) - o39Var.getPaddingBottom());
        }
    }

    public wb4(int i, o39 o39Var) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = o39Var;
        this.M = i;
    }
}
