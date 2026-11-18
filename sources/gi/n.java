package gi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.s00;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class n extends k41 {
    public static final int f13663b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        o oVar = (o) view;
        s00 s00Var = (s00) l41Var.H;
        oVar.f13664a.setText(s00Var.f26719b);
        oVar.f13665b.setText(s00Var.f26720c);
        if (oVar.f13666c != z10) {
            oVar.invalidate();
        }
        oVar.f13666c = z10;
        oVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new o(context);
    }
}
