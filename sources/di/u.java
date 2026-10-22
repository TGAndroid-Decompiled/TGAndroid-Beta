package di;

import ai.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.y4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public u61 Z;

    public u(n2 n2Var, String str, r0 r0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f24890y = true;
        this.E = true;
        fixNavigationBar();
        L();
        jm0 jm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        jm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new y4(1, this, r0Var));
    }

    @Override
    public final CharSequence A() {
        return this.Y;
    }

    @Override
    public final im0 x(jm0 jm0Var) {
        u61 u61Var = new u61(jm0Var, getContext(), this.X, 0, false, new ai.q(this, 11), this.resourcesProvider);
        this.Z = u61Var;
        u61Var.f30864r = false;
        return u61Var;
    }
}
