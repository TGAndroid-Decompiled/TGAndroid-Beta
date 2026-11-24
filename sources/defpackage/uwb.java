package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uwb extends u46 {
    public boolean I;
    public final sxb J;

    public uwb(sxb sxbVar) {
        this.J = sxbVar;
    }

    @Override
    public final void a0(ki2 ki2Var, r69 r69Var) {
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (IndexOutOfBoundsException e) {
            fc4.g(e, true);
            gm.c3(new zcb(this, (byte) 20));
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
    public final int n0(int r17, defpackage.ki2 r18, defpackage.r69 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwb.n0(int, ki2, r69):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, r69Var, i);
            return;
        }
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }
}
