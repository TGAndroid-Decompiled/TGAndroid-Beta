package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ph4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public nh4 g;
    public boolean h;

    public ph4(int i, int i2, String str) {
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

    public final boolean b(ph4 ph4Var) {
        if (this.d != ph4Var.d) {
            if (a() && ph4Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public ph4(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
        this.h = true;
        this.a = i;
        this.b = i2;
        this.e = messagesFilter;
        this.d = i3;
    }
}
