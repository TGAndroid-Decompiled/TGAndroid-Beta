package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.lm0;
public final class hd extends k61 {
    public static final int f1441a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.l61 r33, boolean r34, org.telegram.ui.Components.a71 r35, org.telegram.ui.Components.i71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.hd.bindView(android.view.View, org.telegram.ui.Components.l61, boolean, org.telegram.ui.Components.a71, org.telegram.ui.Components.i71):void");
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        id idVar = (id) getCached();
        if (idVar != null) {
            return idVar;
        }
        return new id(context, i10, g6Var);
    }
}
