package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;
public final class di8 extends n39 {
    public final Context c;
    public final ei8 d;

    public di8(ei8 ei8Var, Context context) {
        this.d = ei8Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return !((gi8) this.d.n.d.get(s49Var.b())).a.current;
    }

    @Override
    public final int b() {
        return this.d.n.d.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        ri8 ri8Var = (ri8) s49Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        gi8 gi8Var = (gi8) premiumPreviewFragment.d.get(i);
        boolean z2 = true;
        if (i != b() - 1) {
            z = true;
        } else {
            z = false;
        }
        ri8Var.a(gi8Var, z);
        if (premiumPreviewFragment.e != i) {
            z2 = false;
        }
        ri8Var.c(z2, false);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ci8 ci8Var = new ci8(this, this.c);
        ci8Var.setCirclePaintProvider(new dx6(this, ci8Var, (byte) 23));
        return new s49(ci8Var);
    }
}
