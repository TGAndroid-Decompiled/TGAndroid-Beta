package jh;

import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.b1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class t extends sa {
    public final int T;
    public final CharSequence U;
    public z41 V;

    public t(o2 o2Var, String str, bg.i iVar) {
        super(o2Var.getParentActivity(), o2Var, true, false, false, 1, o2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T = o2Var.getCurrentAccount();
        this.U = str;
        M();
        this.v = 0.6f;
        this.f32415y = true;
        this.A = true;
        fixNavigationBar();
        J();
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new b1(3, this, iVar));
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.T, 0, false, new bh.c(this, 23), this.resourcesProvider);
        this.V = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return this.U;
    }
}
