package defpackage;

import org.telegram.tgnet.TLRPC;
public final class hb7 implements Runnable {
    public final byte a = 0;
    public final ad7 b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final Object h;

    public hb7(ad7 ad7Var, long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        this.b = ad7Var;
        this.c = j;
        this.e = i;
        this.h = inputChannel;
        this.f = i2;
        this.d = j2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb7.run():void");
    }

    public hb7(ad7 ad7Var, long j, long j2, Integer num, int i, int i2) {
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
        this.h = num;
        this.e = i;
        this.f = i2;
    }

    public hb7(hp8 hp8Var, int i, ad7 ad7Var, long j, long j2, int i2) {
        this.h = hp8Var;
        this.e = i;
        this.b = ad7Var;
        this.c = j;
        this.d = j2;
        this.f = i2;
    }
}
