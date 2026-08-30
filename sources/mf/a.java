package mf;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class a {
    public final b f13928a;
    public final long f13929b;

    public a(long j10, b bVar) {
        this.f13928a = bVar;
        this.f13929b = j10;
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
        b bVar2 = b.f13931b;
        if (bVar == bVar2) {
            return new a((long) ((d / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.f13930a;
        if (bVar == bVar3) {
            return new a((long) (((d * 100000.0d) / MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) * 1000000000), bVar3).n(0);
        }
        return g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.f13930a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.f13931b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l10 = l(starsAmount);
        if (l10 != null) {
            return l10;
        }
        return i(0L, b.f13930a);
    }

    public final long a() {
        return this.f13929b / 1000000000;
    }

    public final String b() {
        BigDecimal stripTrailingZeros;
        BigDecimal divide = new BigDecimal(this.f13929b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        if (divide.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = divide.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final double c() {
        return this.f13929b / 1000000000;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder(LocaleController.formatNumber(a(), ','));
        long j10 = this.f13929b % 1000000000;
        if (j10 == 0) {
            return sb.toString();
        }
        sb.append('.');
        String l10 = Long.toString(j10);
        int length = 9 - l10.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb.append('0');
        }
        int length2 = l10.length();
        while (length2 > 0 && l10.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb.append((CharSequence) l10, 0, length2);
        return sb.toString();
    }

    public final a e(b bVar) {
        double d;
        b bVar2 = this.f13928a;
        if (bVar2 == bVar) {
            return this;
        }
        if (bVar2 == b.f13930a) {
            d = ((c() / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) / 100.0d;
        } else if (bVar2 == b.f13931b) {
            d = c() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get();
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
        if ((obj instanceof a) && (this == (aVar = (a) obj) || (this.f13928a == aVar.f13928a && this.f13929b == aVar.f13929b))) {
            return true;
        }
        return false;
    }

    public final String f() {
        b bVar = this.f13928a;
        if (this.f13929b % 1000000000 == 0) {
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return LocaleController.formatPluralStringSpaced("TonCount", (int) a());
                }
                return "";
            }
            return LocaleController.formatPluralStringSpaced("StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                return "";
            }
            return LocaleController.formatString(R.string.TonCountX, b());
        }
        return LocaleController.formatString(R.string.StarsCountX, b());
    }

    public final boolean k() {
        if (this.f13929b == 0) {
            return true;
        }
        return false;
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
        return i((this.f13929b / j11) * j11, this.f13928a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.f13930a;
        long j10 = this.f13929b;
        b bVar2 = this.f13928a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j10 / 1000000000;
            tL_starsAmount.nanos = (int) (j10 % 1000000000);
            return tL_starsAmount;
        } else if (bVar2 == b.f13931b) {
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = j10;
            return tL_starsTonAmount;
        } else {
            return null;
        }
    }
}
