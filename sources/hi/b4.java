package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class b4 extends s61 {
    public static final int f12895a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        c4 c4Var = (c4) view;
        CharSequence charSequence = t61Var.f32872l;
        CharSequence charSequence2 = t61Var.f32873m;
        c4Var.setText(charSequence);
        c4Var.f12914r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new c4(context, u6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
