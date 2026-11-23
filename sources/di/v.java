package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.lf0;
public final class v implements RequestDelegate {
    public final int f9886a;
    public final int f9887b;
    public final long f9888c;
    public final Object d;
    public final Object f9889e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9886a = i10;
        this.d = obj;
        this.f9889e = obj2;
        this.f9887b = i7;
        this.f9888c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9886a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9889e, this.f9887b, tLObject, this.f9888c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.w3(this.f9887b, 2, this.f9888c, (hi.e) this.d, (org.telegram.ui.ActionBar.w2[]) this.f9889e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9887b, (String) this.f9889e, this.f9888c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.s4(tLObject, this.f9887b, (hi.e) this.d, (org.telegram.ui.ActionBar.w2) this.f9889e, this.f9888c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.s4((lf0) this.d, tL_error, tLObject, this.f9888c, this.f9887b, (TLRPC.Chat) this.f9889e, 7));
                return;
        }
    }

    public v(int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f9886a = 3;
        this.f9887b = i7;
        this.d = eVar;
        this.f9889e = w2Var;
        this.f9888c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9886a = 2;
        this.d = p6Var;
        this.f9887b = i7;
        this.f9889e = str;
        this.f9888c = j3;
    }

    public v(lf0 lf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9886a = 4;
        this.d = lf0Var;
        this.f9888c = j3;
        this.f9887b = i7;
        this.f9889e = chat;
    }
}
