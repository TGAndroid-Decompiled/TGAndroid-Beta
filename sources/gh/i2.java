package gh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class i2 extends m41 {

    public static final int f7318a = 0;

    static {
        m41.setup(new i2());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        ((j2) view).a(n41Var.d, (ArrayList) n41Var.G, n41Var.f30857z, (Utilities.Callback) n41Var.H);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.f30857z == n41Var2.f30857z && n41Var.H == n41Var2.H && equals(n41Var, n41Var2);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j2(context, true);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        if (n41Var.d == n41Var2.d) {
            ArrayList arrayList = (ArrayList) n41Var.G;
            ArrayList arrayList2 = (ArrayList) n41Var2.G;
            if (arrayList == arrayList2) {
                return true;
            }
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
