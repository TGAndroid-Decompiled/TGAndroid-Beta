package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.y00;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class o extends v31 {
    public static final int f10840b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        p pVar = (p) view;
        y00 y00Var = (y00) w31Var.G;
        pVar.f10841a.setText(y00Var.f26555b);
        pVar.f10842b.setText(y00Var.f26556c);
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
