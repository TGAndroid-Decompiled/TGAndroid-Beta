package defpackage;

import android.content.Context;
import java.util.HashSet;
import org.telegram.ui.d0;
public final class nob extends cz0 implements snb {
    public int e;
    public final d0 f;

    public nob(d0 d0Var, Context context) {
        super(context);
        this.f = d0Var;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Mj));
    }

    @Override
    public final void updateColors() {
        bz0 bz0Var = this.d;
        if (bz0Var != null) {
            try {
                int w0 = aob.w0(null, aob.Mj, false);
                if (w0 != this.e) {
                    this.e = w0;
                    bz0Var.setOuterColor(w0);
                    bz0Var.invalidate();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
