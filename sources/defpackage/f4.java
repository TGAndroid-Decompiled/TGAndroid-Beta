package defpackage;
public final class f4 implements gu3 {
    public final byte a;
    public final qd1 b;
    public final xu7 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wxb h;
    public byte i;
    public int j;
    public boolean k;
    public long l;
    public fm4 m;
    public int n;
    public long o;

    public f4(String str, int i, String str2, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                qd1 qd1Var = new qd1(16, new byte[16]);
                this.b = qd1Var;
                this.c = new xu7(qd1Var.b);
                this.i = (byte) 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
            default:
                qd1 qd1Var2 = new qd1(128, new byte[128]);
                this.b = qd1Var2;
                this.c = new xu7(qd1Var2.b);
                this.i = (byte) 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                return;
        }
    }

    @Override
    public final void b(defpackage.xu7 r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4.b(xu7):void");
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
    public final void h(l74 l74Var, l2c l2cVar) {
        switch (this.a) {
            case 0:
                l2cVar.a();
                l2cVar.b();
                this.g = l2cVar.e;
                l2cVar.b();
                this.h = l74Var.T(l2cVar.d, 1);
                return;
            default:
                l2cVar.a();
                l2cVar.b();
                this.g = l2cVar.e;
                l2cVar.b();
                this.h = l74Var.T(l2cVar.d, 1);
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
