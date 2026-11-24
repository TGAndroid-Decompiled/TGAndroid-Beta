package defpackage;

import org.telegram.ui.Wallet.c;
public final class o05 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final String c;
    public final long d;
    public final String e;
    public final byte[] f;
    public final i8c h;
    public final c n;

    public o05(c cVar, String str, long j, String str2, byte[] bArr, i8c i8cVar) {
        this.n = cVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = bArr;
        this.h = i8cVar;
    }

    @Override
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new ae2(this, this.h, (byte) 20));
    }
}
