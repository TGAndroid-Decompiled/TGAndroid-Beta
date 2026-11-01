package ih;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.og0;
public final class m extends a51 {
    public static final int f8562b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        og0 og0Var = (og0) view;
        og0Var.a((TLObject) b51Var.G, b51Var.f24656z, true);
        og0Var.setOnClickListener(b51Var.D);
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.B == b51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        og0 og0Var = new og0(context);
        og0Var.setBackground(t6.N0(false));
        return og0Var;
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.B == b51Var2.B) {
            return true;
        }
        return false;
    }
}
