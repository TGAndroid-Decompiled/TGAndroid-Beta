package di;

import ai.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.x4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.za;
public final class u extends za {
    public final int X;
    public final CharSequence Y;
    public a71 Z;

    public u(o2 o2Var, String str, r0 r0Var) {
        super(o2Var, true, false, o2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = o2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f33217y = true;
        this.E = true;
        fixNavigationBar();
        K();
        lm0 lm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x4(1, this, r0Var));
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.X, 0, false, new ai.q(this, 11), this.resourcesProvider);
        this.Z = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        return this.Y;
    }
}
