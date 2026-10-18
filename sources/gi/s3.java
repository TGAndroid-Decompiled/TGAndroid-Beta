package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class s3 extends e61 {
    public static final int f11450a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        t3 t3Var = (t3) view;
        CharSequence charSequence = f61Var.f26147l;
        CharSequence charSequence2 = f61Var.f26148m;
        t3Var.setText(charSequence);
        t3Var.f11467r.setText(charSequence2);
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
