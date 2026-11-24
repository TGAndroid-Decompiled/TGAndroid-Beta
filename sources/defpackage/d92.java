package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class d92 extends n39 {
    public final e92 c;

    public d92(e92 e92Var) {
        this.c = e92Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
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
    public final void t(s49 s49Var, int i) {
        e92 e92Var = this.c;
        f92 f92Var = e92Var.i3;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((mhb) view).setText(k96.M0(2131743404, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) f92Var.O.get(i - 1);
            ie1 ie1Var = (ie1) view;
            if (ie1Var.I) {
                f92Var.P = null;
            }
            if (i >= f92Var.O.size()) {
                z = false;
            }
            ie1Var.a(tL_username, z, false, 0L);
            if (tL_username != null && tL_username.editable) {
                f92Var.P = ie1Var;
                return;
            }
            return;
        }
        ld5 ld5Var = (ld5) view;
        zkb.h(bkb.c6, e92Var.o2, ld5Var);
        ld5Var.setText(k96.M0(2131743405, null));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        e92 e92Var = this.c;
        wjb wjbVar = e92Var.o2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return new s49(new mhb(12, wjbVar, e92Var.getContext()));
            }
            return new s49(new ee1(this, e92Var.getContext(), wjbVar));
        }
        return new s49(new ld5(e92Var.getContext(), wjbVar));
    }
}
