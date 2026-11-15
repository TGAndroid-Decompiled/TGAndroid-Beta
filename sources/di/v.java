package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf0;
public final class v implements RequestDelegate {
    public final int f9549a;
    public final int f9550b;
    public final long f9551c;
    public final Object d;
    public final Object f9552e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9549a = i10;
        this.d = obj;
        this.f9552e = obj2;
        this.f9550b = i7;
        this.f9551c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9549a) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.e0((e0) this.d, (d0) this.f9552e, this.f9550b, tLObject, this.f9551c, 1));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new x7(this.f9550b, 1, this.f9551c, (hi.d) this.d, (org.telegram.ui.ActionBar.u2[]) this.f9552e));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bi.e0((fi.s6) this.d, tLObject, this.f9550b, (String) this.f9552e, this.f9551c, 3));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new v7(tLObject, this.f9550b, (hi.d) this.d, (org.telegram.ui.ActionBar.u2) this.f9552e, this.f9551c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new v7((jf0) this.d, tL_error, tLObject, this.f9551c, this.f9550b, (TLRPC.Chat) this.f9552e));
                return;
        }
    }

    public v(int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3) {
        this.f9549a = 3;
        this.f9550b = i7;
        this.d = dVar;
        this.f9552e = u2Var;
        this.f9551c = j3;
    }

    public v(fi.s6 s6Var, int i7, String str, long j3) {
        this.f9549a = 2;
        this.d = s6Var;
        this.f9550b = i7;
        this.f9552e = str;
        this.f9551c = j3;
    }

    public v(jf0 jf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9549a = 4;
        this.d = jf0Var;
        this.f9551c = j3;
        this.f9550b = i7;
        this.f9552e = chat;
    }
}
