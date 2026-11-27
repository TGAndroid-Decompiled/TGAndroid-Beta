package defpackage;

import org.telegram.tgnet.TLRPC;
public final class b6a implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final fn7 f;
    public final Object h;
    public final Object n;
    public final Object r;

    public b6a(r7a r7aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, r47 r47Var, int i4) {
        this.a = (byte) 0;
        this.f = r7aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = r47Var;
        this.c = i4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b6a.run():void");
    }

    public b6a(rbb rbbVar, vab vabVar, int i, int i2, c8b c8bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = rbbVar;
        this.h = vabVar;
        this.b = i;
        this.c = i2;
        this.n = c8bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
