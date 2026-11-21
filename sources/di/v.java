package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mf0;
public final class v implements RequestDelegate {
    public final int f9922a;
    public final int f9923b;
    public final long f9924c;
    public final Object d;
    public final Object f9925e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9922a = i10;
        this.d = obj;
        this.f9925e = obj2;
        this.f9923b = i7;
        this.f9924c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9922a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9925e, this.f9923b, tLObject, this.f9924c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.u3(this.f9923b, 2, this.f9924c, (hi.e) this.d, (org.telegram.ui.ActionBar.w2[]) this.f9925e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9923b, (String) this.f9925e, this.f9924c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.p4(tLObject, this.f9923b, (hi.e) this.d, (org.telegram.ui.ActionBar.w2) this.f9925e, this.f9924c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.p4((mf0) this.d, tL_error, tLObject, this.f9924c, this.f9923b, (TLRPC.Chat) this.f9925e, 7));
                return;
        }
    }

    public v(int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f9922a = 3;
        this.f9923b = i7;
        this.d = eVar;
        this.f9925e = w2Var;
        this.f9924c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9922a = 2;
        this.d = p6Var;
        this.f9923b = i7;
        this.f9925e = str;
        this.f9924c = j3;
    }

    public v(mf0 mf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9922a = 4;
        this.d = mf0Var;
        this.f9924c = j3;
        this.f9923b = i7;
        this.f9925e = chat;
    }
}
