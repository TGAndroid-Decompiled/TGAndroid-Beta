package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
public final class js0 extends mz0 {
    public final int S1;
    public final String T1;
    public l7c U1;

    public js0(d dVar, String str, mf2 mf2Var) {
        super(dVar, true, false, dVar.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.S1 = dVar.getCurrentAccount();
        this.T1 = str;
        W0();
        this.u1 = 0.6f;
        this.x1 = true;
        this.y1 = true;
        J();
        T0();
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new k0(this, mf2Var, (byte) 3));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.S1, 0, false, new nq0(this, (byte) 1), this.J0);
        this.U1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return this.T1;
    }
}
