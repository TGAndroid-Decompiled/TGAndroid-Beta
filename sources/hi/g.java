package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class g extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        t61 K = t61.K(g.class);
        K.d = i10;
        K.f32888z = i11;
        K.f32874k = i12;
        K.f32875l = charSequence;
        K.f32876m = str;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((h) view).a(t61Var.f32888z, t61Var.f32874k, t61Var.f32875l, t61Var.f32876m);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new h(context, u6Var);
    }
}
