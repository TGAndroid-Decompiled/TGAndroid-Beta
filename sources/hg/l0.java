package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends s4.o {
    public final q0 f11992b;

    public l0(q0 q0Var) {
        this.f11992b = q0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        q0 q0Var = this.f11992b;
        o0 o0Var = (o0) q0Var.Z2.get(i10);
        o0 o0Var2 = (o0) q0Var.Y2.get(i11);
        if (o0Var.b(o0Var2)) {
            int i12 = o0Var.d;
            if (i12 == 4) {
                TLObject tLObject = o0Var.f12031f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = o0Var2.f12031f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f20490id == ((TLRPC.User) tLObject2).f20490id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = o0Var2.f12031f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f20343id == ((TLRPC.Chat) tLObject3).f20343id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return o0Var.f12030c.equals(o0Var2.f12030c);
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
        return this.f11992b.Y2.size();
    }

    @Override
    public final int e() {
        return this.f11992b.Z2.size();
    }
}
