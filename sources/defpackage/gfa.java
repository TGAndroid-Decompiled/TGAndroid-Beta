package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class gfa extends FragmentContextView {
    public final nha X0;

    public gfa(nha nhaVar, Context context, d dVar, nha nhaVar2, ylb ylbVar) {
        super(context, dVar, nhaVar2, false, ylbVar);
        this.X0 = nhaVar;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        nha nhaVar = this.X0;
        qk3 qk3Var = nhaVar.S0;
        FrameLayout frameLayout = nhaVar.T0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        qk3Var.j(frameLayout, z, true);
    }
}
