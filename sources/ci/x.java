package ci;

import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.o1;
import bi.z5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class x extends db {
    public final int X;
    public final CharSequence Y;
    public z61 Z;

    public x(m2 m2Var, String str, o1 o1Var) {
        super(m2Var, true, false, m2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = m2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.f24350y = true;
        this.E = true;
        fixNavigationBar();
        L();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new z5(1, this, o1Var));
    }

    @Override
    public final CharSequence A() {
        return this.Y;
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        z61 z61Var = new z61(mm0Var, getContext(), this.X, 0, false, new u(this, 0), this.resourcesProvider);
        this.Z = z61Var;
        z61Var.f31780r = false;
        return z61Var;
    }
}
