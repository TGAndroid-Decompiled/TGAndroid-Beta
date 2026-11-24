package defpackage;

import org.telegram.tgnet.TLRPC;
public final class g2a implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final gk7 f;
    public final Object h;
    public final Object n;
    public final Object r;

    public g2a(z3a z3aVar, int i, TLRPC.Message message, int i2, int i3, TLRPC.Message message2, k27 k27Var, int i4) {
        this.a = (byte) 0;
        this.f = z3aVar;
        this.b = i;
        this.h = message;
        this.d = i2;
        this.e = i3;
        this.n = message2;
        this.r = k27Var;
        this.c = i4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2a.run():void");
    }

    public g2a(t7b t7bVar, x6b x6bVar, int i, int i2, f4b f4bVar, boolean z, boolean z2, Runnable runnable, byte b) {
        this.a = b;
        this.f = t7bVar;
        this.h = x6bVar;
        this.b = i;
        this.c = i2;
        this.n = f4bVar;
        this.d = z;
        this.e = z2;
        this.r = runnable;
    }
}
