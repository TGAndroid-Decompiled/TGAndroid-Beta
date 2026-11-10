package ei;

import android.widget.FrameLayout;
import android.widget.ImageView;
import di.q4;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class q extends ma {
    public final int S1;
    public final CharSequence T1;
    public m41 U1;

    public q(f2 f2Var, String str, ai.i iVar) {
        super(f2Var, true, false, f2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.S1 = f2Var.getCurrentAccount();
        this.T1 = str;
        b1();
        this.f35908u1 = 0.6f;
        this.f35911x1 = true;
        this.f35912y1 = true;
        N();
        Y0();
        pj0 pj0Var = this.n1;
        int i7 = this.f28705t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        this.n1.setOnItemClickListener(new q4(1, this, iVar));
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.S1, 0, false, new ai.e(this, 14), this.I0);
        this.U1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return this.T1;
    }
}
