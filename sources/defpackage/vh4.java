package defpackage;
public final class vh4 {
    public boolean c;
    public int e;
    public long h;
    public final th4 i;
    public uh4 a = new uh4();
    public uh4 b = new uh4();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public vh4(th4 th4Var) {
        this.i = th4Var;
    }

    public final long a() {
        if (this.a.a()) {
            uh4 uh4Var = this.a;
            long j = uh4Var.e;
            if (j == 0) {
                return 0L;
            }
            return uh4Var.f / j;
        }
        return -9223372036854775807L;
    }

    public final void b(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vh4.b(long):void");
    }

    public final void c() {
        float f;
        float f2;
        boolean a = this.a.a();
        if (a) {
            uh4 uh4Var = this.a;
            long j = uh4Var.e;
            long j2 = 0;
            if (j != 0) {
                j2 = uh4Var.f / j;
            }
            f = (float) (1.0E9d / j2);
        } else {
            f = this.f;
        }
        float f3 = this.g;
        if (f != f3) {
            if (f != -1.0f) {
                if (f3 != -1.0f) {
                    if (a && this.a.f >= 5000000000L) {
                        f2 = 0.1f;
                    } else {
                        f2 = 1.0f;
                    }
                    if (Math.abs(f - f3) < f2) {
                        return;
                    }
                }
            } else if (this.e < 30) {
                return;
            }
            this.g = f;
            this.i.g(f);
        }
    }
}
