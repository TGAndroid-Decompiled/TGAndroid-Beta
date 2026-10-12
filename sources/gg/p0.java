package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p0 {
    public final int f10758a;
    public final int f10759b;
    public final String f10760c;
    public final int d;
    public final TLRPC.MessagesFilter f10761e;
    public TLObject f10762f;
    public n0 f10763g;
    public boolean h;

    public p0(int i10, int i11, String str) {
        this.h = true;
        this.f10758a = i10;
        this.f10760c = str;
        this.f10761e = null;
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
        this.f10758a = i10;
        this.f10759b = i11;
        this.f10761e = messagesFilter;
        this.d = i12;
    }
}
