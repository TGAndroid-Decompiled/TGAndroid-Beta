package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.d;
public final class jr0 extends fy0 {
    public final int S1;
    public final String T1;
    public l5c U1;

    public jr0(d dVar, String str, be2 be2Var) {
        super(dVar, true, false, dVar.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.S1 = dVar.getCurrentAccount();
        this.T1 = str;
        W0();
        this.u1 = 0.6f;
        this.x1 = true;
        this.y1 = true;
        K();
        T0();
        o39 o39Var = this.n1;
        int i = this.u0;
        o39Var.setPadding(i, 0, i, 0);
        this.n1.setOnItemClickListener(new k0(this, be2Var, (byte) 3));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.S1, 0, false, new np0(this, (byte) 1), this.J0);
        this.U1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return this.T1;
    }
}
