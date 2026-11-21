package ki;

import android.content.Context;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.m80;
public final class g3 extends o4 {
    public final m80 f18725r;

    public g3(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        m80 m80Var = new m80(context, h6Var);
        this.f18725r = m80Var;
        m80Var.setTextSize(1, 14.0f);
        t6.U(m80Var, m6.f29789z6, h6Var);
        t6.G(m80Var, m6.L6, h6Var);
        m80Var.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        if (gd.f24241a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        addView(m80Var, ma.d(-2, -2.0f, i7 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
