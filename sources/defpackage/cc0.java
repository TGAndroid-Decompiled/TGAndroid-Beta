package defpackage;

import org.telegram.tgnet.TLRPC;
public final class cc0 implements pt2 {
    public final byte a;
    public final Object b;
    public final Object c;

    public cc0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = null;
        boolean z = true;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                dc0 dc0Var = (dc0) obj3;
                yb0 yb0Var = (yb0) obj2;
                ec0[] ec0VarArr = yb0Var.i;
                ac0 ac0Var = yb0Var.j;
                if (!dc0Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        dc0Var.a(yb0.c((TLRPC.User) ac0Var.c, (TLRPC.UserFull) obj, ec0VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        dc0Var.a(yb0.a((TLRPC.Chat) ac0Var.c, (TLRPC.ChatFull) obj, ec0VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                pcc pccVar = (pcc) obj2;
                gi0 gi0Var = (gi0) obj;
                if (((gi0) obj3).a == 0) {
                    hl.c3(new jn0(pccVar, (byte) 0));
                    return;
                }
                return;
            case 2:
                tn0 tn0Var = (tn0) obj2;
                gi0 gi0Var2 = (gi0) obj;
                if (((gi0) obj3).a == 0) {
                    hl.c3(new pz(tn0Var, (byte) 15));
                    return;
                }
                return;
            case 3:
                ((vab) obj3).v0((a78) obj2, (Integer) obj);
                return;
            case 4:
                iv4 iv4Var = (iv4) obj2;
                gi0 gi0Var3 = (gi0) obj;
                int i = ((gi0) obj3).a;
                if (i != 0) {
                    z = false;
                }
                if (!z) {
                    str = di0.i(i);
                }
                hl.c3(new yn6(iv4Var, z, str, (byte) 24));
                return;
            default:
                qe2 qe2Var = (qe2) obj2;
                gi0 gi0Var4 = (gi0) obj;
                int i2 = ((gi0) obj3).a;
                if (i2 != 0) {
                    z = false;
                }
                if (!z) {
                    str = di0.i(i2);
                }
                hl.c3(new yn6(qe2Var, z, str, (byte) 25));
                return;
        }
    }
}
