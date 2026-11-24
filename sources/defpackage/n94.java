package defpackage;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class n94 implements Runnable {
    public final ba4 a;
    public final l94[] b;
    public final TLRPC.Document c;
    public final gl5 d;
    public final Object e;
    public final int f;
    public final m94 h;
    public final long n;
    public final boolean r;
    public final int s;
    public final CountDownLatch w;

    public n94(ba4 ba4Var, l94[] l94VarArr, TLRPC.Document document, gl5 gl5Var, Object obj, int i, m94 m94Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = ba4Var;
        this.b = l94VarArr;
        this.c = document;
        this.d = gl5Var;
        this.e = obj;
        this.f = i;
        this.h = m94Var;
        this.n = j;
        this.r = z;
        this.s = i2;
        this.w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j;
        TLRPC.Document document = this.c;
        gl5 gl5Var = this.d;
        String str = null;
        if (document == null && gl5Var != null) {
            tL_fileLocationToBeDeprecated = gl5Var.f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gl5Var != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gl5Var != null) {
            j = gl5Var.r;
        } else {
            j = 0;
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, gl5Var, this.e, str2, j, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
