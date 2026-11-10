package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class o extends w31 {
    public static final int f10845b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) x31Var.G;
        pVar.f10846a.setText(y00Var.f26574b);
        pVar.f10847b.setText(y00Var.f26575c);
        if (pVar.f10848c != z9) {
            pVar.invalidate();
        }
        pVar.f10848c = z9;
        pVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new p(context);
    }
}
