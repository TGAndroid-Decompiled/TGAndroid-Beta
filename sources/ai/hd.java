package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
public final class hd extends l61 {
    public static final int f1441a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.m61 r33, boolean r34, org.telegram.ui.Components.b71 r35, org.telegram.ui.Components.j71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.hd.bindView(android.view.View, org.telegram.ui.Components.m61, boolean, org.telegram.ui.Components.b71, org.telegram.ui.Components.j71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        id idVar = (id) getCached();
        if (idVar != null) {
            return idVar;
        }
        return new id(context, i10, g6Var);
    }
}
