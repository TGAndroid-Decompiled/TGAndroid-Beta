package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
public final class ql8 extends c79 {
    public final Context c;
    public final rl8 d;

    public ql8(rl8 rl8Var, Context context) {
        this.d = rl8Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return !((tl8) this.d.n.d.get(f89Var.b())).a.current;
    }

    @Override
    public final int b() {
        return this.d.n.d.size();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        em8 em8Var = (em8) f89Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        tl8 tl8Var = (tl8) premiumPreviewFragment.d.get(i);
        boolean z2 = true;
        if (i != b() - 1) {
            z = true;
        } else {
            z = false;
        }
        em8Var.a(tl8Var, z);
        if (premiumPreviewFragment.e != i) {
            z2 = false;
        }
        em8Var.c(z2, false);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        pl8 pl8Var = new pl8(this, this.c);
        pl8Var.setCirclePaintProvider(new m88(this, pl8Var, (byte) 8));
        return new f89(pl8Var);
    }
}
