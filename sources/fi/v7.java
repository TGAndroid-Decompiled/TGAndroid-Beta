package fi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.oj0;
public final class v7 extends oj0 {
    public final w7 f12929c;

    public v7(w7 w7Var) {
        this.f12929c = w7Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56931f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f12929c.f13059j1.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(v4.d1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.v7.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int L;
        View view;
        w7 w7Var = this.f12929c;
        if (i7 != 0 && i7 != 1) {
            view = new r8(w7Var.getContext(), w7Var.I0);
        } else {
            View view2 = new View(w7Var.getContext());
            if (i7 == 0) {
                L = (org.telegram.messenger.g0.f22537q.y + org.telegram.messenger.g0.f22531m) - org.telegram.messenger.g0.L(306.0f);
            } else {
                L = org.telegram.messenger.g0.L(54.0f);
            }
            view2.setLayoutParams(new v4.o0(-1, L));
            view = view2;
        }
        return new v4.d1(view);
    }
}
