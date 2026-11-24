package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
public final class tx9 extends rx9 {
    public final wm9 j;
    public final wm9 k;
    public final long l;

    public tx9(b19 b19Var, long j, long j2, long j3, long j4, long j5, ArrayList arrayList, long j6, wm9 wm9Var, wm9 wm9Var2, long j7, long j8) {
        super(b19Var, j, j2, j3, j5, arrayList, j6, j7, j8);
        this.j = wm9Var;
        this.k = wm9Var2;
        this.l = j4;
    }

    @Override
    public final wx9 a() {
        return new tx9(this.a, this.b, 0L, this.d, this.l, this.e, this.f, this.i, this.j, this.k, this.g, this.h);
    }

    @Override
    public final b19 b(ka9 ka9Var) {
        wm9 wm9Var = this.j;
        if (wm9Var != null) {
            go4 go4Var = ka9Var.a;
            return new b19(0L, wm9Var.e(go4Var.k, 0L, 0L, go4Var.a), -1L);
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
        int i = ti0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override
    public final b19 i(ia9 ia9Var, long j) {
        long j2;
        ArrayList arrayList = this.f;
        long j3 = j - this.d;
        if (arrayList != null) {
            j2 = ((ux9) arrayList.get((int) j3)).a;
        } else {
            j2 = j3 * this.e;
        }
        long j4 = j2;
        go4 go4Var = ia9Var.a;
        String str = go4Var.a;
        return new b19(0L, this.k.e(go4Var.k, j, j4, str), -1L);
    }
}
