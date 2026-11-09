package ji;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class i extends x31 {
    public static final int f17098b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        long j3 = y31Var.B;
        ((j) view).a((int) j3, (int) (j3 >>> 32), y31Var.f40567k, y31Var.f40568l, y31Var.f40570n, y31Var.f40573q);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new j(context, g6Var, false);
    }
}
