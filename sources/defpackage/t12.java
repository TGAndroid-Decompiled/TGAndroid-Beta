package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class t12 extends FragmentContextView {
    public final FrameLayout X0;
    public final x12 Y0;

    public t12(x12 x12Var, Context context, e eVar, FrameLayout frameLayout, vnb vnbVar, FrameLayout frameLayout2) {
        super(context, eVar, frameLayout, false, vnbVar);
        this.Y0 = x12Var;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        xj3 xj3Var = this.Y0.y;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        xj3Var.j(this.X0, z, true);
    }
}
