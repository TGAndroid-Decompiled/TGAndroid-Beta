package defpackage;
public class oc0 implements fv9 {
    public final byte a;
    public final long b;
    public final Object c;

    public oc0(long j, long j2) {
        hv9 hv9Var;
        this.a = (byte) 2;
        this.b = j;
        if (j2 == 0) {
            hv9Var = hv9.c;
        } else {
            hv9Var = new hv9(0L, j2);
        }
        this.c = new ev9(hv9Var, hv9Var);
    }

    @Override
    public final boolean c() {
        switch (this.a) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final boolean d() {
        byte b = this.a;
        return false;
    }

    @Override
    public final ev9 f(long j) {
        long j2;
        long j3;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                qc0 qc0Var = (qc0) obj;
                ev9 b2 = qc0Var.i[0].b(j);
                while (true) {
                    ch2[] ch2VarArr = qc0Var.i;
                    if (i < ch2VarArr.length) {
                        ev9 b3 = ch2VarArr[i].b(j);
                        if (b3.a.b < b2.a.b) {
                            b2 = b3;
                        }
                        i++;
                    } else {
                        return b2;
                    }
                }
            case 1:
                ci4 ci4Var = (ci4) obj;
                ci4Var.k.getClass();
                lv6 lv6Var = ci4Var.k;
                long[] jArr = (long[]) lv6Var.b;
                long[] jArr2 = (long[]) lv6Var.c;
                int f = g8c.f(jArr, g8c.j((ci4Var.e * j) / 1000000, 0L, ci4Var.j - 1), false);
                if (f == -1) {
                    j3 = 0;
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                    j3 = jArr2[f];
                }
                int i2 = ci4Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                hv9 hv9Var = new hv9(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i3 = f + 1;
                    return new ev9(hv9Var, new hv9((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
                }
                return new ev9(hv9Var, hv9Var);
            default:
                return (ev9) obj;
        }
    }

    @Override
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((ci4) this.c).b();
            default:
                return this.b;
        }
    }

    public oc0(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public oc0(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
