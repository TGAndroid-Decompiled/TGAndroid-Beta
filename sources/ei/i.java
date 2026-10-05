package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class i extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h61 K = h61.K(i.class);
        K.d = i10;
        K.f27106z = i11;
        K.f27092k = i12;
        K.f27093l = charSequence;
        K.f27094m = str;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((j) view).a(h61Var.f27106z, h61Var.f27092k, h61Var.f27093l, h61Var.f27094m);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new j(context, d6Var);
    }
}
