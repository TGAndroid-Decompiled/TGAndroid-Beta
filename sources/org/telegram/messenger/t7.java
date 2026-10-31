package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class t7 implements Runnable {
    public final b8 f18023a;
    public final m7[] f18024b;
    public final TLRPC.Document f18025c;
    public final ic d;
    public final Object e;
    public final int f18026f;
    public final n7 h;
    public final long f18027n;
    public final boolean f18028r;
    public final int f18029s;
    public final CountDownLatch f18030w;

    public t7(b8 b8Var, m7[] m7VarArr, TLRPC.Document document, ic icVar, Object obj, int i10, n7 n7Var, long j10, boolean z10, int i11, CountDownLatch countDownLatch) {
        this.f18023a = b8Var;
        this.f18024b = m7VarArr;
        this.f18025c = document;
        this.d = icVar;
        this.e = obj;
        this.f18026f = i10;
        this.h = n7Var;
        this.f18027n = j10;
        this.f18028r = z10;
        this.f18029s = i11;
        this.f18030w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j10;
        b8 b8Var = this.f18023a;
        b8Var.getClass();
        TLRPC.Document document = this.f18025c;
        ic icVar = this.d;
        String str = null;
        if (document == null && icVar != null) {
            tL_fileLocationToBeDeprecated = icVar.f16100f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && icVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && icVar != null) {
            j10 = icVar.f16111r;
        } else {
            j10 = 0;
        }
        this.f18024b[0] = b8Var.Z(document, null, null, tL_fileLocationToBeDeprecated, icVar, this.e, str2, j10, this.f18026f, this.h, this.f18027n, this.f18028r, this.f18029s);
        this.f18030w.countDown();
    }
}
