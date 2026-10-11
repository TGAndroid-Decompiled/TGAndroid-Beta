package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
public final class y extends db {
    public final int X;
    public final CharSequence Y;
    public e71 Z;

    public y(m2 m2Var, String str, y1 y1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f25528y = true;
        this.E = true;
        fixNavigationBar();
        L();
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final CharSequence B() {
        return this.Y;
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        e71 e71Var = new e71(sm0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = e71Var;
        e71Var.f25890r = false;
        return e71Var;
    }
}
