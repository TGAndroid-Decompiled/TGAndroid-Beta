package defpackage;

import org.telegram.tgnet.TLRPC;
public final class i4a implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final jm7 f;
    public final Object h;
    public final Object n;
    public final Object r;

    public i4a(a6a a6aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, k47 k47Var, int i4) {
        this.a = (byte) 0;
        this.f = a6aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = k47Var;
        this.c = i4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4a.run():void");
    }

    public i4a(v9b v9bVar, z8b z8bVar, int i, int i2, g6b g6bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = v9bVar;
        this.h = z8bVar;
        this.b = i;
        this.c = i2;
        this.n = g6bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
