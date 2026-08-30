package kh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class f2 extends h51 {
    public static final int f10600a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((g2) view).a(i51Var.d, (ArrayList) i51Var.G, i51Var.f25578z, (Utilities.Callback) i51Var.H);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.f25578z == i51Var2.f25578z && i51Var.H == i51Var2.H && equals(i51Var, i51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new g2(context, true);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            ArrayList arrayList = (ArrayList) i51Var.G;
            ArrayList arrayList2 = (ArrayList) i51Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
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
