package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public class vd4 extends q55 {
    public final SparseArray Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public final r59 V;
    public boolean W;
    public boolean X;

    public vd4(int i, p85 p85Var) {
        super(i, false);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = p85Var;
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
    public final void c0(ki2 ki2Var, r69 r69Var, int i, int i2) {
        int i3 = this.S;
        this.T = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.S = size;
        if (i3 != size) {
            z1();
        }
        super.c0(ki2Var, r69Var, i, i2);
    }

    @Override
    public final boolean e() {
        return this.X;
    }

    @Override
    public final void v1(int i, View view, boolean z) {
        if (this.V.G(view).b() == A() - 1) {
            ((ViewGroup.MarginLayoutParams) ((g69) view.getLayoutParams())).height = Math.max(this.R, 0);
        }
        super.v1(i, view, z);
    }

    public final void z1() {
        r59 r59Var;
        y59 adapter;
        int i;
        r59 r59Var2;
        if (this.S > 0 && A1() && (adapter = (r59Var = this.V).getAdapter()) != null) {
            int i2 = this.J;
            boolean z = true;
            int b = adapter.b() - 1;
            yp ypVar = this.O;
            boolean z2 = true;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = this.U;
                if (i3 < b) {
                    int i6 = ypVar.i(i3);
                    i4 += i6;
                    if (i6 == i2 || i4 > i2) {
                        z2 = z;
                        i4 = i6;
                    }
                    if (!z2) {
                        r59Var2 = r59Var;
                    } else {
                        int d = adapter.d(i3);
                        SparseArray sparseArray = this.Q;
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
                        if (this.W) {
                            adapter.t(u69Var, i3);
                        }
                        g69 g69Var = (g69) view2.getLayoutParams();
                        r59Var2 = r59Var;
                        view2.measure(f69.s(d(), this.T, this.k, D() + C() + ((ViewGroup.MarginLayoutParams) g69Var).leftMargin + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin, ((ViewGroup.MarginLayoutParams) g69Var).width), f69.s(this.X, this.S, this.l, B() + E() + ((ViewGroup.MarginLayoutParams) g69Var).topMargin + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin, ((ViewGroup.MarginLayoutParams) g69Var).height));
                        i5 += view2.getMeasuredHeight();
                        if (i5 >= (this.S - i) - r59Var2.getPaddingBottom()) {
                            break;
                        }
                        z2 = false;
                    }
                    i3++;
                    r59Var = r59Var2;
                    z = true;
                } else {
                    r59Var2 = r59Var;
                    break;
                }
            }
            this.R = Math.max(0, ((this.S - i5) - i) - r59Var2.getPaddingBottom());
        }
    }

    public vd4(int i, int i2, r59 r59Var) {
        super(i);
        this.Q = new SparseArray();
        this.R = -1;
        this.W = true;
        this.X = true;
        this.V = r59Var;
        this.U = i2;
    }
}
