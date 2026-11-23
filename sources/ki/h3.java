package ki;

import android.content.Context;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.j80;
public final class h3 extends o4 {
    public final j80 f18804r;

    public h3(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        j80 j80Var = new j80(context, i6Var);
        this.f18804r = j80Var;
        j80Var.setTextSize(1, 14.0f);
        u6.U(j80Var, n6.f29862z6, i6Var);
        u6.G(j80Var, n6.L6, i6Var);
        j80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (gd.f24314a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(j80Var, na.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
