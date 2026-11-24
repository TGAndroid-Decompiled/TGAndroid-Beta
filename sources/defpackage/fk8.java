package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
public final class fk8 extends q59 {
    public final Context c;
    public final gk8 d;

    public fk8(gk8 gk8Var, Context context) {
        this.d = gk8Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return !((ik8) this.d.n.d.get(u69Var.b())).a.current;
    }

    @Override
    public final int b() {
        return this.d.n.d.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        tk8 tk8Var = (tk8) u69Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        ik8 ik8Var = (ik8) premiumPreviewFragment.d.get(i);
        boolean z2 = true;
        if (i != b() - 1) {
            z = true;
        } else {
            z = false;
        }
        tk8Var.a(ik8Var, z);
        if (premiumPreviewFragment.e != i) {
            z2 = false;
        }
        tk8Var.c(z2, false);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ek8 ek8Var = new ek8(this, this.c);
        ek8Var.setCirclePaintProvider(new cz6(this, ek8Var, (byte) 24));
        return new u69(ek8Var);
    }
}
