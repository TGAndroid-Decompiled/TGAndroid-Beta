package defpackage;
public final class rvc implements i35 {
    public final svc a;
    public final bwc b;
    public final long c;
    public final byte[] d;

    public rvc(svc svcVar, bwc bwcVar, long j, byte[] bArr) {
        this.a = svcVar;
        this.b = bwcVar;
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
