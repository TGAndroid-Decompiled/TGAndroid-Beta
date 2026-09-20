package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
public final class y extends ab {
    public final int X;
    public final CharSequence Y;
    public k61 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f22643y = true;
        this.E = true;
        fixNavigationBar();
        K();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(vl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = k61Var;
        k61Var.f25678r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
