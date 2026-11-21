package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class z0 implements fs {
    public final long f19120a;
    public final fs[] f19121b;
    public final int f19122c;
    public final x0 d;

    public z0(long j3, fs[] fsVarArr, int i7, x0 x0Var) {
        this.f19120a = j3;
        this.f19121b = fsVarArr;
        this.f19122c = i7;
        this.d = x0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ks.f25239w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f19120a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                fs[] fsVarArr = this.f19121b;
                if (fsVarArr[0] != null) {
                    ks.f(this.f19122c).n(fsVarArr[0], i11);
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
