package defpackage;
public final class w04 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final byte g;
    public final jm7 h;
    public boolean d = false;
    public long f = -1;

    public w04(jm7 jm7Var, int i, long j, long j2, byte b) {
        this.g = b;
        this.h = jm7Var;
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void a() {
        boolean z;
        byte b = this.g;
        jm7 jm7Var = this.h;
        switch (b) {
            case 0:
                e34 e34Var = (e34) jm7Var;
                if (e34Var.u1 != null && e34Var.getVisibility() == 0 && e34Var.L0) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            default:
                z = ((k17) jm7Var).N();
                break;
        }
        this.d = z;
        if (!z) {
            if (this.e) {
                oc7.r1(this.a).J4(2, 0, this.b, this.c, null);
            }
            this.f = -1L;
        }
    }

    public final void b() {
        if (this.d) {
            if (this.f == -1) {
                this.f = System.currentTimeMillis();
            } else if (System.currentTimeMillis() - this.f > 2000) {
                this.e = true;
                this.f = System.currentTimeMillis();
                oc7.r1(this.a).J4(10, 0, this.b, this.c, null);
            }
        }
    }
}
