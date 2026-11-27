package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uyb extends x46 {
    public boolean I;
    public final tzb J;

    public uyb(tzb tzbVar) {
        this.J = tzbVar;
    }

    @Override
    public final void a0(oh2 oh2Var, c89 c89Var) {
        boolean z = f11.a;
        try {
            super.a0(oh2Var, c89Var);
        } catch (IndexOutOfBoundsException e) {
            cc4.g(e, true);
            hl.c3(new s8b(this, (byte) 29));
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
    public final int n0(int r17, defpackage.oh2 r18, defpackage.c89 r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uyb.n0(int, oh2, c89):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        if (this.J.y > 0 && i == 1) {
            super.u0(recyclerView, c89Var, i);
            return;
        }
        z46 z46Var = new z46(recyclerView.getContext(), 0);
        z46Var.a = i;
        v0(z46Var);
    }
}
