package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class i extends s61 {
    public static final int f15994a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        long j10 = t61Var.B;
        ((j) view).a((int) j10, (int) (j10 >>> 32), t61Var.f32871k, t61Var.f32872l, t61Var.f32874n, t61Var.f32877q);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new j(context, u6Var, false);
    }
}
