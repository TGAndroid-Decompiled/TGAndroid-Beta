package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.v00;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class n extends a41 {
    public static final int f13348b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        o oVar = (o) view;
        v00 v00Var = (v00) b41Var.G;
        oVar.f13349a.setText(v00Var.f26918b);
        oVar.f13350b.setText(v00Var.f26919c);
        if (oVar.f13351c != z10) {
            oVar.invalidate();
        }
        oVar.f13351c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new o(context);
    }
}
