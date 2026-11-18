package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f24999a;
    public final i7[] f25000b;
    public final TLRPC.Document f25001c;
    public final fc d;
    public final Object f25002e;
    public final int f25003f;
    public final j7 h;
    public final long f25004n;
    public final boolean f25005r;
    public final int f25006s;
    public final CountDownLatch f25007w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, fc fcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f24999a = w7Var;
        this.f25000b = i7VarArr;
        this.f25001c = document;
        this.d = fcVar;
        this.f25002e = obj;
        this.f25003f = i7;
        this.h = j7Var;
        this.f25004n = j3;
        this.f25005r = z10;
        this.f25006s = i10;
        this.f25007w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24999a;
        w7Var.getClass();
        TLRPC.Document document = this.f25001c;
        fc fcVar = this.d;
        String str = null;
        if (document == null && fcVar != null) {
            tL_fileLocationToBeDeprecated = fcVar.f23868f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && fcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && fcVar != null) {
            j3 = fcVar.f23879r;
        } else {
            j3 = 0;
        }
        this.f25000b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, fcVar, this.f25002e, str2, j3, this.f25003f, this.h, this.f25004n, this.f25005r, this.f25006s);
        this.f25007w.countDown();
    }
}
