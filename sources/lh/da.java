package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.sl0;
public final class da extends h51 {
    public static final int f12321a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.i51 r33, boolean r34, org.telegram.ui.Components.w51 r35, org.telegram.ui.Components.g61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: lh.da.bindView(android.view.View, org.telegram.ui.Components.i51, boolean, org.telegram.ui.Components.w51, org.telegram.ui.Components.g61):void");
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        ea eaVar = (ea) getCached();
        if (eaVar != null) {
            return eaVar;
        }
        return new ea(context, i10, f6Var);
    }
}
