package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f24651a;
    public final i7[] f24652b;
    public final TLRPC.Document f24653c;
    public final gc d;
    public final Object f24654e;
    public final int f24655f;
    public final j7 h;
    public final long f24656n;
    public final boolean f24657r;
    public final int f24658s;
    public final CountDownLatch f24659w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, gc gcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f24651a = w7Var;
        this.f24652b = i7VarArr;
        this.f24653c = document;
        this.d = gcVar;
        this.f24654e = obj;
        this.f24655f = i7;
        this.h = j7Var;
        this.f24656n = j3;
        this.f24657r = z10;
        this.f24658s = i10;
        this.f24659w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24651a;
        w7Var.getClass();
        TLRPC.Document document = this.f24653c;
        gc gcVar = this.d;
        String str = null;
        if (document == null && gcVar != null) {
            tL_fileLocationToBeDeprecated = gcVar.f23715f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gcVar != null) {
            j3 = gcVar.f23726r;
        } else {
            j3 = 0;
        }
        this.f24652b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, gcVar, this.f24654e, str2, j3, this.f24655f, this.h, this.f24656n, this.f24657r, this.f24658s);
        this.f24659w.countDown();
    }
}
