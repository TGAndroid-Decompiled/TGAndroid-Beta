package fh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class n2 extends k41 {
    public static final int f6640a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((o2) view).a(l41Var.d, (ArrayList) l41Var.G, l41Var.f30352z, (Utilities.Callback) l41Var.H);
    }

    @Override
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        if (l41Var.f30352z == l41Var2.f30352z && l41Var.H == l41Var2.H && equals(l41Var, l41Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new o2(context, true);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.d == l41Var2.d) {
            ArrayList arrayList = (ArrayList) l41Var.G;
            ArrayList arrayList2 = (ArrayList) l41Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i9 = 0; i9 < arrayList.size(); i9++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i9), (CharSequence) arrayList2.get(i9))) {
                            }
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
