package cg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f4988a;
    public final long f4989b;

    public a(long j3, b bVar) {
        this.f4988a = bVar;
        this.f4989b = j3;
    }

    public static a g(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3 * 1000000000, bVar);
    }

    public static a h(String str, b bVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return i(multiply.longValue(), bVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static a i(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.f4991b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((i0) np.s1(m10.f24940t0).f25451y7.f25857l.f13134b).f24257a) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f4990a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / np.s1(m10.f24940t0).f25254c6) * 1000000000), bVar3).n(0);
        }
        return g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f4990a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f4991b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l10 = l(starsAmount);
        if (l10 != null) {
            return l10;
        }
        return i(0L, b.f4990a);
    }

    public final long a() {
        return this.f4989b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f4989b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f4989b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(hd.E(a(), ','));
        long j3 = this.f4989b % 1000000000;
        if (j3 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l10 = Long.toString(j3);
        int length = 9 - l10.length();
        for (int i7 = 0; i7 < length; i7++) {
            sb2.append('0');
        }
        int length2 = l10.length();
        while (length2 > 0 && l10.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb2.append((CharSequence) l10, 0, length2);
        return sb2.toString();
    }

    public final a e(b bVar) {
        double d;
        b bVar2 = this.f4988a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f4990a) {
            d = ((c() / 1000.0d) * np.s1(m10.f24940t0).f25254c6) / 100.0d;
        } else if (bVar2 == b.f4991b) {
            d = c() * ((i0) np.s1(m10.f24940t0).f25451y7.f25857l.f13134b).f24257a;
        } else {
            d = 0.0d;
        }
        return j(d, bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f4988a == aVar.f4988a && this.f4989b == aVar.f4989b))) {
            return true;
        }
        return false;
    }

    public final String f() {
        int i7 = ((this.f4989b % 1000000000) > 0L ? 1 : ((this.f4989b % 1000000000) == 0L ? 0 : -1));
        b bVar = this.f4988a;
        if (i7 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return hd.H(' ', "TonCount", (int) a());
                }
                return "";
            }
            return hd.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return hd.a0(null, null, 2131744050, b());
        }
        return hd.a0(null, null, 2131745113, b());
    }

    public final boolean k() {
        if (this.f4989b == 0) {
            return true;
        }
        return false;
    }

    public final a n(int i7) {
        long j3 = 9 - i7;
        if (j3 <= 0) {
            return this;
        }
        long j10 = 1;
        for (int i10 = 0; i10 < j3; i10++) {
            j10 *= 10;
        }
        return i((this.f4989b / j10) * j10, this.f4988a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f4990a;
        long j3 = this.f4989b;
        b bVar2 = this.f4988a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f4991b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j3;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
