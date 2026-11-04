package gi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.sj0;
public final class u7 extends sj0 {
    public final v7 f13662c;

    public u7(v7 v7Var) {
        this.f13662c = v7Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f13662c.k1.size() + 2;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u4.d1 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u7.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int L;
        View view;
        v7 v7Var = this.f13662c;
        if (i3 != 0 && i3 != 1) {
            view = new s8(v7Var.getContext(), v7Var.J0);
        } else {
            View view2 = new View(v7Var.getContext());
            if (i3 == 0) {
                L = (org.telegram.messenger.g0.f22608q.y + org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.L(306.0f);
            } else {
                L = org.telegram.messenger.g0.L(54.0f);
            }
            view2.setLayoutParams(new u4.p0(-1, L));
            view = view2;
        }
        return new u4.d1(view);
    }
}
