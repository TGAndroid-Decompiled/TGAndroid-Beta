package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
public final class y extends eb {
    public final int X;
    public final CharSequence Y;
    public d71 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f25990y = true;
        this.E = true;
        fixNavigationBar();
        L();
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final CharSequence B() {
        return this.Y;
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        d71 d71Var = new d71(rm0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = d71Var;
        d71Var.f25587r = false;
        return d71Var;
    }
}
