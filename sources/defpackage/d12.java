package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class d12 extends FragmentContextView {
    public final FrameLayout X0;
    public final h12 Y0;

    public d12(h12 h12Var, Context context, d dVar, FrameLayout frameLayout, wjb wjbVar, FrameLayout frameLayout2) {
        super(context, dVar, frameLayout, false, wjbVar);
        this.Y0 = h12Var;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        fj3 fj3Var = this.Y0.y;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        fj3Var.j(this.X0, z, true);
    }
}
