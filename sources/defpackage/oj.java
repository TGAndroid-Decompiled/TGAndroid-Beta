package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.tgnet.tl.TL_stars;
public final class oj {
    public final pj a;
    public final long b;

    public oj(long j, pj pjVar) {
        this.a = pjVar;
        this.b = j;
    }

    public static oj h(long j, pj pjVar) {
        if (pjVar == null) {
            return null;
        }
        return new oj(j * 1000000000, pjVar);
    }

    public static oj i(String str, pj pjVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return j(multiply.longValue(), pjVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static oj j(long j, pj pjVar) {
        if (pjVar == null) {
            return null;
        }
        return new oj(j, pjVar);
    }

    public static oj k(double d, pj pjVar) {
        pj pjVar2 = pj.b;
        if (pjVar == pjVar2) {
            return new oj((long) ((d / uc7.s1(yac.t0).l4.k.i) * 1.0E9d), pjVar2).o(2);
        }
        pj pjVar3 = pj.a;
        if (pjVar == pjVar3) {
            return new oj((long) (((d * 100000.0d) / uc7.s1(yac.t0).l4.z3.i) * 1.0E9d), pjVar3).o(0);
        }
        return h(0L, pjVar);
    }

    public static oj m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, pj.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, pj.b);
        }
        return null;
    }

    public static oj n(TL_stars.StarsAmount starsAmount) {
        oj m = m(starsAmount);
        if (m != null) {
            return m;
        }
        return j(0L, pj.a);
    }

    public final long a() {
        return this.b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.b / 1.0E9d;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder(ob6.E(a(), ','));
        long j = this.b % 1000000000;
        if (j == 0) {
            return sb.toString();
        }
        sb.append('.');
        String l = Long.toString(j);
        int length = 9 - l.length();
        for (int i = 0; i < length; i++) {
            sb.append('0');
        }
        int length2 = l.length();
        while (length2 > 0 && l.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb.append((CharSequence) l, 0, length2);
        return sb.toString();
    }

    public final oj e(pj pjVar) {
        if (this.a == pjVar) {
            return this;
        }
        return k(f(), pjVar);
    }

    public final boolean equals(Object obj) {
        oj ojVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oj) && (this == (ojVar = (oj) obj) || (this.a == ojVar.a && this.b == ojVar.b))) {
            return true;
        }
        return false;
    }

    public final double f() {
        pj pjVar = this.a;
        if (pjVar == pj.a) {
            return ((c() / 1000.0d) * uc7.s1(yac.t0).l4.z3.i) / 100.0d;
        }
        if (pjVar == pj.b) {
            return c() * uc7.s1(yac.t0).l4.k.i;
        }
        return 0.0d;
    }

    public final String g() {
        int i = ((this.b % 1000000000) > 0L ? 1 : ((this.b % 1000000000) == 0L ? 0 : -1));
        pj pjVar = this.a;
        if (i == 0) {
            int ordinal = pjVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return ob6.H(' ', "TonCount", (int) a());
                }
                return "";
            }
            return ob6.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = pjVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return ob6.a0(null, null, 2131743703, b());
        }
        return ob6.a0(null, null, 2131744770, b());
    }

    public final boolean l() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final oj o(int i) {
        long j = 9 - i;
        if (j <= 0) {
            return this;
        }
        long j2 = 1;
        for (int i2 = 0; i2 < j; i2++) {
            j2 *= 10;
        }
        return j((this.b / j2) * j2, this.a);
    }

    public final oj p() {
        oj o = o(2);
        if (o.b == this.b) {
            return this;
        }
        long j = 1;
        for (int i = 0; i < 7; i++) {
            j *= 10;
        }
        return j(o.b + j, this.a);
    }

    public final TL_stars.StarsAmount q() {
        pj pjVar = pj.a;
        long j = this.b;
        pj pjVar2 = this.a;
        if (pjVar2 == pjVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j / 1000000000;
            tL_starsAmount.nanos = (int) (j % 1000000000);
            return tL_starsAmount;
        } else if (pjVar2 == pj.b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
