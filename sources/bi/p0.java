package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class p0 extends v31 {
    static {
        v31.h(new v31());
    }

    public static w31 i(String str, CharSequence charSequence, int i7) {
        w31 K = w31.K(p0.class);
        K.f54441b = false;
        K.f39843z = i7;
        K.f39830l = str;
        K.f39831m = charSequence;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((q0) view).a(w31Var.f39843z, w31Var.f39830l, w31Var.f39831m);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(0, context, f6Var);
    }
}
