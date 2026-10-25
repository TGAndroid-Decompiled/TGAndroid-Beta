package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s61;
public final class xc extends s61 {
    public static final int f5710a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.t61 r33, boolean r34, org.telegram.ui.Components.j71 r35, org.telegram.ui.Components.r71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.xc.bindView(android.view.View, org.telegram.ui.Components.t61, boolean, org.telegram.ui.Components.j71, org.telegram.ui.Components.r71):void");
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        yc ycVar = (yc) getCached();
        if (ycVar != null) {
            return ycVar;
        }
        return new yc(context, i10, u6Var);
    }
}
