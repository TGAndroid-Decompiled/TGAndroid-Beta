package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class t7 implements Runnable {
    public final b8 f18224a;
    public final m7[] f18225b;
    public final TLRPC.Document f18226c;
    public final jc d;
    public final Object e;
    public final int f18227f;
    public final n7 h;
    public final long f18228n;
    public final boolean f18229r;
    public final int f18230s;
    public final CountDownLatch f18231w;

    public t7(b8 b8Var, m7[] m7VarArr, TLRPC.Document document, jc jcVar, Object obj, int i10, n7 n7Var, long j10, boolean z10, int i11, CountDownLatch countDownLatch) {
        this.f18224a = b8Var;
        this.f18225b = m7VarArr;
        this.f18226c = document;
        this.d = jcVar;
        this.e = obj;
        this.f18227f = i10;
        this.h = n7Var;
        this.f18228n = j10;
        this.f18229r = z10;
        this.f18230s = i11;
        this.f18231w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j10;
        b8 b8Var = this.f18224a;
        b8Var.getClass();
        TLRPC.Document document = this.f18226c;
        jc jcVar = this.d;
        String str = null;
        if (document == null && jcVar != null) {
            tL_fileLocationToBeDeprecated = jcVar.f16435f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && jcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && jcVar != null) {
            j10 = jcVar.f16446r;
        } else {
            j10 = 0;
        }
        this.f18225b[0] = b8Var.Z(document, null, null, tL_fileLocationToBeDeprecated, jcVar, this.e, str2, j10, this.f18227f, this.h, this.f18228n, this.f18229r, this.f18230s);
        this.f18231w.countDown();
    }
}
