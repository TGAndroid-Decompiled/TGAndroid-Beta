package ei;

import android.widget.FrameLayout;
import android.widget.ImageView;
import di.x4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public j71 Z;

    public u(r2 r2Var, String str, ai.i iVar) {
        super(r2Var, true, false, r2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = r2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.f26814y = true;
        this.E = true;
        fixNavigationBar();
        K();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x4(1, this, iVar));
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.X, 0, false, new ai.e(this, 14), this.resourcesProvider);
        this.Z = j71Var;
        j71Var.f29505r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return this.Y;
    }
}
