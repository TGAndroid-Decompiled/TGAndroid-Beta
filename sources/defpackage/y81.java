package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class y81 extends FragmentContextView {
    public final byte X0 = 0;
    public final e Y0;

    public y81(tzb tzbVar, Context context, tzb tzbVar2) {
        super(context, tzbVar2, null, false, null);
        this.Y0 = tzbVar;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        e eVar = this.Y0;
        switch (b) {
            case 0:
                i91 i91Var = (i91) eVar;
                xj3 xj3Var = i91Var.I;
                FrameLayout frameLayout = i91Var.J;
                if (i == 0) {
                    z = true;
                }
                xj3Var.j(frameLayout, z, true);
                return;
            default:
                tzb tzbVar = (tzb) eVar;
                xj3 xj3Var2 = tzbVar.V0;
                FrameLayout frameLayout2 = tzbVar.G0;
                if (i == 0) {
                    z = true;
                }
                xj3Var2.j(frameLayout2, z, true);
                return;
        }
    }

    public y81(i91 i91Var, Context context, i91 i91Var2, w81 w81Var, vnb vnbVar) {
        super(context, i91Var2, w81Var, false, vnbVar);
        this.Y0 = i91Var;
    }
}
