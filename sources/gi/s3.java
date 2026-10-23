package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class s3 extends g61 {
    public static final int f11447a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = h61Var.f26786l;
        CharSequence charSequence2 = h61Var.f26787m;
        t3Var.setText(charSequence);
        t3Var.f11464r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
