package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends s4.o {
    public final q0 f11966b;

    public l0(q0 q0Var) {
        this.f11966b = q0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        q0 q0Var = this.f11966b;
        o0 o0Var = (o0) q0Var.W2.get(i10);
        o0 o0Var2 = (o0) q0Var.V2.get(i11);
        if (o0Var.b(o0Var2)) {
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f12006f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = o0Var2.f12006f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f20422id == ((TLRPC.User) tLObject2).f20422id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = o0Var2.f12006f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f20275id == ((TLRPC.Chat) tLObject3).f20275id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return o0Var.f12005c.equals(o0Var2.f12005c);
            } else {
                if (i12 == 7) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f11966b.V2.size();
    }

    @Override
    public final int e() {
        return this.f11966b.W2.size();
    }
}
