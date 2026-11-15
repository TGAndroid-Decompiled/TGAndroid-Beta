package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends v4.o {
    public final q0 f17180b;

    public l0(q0 q0Var) {
        this.f17180b = q0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        q0 q0Var = this.f17180b;
        o0 o0Var = (o0) q0Var.f17245g3.get(i7);
        o0 o0Var2 = (o0) q0Var.f17244f3.get(i10);
        if (o0Var.b(o0Var2)) {
            int i11 = o0Var.d;
            if (i11 == 4) {
                TLObject tLObject = o0Var.f17223f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = o0Var2.f17223f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f28200id == ((TLRPC.User) tLObject2).f28200id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = o0Var2.f17223f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f28051id == ((TLRPC.Chat) tLObject3).f28051id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i11 == 6) {
                return o0Var.f17221c.equals(o0Var2.f17221c);
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
        return this.f17180b.f17244f3.size();
    }

    @Override
    public final int e() {
        return this.f17180b.f17245g3.size();
    }
}
