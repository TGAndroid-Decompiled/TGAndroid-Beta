package mh;

import ag.i0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.t1;
import eg.w0;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
public final class u extends xa {
    public final int T;
    public final CharSequence U;
    public k51 V;

    public u(o2 o2Var, String str, i0 i0Var) {
        super(o2Var.getParentActivity(), o2Var, true, false, false, 1, o2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T = o2Var.getCurrentAccount();
        this.U = str;
        M();
        this.v = 0.6f;
        this.f34667y = true;
        this.A = true;
        fixNavigationBar();
        J();
        jl0 jl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new w0(3, this, i0Var));
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.T, 0, false, new t1(this, 24), this.resourcesProvider);
        this.V = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return this.U;
    }
}
