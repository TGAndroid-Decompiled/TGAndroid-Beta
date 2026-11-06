package bi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.jf0;
public final class b0 implements RequestDelegate {
    public final int f3496a;
    public final int f3497b;
    public final long f3498c;
    public final Object d;
    public final Object f3499e;

    public b0(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f3496a = i10;
        this.d = obj;
        this.f3499e = obj2;
        this.f3497b = i7;
        this.f3498c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3496a) {
            case 0:
                org.telegram.messenger.g0.h3(new d0((n0) this.d, (m0) this.f3499e, this.f3497b, tLObject, this.f3498c, 0));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new f9(this.f3497b, 1, this.f3498c, (fi.d) this.d, (org.telegram.ui.ActionBar.v2[]) this.f3499e));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new d0((di.y6) this.d, tLObject, this.f3497b, (String) this.f3499e, this.f3498c));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new d9(tLObject, this.f3497b, (fi.d) this.d, (org.telegram.ui.ActionBar.v2) this.f3499e, this.f3498c, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new d9((jf0) this.d, tL_error, tLObject, this.f3498c, this.f3497b, (TLRPC.Chat) this.f3499e));
                return;
        }
    }

    public b0(int i7, fi.d dVar, org.telegram.ui.ActionBar.v2 v2Var, long j3) {
        this.f3496a = 3;
        this.f3497b = i7;
        this.d = dVar;
        this.f3499e = v2Var;
        this.f3498c = j3;
    }

    public b0(di.y6 y6Var, int i7, String str, long j3) {
        this.f3496a = 2;
        this.d = y6Var;
        this.f3497b = i7;
        this.f3499e = str;
        this.f3498c = j3;
    }

    public b0(jf0 jf0Var, long j3, int i7, TLRPC.Chat chat) {
        this.f3496a = 4;
        this.d = jf0Var;
        this.f3498c = j3;
        this.f3497b = i7;
        this.f3499e = chat;
    }
}
