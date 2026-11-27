package defpackage;
public final class g4 implements av3 {
    public final byte a;
    public final zd1 b;
    public final ey7 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public x1c h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public ko4 m;
    public int n;
    public long o;

    public g4(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                zd1 zd1Var = new zd1(16, new byte[16]);
                this.b = zd1Var;
                this.c = new ey7(zd1Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
            default:
                zd1 zd1Var2 = new zd1(128, new byte[128]);
                this.b = zd1Var2;
                this.c = new ey7(zd1Var2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
        }
    }

    @Override
    public final void b(defpackage.ey7 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.b(ey7):void");
    }

    @Override
    public final void d() {
        switch (this.a) {
            case 0:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                return;
            default:
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                return;
        }
    }

    @Override
    public final void e() {
        byte b = this.a;
    }

    @Override
    public final void f() {
        byte b = this.a;
    }

    @Override
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                return;
            default:
                this.o = j;
                return;
        }
    }

    @Override
    public final void h(g84 g84Var, l6c l6cVar) {
        switch (this.a) {
            case 0:
                l6cVar.a();
                l6cVar.b();
                this.g = l6cVar.e;
                l6cVar.b();
                this.h = g84Var.e0(l6cVar.d, 1);
                return;
            default:
                l6cVar.a();
                l6cVar.b();
                this.g = l6cVar.e;
                l6cVar.b();
                this.h = g84Var.e0(l6cVar.d, 1);
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void i() {
    }

    private final void j() {
    }

    public g4(String str) {
        this(null, 0, str, (byte) 0);
        this.a = (byte) 0;
    }
}
