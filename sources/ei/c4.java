package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class c4 extends v51 {
    public static final int f8287a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        d4Var.setText(charSequence);
        d4Var.f8302r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new d4(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
