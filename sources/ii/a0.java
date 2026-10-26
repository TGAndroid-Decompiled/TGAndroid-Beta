package ii;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.un;
public final class a0 implements q0 {
    public final r2 f14324a;
    public final j0 f14325b;

    public a0(j0 j0Var, r2 r2Var) {
        this.f14325b = j0Var;
        this.f14324a = r2Var;
    }

    @Override
    public final void a(long j10) {
        this.f14324a.presentFragment(un.ba(j10));
        this.f14325b.dismiss();
    }

    @Override
    public final void c() {
        j0 j0Var = this.f14325b;
        j0Var.f14364w.d.f32152g3.O(true);
        j0Var.v.d.f32152g3.O(true);
    }

    @Override
    public final void close() {
        this.f14325b.d.E(0);
    }
}
