package bi;

import ai.n6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class y extends bb {
    public final int X;
    public final CharSequence Y;
    public v51 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f22666y = true;
        this.E = true;
        fixNavigationBar();
        K();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n6(1, this, y1Var));
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(ml0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = v51Var;
        v51Var.f28662r = false;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
