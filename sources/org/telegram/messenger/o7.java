package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public final class o7 implements Runnable {
    public final w7 f24505a;
    public final i7[] f24506b;
    public final TLRPC.Document f24507c;
    public final ac d;
    public final Object f24508e;
    public final int f24509f;
    public final j7 h;
    public final long f24510n;
    public final boolean f24511r;
    public final int f24512s;
    public final CountDownLatch f24513w;

    public o7(w7 w7Var, i7[] i7VarArr, TLRPC.Document document, ac acVar, Object obj, int i3, j7 j7Var, long j10, boolean z10, int i10, CountDownLatch countDownLatch) {
        this.f24505a = w7Var;
        this.f24506b = i7VarArr;
        this.f24507c = document;
        this.d = acVar;
        this.f24508e = obj;
        this.f24509f = i3;
        this.h = j7Var;
        this.f24510n = j10;
        this.f24511r = z10;
        this.f24512s = i10;
        this.f24513w = countDownLatch;
    }

    @Override
    public final void run() {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        long j10;
        w7 w7Var = this.f24505a;
        w7Var.getClass();
        TLRPC.Document document = this.f24507c;
        ac acVar = this.d;
        String str = null;
        if (document == null && acVar != null) {
            tL_fileLocationToBeDeprecated = acVar.f21488f;
        } else {
            tL_fileLocationToBeDeprecated = null;
        }
        if (document == null && acVar != null) {
            str = "mp4";
        }
        String str2 = str;
        if (document == null && acVar != null) {
            j10 = acVar.f21499r;
        } else {
            j10 = 0;
        }
        this.f24506b[0] = w7Var.Z(document, null, null, tL_fileLocationToBeDeprecated, acVar, this.f24508e, str2, j10, this.f24509f, this.h, this.f24510n, this.f24511r, this.f24512s);
        this.f24513w.countDown();
    }
}
