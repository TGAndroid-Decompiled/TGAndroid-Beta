package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mf0;
public final class v implements RequestDelegate {
    public final int f9895a;
    public final int f9896b;
    public final long f9897c;
    public final Object d;
    public final Object f9898e;

    public v(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f9895a = i10;
        this.d = obj;
        this.f9898e = obj2;
        this.f9896b = i7;
        this.f9897c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9895a) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.e0((e0) this.d, (d0) this.f9898e, this.f9896b, tLObject, this.f9897c, 3));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new bi.q3(this.f9896b, 2, this.f9897c, (hi.d) this.d, (org.telegram.ui.ActionBar.x2[]) this.f9898e));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bi.e0((fi.p6) this.d, tLObject, this.f9896b, (String) this.f9898e, this.f9897c, 5));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new bi.l4(tLObject, this.f9896b, (hi.d) this.d, (org.telegram.ui.ActionBar.x2) this.f9898e, this.f9897c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new bi.l4((mf0) this.d, tL_error, tLObject, this.f9897c, this.f9896b, (TLRPC.Chat) this.f9898e, 7));
                return;
        }
    }

    public v(int i7, hi.d dVar, org.telegram.ui.ActionBar.x2 x2Var, long j3) {
        this.f9895a = 3;
        this.f9896b = i7;
        this.d = dVar;
        this.f9898e = x2Var;
        this.f9897c = j3;
    }

    public v(fi.p6 p6Var, int i7, String str, long j3) {
        this.f9895a = 2;
        this.d = p6Var;
        this.f9896b = i7;
        this.f9898e = str;
        this.f9897c = j3;
    }

    public v(mf0 mf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f9895a = 4;
        this.d = mf0Var;
        this.f9897c = j3;
        this.f9896b = i7;
        this.f9898e = chat;
    }
}
