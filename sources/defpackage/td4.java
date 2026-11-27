package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class td4 extends x46 {
    public final SparseArray I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final d79 N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final boolean T;

    public td4(int i, int i2, d79 d79Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = d79Var;
        this.M = i;
    }

    @Override
    public final void O(View view) {
        f89 U;
        if (this.T) {
            d79 d79Var = this.N;
            View G = d79Var.G(view);
            if (G == null) {
                U = null;
            } else {
                U = d79Var.U(G);
            }
            if (U.b() == A() - 1) {
                ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).height = Math.max(this.J, 0);
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
    public final void c0(oh2 oh2Var, c89 c89Var, int i, int i2) {
        int i3 = this.K;
        this.L = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.K = size;
        if (i3 != size) {
            o1();
        }
        super.c0(oh2Var, c89Var, i, i2);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void o1() {
        d79 d79Var;
        j79 adapter;
        if (this.K <= 0 || (adapter = (d79Var = this.N).getAdapter()) == null) {
            return;
        }
        int b = adapter.b() - 1;
        int i = 0;
        int i2 = 0;
        for (int i3 = this.O; i3 < b; i3++) {
            int d = adapter.d(i3);
            SparseArray sparseArray = this.I;
            f89 f89Var = (f89) sparseArray.get(d, null);
            if (f89Var == null) {
                f89Var = adapter.a(d79Var, d);
                View view = f89Var.a;
                sparseArray.put(d, f89Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = f89Var.a;
            if (this.P) {
                adapter.t(f89Var, i3);
            }
            r79 r79Var = (r79) view2.getLayoutParams();
            view2.measure(q79.s(d(), this.L, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) r79Var).leftMargin + ((ViewGroup.MarginLayoutParams) r79Var).rightMargin, ((ViewGroup.MarginLayoutParams) r79Var).width), q79.s(this.Q, this.K, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) r79Var).topMargin + ((ViewGroup.MarginLayoutParams) r79Var).bottomMargin, ((ViewGroup.MarginLayoutParams) r79Var).height));
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
            this.J = Math.max(i5, ((i6 - this.M) - d79Var.getPaddingBottom()) + i2);
        } else {
            this.J = Math.max(i5, (i6 - this.M) - d79Var.getPaddingBottom());
        }
    }

    public td4(int i, d79 d79Var) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = d79Var;
        this.M = i;
    }
}
