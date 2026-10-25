package hi;

import org.telegram.messenger.R;
public final class v2 extends org.telegram.ui.ActionBar.j {
    public final m3 f13336a;

    public v2(m3 m3Var) {
        this.f13336a = m3Var;
    }

    @Override
    public final void b(int i10) {
        m3 m3Var = this.f13336a;
        if (i10 == -1) {
            if (!m3Var.f13133y.C()) {
                m3Var.r();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            m3Var.f13134y0 = true;
            m3Var.k(true);
        }
    }
}
