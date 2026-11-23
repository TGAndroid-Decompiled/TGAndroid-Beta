package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f25029a;
    public final i7[] f25030b;
    public final TLRPC.Document f25031c;
    public final gc d;
    public final Object f25032e;
    public final int f25033f;
    public final j7 h;
    public final long f25034n;
    public final boolean f25035r;
    public final int f25036s;
    public final CountDownLatch f25037w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, gc gcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f25029a = w7Var;
        this.f25030b = i7VarArr;
        this.f25031c = document;
        this.d = gcVar;
        this.f25032e = obj;
        this.f25033f = i7;
        this.h = j7Var;
        this.f25034n = j3;
        this.f25035r = z10;
        this.f25036s = i10;
        this.f25037w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f25029a;
        w7Var.getClass();
        TLRPC.Document document = this.f25031c;
        gc gcVar = this.d;
        String str = null;
        if (document == null && gcVar != null) {
            tL_fileLocationToBeDeprecated = gcVar.f24116f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gcVar != null) {
            j3 = gcVar.f24127r;
        } else {
            j3 = 0;
        }
        this.f25030b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, gcVar, this.f25032e, str2, j3, this.f25033f, this.h, this.f25034n, this.f25035r, this.f25036s);
        this.f25037w.countDown();
    }
}
