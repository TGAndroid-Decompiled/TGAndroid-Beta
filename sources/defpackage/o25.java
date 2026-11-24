package defpackage;

import org.telegram.ui.Wallet.c;
public final class o25 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final String c;
    public final long d;
    public final String e;
    public final byte[] f;
    public final jac h;
    public final c n;

    public o25(c cVar, String str, long j, String str2, byte[] bArr, jac jacVar) {
        this.n = cVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = bArr;
        this.h = jacVar;
    }

    @Override
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new lf2(this, this.h, (byte) 22));
    }
}
