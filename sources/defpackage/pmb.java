package defpackage;

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;
public final class pmb extends b01 implements vlb {
    public int e;
    public final d0 f;

    public pmb(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Lj));
    }

    @Override
    public final void updateColors() {
        a01 a01Var = this.d;
        if (a01Var != null) {
            try {
                int w0 = cmb.w0(null, cmb.Lj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    a01Var.setOuterColor(w0);
                    a01Var.invalidate();
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
