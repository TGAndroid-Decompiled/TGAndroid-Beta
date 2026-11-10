package hi;

import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
public final class b1 implements ls {
    public final long f14553a;
    public final ls[] f14554b;
    public final int f14555c;
    public final z0 d;

    public b1(long j3, ls[] lsVarArr, int i7, z0 z0Var) {
        this.f14553a = j3;
        this.f14554b = lsVarArr;
        this.f14555c = i7;
        this.d = z0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = qs.f25101w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f14553a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                ls[] lsVarArr = this.f14554b;
                if (lsVarArr[0] != null) {
                    qs.f(this.f14555c).n(lsVarArr[0], i11);
                    lsVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
