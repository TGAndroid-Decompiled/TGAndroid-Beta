package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends v4.p {
    public final q0 f17659b;

    public l0(q0 q0Var) {
        this.f17659b = q0Var;
    }

    @Override
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        q0 q0Var = this.f17659b;
        o0 o0Var = (o0) q0Var.f17724g3.get(i7);
        o0 o0Var2 = (o0) q0Var.f17723f3.get(i10);
        if (o0Var.b(o0Var2)) {
            int i11 = o0Var.d;
            if (i11 == 4) {
                TLObject tLObject = o0Var.f17702f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = o0Var2.f17702f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f28641id == ((TLRPC.User) tLObject2).f28641id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = o0Var2.f17702f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f28492id == ((TLRPC.Chat) tLObject3).f28492id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i11 == 6) {
                return o0Var.f17700c.equals(o0Var2.f17700c);
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
        return this.f17659b.f17723f3.size();
    }

    @Override
    public final int e() {
        return this.f17659b.f17724g3.size();
    }
}
