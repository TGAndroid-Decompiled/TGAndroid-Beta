package bi;

import ai.n6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class y extends cb {
    public final int X;
    public final CharSequence Y;
    public u61 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        L();
        this.v = 0.6f;
        this.f25309y = true;
        this.E = true;
        fixNavigationBar();
        I();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n6(1, this, y1Var));
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        u61 u61Var = new u61(zl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = u61Var;
        u61Var.f31307r = false;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
