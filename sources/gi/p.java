package gi;

import ai.g0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fi.i4;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class p extends ja {
    public final int T1;
    public final CharSequence U1;
    public p41 V1;

    public p(e2 e2Var, String str, g0 g0Var) {
        super(e2Var, true, false, e2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T1 = e2Var.getCurrentAccount();
        this.U1 = str;
        b1();
        this.f35938v1 = 0.6f;
        this.f35941y1 = true;
        this.f35942z1 = true;
        O();
        Y0();
        uj0 uj0Var = this.f35931o1;
        int i7 = this.f29717u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.f35931o1.setOnItemClickListener(new i4(1, this, g0Var));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.T1, 0, false, new bi.b(this, 24), this.J0);
        this.V1 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return this.U1;
    }
}
