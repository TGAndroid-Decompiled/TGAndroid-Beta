package bi;

import ai.n6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class y extends cb {
    public final int X;
    public final CharSequence Y;
    public m61 Z;

    public y(m2 m2Var, String str, y1 y1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f23246y = true;
        this.E = true;
        fixNavigationBar();
        K();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n6(1, this, y1Var));
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        m61 m61Var = new m61(zl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = m61Var;
        m61Var.f26223r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
