package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class s3 extends k61 {
    public static final int f11473a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = l61Var.f28227l;
        CharSequence charSequence2 = l61Var.f28228m;
        t3Var.setText(charSequence);
        t3Var.f11490r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new t3(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
