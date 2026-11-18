package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class a1 implements fs {
    public final long f18571a;
    public final fs[] f18572b;
    public final int f18573c;
    public final y0 d;

    public a1(long j3, fs[] fsVarArr, int i7, y0 y0Var) {
        this.f18571a = j3;
        this.f18572b = fsVarArr;
        this.f18573c = i7;
        this.d = y0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ks.f25213w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f18571a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                fs[] fsVarArr = this.f18572b;
                if (fsVarArr[0] != null) {
                    ks.f(this.f18573c).n(fsVarArr[0], i11);
                    fsVarArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.a(webPage);
            }
        }
    }
}
