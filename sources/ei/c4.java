package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class c4 extends h51 {
    public static final int f8282a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = i51Var.f24894l;
        CharSequence charSequence2 = i51Var.f24895m;
        d4Var.setText(charSequence);
        d4Var.f8297r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new d4(context, e6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
