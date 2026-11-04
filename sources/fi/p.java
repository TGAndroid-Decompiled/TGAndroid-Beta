package fi;

import ai.v2;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ei.q4;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class p extends ma {
    public final int Q1;
    public final CharSequence R1;
    public f41 S1;

    public p(d2 d2Var, String str, v2 v2Var) {
        super(d2Var, true, false, d2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.Q1 = d2Var.getCurrentAccount();
        this.R1 = str;
        b1();
        this.f36108s1 = 0.6f;
        this.f36111v1 = true;
        this.f36112w1 = true;
        N();
        Y0();
        tj0 tj0Var = this.f36102l1;
        int i3 = this.f28618u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        this.f36102l1.setOnItemClickListener(new q4(1, this, v2Var));
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.Q1, 0, false, new ai.c(this, 24), this.J0);
        this.S1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return this.R1;
    }
}
