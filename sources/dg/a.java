package dg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f8923a;
    public final long f8924b;

    public a(long j10, b bVar) {
        this.f8923a = bVar;
        this.f8924b = j10;
    }

    public static a g(long j10, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j10 * 1000000000, bVar);
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

    public static a i(long j10, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j10, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.f8926b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((i0) hp.s1(h10.f22829t0).f23167x7.f24665l.f14429b).f23413a) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f8925a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / hp.s1(h10.f22829t0).f22970b6) * 1000000000), bVar3).n(0);
        }
        return g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f8925a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f8926b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l10 = l(starsAmount);
        if (l10 != null) {
            return l10;
        }
        return i(0L, b.f8925a);
    }

    public final long a() {
        return this.f8924b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f8924b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f8924b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(bd.E(a(), ','));
        long j10 = this.f8924b % 1000000000;
        if (j10 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l10 = Long.toString(j10);
        int length = 9 - l10.length();
        for (int i3 = 0; i3 < length; i3++) {
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
        b bVar2 = this.f8923a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f8925a) {
            d = ((c() / 1000.0d) * hp.s1(h10.f22829t0).f22970b6) / 100.0d;
        } else if (bVar2 == b.f8926b) {
            d = c() * ((i0) hp.s1(h10.f22829t0).f23167x7.f24665l.f14429b).f23413a;
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
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f8923a == aVar.f8923a && this.f8924b == aVar.f8924b))) {
            return true;
        }
        return false;
    }

    public final String f() {
        int i3 = ((this.f8924b % 1000000000) > 0L ? 1 : ((this.f8924b % 1000000000) == 0L ? 0 : -1));
        b bVar = this.f8923a;
        if (i3 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return bd.H(' ', "TonCount", (int) a());
                }
                return "";
            }
            return bd.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return bd.a0(null, null, 2131744060, b());
        }
        return bd.a0(null, null, 2131745123, b());
    }

    public final boolean k() {
        if (this.f8924b == 0) {
            return true;
        }
        return false;
    }

    public final a n(int i3) {
        long j10 = 9 - i3;
        if (j10 <= 0) {
            return this;
        }
        long j11 = 1;
        for (int i10 = 0; i10 < j10; i10++) {
            j11 *= 10;
        }
        return i((this.f8924b / j11) * j11, this.f8923a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f8925a;
        long j10 = this.f8924b;
        b bVar2 = this.f8923a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j10 / 1000000000;
            tL_starsAmount.nanos = (int) (j10 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f8926b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j10;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
