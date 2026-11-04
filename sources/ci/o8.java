package ci;

import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o8 implements Runnable {
    public final int f5695a = 0;
    public final long f5696b;
    public final boolean f5697c;
    public final long d;
    public final int f5698e;
    public final Object f5699f;
    public final Object h;
    public final Object f5700n;
    public final Object f5701r;
    public final Object f5702s;

    public o8(e9 e9Var, TLObject tLObject, Runnable runnable, TLRPC.TL_error tL_error, boolean z10, long j10, int i3, zi ziVar, long j11) {
        this.f5699f = e9Var;
        this.h = tLObject;
        this.f5700n = runnable;
        this.f5701r = tL_error;
        this.f5697c = z10;
        this.f5696b = j10;
        this.f5698e = i3;
        this.f5702s = ziVar;
        this.d = j11;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.o8.run():void");
    }

    public o8(qr qrVar, long j10, boolean z10, String str, long j11, int i3, String str2, String str3, String str4) {
        this.f5699f = qrVar;
        this.f5696b = j10;
        this.f5697c = z10;
        this.h = str;
        this.d = j11;
        this.f5698e = i3;
        this.f5700n = str2;
        this.f5701r = str3;
        this.f5702s = str4;
    }
}
