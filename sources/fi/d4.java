package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class d4 extends k61 {
    public static final int f9232a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        e4 e4Var = (e4) view;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        e4Var.setText(charSequence);
        e4Var.f9250r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new e4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
