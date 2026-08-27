package hf;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

public final class a {

    public final b f8919a;

    public final long f8920b;

    public a(long j10, b bVar) {
        this.f8919a = bVar;
        this.f8920b = j10;
    }

    public static a g(long j10, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j10 * 1000000000, bVar);
    }

    public static a h(String str, b bVar) {
        try {
            BigDecimal bigDecimalMultiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return i(bigDecimalMultiply.longValue(), bVar);
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
        b bVar2 = b.f8922b;
        if (bVar == bVar2) {
            return new a((long) ((d / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f8921a;
        return bVar == bVar3 ? new a((long) (((d * 100000.0d) / ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) * 1000000000), bVar3).n(0) : g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + ((long) starsAmount.nanos), b.f8921a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f8922b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a aVarL = l(starsAmount);
        return aVarL != null ? aVarL : i(0L, b.f8921a);
    }

    public final long a() {
        return this.f8920b / 1000000000;
    }

    public final String b() {
        BigDecimal bigDecimalDivide = new BigDecimal(this.f8920b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        return (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
    }

    public final double c() {
        return this.f8920b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(LocaleController.formatNumber(a(), ','));
        long j10 = this.f8920b % 1000000000;
        if (j10 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String string = Long.toString(j10);
        int length = 9 - string.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        int length2 = string.length();
        while (length2 > 0 && string.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb2.append((CharSequence) string, 0, length2);
        return sb2.toString();
    }

    public final a e(b bVar) {
        double dC;
        b bVar2 = this.f8919a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f8921a) {
            dC = ((c() / 1000.0d) * ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) / 100.0d;
        } else {
            dC = bVar2 == b.f8922b ? c() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get() : 0.0d;
        }
        return j(dC, bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && (this == (aVar = (a) obj) || (this.f8919a == aVar.f8919a && this.f8920b == aVar.f8920b));
    }

    public final String f() {
        long j10 = this.f8920b % 1000000000;
        b bVar = this.f8919a;
        if (j10 == 0) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? "" : LocaleController.formatPluralStringSpaced("TonCount", (int) a());
            }
            return LocaleController.formatPluralStringSpaced("StarsCount", (int) a());
        }
        int iOrdinal2 = bVar.ordinal();
        if (iOrdinal2 != 0) {
            return iOrdinal2 != 1 ? "" : LocaleController.formatString(R.string.TonCountX, b());
        }
        return LocaleController.formatString(R.string.StarsCountX, b());
    }

    public final boolean k() {
        return this.f8920b == 0;
    }

    public final a n(int i10) {
        long j10 = 9 - i10;
        if (j10 <= 0) {
            return this;
        }
        long j11 = 1;
        for (int i11 = 0; i11 < j10; i11++) {
            j11 *= 10;
        }
        return i((this.f8920b / j11) * j11, this.f8919a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f8921a;
        long j10 = this.f8920b;
        b bVar2 = this.f8919a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j10 / 1000000000;
            tL_starsAmount.nanos = (int) (j10 % 1000000000);
            return tL_starsAmount;
        }
        if (bVar2 != b.f8922b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j10;
        return tL_starsTonAmount;
    }
}
