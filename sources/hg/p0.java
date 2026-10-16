package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p0 {
    public final int f10703a;
    public final int f10704b;
    public final String f10705c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f10706f;
    public n0 f10707g;
    public boolean h;

    public p0(int i10, int i11, String str) {
        this.h = true;
        this.f10703a = i10;
        this.f10705c = str;
        this.e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(p0 p0Var) {
        if (this.d != p0Var.d) {
            if (a() && p0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public p0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f10703a = i10;
        this.f10704b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
