package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class o extends x31 {
    public static final int f10840b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) y31Var.G;
        pVar.f10841a.setText(y00Var.f26570b);
        pVar.f10842b.setText(y00Var.f26571c);
        if (pVar.f10843c != z9) {
            pVar.invalidate();
        }
        pVar.f10843c = z9;
        pVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new p(context);
    }
}
