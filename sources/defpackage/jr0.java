package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e;
public final class jr0 extends ny0 {
    public final int S1;
    public final String T1;
    public l9c U1;

    public jr0(e eVar, String str, te2 te2Var) {
        super(eVar, true, false, eVar.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.S1 = eVar.getCurrentAccount();
        this.T1 = str;
        X0();
        this.u1 = 0.6f;
        this.x1 = true;
        this.y1 = true;
        J();
        U0();
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new l0(this, te2Var, (byte) 3));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.S1, 0, false, new pp0(this, (byte) 1), this.J0);
        this.U1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return this.T1;
    }
}
