package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jm0;
public final class gd extends g61 {
    public static final int f1391a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.h61 r33, boolean r34, org.telegram.ui.Components.u61 r35, org.telegram.ui.Components.c71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.gd.bindView(android.view.View, org.telegram.ui.Components.h61, boolean, org.telegram.ui.Components.u61, org.telegram.ui.Components.c71):void");
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        hd hdVar = (hd) getCached();
        if (hdVar != null) {
            return hdVar;
        }
        return new hd(context, i10, d6Var);
    }
}
