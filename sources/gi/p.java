package gi;

import ai.d0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fi.g4;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ra;
public final class p extends ra {
    public final int T1;
    public final CharSequence U1;
    public b51 V1;

    public p(g2 g2Var, String str, d0 d0Var) {
        super(g2Var, true, false, g2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T1 = g2Var.getCurrentAccount();
        this.U1 = str;
        c1();
        this.f39253v1 = 0.6f;
        this.f39256y1 = true;
        this.f39257z1 = true;
        O();
        Z0();
        ek0 ek0Var = this.f39246o1;
        int i7 = this.f30261u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.f39246o1.setOnItemClickListener(new g4(1, this, d0Var));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.T1, 0, false, new bi.b(this, 23), this.J0);
        this.V1 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return this.U1;
    }
}
