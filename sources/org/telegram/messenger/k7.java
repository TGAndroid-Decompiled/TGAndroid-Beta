package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f24993a;
    public final i7[] f24994b;
    public final TLRPC.Document f24995c;
    public final gc d;
    public final Object f24996e;
    public final int f24997f;
    public final j7 h;
    public final long f24998n;
    public final boolean f24999r;
    public final int f25000s;
    public final CountDownLatch f25001w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, gc gcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f24993a = w7Var;
        this.f24994b = i7VarArr;
        this.f24995c = document;
        this.d = gcVar;
        this.f24996e = obj;
        this.f24997f = i7;
        this.h = j7Var;
        this.f24998n = j3;
        this.f24999r = z10;
        this.f25000s = i10;
        this.f25001w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24993a;
        w7Var.getClass();
        TLRPC.Document document = this.f24995c;
        gc gcVar = this.d;
        String str = null;
        if (document == null && gcVar != null) {
            tL_fileLocationToBeDeprecated = gcVar.f24080f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gcVar != null) {
            j3 = gcVar.f24091r;
        } else {
            j3 = 0;
        }
        this.f24994b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, gcVar, this.f24996e, str2, j3, this.f24997f, this.h, this.f24998n, this.f24999r, this.f25000s);
        this.f25001w.countDown();
    }
}
