package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public pf4 g;
    public boolean h;

    public rf4(int i, int i2, String str) {
        this.h = true;
        this.a = i;
        this.c = str;
        this.e = null;
        this.d = i2;
    }

    public final boolean a() {
        byte b = this.d;
        if (b == 0 || b == 1 || b == 2 || b == 3 || b == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(rf4 rf4Var) {
        if (this.d != rf4Var.d) {
            if (a() && rf4Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public rf4(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
        this.h = true;
        this.a = i;
        this.b = i2;
        this.e = messagesFilter;
        this.d = i3;
    }
}
