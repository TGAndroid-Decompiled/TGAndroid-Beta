package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class d9b extends c79 {
    public final e9b c;

    public d9b(e9b e9bVar) {
        this.c = e9bVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 2) {
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
    public final void t(defpackage.f89 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9b.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int L;
        e9b e9bVar = this.c;
        if (i != 0 && i != 1) {
            view = new v9b(e9bVar.getContext(), e9bVar.J0);
        } else {
            view = new View(e9bVar.getContext());
            if (i == 0) {
                L = (hl.q.y + hl.m) - hl.L(306.0f);
            } else {
                L = hl.L(54.0f);
            }
            view.setLayoutParams(new r79(-1, L));
        }
        return new f89(view);
    }
}
