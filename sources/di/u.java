package di;

import ai.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.y4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public t61 Z;

    public u(n2 n2Var, String str, r0 r0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f24902y = true;
        this.E = true;
        fixNavigationBar();
        L();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new y4(1, this, r0Var));
    }

    @Override
    public final CharSequence A() {
        return this.Y;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        t61 t61Var = new t61(im0Var, getContext(), this.X, 0, false, new ai.q(this, 11), this.resourcesProvider);
        this.Z = t61Var;
        t61Var.f30436r = false;
        return t61Var;
    }
}
