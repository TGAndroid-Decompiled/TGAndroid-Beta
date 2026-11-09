package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class h extends x31 {
    static {
        x31.h(new x31());
    }

    public static y31 i(int i7, String str, String str2) {
        y31 K = y31.K(h.class);
        K.f40567k = i7;
        K.f40568l = str;
        K.f40569m = str2;
        return K;
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((i) view).a(y31Var.f40567k, y31Var.f40568l, y31Var.f40569m);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new i(context, g6Var, false);
    }

    @Override
    public final boolean f() {
        return false;
    }
}
