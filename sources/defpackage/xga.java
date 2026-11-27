package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class xga extends FragmentContextView {
    public final eja X0;

    public xga(eja ejaVar, Context context, e eVar, eja ejaVar2, vnb vnbVar) {
        super(context, eVar, ejaVar2, false, vnbVar);
        this.X0 = ejaVar;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        eja ejaVar = this.X0;
        xj3 xj3Var = ejaVar.S0;
        FrameLayout frameLayout = ejaVar.T0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        xj3Var.j(frameLayout, z, true);
    }
}
