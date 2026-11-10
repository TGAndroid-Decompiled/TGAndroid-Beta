package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mf0;
public final class b0 implements RequestDelegate {
    public final int f3499a;
    public final int f3500b;
    public final long f3501c;
    public final Object d;
    public final Object f3502e;

    public b0(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f3499a = i10;
        this.d = obj;
        this.f3502e = obj2;
        this.f3500b = i7;
        this.f3501c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3499a) {
            case 0:
                org.telegram.messenger.g0.h3(new d0((n0) this.d, (m0) this.f3502e, this.f3500b, tLObject, this.f3501c, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new f9(this.f3500b, 1, this.f3501c, (fi.d) this.d, (org.telegram.ui.ActionBar.w2[]) this.f3502e));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new d0((di.z6) this.d, tLObject, this.f3500b, (String) this.f3502e, this.f3501c));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new d9(tLObject, this.f3500b, (fi.d) this.d, (org.telegram.ui.ActionBar.w2) this.f3502e, this.f3501c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new d9((mf0) this.d, tL_error, tLObject, this.f3501c, this.f3500b, (TLRPC.Chat) this.f3502e));
                return;
        }
    }

    public b0(int i7, fi.d dVar, org.telegram.ui.ActionBar.w2 w2Var, long j3) {
        this.f3499a = 3;
        this.f3500b = i7;
        this.d = dVar;
        this.f3502e = w2Var;
        this.f3501c = j3;
    }

    public b0(di.z6 z6Var, int i7, String str, long j3) {
        this.f3499a = 2;
        this.d = z6Var;
        this.f3500b = i7;
        this.f3502e = str;
        this.f3501c = j3;
    }

    public b0(mf0 mf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f3499a = 4;
        this.d = mf0Var;
        this.f3501c = j3;
        this.f3500b = i7;
        this.f3502e = chat;
    }
}
