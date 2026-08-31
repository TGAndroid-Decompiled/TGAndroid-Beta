package mh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.tl0;
public final class da extends i51 {
    public static final int f13917a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.j51 r33, boolean r34, org.telegram.ui.Components.x51 r35, org.telegram.ui.Components.i61 r36) {
        throw new UnsupportedOperationException("Method not decompiled: mh.da.bindView(android.view.View, org.telegram.ui.Components.j51, boolean, org.telegram.ui.Components.x51, org.telegram.ui.Components.i61):void");
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        ea eaVar = (ea) getCached();
        if (eaVar != null) {
            return eaVar;
        }
        return new ea(context, i10, g6Var);
    }
}
