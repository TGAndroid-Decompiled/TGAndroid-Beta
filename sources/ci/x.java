package ci;

import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.o1;
import bi.x5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class x extends bb {
    public final int X;
    public final CharSequence Y;
    public v51 Z;

    public x(n2 n2Var, String str, o1 o1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f24654y = true;
        this.E = true;
        fixNavigationBar();
        K();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x5(1, this, o1Var));
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.X, 0, false, new u(this, 0), this.resourcesProvider);
        this.Z = v51Var;
        v51Var.f31135r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
