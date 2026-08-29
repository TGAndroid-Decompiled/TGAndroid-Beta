package jh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.v41;
public final class ca extends v41 {
    public static final int f11886a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.w41 r33, boolean r34, org.telegram.ui.Components.k51 r35, org.telegram.ui.Components.u51 r36) {
        throw new UnsupportedOperationException("Method not decompiled: jh.ca.bindView(android.view.View, org.telegram.ui.Components.w41, boolean, org.telegram.ui.Components.k51, org.telegram.ui.Components.u51):void");
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        da daVar = (da) getCached();
        if (daVar != null) {
            return daVar;
        }
        return new da(context, i10, c6Var);
    }
}
