package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class p81 extends FragmentContextView {
    public final byte X0 = 1;
    public final d Y0;

    public p81(qvb qvbVar, Context context, qvb qvbVar2) {
        super(context, qvbVar2, null, false, null);
        this.Y0 = qvbVar;
    }

    @Override
    public final void setVisibility(int i) {
        byte b = this.X0;
        boolean z = false;
        d dVar = this.Y0;
        switch (b) {
            case 0:
                z81 z81Var = (z81) dVar;
                fj3 fj3Var = z81Var.I;
                FrameLayout frameLayout = z81Var.J;
                if (i == 0) {
                    z = true;
                }
                fj3Var.j(frameLayout, z, true);
                return;
            default:
                qvb qvbVar = (qvb) dVar;
                fj3 fj3Var2 = qvbVar.V0;
                FrameLayout frameLayout2 = qvbVar.G0;
                if (i == 0) {
                    z = true;
                }
                fj3Var2.j(frameLayout2, z, true);
                return;
        }
    }

    public p81(z81 z81Var, Context context, z81 z81Var2, n81 n81Var, wjb wjbVar) {
        super(context, z81Var2, n81Var, false, wjbVar);
        this.Y0 = z81Var;
    }
}
