package defpackage;
public final class sxc implements i55 {
    public final txc a;
    public final cyc b;
    public final long c;
    public final byte[] d;

    public sxc(txc txcVar, cyc cycVar, long j, byte[] bArr) {
        this.a = txcVar;
        this.b = cycVar;
        this.c = j;
        this.d = bArr;
    }

    @Override
    public final void a() {
        this.b.b(5, null, this.c);
    }

    @Override
    public final void b() {
        this.b.b(3, null, this.c);
    }
}
