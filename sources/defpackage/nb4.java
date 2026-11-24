package defpackage;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class nb4 implements Runnable {
    public final bc4 a;
    public final lb4[] b;
    public final TLRPC.Document c;
    public final gn5 d;
    public final Object e;
    public final int f;
    public final mb4 h;
    public final long n;
    public final boolean r;
    public final int s;
    public final CountDownLatch w;

    public nb4(bc4 bc4Var, lb4[] lb4VarArr, TLRPC.Document document, gn5 gn5Var, Object obj, int i, mb4 mb4Var, long j, boolean z, int i2, CountDownLatch countDownLatch) {
        this.a = bc4Var;
        this.b = lb4VarArr;
        this.c = document;
        this.d = gn5Var;
        this.e = obj;
        this.f = i;
        this.h = mb4Var;
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
        gn5 gn5Var = this.d;
        String str = null;
        if (document == null && gn5Var != null) {
            tL_fileLocationToBeDeprecated = gn5Var.f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gn5Var != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gn5Var != null) {
            j = gn5Var.r;
        } else {
            j = 0;
        }
        this.b[0] = this.a.Y(document, null, null, tL_fileLocationToBeDeprecated, gn5Var, this.e, str2, j, this.f, this.h, this.n, this.r, this.s);
        this.w.countDown();
    }
}
