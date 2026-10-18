package hg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o0 {
    public final int f12004a;
    public final int f12005b;
    public final String f12006c;
    public final int d;
    public final TLRPC.MessagesFilter e;
    public TLObject f12007f;
    public m0 f12008g;
    public boolean h;

    public o0(int i10, int i11, String str) {
        this.h = true;
        this.f12004a = i10;
        this.f12006c = str;
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

    public final boolean b(o0 o0Var) {
        if (this.d != o0Var.d) {
            if (a() && o0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public o0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f12004a = i10;
        this.f12005b = i11;
        this.e = messagesFilter;
        this.d = i12;
    }
}
