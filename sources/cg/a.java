package cg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f5303a;
    public final long f5304b;

    public a(long j3, b bVar) {
        this.f5303a = bVar;
        this.f5304b = j3;
    }

    public static a h(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3 * 1000000000, bVar);
    }

    public static a i(String str, b bVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return j(multiply.longValue(), bVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static a j(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3, bVar);
    }

    public static a k(double d, b bVar) {
        b bVar2 = b.f5306b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((i0) np.u1(k10.f24968t0).A7.f26231l.f15708b).f24565a) * 1000000000), bVar2).o(2);
        }
        b bVar3 = b.f5305a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / np.u1(k10.f24968t0).f25837e6) * 1000000000), bVar3).o(0);
        }
        return h(0L, bVar);
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f5305a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, b.f5306b);
        }
        return null;
    }

    public static a n(TL_stars.StarsAmount starsAmount) {
        a m10 = m(starsAmount);
        if (m10 != null) {
            return m10;
        }
        return j(0L, b.f5305a);
    }

    public final long a() {
        return this.f5304b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f5304b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f5304b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(hd.E(a(), ','));
        long j3 = this.f5304b % 1000000000;
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
        if (this.f5303a == bVar) {
            return this;
        }
        return k(f(), bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f5303a == aVar.f5303a && this.f5304b == aVar.f5304b))) {
            return true;
        }
        return false;
    }

    public final double f() {
        b bVar = b.f5305a;
        b bVar2 = this.f5303a;
        if (bVar2 == bVar) {
            return ((c() / 1000.0d) * np.u1(k10.f24968t0).f25837e6) / 100.0d;
        }
        if (bVar2 == b.f5306b) {
            return c() * ((i0) np.u1(k10.f24968t0).A7.f26231l.f15708b).f24565a;
        }
        return 0.0d;
    }

    public final String g() {
        int i7 = ((this.f5304b % 1000000000) > 0L ? 1 : ((this.f5304b % 1000000000) == 0L ? 0 : -1));
        b bVar = this.f5303a;
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
            return hd.a0(null, null, 2131743807, b());
        }
        return hd.a0(null, null, 2131744870, b());
    }

    public final boolean l() {
        if (this.f5304b == 0) {
            return true;
        }
        return false;
    }

    public final a o(int i7) {
        long j3 = 9 - i7;
        if (j3 <= 0) {
            return this;
        }
        long j10 = 1;
        for (int i10 = 0; i10 < j3; i10++) {
            j10 *= 10;
        }
        return j((this.f5304b / j10) * j10, this.f5303a);
    }

    public final a p() {
        a o4 = o(2);
        if (o4.f5304b == this.f5304b) {
            return this;
        }
        long j3 = 1;
        for (int i7 = 0; i7 < 7; i7++) {
            j3 *= 10;
        }
        return j(o4.f5304b + j3, this.f5303a);
    }

    public final TL_stars.StarsAmount q() {
        b bVar = b.f5305a;
        long j3 = this.f5304b;
        b bVar2 = this.f5303a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f5306b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j3;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
