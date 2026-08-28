package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.wk0;
public final class ia extends k41 {
    public static final int f8310a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.l41 r33, boolean r34, org.telegram.ui.Components.z41 r35, org.telegram.ui.Components.i51 r36) {
        throw new UnsupportedOperationException("Method not decompiled: gh.ia.bindView(android.view.View, org.telegram.ui.Components.l41, boolean, org.telegram.ui.Components.z41, org.telegram.ui.Components.i51):void");
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        ja jaVar = (ja) getCached();
        if (jaVar != null) {
            return jaVar;
        }
        return new ja(context, i9, b6Var);
    }
}
