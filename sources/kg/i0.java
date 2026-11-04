package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i0 extends u4.o {
    public final n0 f17042b;

    public i0(n0 n0Var) {
        this.f17042b = n0Var;
    }

    @Override
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i3, int i10) {
        n0 n0Var = this.f17042b;
        l0 l0Var = (l0) n0Var.f17113g3.get(i3);
        l0 l0Var2 = (l0) n0Var.f17112f3.get(i10);
        if (l0Var.b(l0Var2)) {
            int i11 = l0Var.d;
            if (i11 == 4) {
                TLObject tLObject = l0Var.f17084f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = l0Var2.f17084f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f27150id == ((TLRPC.User) tLObject2).f27150id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = l0Var2.f17084f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f27001id == ((TLRPC.Chat) tLObject3).f27001id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i11 == 6) {
                return l0Var.f17082c.equals(l0Var2.f17082c);
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
        return this.f17042b.f17112f3.size();
    }

    @Override
    public final int e() {
        return this.f17042b.f17113g3.size();
    }
}
