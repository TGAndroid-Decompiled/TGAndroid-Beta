package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class oa2 extends q59 {
    public final pa2 c;

    public oa2(pa2 pa2Var) {
        this.c = pa2Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.i3.O.size() + 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i <= this.c.i3.O.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        pa2 pa2Var = this.c;
        qa2 qa2Var = pa2Var.i3;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((njb) view).setText(jb6.M0(2131743330, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) qa2Var.O.get(i - 1);
            qf1 qf1Var = (qf1) view;
            if (qf1Var.I) {
                qa2Var.P = null;
            }
            if (i >= qa2Var.O.size()) {
                z = false;
            }
            qf1Var.a(tL_username, z, false, 0L);
            if (tL_username != null && tL_username.editable) {
                qa2Var.P = qf1Var;
                return;
            }
            return;
        }
        jf5 jf5Var = (jf5) view;
        anb.h(cmb.c6, pa2Var.o2, jf5Var);
        jf5Var.setText(jb6.M0(2131743331, null));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        pa2 pa2Var = this.c;
        ylb ylbVar = pa2Var.o2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return new u69(new njb(12, ylbVar, pa2Var.getContext()));
            }
            return new u69(new mf1(this, pa2Var.getContext(), ylbVar));
        }
        return new u69(new jf5(pa2Var.getContext(), ylbVar));
    }
}
