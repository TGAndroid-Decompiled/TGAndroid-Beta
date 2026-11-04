package kg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l0 {
    public final int f17080a;
    public final int f17081b;
    public final String f17082c;
    public final int d;
    public final TLRPC.MessagesFilter f17083e;
    public TLObject f17084f;
    public j0 f17085g;
    public boolean h;

    public l0(int i3, int i10, String str) {
        this.h = true;
        this.f17080a = i3;
        this.f17082c = str;
        this.f17083e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i3 = this.d;
        if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(l0 l0Var) {
        if (this.d != l0Var.d) {
            if (a() && l0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public l0(int i3, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.f17080a = i3;
        this.f17081b = i10;
        this.f17083e = messagesFilter;
        this.d = i11;
    }
}
