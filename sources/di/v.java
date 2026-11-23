package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mf0;
public final class v implements RequestDelegate {
    public final int f9925a;
    public final int f9926b;
    public final long f9927c;
    public final Object d;
    public final Object f9928e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9925a = i10;
        this.d = obj;
        this.f9928e = obj2;
        this.f9926b = i7;
        this.f9927c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9925a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9928e, this.f9926b, tLObject, this.f9927c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.u3(this.f9926b, 2, this.f9927c, (hi.e) this.d, (org.telegram.ui.ActionBar.w2[]) this.f9928e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9926b, (String) this.f9928e, this.f9927c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.p4(tLObject, this.f9926b, (hi.e) this.d, (org.telegram.ui.ActionBar.w2) this.f9928e, this.f9927c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.p4((mf0) this.d, tL_error, tLObject, this.f9927c, this.f9926b, (TLRPC.Chat) this.f9928e, 7));
                return;
        }
    }

    public v(int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f9925a = 3;
        this.f9926b = i7;
        this.d = eVar;
        this.f9928e = w2Var;
        this.f9927c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9925a = 2;
        this.d = p6Var;
        this.f9926b = i7;
        this.f9928e = str;
        this.f9927c = j3;
    }

    public v(mf0 mf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9925a = 4;
        this.d = mf0Var;
        this.f9927c = j3;
        this.f9926b = i7;
        this.f9928e = chat;
    }
}
