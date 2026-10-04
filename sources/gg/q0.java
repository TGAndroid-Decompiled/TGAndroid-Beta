package gg;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q0 {
    public final int f10755a;
    public final int f10756b;
    public final String f10757c;
    public final int d;
    public final TLRPC.MessagesFilter f10758e;
    public TLObject f10759f;
    public o0 f10760g;
    public boolean h;

    public q0(int i10, int i11, String str) {
        this.h = true;
        this.f10755a = i10;
        this.f10757c = str;
        this.f10758e = null;
        this.d = i11;
    }

    public final boolean a() {
        int i10 = this.d;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5) {
            return true;
        }
        return false;
    }

    public final boolean b(q0 q0Var) {
        if (this.d != q0Var.d) {
            if (a() && q0Var.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public q0(int i10, int i11, TLRPC.MessagesFilter messagesFilter, int i12) {
        this.h = true;
        this.f10755a = i10;
        this.f10756b = i11;
        this.f10758e = messagesFilter;
        this.d = i12;
    }
}
