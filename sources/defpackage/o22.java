package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class o22 extends FragmentContextView {
    public final FrameLayout X0;
    public final s22 Y0;

    public o22(s22 s22Var, Context context, d dVar, FrameLayout frameLayout, ylb ylbVar, FrameLayout frameLayout2) {
        super(context, dVar, frameLayout, false, ylbVar);
        this.Y0 = s22Var;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        qk3 qk3Var = this.Y0.y;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        qk3Var.j(this.X0, z, true);
    }
}
