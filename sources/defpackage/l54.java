package defpackage;
public final class l54 {
    public final double a;
    public final k54 b = new k54(9.0d);
    public final k54 c = new k54(3.0d);
    public final k54 d = new k54(9.0d);

    public l54(double d) {
        this.a = d;
    }

    public final double a() {
        k54 k54Var = this.c;
        if (k54Var.c >= 0.001d) {
            return Math.min(k54Var.a(), this.b.a());
        }
        return this.a;
    }

    public final double b() {
        k54 k54Var = this.d;
        if (k54Var.c >= 0.001d) {
            return k54Var.a();
        }
        return 100.0d;
    }

    public final void c(double d, long j) {
        if (j <= 0) {
            return;
        }
        double max = (j * 8.0d) / (Math.max(d, 50.0d) / 1000.0d);
        this.c.b(1.0d, max);
        this.b.b(1.0d, max);
    }
}
