package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 extends s4.o {
    public final r0 f10656b;

    public l0(r0 r0Var) {
        this.f10656b = r0Var;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        r0 r0Var = this.f10656b;
        p0 p0Var = (p0) r0Var.W2.get(i10);
        p0 p0Var2 = (p0) r0Var.V2.get(i11);
        if (p0Var.b(p0Var2)) {
            int i12 = p0Var.d;
            if (i12 == 4) {
                TLObject tLObject = p0Var.f10702f;
                if (tLObject instanceof TLRPC.User) {
                    TLObject tLObject2 = p0Var2.f10702f;
                    if (tLObject2 instanceof TLRPC.User) {
                        if (((TLRPC.User) tLObject).f19363id == ((TLRPC.User) tLObject2).f19363id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (tLObject instanceof TLRPC.Chat) {
                    TLObject tLObject3 = p0Var2.f10702f;
                    if ((tLObject3 instanceof TLRPC.Chat) && ((TLRPC.Chat) tLObject).f19216id == ((TLRPC.Chat) tLObject3).f19216id) {
                        return true;
                    }
                    return false;
                }
                return false;
            } else if (i12 == 6) {
                return p0Var.f10701c.equals(p0Var2.f10701c);
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
        return this.f10656b.V2.size();
    }

    @Override
    public final int e() {
        return this.f10656b.W2.size();
    }
}
