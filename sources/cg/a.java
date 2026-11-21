package cg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.gd;
import org.telegram.messenger.i0;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f5300a;
    public final long f5301b;

    public a(long j3, b bVar) {
        this.f5300a = bVar;
        this.f5301b = j3;
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
        b bVar2 = b.f5303b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((i0) mp.u1(j10.f24798t0).A7.f26179l.f15705b).f24560a) * 1000000000), bVar2).o(2);
        }
        b bVar3 = b.f5302a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / mp.u1(j10.f24798t0).f25666e6) * 1000000000), bVar3).o(0);
        }
        return h(0L, bVar);
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f5302a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, b.f5303b);
        }
        return null;
    }

    public static a n(TL_stars.StarsAmount starsAmount) {
        a m10 = m(starsAmount);
        if (m10 != null) {
            return m10;
        }
        return j(0L, b.f5302a);
    }

    public final long a() {
        return this.f5301b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f5301b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f5301b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(gd.E(a(), ','));
        long j3 = this.f5301b % 1000000000;
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
        if (this.f5300a == bVar) {
            return this;
        }
        return k(f(), bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f5300a == aVar.f5300a && this.f5301b == aVar.f5301b))) {
            return true;
        }
        return false;
    }

    public final double f() {
        b bVar = b.f5302a;
        b bVar2 = this.f5300a;
        if (bVar2 == bVar) {
            return ((c() / 1000.0d) * mp.u1(j10.f24798t0).f25666e6) / 100.0d;
        }
        if (bVar2 == b.f5303b) {
            return c() * ((i0) mp.u1(j10.f24798t0).A7.f26179l.f15705b).f24560a;
        }
        return 0.0d;
    }

    public final String g() {
        int i7 = ((this.f5301b % 1000000000) > 0L ? 1 : ((this.f5301b % 1000000000) == 0L ? 0 : -1));
        b bVar = this.f5300a;
        if (i7 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return gd.H(' ', "TonCount", (int) a());
                }
                return "";
            }
            return gd.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return gd.a0(null, null, 2131743809, b());
        }
        return gd.a0(null, null, 2131744872, b());
    }

    public final boolean l() {
        if (this.f5301b == 0) {
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
        return j((this.f5301b / j10) * j10, this.f5300a);
    }

    public final a p() {
        a o4 = o(2);
        if (o4.f5301b == this.f5301b) {
            return this;
        }
        long j3 = 1;
        for (int i7 = 0; i7 < 7; i7++) {
            j3 *= 10;
        }
        return j(o4.f5301b + j3, this.f5300a);
    }

    public final TL_stars.StarsAmount q() {
        b bVar = b.f5302a;
        long j3 = this.f5301b;
        b bVar2 = this.f5300a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f5303b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j3;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
