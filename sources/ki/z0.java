package ki;

import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
public final class z0 implements fs {
    public final long f19191a;
    public final fs[] f19192b;
    public final int f19193c;
    public final x0 d;

    public z0(long j3, fs[] fsVarArr, int i7, x0 x0Var) {
        this.f19191a = j3;
        this.f19192b = fsVarArr;
        this.f19193c = i7;
        this.d = x0Var;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = ks.f25310w0;
        if (i7 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j3 = this.f19191a;
            if (hVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j3);
                fs[] fsVarArr = this.f19192b;
                if (fsVarArr[0] != null) {
                    ks.f(this.f19193c).n(fsVarArr[0], i11);
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
