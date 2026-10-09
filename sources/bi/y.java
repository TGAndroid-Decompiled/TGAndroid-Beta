package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
public final class y extends eb {
    public final int X;
    public final CharSequence Y;
    public c71 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f26030y = true;
        this.E = true;
        fixNavigationBar();
        L();
        qm0 qm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final CharSequence B() {
        return this.Y;
    }

    @Override
    public final pm0 x(qm0 qm0Var) {
        c71 c71Var = new c71(qm0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = c71Var;
        c71Var.f25280r = false;
        return c71Var;
    }
}
