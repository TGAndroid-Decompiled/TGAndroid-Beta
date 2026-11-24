package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph4 extends age {
    public final uh4 a;

    public ph4(uh4 uh4Var) {
        this.a = uh4Var;
    }

    @Override
    public final boolean b(int i, int i2) {
        uh4 uh4Var = this.a;
        sh4 sh4Var = (sh4) uh4Var.g3.get(i);
        sh4 sh4Var2 = (sh4) uh4Var.f3.get(i2);
        if (sh4Var.b(sh4Var2)) {
            byte b = sh4Var.d;
            if (b == 4) {
                TLObject tLObject = sh4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = sh4Var2.f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = sh4Var2.f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (b == 6) {
                return sh4Var.c.equals(sh4Var2.c);
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
