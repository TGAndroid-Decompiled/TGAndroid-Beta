package org.telegram.messenger;
public final class qq implements Runnable {
    public final int f24927a;
    public final qr f24928b;
    public final int f24929c;
    public final long d;
    public final long f24930e;

    public qq(int i3, long j10, long j11, qr qrVar) {
        this.f24927a = 2;
        this.f24928b = qrVar;
        this.d = j10;
        this.f24929c = i3;
        this.f24930e = j11;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qq.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qq.run():void");
    }

    public qq(qr qrVar, int i3, long j10, long j11, int i10) {
        this.f24927a = i10;
        this.f24928b = qrVar;
        this.f24929c = i3;
        this.d = j10;
        this.f24930e = j11;
    }

    public qq(qr qrVar, long j10, long j11, int i3, int i10) {
        this.f24927a = i10;
        this.f24928b = qrVar;
        this.d = j10;
        this.f24930e = j11;
        this.f24929c = i3;
    }
}
