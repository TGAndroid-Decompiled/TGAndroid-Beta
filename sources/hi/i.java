package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class i extends s61 {
    static {
        s61.setup(new s61());
    }

    public static t61 a(int i10, String str, String str2) {
        t61 K = t61.K(i.class);
        K.f32871k = i10;
        K.f32872l = str;
        K.f32873m = str2;
        return K;
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((j) view).a(t61Var.f32872l, t61Var.f32873m, t61Var.f32871k);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new j(context, u6Var, false);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
