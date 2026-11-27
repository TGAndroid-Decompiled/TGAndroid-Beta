package defpackage;
public final class ld9 implements fn7 {
    public final int a;
    public final axa b;
    public final ed9 c;
    public jd9 d;
    public boolean e;

    public ld9(int i, long j) {
        this.a = i;
        axa axaVar = new axa(i, 0L, false);
        this.b = axaVar;
        axaVar.p = j;
        ed9 ed9Var = new ed9(i, j, new ji7(this, (byte) 28));
        ed9Var.y = true;
        this.c = ed9Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        jn7.f(this.a).b(this, jn7.I3);
        this.b.a();
        this.c.o(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        jn7.f(this.a).n(this, jn7.I3);
        this.b.f();
        this.c.i();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jd9 jd9Var;
        if (i == jn7.I3 && objArr[1] == this.b && (jd9Var = this.d) != null) {
            jd9Var.run();
        }
    }
}
