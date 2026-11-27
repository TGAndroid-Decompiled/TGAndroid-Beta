package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
public final class kz9 extends iz9 {
    public final ko9 j;
    public final ko9 k;
    public final long l;

    public kz9(n29 n29Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, ko9 ko9Var, ko9 ko9Var2, long j7, long j8) {
        super(n29Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = ko9Var;
        this.k = ko9Var2;
        this.l = j4;
    }

    @Override
    public final nz9 a() {
        return new kz9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override
    public final n29 b(ub9 ub9Var) {
        ko9 ko9Var = this.j;
        if (ko9Var != null) {
            ko4 ko4Var = ub9Var.a;
            return new n29(0L, -1L, ko9Var.g(ko4Var.k, 0L, 0L, ko4Var.a));
        }
        return this.a;
    }

    @Override
    public final long e(long j) {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            return arrayList.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = uh0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final n29 i(sb9 sb9Var, long j) {
        long j2;
        ArrayList arrayList = this.f;
        long j3 = j - this.d;
        if (arrayList != null) {
            j2 = ((lz9) arrayList.get((int) j3)).a;
        } else {
            j2 = j3 * this.e;
        }
        long j4 = j2;
        ko4 ko4Var = sb9Var.a;
        String str = ko4Var.a;
        return new n29(0L, -1L, this.k.g(ko4Var.k, j, j4, str));
    }
}
