package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class t92 extends c79 {
    public final u92 c;

    public t92(u92 u92Var) {
        this.c = u92Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
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
    public final void t(f89 f89Var, int i) {
        u92 u92Var = this.c;
        v92 v92Var = u92Var.i3;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((ilb) view).setText(ob6.M0(2131743298, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) v92Var.O.get(i - 1);
            re1 re1Var = (re1) view;
            if (re1Var.I) {
                v92Var.P = null;
            }
            if (i >= v92Var.O.size()) {
                z = false;
            }
            re1Var.a(tL_username, z, false, 0L);
            if (tL_username != null && tL_username.editable) {
                v92Var.P = re1Var;
                return;
            }
            return;
        }
        mf5 mf5Var = (mf5) view;
        yob.h(aob.d6, u92Var.o2, mf5Var);
        mf5Var.setText(ob6.M0(2131743299, null));
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        u92 u92Var = this.c;
        vnb vnbVar = u92Var.o2;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return new f89(new ilb(12, vnbVar, u92Var.getContext()));
            }
            return new f89(new ne1(this, u92Var.getContext(), vnbVar));
        }
        return new f89(new mf5(u92Var.getContext(), vnbVar));
    }
}
