package defpackage;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class jb4 implements Runnable {
    public final xb4 a;
    public final hb4[] b;
    public final TLRPC.Document c;
    public final jn5 d;
    public final Object e;
    public final int f;
    public final ib4 h;
    public final long n;
    public final boolean r;
    public final int s;
    public final CountDownLatch w;

    public jb4(xb4 xb4Var, hb4[] hb4VarArr, TLRPC.Document document, jn5 jn5Var, Object obj, int i, ib4 ib4Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = xb4Var;
        this.b = hb4VarArr;
        this.c = document;
        this.d = jn5Var;
        this.e = obj;
        this.f = i;
        this.h = ib4Var;
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
        jn5 jn5Var = this.d;
        String str = null;
        if (document == null && jn5Var != null) {
            tL_fileLocationToBeDeprecated = jn5Var.f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && jn5Var != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && jn5Var != null) {
            j = jn5Var.r;
        } else {
            j = 0;
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, jn5Var, this.e, str2, j, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
