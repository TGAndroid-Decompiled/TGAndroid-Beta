package defpackage;
public final class f4 implements rv3 {
    public final byte a;
    public final ye1 b;
    public final yw7 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public yzb h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public go4 m;
    public int n;
    public long o;

    public f4(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                ye1 ye1Var = new ye1(16, new byte[16]);
                this.b = ye1Var;
                this.c = new yw7(ye1Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
            default:
                ye1 ye1Var2 = new ye1(128, new byte[128]);
                this.b = ye1Var2;
                this.c = new yw7(ye1Var2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
        }
    }

    @Override
    public final void b(defpackage.yw7 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4.b(yw7):void");
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
    public final void h(u84 u84Var, l4c l4cVar) {
        switch (this.a) {
            case 0:
                l4cVar.a();
                l4cVar.b();
                this.g = l4cVar.e;
                l4cVar.b();
                this.h = u84Var.c0(l4cVar.d, 1);
                return;
            default:
                l4cVar.a();
                l4cVar.b();
                this.g = l4cVar.e;
                l4cVar.b();
                this.h = u84Var.c0(l4cVar.d, 1);
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

    public f4(String str) {
        this(null, 0, str, (byte) 0);
        this.a = (byte) 0;
    }
}
