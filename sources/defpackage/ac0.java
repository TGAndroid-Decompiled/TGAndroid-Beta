package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ac0 implements vs2 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ac0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = null;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                bc0 bc0Var = (bc0) obj3;
                wb0 wb0Var = (wb0) obj2;
                cc0[] cc0VarArr = wb0Var.i;
                yb0 yb0Var = wb0Var.j;
                if (!bc0Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        bc0Var.a(wb0.c((TLRPC.User) yb0Var.c, (TLRPC.UserFull) obj, cc0VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        bc0Var.a(wb0.a((TLRPC.Chat) yb0Var.c, (TLRPC.ChatFull) obj, cc0VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                p8c p8cVar = (p8c) obj2;
                fi0 fi0Var = (fi0) obj;
                if (((fi0) obj3).a == 0) {
                    gl.c3(new mn0(p8cVar, (byte) 1));
                    return;
                }
                return;
            case 2:
                tn0 tn0Var = (tn0) obj2;
                fi0 fi0Var2 = (fi0) obj;
                if (((fi0) obj3).a == 0) {
                    gl.c3(new oz(tn0Var, (byte) 16));
                    return;
                }
                return;
            case 3:
                ((x6b) obj3).v0((k38) obj2, (Integer) obj);
                return;
            case 4:
                et4 et4Var = (et4) obj2;
                fi0 fi0Var3 = (fi0) obj;
                int i = ((fi0) obj3).a;
                if (i == 0) {
                    z = true;
                }
                if (!z) {
                    str = ci0.i(i);
                }
                gl.c3(new vj6(et4Var, z, str, (byte) 26));
                return;
            default:
                ae2 ae2Var = (ae2) obj2;
                fi0 fi0Var4 = (fi0) obj;
                int i2 = ((fi0) obj3).a;
                if (i2 == 0) {
                    z = true;
                }
                if (!z) {
                    str = ci0.i(i2);
                }
                gl.c3(new vj6(ae2Var, z, str, (byte) 25));
                return;
        }
    }
}
