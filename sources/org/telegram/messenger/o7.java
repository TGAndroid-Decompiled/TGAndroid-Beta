package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class o7 implements Runnable {
    public final w7 f24286a;
    public final i7[] f24287b;
    public final TLRPC.Document f24288c;
    public final hc d;
    public final Object f24289e;
    public final int f24290f;
    public final j7 h;
    public final long f24291n;
    public final boolean f24292r;
    public final int f24293s;
    public final CountDownLatch f24294w;

    public o7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, hc hcVar, Object obj, int i7, j7 j7Var, long j3, boolean z9, int i10, CountDownLatch countDownLatch) {
        this.f24286a = w7Var;
        this.f24287b = i7VarArr;
        this.f24288c = document;
        this.d = hcVar;
        this.f24289e = obj;
        this.f24290f = i7;
        this.h = j7Var;
        this.f24291n = j3;
        this.f24292r = z9;
        this.f24293s = i10;
        this.f24294w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24286a;
        w7Var.getClass();
        TLRPC.Document document = this.f24288c;
        hc hcVar = this.d;
        String str = null;
        if (document == null && hcVar != null) {
            tL_fileLocationToBeDeprecated = hcVar.f22856f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && hcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && hcVar != null) {
            j3 = hcVar.f22867r;
        } else {
            j3 = 0;
        }
        this.f24287b[0] = w7Var.Z(document, null, null, tL_fileLocationToBeDeprecated, hcVar, this.f24289e, str2, j3, this.f24290f, this.h, this.f24291n, this.f24292r, this.f24293s);
        this.f24294w.countDown();
    }
}
