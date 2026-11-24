package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class y91 extends FragmentContextView {
    public final byte X0 = 0;
    public final d Y0;

    public y91(sxb sxbVar, Context context, sxb sxbVar2) {
        super(context, sxbVar2, null, false, null);
        this.Y0 = sxbVar;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        d dVar = this.Y0;
        switch (b) {
            case 0:
                ia1 ia1Var = (ia1) dVar;
                qk3 qk3Var = ia1Var.I;
                FrameLayout frameLayout = ia1Var.J;
                if (i == 0) {
                    z = true;
                }
                qk3Var.j(frameLayout, z, true);
                return;
            default:
                sxb sxbVar = (sxb) dVar;
                qk3 qk3Var2 = sxbVar.V0;
                FrameLayout frameLayout2 = sxbVar.G0;
                if (i == 0) {
                    z = true;
                }
                qk3Var2.j(frameLayout2, z, true);
                return;
        }
    }

    public y91(ia1 ia1Var, Context context, ia1 ia1Var2, w91 w91Var, ylb ylbVar) {
        super(context, ia1Var2, w91Var, false, ylbVar);
        this.Y0 = ia1Var;
    }
}
