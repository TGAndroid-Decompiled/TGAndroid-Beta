package of;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j0 extends f2.s {
    public final o0 f19375b;

    public j0(o0 o0Var) {
        this.f19375b = o0Var;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i9, int i10) {
        o0 o0Var = this.f19375b;
        m0 m0Var = (m0) o0Var.U2.get(i9);
        m0 m0Var2 = (m0) o0Var.T2.get(i10);
        if (m0Var.b(m0Var2)) {
            int i11 = m0Var.d;
            if (i11 == 4) {
                TLObject tLObject = m0Var.f19422f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = m0Var2.f19422f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f22527id == ((TLRPC.User) tLObject2).f22527id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = m0Var2.f19422f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f22380id == ((TLRPC.Chat) tLObject3).f22380id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i11 == 6) {
                return m0Var.f19420c.equals(m0Var2.f19420c);
            } else {
                if (i11 == 7) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f19375b.T2.size();
    }

    @Override
    public final int e() {
        return this.f19375b.U2.size();
    }
}
