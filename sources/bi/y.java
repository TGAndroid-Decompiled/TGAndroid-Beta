package bi;

import ai.n6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xl0;
public final class y extends bb {
    public final int X;
    public final CharSequence Y;
    public k61 Z;

    public y(m2 m2Var, String str, y1 y1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f22963y = true;
        this.E = true;
        fixNavigationBar();
        K();
        xl0 xl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new n6(1, this, y1Var));
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        k61 k61Var = new k61(xl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = k61Var;
        k61Var.f25644r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
