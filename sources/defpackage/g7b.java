package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class g7b extends q59 {
    public final h7b c;

    public g7b(h7b h7bVar) {
        this.c = h7bVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.m1.size() + 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(defpackage.u69 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7b.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int L;
        h7b h7bVar = this.c;
        if (i != 0 && i != 1) {
            view = new z7b(h7bVar.getContext(), h7bVar.J0);
        } else {
            view = new View(h7bVar.getContext());
            if (i == 0) {
                L = (gm.q.y + gm.m) - gm.L(306.0f);
            } else {
                L = gm.L(54.0f);
            }
            view.setLayoutParams(new g69(-1, L));
        }
        return new u69(view);
    }
}
