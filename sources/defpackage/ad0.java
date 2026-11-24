package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ad0 implements gu2 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ad0(Object obj, Object obj2, byte b) {
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
                bd0 bd0Var = (bd0) obj3;
                wc0 wc0Var = (wc0) obj2;
                cd0[] cd0VarArr = wc0Var.i;
                yc0 yc0Var = wc0Var.j;
                if (!bd0Var.F) {
                    if (obj instanceof TLRPC.UserFull) {
                        bd0Var.a(wc0.c((TLRPC.User) yc0Var.c, (TLRPC.UserFull) obj, cd0VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        bd0Var.a(wc0.a((TLRPC.Chat) yc0Var.c, (TLRPC.ChatFull) obj, cd0VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                qac qacVar = (qac) obj2;
                fj0 fj0Var = (fj0) obj;
                if (((fj0) obj3).a == 0) {
                    gm.c3(new mo0(qacVar, (byte) 1));
                    return;
                }
                return;
            case 2:
                to0 to0Var = (to0) obj2;
                fj0 fj0Var2 = (fj0) obj;
                if (((fj0) obj3).a == 0) {
                    gm.c3(new f00(to0Var, (byte) 18));
                    return;
                }
                return;
            case 3:
                ((z8b) obj3).v0((m58) obj2, (Integer) obj);
                return;
            case 4:
                fv4 fv4Var = (fv4) obj2;
                fj0 fj0Var3 = (fj0) obj;
                int i = ((fj0) obj3).a;
                if (i == 0) {
                    z = true;
                }
                if (!z) {
                    str = cj0.i(i);
                }
                gm.c3(new yl6(fv4Var, z, str, (byte) 26));
                return;
            default:
                lf2 lf2Var = (lf2) obj2;
                fj0 fj0Var4 = (fj0) obj;
                int i2 = ((fj0) obj3).a;
                if (i2 == 0) {
                    z = true;
                }
                if (!z) {
                    str = cj0.i(i2);
                }
                gm.c3(new yl6(lf2Var, z, str, (byte) 25));
                return;
        }
    }
}
