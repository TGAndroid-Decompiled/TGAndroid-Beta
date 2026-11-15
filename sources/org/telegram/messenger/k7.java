package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f24654a;
    public final i7[] f24655b;
    public final TLRPC.Document f24656c;
    public final gc d;
    public final Object f24657e;
    public final int f24658f;
    public final j7 h;
    public final long f24659n;
    public final boolean f24660r;
    public final int f24661s;
    public final CountDownLatch f24662w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, gc gcVar, Object obj, int i7, j7 j7Var, long j3, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f24654a = w7Var;
        this.f24655b = i7VarArr;
        this.f24656c = document;
        this.d = gcVar;
        this.f24657e = obj;
        this.f24658f = i7;
        this.h = j7Var;
        this.f24659n = j3;
        this.f24660r = z10;
        this.f24661s = i10;
        this.f24662w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f24654a;
        w7Var.getClass();
        TLRPC.Document document = this.f24656c;
        gc gcVar = this.d;
        String str = null;
        if (document == null && gcVar != null) {
            tL_fileLocationToBeDeprecated = gcVar.f23717f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && gcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && gcVar != null) {
            j3 = gcVar.f23728r;
        } else {
            j3 = 0;
        }
        this.f24655b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, gcVar, this.f24657e, str2, j3, this.f24658f, this.h, this.f24659n, this.f24660r, this.f24661s);
        this.f24662w.countDown();
    }
}
