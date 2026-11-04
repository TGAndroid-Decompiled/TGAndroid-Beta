package ii;

import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
public final class c1 implements cs {
    public final long f14858a;
    public final cs[] f14859b;
    public final int f14860c;
    public final a1 d;

    public c1(long j10, cs[] csVarArr, int i3, a1 a1Var) {
        this.f14858a = j10;
        this.f14859b = csVarArr;
        this.f14860c = i3;
        this.d = a1Var;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = hs.f23326w0;
        if (i3 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f14858a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                cs[] csVarArr = this.f14859b;
                if (csVarArr[0] != null) {
                    hs.f(this.f14860c).n(csVarArr[0], i11);
                    csVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
