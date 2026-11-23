package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.r00;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class n extends m41 {
    public static final int f13655b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        o oVar = (o) view;
        r00 r00Var = (r00) n41Var.H;
        oVar.f13656a.setText(r00Var.f26619b);
        oVar.f13657b.setText(r00Var.f26620c);
        if (oVar.f13658c != z10) {
            oVar.invalidate();
        }
        oVar.f13658c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new o(context);
    }
}
