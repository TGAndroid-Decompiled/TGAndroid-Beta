package ii;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.wn;
public final class a0 implements q0 {
    public final r2 f14323a;
    public final j0 f14324b;

    public a0(j0 j0Var, r2 r2Var) {
        this.f14324b = j0Var;
        this.f14323a = r2Var;
    }

    @Override
    public final void a(long j10) {
        this.f14323a.presentFragment(wn.ea(j10));
        this.f14324b.dismiss();
    }

    @Override
    public final void c() {
        j0 j0Var = this.f14324b;
        j0Var.f14363w.d.f32504g3.O(true);
        j0Var.v.d.f32504g3.O(true);
    }

    @Override
    public final void close() {
        this.f14324b.d.E(0);
    }
}
