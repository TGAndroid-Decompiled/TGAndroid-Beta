package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.za;
public final class y extends za {
    public final int X;
    public final CharSequence Y;
    public x51 Z;

    public y(o2 o2Var, String str, y1 y1Var) {
        super(o2Var, true, false, o2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = o2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f30456y = true;
        this.E = true;
        fixNavigationBar();
        K();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        x51 x51Var = new x51(ml0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = x51Var;
        x51Var.f29851r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
