package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class o extends w31 {
    public static final int f10840b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) x31Var.G;
        pVar.f10841a.setText(y00Var.f26563b);
        pVar.f10842b.setText(y00Var.f26564c);
        if (pVar.f10843c != z9) {
            pVar.invalidate();
        }
        pVar.f10843c = z9;
        pVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new p(context);
    }
}
