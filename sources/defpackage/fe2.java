package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe2 implements Runnable {
    public final byte a = 4;
    public final Object b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public fe2(i20 i20Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = i20Var;
        this.c = j;
        this.d = z;
        this.f = document;
        this.b = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe2.run():void");
    }

    public fe2(je2 je2Var, TLObject tLObject, long j, boolean z, String str, jc jcVar) {
        this.e = je2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public fe2(g15 g15Var, long j, String str, boolean z, p8c p8cVar) {
        this.e = g15Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = p8cVar;
    }

    public fe2(ad7 ad7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = ad7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public fe2(Context context, String str, long j, boolean z, c01 c01Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = c01Var;
    }
}
