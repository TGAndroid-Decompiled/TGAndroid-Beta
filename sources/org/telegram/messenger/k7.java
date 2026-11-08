package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f23660a;
    public final i7[] f23661b;
    public final TLRPC.Document f23662c;
    public final hc d;
    public final Object f23663e;
    public final int f23664f;
    public final j7 h;
    public final long f23665n;
    public final boolean f23666r;
    public final int f23667s;
    public final CountDownLatch f23668w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, hc hcVar, Object obj, int i7, j7 j7Var, long j3, boolean z9, int i10, CountDownLatch countDownLatch) {
        this.f23660a = w7Var;
        this.f23661b = i7VarArr;
        this.f23662c = document;
        this.d = hcVar;
        this.f23663e = obj;
        this.f23664f = i7;
        this.h = j7Var;
        this.f23665n = j3;
        this.f23666r = z9;
        this.f23667s = i10;
        this.f23668w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f23660a;
        w7Var.getClass();
        TLRPC.Document document = this.f23662c;
        hc hcVar = this.d;
        String str = null;
        if (document == null && hcVar != null) {
            tL_fileLocationToBeDeprecated = hcVar.f22869f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && hcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && hcVar != null) {
            j3 = hcVar.f22880r;
        } else {
            j3 = 0;
        }
        this.f23661b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, hcVar, this.f23663e, str2, j3, this.f23664f, this.h, this.f23665n, this.f23666r, this.f23667s);
        this.f23668w.countDown();
    }
}
