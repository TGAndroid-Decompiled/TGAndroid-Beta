package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 extends s4.o {
    public final s0 f9857b;

    public m0(s0 s0Var) {
        this.f9857b = s0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        s0 s0Var = this.f9857b;
        q0 q0Var = (q0) s0Var.Y2.get(i10);
        q0 q0Var2 = (q0) s0Var.X2.get(i11);
        if (q0Var.b(q0Var2)) {
            int i12 = q0Var.d;
            if (i12 == 4) {
                TLObject tLObject = q0Var.f9895f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = q0Var2.f9895f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f18259id == ((TLRPC.User) tLObject2).f18259id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = q0Var2.f9895f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f18112id == ((TLRPC.Chat) tLObject3).f18112id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return q0Var.f9894c.equals(q0Var2.f9894c);
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
        return this.f9857b.X2.size();
    }

    @Override
    public final int e() {
        return this.f9857b.Y2.size();
    }
}
