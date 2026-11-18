package ki;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.k80;
public final class h3 extends o4 {
    public final k80 f18715r;

    public h3(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        k80 k80Var = new k80(context, i6Var);
        this.f18715r = k80Var;
        k80Var.setTextSize(1, 14.0f);
        u6.U(k80Var, n6.f29805z6, i6Var);
        u6.G(k80Var, n6.L6, i6Var);
        k80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (gd.f24213a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(k80Var, ma.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
