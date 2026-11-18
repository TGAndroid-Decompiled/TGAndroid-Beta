package gi;

import ai.g0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fi.g4;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
public final class p extends sa {
    public final int T1;
    public final CharSequence U1;
    public z41 V1;

    public p(h2 h2Var, String str, g0 g0Var) {
        super(h2Var, true, false, h2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T1 = h2Var.getCurrentAccount();
        this.U1 = str;
        c1();
        this.f39541v1 = 0.6f;
        this.f39544y1 = true;
        this.f39545z1 = true;
        O();
        Z0();
        ck0 ck0Var = this.f39534o1;
        int i7 = this.f30225u0;
        ck0Var.setPadding(i7, 0, i7, 0);
        this.f39534o1.setOnItemClickListener(new g4(1, this, g0Var));
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.T1, 0, false, new bi.b(this, 23), this.J0);
        this.V1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return this.U1;
    }
}
