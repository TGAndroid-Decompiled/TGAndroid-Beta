package ei;

import android.widget.FrameLayout;
import android.widget.ImageView;
import di.p4;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class q extends na {
    public final int P1;
    public final CharSequence Q1;
    public l41 R1;

    public q(f2 f2Var, String str, ai.i iVar) {
        super(f2Var, true, false, f2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.P1 = f2Var.getCurrentAccount();
        this.Q1 = str;
        b1();
        this.f36266r1 = 0.6f;
        this.f36269u1 = true;
        this.f36270v1 = true;
        N();
        Y0();
        pj0 pj0Var = this.f36261k1;
        int i7 = this.f28646t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.f36261k1.setOnItemClickListener(new p4(1, this, iVar));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.P1, 0, false, new ai.e(this, 14), this.I0);
        this.R1 = l41Var;
        l41Var.f35510r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return this.Q1;
    }
}
