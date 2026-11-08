package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends v4.o {
    public final q0 f16830b;

    public l0(q0 q0Var) {
        this.f16830b = q0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        q0 q0Var = this.f16830b;
        o0 o0Var = (o0) q0Var.f16892f3.get(i7);
        o0 o0Var2 = (o0) q0Var.f16891e3.get(i10);
        if (o0Var.b(o0Var2)) {
            int i11 = o0Var.d;
            if (i11 == 4) {
                TLObject tLObject = o0Var.f16874f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = o0Var2.f16874f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f27105id == ((TLRPC.User) tLObject2).f27105id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = o0Var2.f16874f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f26956id == ((TLRPC.Chat) tLObject3).f26956id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i11 == 6) {
                return o0Var.f16872c.equals(o0Var2.f16872c);
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
        return this.f16830b.f16891e3.size();
    }

    @Override
    public final int e() {
        return this.f16830b.f16892f3.size();
    }
}
