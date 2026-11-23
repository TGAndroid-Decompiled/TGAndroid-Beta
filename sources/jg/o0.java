package jg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o0 {
    public final int f17698a;
    public final int f17699b;
    public final String f17700c;
    public final int d;
    public final TLRPC.MessagesFilter f17701e;
    public TLObject f17702f;
    public m0 f17703g;
    public boolean h;

    public o0(int i7, int i10, String str) {
        this.h = true;
        this.f17698a = i7;
        this.f17700c = str;
        this.f17701e = null;
        this.d = i10;
    }

    public final boolean a() {
        int i7 = this.d;
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(o0 o0Var) {
        if (this.d != o0Var.d) {
            if (a() && o0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public o0(int i7, int i10, TLRPC.MessagesFilter messagesFilter, int i11) {
        this.h = true;
        this.f17698a = i7;
        this.f17699b = i10;
        this.f17701e = messagesFilter;
        this.d = i11;
    }
}
