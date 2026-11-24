package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class wd4 extends u46 {
    public final SparseArray I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final r59 N;
    public boolean O;
    public boolean P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final boolean T;

    public wd4(int i, int i2, r59 r59Var) {
        super(1, false);
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = r59Var;
        this.M = i;
    }

    @Override
    public final void O(View view) {
        u69 T;
        if (this.T) {
            r59 r59Var = this.N;
            View F = r59Var.F(view);
            if (F == null) {
                T = null;
            } else {
                T = r59Var.T(F);
            }
            if (T.b() == A() - 1) {
                ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).height = Math.max(this.J, 0);
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
    public final void c0(ki2 ki2Var, r69 r69Var, int i, int i2) {
        int i3 = this.K;
        this.L = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.K = size;
        if (i3 != size) {
            o1();
        }
        super.c0(ki2Var, r69Var, i, i2);
    }

    @Override
    public final boolean e() {
        return this.Q;
    }

    public final void o1() {
        r59 r59Var;
        y59 adapter;
        if (this.K <= 0 || (adapter = (r59Var = this.N).getAdapter()) == null) {
            return;
        }
        int b = adapter.b() - 1;
        int i = 0;
        int i2 = 0;
        for (int i3 = this.O; i3 < b; i3++) {
            int d = adapter.d(i3);
            SparseArray sparseArray = this.I;
            u69 u69Var = (u69) sparseArray.get(d, null);
            if (u69Var == null) {
                u69Var = adapter.a(r59Var, d);
                View view = u69Var.a;
                sparseArray.put(d, u69Var);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(n());
                }
            }
            View view2 = u69Var.a;
            if (this.P) {
                adapter.t(u69Var, i3);
            }
            g69 g69Var = (g69) view2.getLayoutParams();
            view2.measure(f69.s(d(), this.L, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) g69Var).leftMargin + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin, ((ViewGroup.MarginLayoutParams) g69Var).width), f69.s(this.Q, this.K, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) g69Var).topMargin + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin, ((ViewGroup.MarginLayoutParams) g69Var).height));
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
            this.J = Math.max(i5, ((i6 - this.M) - r59Var.getPaddingBottom()) + i2);
        } else {
            this.J = Math.max(i5, (i6 - this.M) - r59Var.getPaddingBottom());
        }
    }

    public wd4(int i, r59 r59Var) {
        this.I = new SparseArray();
        this.J = -1;
        this.P = true;
        this.Q = true;
        this.T = true;
        this.N = r59Var;
        this.M = i;
    }
}
