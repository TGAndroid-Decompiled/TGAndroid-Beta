package ai;

import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
public final class f0 extends ab {
    public final int X;
    public final CharSequence Y;
    public j61 Z;

    public f0(p2 p2Var, String str, b bVar) {
        super(p2Var, true, false, p2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = p2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f21457y = true;
        this.E = true;
        fixNavigationBar();
        K();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new b0(0, this, bVar));
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.X, 0, false, new c0(this, 0), this.resourcesProvider);
        this.Z = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
