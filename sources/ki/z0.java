package ki;

import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
public final class z0 implements gs {
    public final long f19089a;
    public final gs[] f19090b;
    public final int f19091c;
    public final x0 d;

    public z0(long j3, gs[] gsVarArr, int i7, x0 x0Var) {
        this.f19089a = j3;
        this.f19090b = gsVarArr;
        this.f19091c = i7;
        this.d = x0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ls.f25369w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f19089a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                gs[] gsVarArr = this.f19090b;
                if (gsVarArr[0] != null) {
                    ls.f(this.f19091c).n(gsVarArr[0], i11);
                    gsVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
