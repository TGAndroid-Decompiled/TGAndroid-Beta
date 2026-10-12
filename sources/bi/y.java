package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.Components.wm0;
public final class y extends db {
    public final int X;
    public final CharSequence Y;
    public h71 Z;

    public y(m2 m2Var, String str, y1 y1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f25294y = true;
        this.E = true;
        fixNavigationBar();
        L();
        wm0 wm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override
    public final CharSequence A() {
        return this.Y;
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        h71 h71Var = new h71(wm0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = h71Var;
        h71Var.f26679r = false;
        return h71Var;
    }
}
