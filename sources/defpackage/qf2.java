package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qf2 implements Runnable {
    public final byte a = 1;
    public final Object b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public qf2(i30 i30Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = i30Var;
        this.c = j;
        this.d = z;
        this.f = document;
        this.b = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qf2.run():void");
    }

    public qf2(uf2 uf2Var, TLObject tLObject, long j, boolean z, String str, jd jdVar) {
        this.e = uf2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public qf2(g35 g35Var, long j, String str, boolean z, qac qacVar) {
        this.e = g35Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = qacVar;
    }

    public qf2(cf7 cf7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = cf7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public qf2(Context context, String str, long j, boolean z, k11 k11Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = k11Var;
    }
}
