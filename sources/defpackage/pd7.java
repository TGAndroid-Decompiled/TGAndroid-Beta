package defpackage;

import org.telegram.tgnet.TLRPC;
public final class pd7 implements Runnable {
    public final byte a = 0;
    public final kf7 b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final Object h;

    public pd7(kf7 kf7Var, long j, int i, TLRPC.InputChannel inputChannel, int i2, long j2) {
        this.b = kf7Var;
        this.c = j;
        this.e = i;
        this.h = inputChannel;
        this.f = i2;
        this.d = j2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd7.run():void");
    }

    public pd7(kf7 kf7Var, long j, long j2, Integer num, int i, int i2) {
        this.b = kf7Var;
        this.c = j;
        this.d = j2;
        this.h = num;
        this.e = i;
        this.f = i2;
    }

    public pd7(ts8 ts8Var, int i, kf7 kf7Var, long j, long j2, int i2) {
        this.h = ts8Var;
        this.e = i;
        this.b = kf7Var;
        this.c = j;
        this.d = j2;
        this.f = i2;
    }
}
