package defpackage;

import org.telegram.ui.Wallet.c;
public final class s25 implements Runnable {
    public volatile boolean a;
    public Runnable b;
    public final String c;
    public final long d;
    public final String e;
    public final byte[] f;
    public final icc h;
    public final c n;

    public s25(c cVar, String str, long j, String str2, byte[] bArr, icc iccVar) {
        this.n = cVar;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = bArr;
        this.h = iccVar;
    }

    @Override
    public final synchronized void run() {
        if (this.a) {
            return;
        }
        this.b = this.n.b.emulateSend(this.c, this.d, this.e, this.f, new qe2(this, this.h, (byte) 20));
    }
}
