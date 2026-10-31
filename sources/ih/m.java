package ih;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.qg0;
public final class m extends z41 {
    public static final int f8561b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        qg0 qg0Var = (qg0) view;
        qg0Var.a((TLObject) a51Var.G, a51Var.f24305z, true);
        qg0Var.setOnClickListener(a51Var.D);
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.B == a51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        qg0 qg0Var = new qg0(context);
        qg0Var.setBackground(t6.N0(false));
        return qg0Var;
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.B == a51Var2.B) {
            return true;
        }
        return false;
    }
}
