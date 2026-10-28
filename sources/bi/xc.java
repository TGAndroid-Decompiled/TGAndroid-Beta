package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.t61;
public final class xc extends t61 {
    public static final int f5710a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.u61 r33, boolean r34, org.telegram.ui.Components.k71 r35, org.telegram.ui.Components.s71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.xc.bindView(android.view.View, org.telegram.ui.Components.u61, boolean, org.telegram.ui.Components.k71, org.telegram.ui.Components.s71):void");
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        yc ycVar = (yc) getCached();
        if (ycVar != null) {
            return ycVar;
        }
        return new yc(context, i10, u6Var);
    }
}
