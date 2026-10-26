package ig;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 extends s4.p {
    public final r0 f14162b;

    public m0(r0 r0Var) {
        this.f14162b = r0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        r0 r0Var = this.f14162b;
        p0 p0Var = (p0) r0Var.f14221g3.get(i10);
        p0 p0Var2 = (p0) r0Var.f14220f3.get(i11);
        if (p0Var.b(p0Var2)) {
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f14201f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = p0Var2.f14201f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f22176id == ((TLRPC.User) tLObject2).f22176id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = p0Var2.f14201f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f22027id == ((TLRPC.Chat) tLObject3).f22027id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return p0Var.f14200c.equals(p0Var2.f14200c);
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
        return this.f14162b.f14220f3.size();
    }

    @Override
    public final int e() {
        return this.f14162b.f14221g3.size();
    }
}
