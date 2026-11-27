package defpackage;
public final class zj4 {
    public boolean c;
    public int e;
    public long h;
    public final xj4 i;
    public yj4 a = new yj4();
    public yj4 b = new yj4();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public zj4(xj4 xj4Var) {
        this.i = xj4Var;
    }

    public final long a() {
        if (this.a.a()) {
            yj4 yj4Var = this.a;
            long j = yj4Var.e;
            if (j == 0) {
                return 0L;
            }
            return yj4Var.f / j;
        }
        return -9223372036854775807L;
    }

    public final void b(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj4.b(long):void");
    }

    public final void c() {
        float f;
        float f2;
        boolean a = this.a.a();
        if (a) {
            yj4 yj4Var = this.a;
            long j = yj4Var.e;
            long j2 = 0;
            if (j != 0) {
                j2 = yj4Var.f / j;
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
