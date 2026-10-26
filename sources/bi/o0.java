package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class o0 extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(String str, CharSequence charSequence, int i10) {
        t61 K = t61.K(o0.class);
        K.f47041b = false;
        K.f32888z = i10;
        K.f32875l = str;
        K.f32876m = charSequence;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((p0) view).a(t61Var.f32875l, t61Var.f32876m, t61Var.f32888z);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new p0(context, 0, u6Var);
    }
}
