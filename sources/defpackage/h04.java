package defpackage;
public final class h04 {
    public final int a;
    public final long b;
    public final long c;
    public boolean e;
    public final byte g;
    public final fn7 h;
    public boolean d = false;
    public long f = -1;

    public h04(fn7 fn7Var, int i, long j, long j2, byte b) {
        this.g = b;
        this.h = fn7Var;
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void a() {
        boolean z;
        byte b = this.g;
        fn7 fn7Var = this.h;
        switch (b) {
            case 0:
                o24 o24Var = (o24) fn7Var;
                if (o24Var.u1 != null && o24Var.getVisibility() == 0 && o24Var.L0) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            default:
                z = ((r17) fn7Var).N();
                break;
        }
        this.d = z;
        if (!z) {
            if (this.e) {
                uc7.s1(this.a).P4(2, 0, this.b, this.c, null);
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
                uc7.s1(this.a).P4(10, 0, this.b, this.c, null);
            }
        }
    }
}
