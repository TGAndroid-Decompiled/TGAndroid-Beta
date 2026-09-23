package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 extends s4.o {
    public final s0 f9844b;

    public m0(s0 s0Var) {
        this.f9844b = s0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        s0 s0Var = this.f9844b;
        q0 q0Var = (q0) s0Var.Y2.get(i10);
        q0 q0Var2 = (q0) s0Var.X2.get(i11);
        if (q0Var.b(q0Var2)) {
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9882f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = q0Var2.f9882f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f18230id == ((TLRPC.User) tLObject2).f18230id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = q0Var2.f9882f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f18083id == ((TLRPC.Chat) tLObject3).f18083id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return q0Var.f9881c.equals(q0Var2.f9881c);
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
        return this.f9844b.X2.size();
    }

    @Override
    public final int e() {
        return this.f9844b.Y2.size();
    }
}
