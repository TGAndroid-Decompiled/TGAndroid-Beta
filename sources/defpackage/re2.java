package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class re2 implements Runnable {
    public final byte a = 0;
    public final Object b;
    public final long c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public re2(j20 j20Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = j20Var;
        this.c = j;
        this.d = z;
        this.f = document;
        this.b = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re2.run():void");
    }

    public re2(af2 af2Var, TLObject tLObject, long j, boolean z, String str, kc kcVar) {
        this.e = af2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public re2(k35 k35Var, long j, String str, boolean z, pcc pccVar) {
        this.e = k35Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = pccVar;
    }

    public re2(jf7 jf7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = jf7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public re2(Context context, String str, long j, boolean z, l01 l01Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = l01Var;
    }
}
