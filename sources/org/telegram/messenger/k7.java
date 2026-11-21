package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f25027a;
    public final i7[] f25028b;
    public final TLRPC.Document f25029c;
    public final fc d;
    public final Object f25030e;
    public final int f25031f;
    public final j7 h;
    public final long f25032n;
    public final boolean f25033r;
    public final int f25034s;
    public final CountDownLatch f25035w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, fc fcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f25027a = w7Var;
        this.f25028b = i7VarArr;
        this.f25029c = document;
        this.d = fcVar;
        this.f25030e = obj;
        this.f25031f = i7;
        this.h = j7Var;
        this.f25032n = j3;
        this.f25033r = z10;
        this.f25034s = i10;
        this.f25035w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f25027a;
        w7Var.getClass();
        TLRPC.Document document = this.f25029c;
        fc fcVar = this.d;
        String str = null;
        if (document == null && fcVar != null) {
            tL_fileLocationToBeDeprecated = fcVar.f23896f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && fcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && fcVar != null) {
            j3 = fcVar.f23907r;
        } else {
            j3 = 0;
        }
        this.f25028b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, fcVar, this.f25030e, str2, j3, this.f25031f, this.h, this.f25032n, this.f25033r, this.f25034s);
        this.f25035w.countDown();
    }
}
