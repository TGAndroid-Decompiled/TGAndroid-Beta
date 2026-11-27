package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mh4 extends qie {
    public final rh4 a;

    public mh4(rh4 rh4Var) {
        this.a = rh4Var;
    }

    @Override
    public final boolean b(int i, int i2) {
        rh4 rh4Var = this.a;
        ph4 ph4Var = (ph4) rh4Var.g3.get(i);
        ph4 ph4Var2 = (ph4) rh4Var.f3.get(i2);
        if (ph4Var.b(ph4Var2)) {
            byte b = ph4Var.d;
            if (b == 4) {
                TLObject tLObject = ph4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = ph4Var2.f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = ph4Var2.f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (b == 6) {
                return ph4Var.c.equals(ph4Var2.c);
            } else {
                if (b == 7) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public final int c() {
        return this.a.f3.size();
    }

    @Override
    public final int d() {
        return this.a.g3.size();
    }
}
