package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class of4 extends zde {
    public final tf4 a;

    public of4(tf4 tf4Var) {
        this.a = tf4Var;
    }

    @Override
    public final boolean b(int i, int i2) {
        tf4 tf4Var = this.a;
        rf4 rf4Var = (rf4) tf4Var.g3.get(i);
        rf4 rf4Var2 = (rf4) tf4Var.f3.get(i2);
        if (rf4Var.b(rf4Var2)) {
            byte b = rf4Var.d;
            if (b == 4) {
                TLObject tLObject = rf4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = rf4Var2.f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).id == ((TLRPC.User) tLObject2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = rf4Var2.f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).id == ((TLRPC.Chat) tLObject3).id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (b == 6) {
                return rf4Var.c.equals(rf4Var2.c);
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
