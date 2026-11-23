package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f25098a;
    public final i7[] f25099b;
    public final TLRPC.Document f25100c;
    public final fc d;
    public final Object f25101e;
    public final int f25102f;
    public final j7 h;
    public final long f25103n;
    public final boolean f25104r;
    public final int f25105s;
    public final CountDownLatch f25106w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, fc fcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f25098a = w7Var;
        this.f25099b = i7VarArr;
        this.f25100c = document;
        this.d = fcVar;
        this.f25101e = obj;
        this.f25102f = i7;
        this.h = j7Var;
        this.f25103n = j3;
        this.f25104r = z10;
        this.f25105s = i10;
        this.f25106w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f25098a;
        w7Var.getClass();
        TLRPC.Document document = this.f25100c;
        fc fcVar = this.d;
        String str = null;
        if (document == null && fcVar != null) {
            tL_fileLocationToBeDeprecated = fcVar.f23976f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && fcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && fcVar != null) {
            j3 = fcVar.f23987r;
        } else {
            j3 = 0;
        }
        this.f25099b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, fcVar, this.f25101e, str2, j3, this.f25102f, this.h, this.f25103n, this.f25104r, this.f25105s);
        this.f25106w.countDown();
    }
}
