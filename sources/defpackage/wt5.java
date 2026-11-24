package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wt5 extends n39 {
    public final Context c;
    public final xt5 d;

    public wt5(xt5 xt5Var, Context context) {
        this.d = xt5Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.d.s1.size();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLObject K0;
        String str;
        xt5 xt5Var = this.d;
        long B1 = k27.B1((TLRPC.Peer) xt5Var.s1.get(i));
        int i2 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i3 = xt5Var.a;
        if (i2 > 0) {
            K0 = na7.q1(i3).V1(Long.valueOf(B1));
            str = k96.M0(2131743107, null);
        } else {
            K0 = na7.q1(i3).K0(Long.valueOf(-B1));
            str = null;
        }
        int i4 = xt5Var.v1;
        View view = s49Var.a;
        boolean z = false;
        if (i4 == 0) {
            waa waaVar = (waa) view;
            if (B1 == k27.B1(xt5Var.w1)) {
                z = true;
            }
            waaVar.c(B1, z, null);
            return;
        }
        za5 za5Var = (za5) view;
        if (i != b() - 1) {
            z = true;
        }
        za5Var.e(K0, null, str, z);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        boolean z;
        View za5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            za5Var = new waa(2, null, this.c);
            za5Var.setLayoutParams(new e49(gl.L(80.0f), gl.L(100.0f)));
        } else {
            if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            za5Var = new za5(2, 0, null, this.c, false, z);
        }
        return new s49(za5Var);
    }

    @Override
    public final void y(s49 s49Var) {
        long j;
        s49Var.b();
        long B1 = k27.B1(this.d.w1);
        View view = s49Var.a;
        boolean z = true;
        if (view instanceof za5) {
            za5 za5Var = (za5) view;
            Object object = za5Var.getObject();
            if (object != null) {
                if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    j = ((TLRPC.User) object).id;
                }
            } else {
                j = 0;
            }
            if (B1 != j) {
                z = false;
            }
            za5Var.c(z, false);
            return;
        }
        waa waaVar = (waa) view;
        if (B1 != waaVar.getCurrentDialog()) {
            z = false;
        }
        waaVar.b(z, false);
    }
}
