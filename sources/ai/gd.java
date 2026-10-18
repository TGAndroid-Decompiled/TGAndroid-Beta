package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.im0;
public final class gd extends e61 {
    public static final int f1382a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(android.view.View r32, org.telegram.ui.Components.f61 r33, boolean r34, org.telegram.ui.Components.s61 r35, org.telegram.ui.Components.a71 r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.gd.bindView(android.view.View, org.telegram.ui.Components.f61, boolean, org.telegram.ui.Components.s61, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        hd hdVar = (hd) getCached();
        if (hdVar != null) {
            return hdVar;
        }
        return new hd(context, i10, d6Var);
    }
}
