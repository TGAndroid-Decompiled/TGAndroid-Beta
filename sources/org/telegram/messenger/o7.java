package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class o7 implements Runnable {
    public final w7 f24293a;
    public final i7[] f24294b;
    public final TLRPC.Document f24295c;
    public final hc d;
    public final Object f24296e;
    public final int f24297f;
    public final j7 h;
    public final long f24298n;
    public final boolean f24299r;
    public final int f24300s;
    public final CountDownLatch f24301w;

    public o7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, hc hcVar, Object obj, int i7, j7 j7Var, long j3, boolean z9, int i10, CountDownLatch countDownLatch) {
        this.f24293a = w7Var;
        this.f24294b = i7VarArr;
        this.f24295c = document;
        this.d = hcVar;
        this.f24296e = obj;
        this.f24297f = i7;
        this.h = j7Var;
        this.f24298n = j3;
        this.f24299r = z9;
        this.f24300s = i10;
        this.f24301w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24293a;
        w7Var.getClass();
        TLRPC.Document document = this.f24295c;
        hc hcVar = this.d;
        String str = null;
        if (document == null && hcVar != null) {
            tL_fileLocationToBeDeprecated = hcVar.f22863f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && hcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && hcVar != null) {
            j3 = hcVar.f22874r;
        } else {
            j3 = 0;
        }
        this.f24294b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, hcVar, this.f24296e, str2, j3, this.f24297f, this.h, this.f24298n, this.f24299r, this.f24300s);
        this.f24301w.countDown();
    }
}
