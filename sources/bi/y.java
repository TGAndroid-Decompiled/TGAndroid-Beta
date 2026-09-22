package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
public final class y extends ab {
    public final int X;
    public final CharSequence Y;
    public m61 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f22607y = true;
        this.E = true;
        fixNavigationBar();
        K();
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = m61Var;
        m61Var.f26342r = false;
        return m61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
