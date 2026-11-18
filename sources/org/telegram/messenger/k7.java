package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f25002a;
    public final i7[] f25003b;
    public final TLRPC.Document f25004c;
    public final fc d;
    public final Object f25005e;
    public final int f25006f;
    public final j7 h;
    public final long f25007n;
    public final boolean f25008r;
    public final int f25009s;
    public final CountDownLatch f25010w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, fc fcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f25002a = w7Var;
        this.f25003b = i7VarArr;
        this.f25004c = document;
        this.d = fcVar;
        this.f25005e = obj;
        this.f25006f = i7;
        this.h = j7Var;
        this.f25007n = j3;
        this.f25008r = z10;
        this.f25009s = i10;
        this.f25010w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f25002a;
        w7Var.getClass();
        TLRPC.Document document = this.f25004c;
        fc fcVar = this.d;
        String str = null;
        if (document == null && fcVar != null) {
            tL_fileLocationToBeDeprecated = fcVar.f23871f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && fcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && fcVar != null) {
            j3 = fcVar.f23882r;
        } else {
            j3 = 0;
        }
        this.f25003b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, fcVar, this.f25005e, str2, j3, this.f25006f, this.h, this.f25007n, this.f25008r, this.f25009s);
        this.f25010w.countDown();
    }
}
