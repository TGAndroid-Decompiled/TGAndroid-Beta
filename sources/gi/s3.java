package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class s3 extends f61 {
    public static final int f11449a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = g61Var.f26499l;
        CharSequence charSequence2 = g61Var.f26500m;
        t3Var.setText(charSequence);
        t3Var.f11466r.setText(charSequence2);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new t3(context, d6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
