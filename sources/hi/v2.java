package hi;

import org.telegram.messenger.R;
public final class v2 extends org.telegram.ui.ActionBar.j {
    public final m3 f13335a;

    public v2(m3 m3Var) {
        this.f13335a = m3Var;
    }

    @Override
    public final void b(int i10) {
        m3 m3Var = this.f13335a;
        if (i10 == -1) {
            if (!m3Var.f13132y.C()) {
                m3Var.r();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            m3Var.f13133y0 = true;
            m3Var.k(true);
        }
    }
}
