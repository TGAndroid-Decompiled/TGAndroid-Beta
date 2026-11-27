package defpackage;
public final class rz5 implements av3 {
    public final String a;
    public final int b;
    public final ey7 c;
    public final zd1 d;
    public x1c e;
    public String f;
    public ko4 g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public rz5(String str, int i) {
        this.a = str;
        this.b = i;
        ey7 ey7Var = new ey7(1024);
        this.c = ey7Var;
        byte[] bArr = ey7Var.a;
        this.d = new zd1(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override
    public final void b(defpackage.ey7 r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz5.b(ey7):void");
    }

    @Override
    public final void d() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        l6cVar.a();
        l6cVar.b();
        this.e = g84Var.e0(l6cVar.d, 1);
        l6cVar.b();
        this.f = l6cVar.e;
    }

    @Override
    public final void e() {
    }

    @Override
    public final void f() {
    }
}
