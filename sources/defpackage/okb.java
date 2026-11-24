package defpackage;

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;
public final class okb extends uy0 implements tjb {
    public int e;
    public final d0 f;

    public okb(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Lj));
    }

    @Override
    public final void updateColors() {
        ty0 ty0Var = this.d;
        if (ty0Var != null) {
            try {
                int w0 = bkb.w0(null, bkb.Lj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    ty0Var.setOuterColor(w0);
                    ty0Var.invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
