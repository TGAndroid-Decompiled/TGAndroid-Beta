package mh;

import org.telegram.messenger.R;
public final class l2 extends org.telegram.ui.ActionBar.j {
    public final c3 f17960a;

    public l2(c3 c3Var) {
        this.f17960a = c3Var;
    }

    @Override
    public final void b(int i9) {
        c3 c3Var = this.f17960a;
        if (i9 == -1) {
            if (!c3Var.f17778x.z()) {
                c3Var.q();
            }
        } else if (i9 == R.id.menu_collapse_bot) {
            c3Var.f17773t0 = true;
            c3Var.k(true);
        }
    }
}
