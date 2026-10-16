package ci;

import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.o1;
import bi.z5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class x extends db {
    public final int X;
    public final CharSequence Y;
    public a71 Z;

    public x(m2 m2Var, String str, o1 o1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f24075y = true;
        this.E = true;
        fixNavigationBar();
        L();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new z5(1, this, o1Var));
    }

    @Override
    public final CharSequence B() {
        return this.Y;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.X, 0, false, new u(this, 0), this.resourcesProvider);
        this.Z = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }
}
