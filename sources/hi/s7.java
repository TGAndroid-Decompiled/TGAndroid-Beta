package hi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.dk0;
public final class s7 extends dk0 {
    public final t7 f15379c;

    public s7(t7 t7Var) {
        this.f15379c = t7Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f15379c.n1.size() + 2;
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
    public final void t(v4.f1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.s7.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int L;
        View view;
        t7 t7Var = this.f15379c;
        if (i7 != 0 && i7 != 1) {
            view = new o8(t7Var.getContext(), t7Var.J0);
        } else {
            View view2 = new View(t7Var.getContext());
            if (i7 == 0) {
                L = (org.telegram.messenger.g0.f24046q.y + org.telegram.messenger.g0.f24040m) - org.telegram.messenger.g0.L(306.0f);
            } else {
                L = org.telegram.messenger.g0.L(54.0f);
            }
            view2.setLayoutParams(new v4.q0(-1, L));
            view = view2;
        }
        return new v4.f1(view);
    }
}
