package hi;

import java.io.Serializable;
import java.util.concurrent.CountDownLatch;
public final class h7 implements Runnable {
    public final int f14586a = 0;
    public final long f14587b;
    public final int f14588c;
    public final int d;
    public final long f14589e;
    public final Object f14590f;
    public final Serializable h;
    public final Object f14591n;

    public h7(r7 r7Var, long j3, long j10, int i7, Long l10, Long l11, int i10) {
        this.f14590f = r7Var;
        this.f14587b = j3;
        this.f14589e = j10;
        this.f14588c = i7;
        this.h = l10;
        this.f14591n = l11;
        this.d = i10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hi.h7.run():void");
    }

    public h7(org.telegram.messenger.e8 e8Var, long j3, int i7, int i10, String[] strArr, long j10, CountDownLatch countDownLatch) {
        this.f14590f = e8Var;
        this.f14587b = j3;
        this.f14588c = i7;
        this.d = i10;
        this.h = strArr;
        this.f14589e = j10;
        this.f14591n = countDownLatch;
    }
}
