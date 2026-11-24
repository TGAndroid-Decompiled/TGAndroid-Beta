package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tub extends t26 {
    public boolean I;
    public final qvb J;

    public tub(qvb qvbVar) {
        this.J = qvbVar;
    }

    @Override
    public final void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = w01.a;
        try {
            super.a0(wg2Var, p49Var);
        } catch (IndexOutOfBoundsException e) {
            fa4.g(e, true);
            gl.d3(new cib(this, (byte) 12));
        }
    }

    @Override
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.J.O.getPaddingTop();
        }
        super.g1(i, i2);
    }

    @Override
    public final int n0(int r17, defpackage.wg2 r18, defpackage.p49 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tub.n0(int, wg2, p49):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, p49Var, i);
            return;
        }
        v26 v26Var = new v26(recyclerView.getContext(), 0);
        v26Var.a = i;
        v0(v26Var);
    }
}
