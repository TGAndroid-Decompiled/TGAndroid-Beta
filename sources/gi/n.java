package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.t00;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class n extends n41 {
    public static final int f13692b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        o oVar = (o) view;
        t00 t00Var = (t00) o41Var.H;
        oVar.f13693a.setText(t00Var.f26942b);
        oVar.f13694b.setText(t00Var.f26943c);
        if (oVar.f13695c != z10) {
            oVar.invalidate();
        }
        oVar.f13695c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new o(context);
    }
}
