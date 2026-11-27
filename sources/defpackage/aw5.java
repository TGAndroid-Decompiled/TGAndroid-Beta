package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aw5 extends c79 {
    public final Context c;
    public final bw5 d;

    public aw5(bw5 bw5Var, Context context) {
        this.d = bw5Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
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
    public final void t(f89 f89Var, int i) {
        TLObject M0;
        String str;
        bw5 bw5Var = this.d;
        long B1 = r47.B1((TLRPC.Peer) bw5Var.s1.get(i));
        int i2 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        int i3 = bw5Var.a;
        if (i2 > 0) {
            M0 = uc7.s1(i3).X1(Long.valueOf(B1));
            str = ob6.M0(2131743001, null);
        } else {
            M0 = uc7.s1(i3).M0(Long.valueOf(-B1));
            str = null;
        }
        int i4 = bw5Var.v1;
        View view = f89Var.a;
        boolean z = false;
        if (i4 == 0) {
            nea neaVar = (nea) view;
            if (B1 == r47.B1(bw5Var.w1)) {
                z = true;
            }
            neaVar.c(B1, z, null);
            return;
        }
        bd5 bd5Var = (bd5) view;
        if (i != b() - 1) {
            z = true;
        }
        bd5Var.e(M0, null, str, z);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        boolean z;
        View bd5Var;
        int i2 = this.d.v1;
        if (i2 == 0) {
            bd5Var = new nea(2, null, this.c);
            bd5Var.setLayoutParams(new r79(hl.L(80.0f), hl.L(100.0f)));
        } else {
            if (i2 == 2) {
                z = true;
            } else {
                z = false;
            }
            bd5Var = new bd5(2, 0, null, this.c, false, z);
        }
        return new f89(bd5Var);
    }

    @Override
    public final void y(f89 f89Var) {
        long j;
        f89Var.b();
        long B1 = r47.B1(this.d.w1);
        View view = f89Var.a;
        boolean z = true;
        if (view instanceof bd5) {
            bd5 bd5Var = (bd5) view;
            Object object = bd5Var.getObject();
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
            bd5Var.c(z, false);
            return;
        }
        nea neaVar = (nea) view;
        if (B1 != neaVar.getCurrentDialog()) {
            z = false;
        }
        neaVar.b(z, false);
    }
}
