package ki;

import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
public final class c1 implements is {
    public final long f18232a;
    public final is[] f18233b;
    public final int f18234c;
    public final a1 d;

    public c1(long j3, is[] isVarArr, int i7, a1 a1Var) {
        this.f18232a = j3;
        this.f18233b = isVarArr;
        this.f18234c = i7;
        this.d = a1Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ns.f25594w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f18232a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                is[] isVarArr = this.f18233b;
                if (isVarArr[0] != null) {
                    ns.f(this.f18234c).n(isVarArr[0], i11);
                    isVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
