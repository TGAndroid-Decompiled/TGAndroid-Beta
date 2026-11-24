package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vv5 extends q59 {
    public final Context c;
    public final wv5 d;

    public vv5(wv5 wv5Var, Context context) {
        this.d = wv5Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
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
    public final void t(u69 u69Var, int i) {
        TLObject L0;
        String str;
        wv5 wv5Var = this.d;
        long B1 = k47.B1((TLRPC.Peer) wv5Var.s1.get(i));
        int i2 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i3 = wv5Var.a;
        if (i2 > 0) {
            L0 = oc7.r1(i3).W1(Long.valueOf(B1));
            str = jb6.M0(2131743033, null);
        } else {
            L0 = oc7.r1(i3).L0(Long.valueOf(-B1));
            str = null;
        }
        int i4 = wv5Var.v1;
        View view = u69Var.a;
        boolean z = false;
        if (i4 == 0) {
            wca wcaVar = (wca) view;
            if (B1 == k47.B1(wv5Var.w1)) {
                z = true;
            }
            wcaVar.c(B1, z, null);
            return;
        }
        xc5 xc5Var = (xc5) view;
        if (i != b() - 1) {
            z = true;
        }
        xc5Var.e(L0, null, str, z);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        boolean z;
        View xc5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            xc5Var = new wca(2, null, this.c);
            xc5Var.setLayoutParams(new g69(gm.L(80.0f), gm.L(100.0f)));
        } else {
            if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            xc5Var = new xc5(2, 0, null, this.c, false, z);
        }
        return new u69(xc5Var);
    }

    @Override
    public final void y(u69 u69Var) {
        long j;
        u69Var.b();
        long B1 = k47.B1(this.d.w1);
        View view = u69Var.a;
        boolean z = true;
        if (view instanceof xc5) {
            xc5 xc5Var = (xc5) view;
            Object object = xc5Var.getObject();
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
            xc5Var.c(z, false);
            return;
        }
        wca wcaVar = (wca) view;
        if (B1 != wcaVar.getCurrentDialog()) {
            z = false;
        }
        wcaVar.b(z, false);
    }
}
