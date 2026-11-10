package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class k7 implements Runnable {
    public final w7 f23664a;
    public final i7[] f23665b;
    public final TLRPC.Document f23666c;
    public final hc d;
    public final Object f23667e;
    public final int f23668f;
    public final j7 h;
    public final long f23669n;
    public final boolean f23670r;
    public final int f23671s;
    public final CountDownLatch f23672w;

    public k7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, hc hcVar, Object obj, int i7, j7 j7Var, long j3, boolean z9, int i10, CountDownLatch countDownLatch) {
        this.f23664a = w7Var;
        this.f23665b = i7VarArr;
        this.f23666c = document;
        this.d = hcVar;
        this.f23667e = obj;
        this.f23668f = i7;
        this.h = j7Var;
        this.f23669n = j3;
        this.f23670r = z9;
        this.f23671s = i10;
        this.f23672w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j3;
        w7 w7Var = this.f23664a;
        w7Var.getClass();
        TLRPC.Document document = this.f23666c;
        hc hcVar = this.d;
        String str = null;
        if (document == null && hcVar != null) {
            tL_fileLocationToBeDeprecated = hcVar.f22873f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && hcVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && hcVar != null) {
            j3 = hcVar.f22884r;
        } else {
            j3 = 0;
        }
        this.f23665b[0] = w7Var.Y(document, null, null, tL_fileLocationToBeDeprecated, hcVar, this.f23667e, str2, j3, this.f23668f, this.h, this.f23669n, this.f23670r, this.f23671s);
        this.f23672w.countDown();
    }
}
