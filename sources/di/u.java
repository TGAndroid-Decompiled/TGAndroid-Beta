package di;

import ai.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.x4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public b71 Z;

    public u(o2 o2Var, String str, r0 r0Var) {
        super(o2Var, true, false, o2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = o2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f25034y = true;
        this.E = true;
        fixNavigationBar();
        K();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x4(1, this, r0Var));
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.X, 0, false, new ai.q(this, 11), this.resourcesProvider);
        this.Z = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return this.Y;
    }
}
