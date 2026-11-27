package defpackage;
public class qc0 implements zy9 {
    public final byte a;
    public final long b;
    public final Object c;

    public qc0(long j, long j2) {
        bz9 bz9Var;
        this.a = (byte) 2;
        this.b = j;
        if (j2 == 0) {
            bz9Var = bz9.c;
        } else {
            bz9Var = new bz9(0L, j2);
        }
        this.c = new yy9(bz9Var, bz9Var);
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
    public final yy9 e(long j) {
        long j2;
        long j3;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                sc0 sc0Var = (sc0) obj;
                yy9 b2 = sc0Var.i[0].b(j);
                while (true) {
                    uh2[] uh2VarArr = sc0Var.i;
                    if (i < uh2VarArr.length) {
                        yy9 b3 = uh2VarArr[i].b(j);
                        if (b3.a.b < b2.a.b) {
                            b2 = b3;
                        }
                        i++;
                    } else {
                        return b2;
                    }
                }
            case 1:
                gk4 gk4Var = (gk4) obj;
                gk4Var.k.getClass();
                lh2 lh2Var = gk4Var.k;
                long[] jArr = (long[]) lh2Var.b;
                long[] jArr2 = (long[]) lh2Var.c;
                int f = gcc.f(jArr, gcc.j((gk4Var.e * j) / 1000000, 0L, gk4Var.j - 1), false);
                if (f == -1) {
                    j3 = 0;
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                    j3 = jArr2[f];
                }
                int i2 = gk4Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                bz9 bz9Var = new bz9(j4, j3 + j5);
                if (j4 != j && f != jArr.length - 1) {
                    int i3 = f + 1;
                    return new yy9(bz9Var, new bz9((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
                }
                return new yy9(bz9Var, bz9Var);
            default:
                return (yy9) obj;
        }
    }

    @Override
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((gk4) this.c).b();
            default:
                return this.b;
        }
    }

    public qc0(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public qc0(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
