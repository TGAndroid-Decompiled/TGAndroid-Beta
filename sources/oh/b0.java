package oh;

import android.view.View;
import org.telegram.ui.Components.g71;

public final class b0 extends g71 {

    public final j0 f19466a;

    public b0(j0 j0Var) {
        this.f19466a = j0Var;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ((g0) view).getClass();
    }

    @Override
    public final View d(int i10) {
        j0 j0Var = this.f19466a;
        if (i10 == 2) {
            return j0Var.f19506x;
        }
        return i10 == 0 ? j0Var.v : j0Var.f19505w;
    }

    @Override
    public final int e() {
        return this.f19466a.J ? 1 : 3;
    }

    @Override
    public final int h(int i10) {
        if (this.f19466a.J || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
