package defpackage;

import android.view.View;
import android.view.ViewGroup;
public final class f5b extends n39 {
    public final g5b c;

    public f5b(g5b g5bVar) {
        this.c = g5bVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 2) {
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
    public final void t(defpackage.s49 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5b.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int L;
        g5b g5bVar = this.c;
        if (i != 0 && i != 1) {
            view = new x5b(g5bVar.getContext(), g5bVar.J0);
        } else {
            view = new View(g5bVar.getContext());
            if (i == 0) {
                L = (gl.q.y + gl.m) - gl.L(306.0f);
            } else {
                L = gl.L(54.0f);
            }
            view.setLayoutParams(new e49(-1, L));
        }
        return new s49(view);
    }
}
