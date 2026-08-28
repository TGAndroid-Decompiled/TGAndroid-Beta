package of;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m0 {
    public final int f19418a;
    public final int f19419b;
    public final String f19420c;
    public final int d;
    public final TLRPC.MessagesFilter f19421e;
    public TLObject f19422f;
    public k0 f19423g;
    public boolean h;

    public m0(int i9, int i10, String str) {
        this.h = true;
        this.f19418a = i9;
        this.f19420c = str;
        this.f19421e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i9 = this.d;
        if (i9 == 0 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(m0 m0Var) {
        if (this.d != m0Var.d) {
            if (a() && m0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public m0(int i9, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.f19418a = i9;
        this.f19419b = i10;
        this.f19421e = messagesFilter;
        this.d = i11;
    }
}
