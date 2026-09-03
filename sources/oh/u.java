package oh;

import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.h0;
import dg.r1;
import gg.v0;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
public final class u extends sa {
    public final int U;
    public final CharSequence V;
    public w51 W;

    public u(p2 p2Var, String str, h0 h0Var) {
        super(p2Var.getParentActivity(), p2Var, true, false, false, 1, p2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.U = p2Var.getCurrentAccount();
        this.V = str;
        N();
        this.v = 0.6f;
        this.f28706y = true;
        this.B = true;
        fixNavigationBar();
        J();
        rl0 rl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new v0(3, this, h0Var));
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.U, 0, false, new r1(this, 24), this.resourcesProvider);
        this.W = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return this.V;
    }
}
