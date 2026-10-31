package org.telegram.messenger;
public final class ir implements Runnable {
    public final int f16163a;
    public final hs f16164b;
    public final int f16165c;
    public final long d;
    public final long e;

    public ir(int i10, long j10, long j11, hs hsVar) {
        this.f16163a = 2;
        this.f16164b = hsVar;
        this.d = j10;
        this.f16165c = i10;
        this.e = j11;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ir.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ir.run():void");
    }

    public ir(hs hsVar, int i10, long j10, long j11, int i11) {
        this.f16163a = i11;
        this.f16164b = hsVar;
        this.f16165c = i10;
        this.d = j10;
        this.e = j11;
    }

    public ir(hs hsVar, long j10, long j11, int i10, int i11) {
        this.f16163a = i11;
        this.f16164b = hsVar;
        this.d = j10;
        this.e = j11;
        this.f16165c = i10;
    }
}
