package org.telegram.messenger.utils.tlutils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

public final class AmountUtils$Amount {
    public final AmountUtils$Currency currency;
    public final long nanos;

    public AmountUtils$Amount(long j, AmountUtils$Currency amountUtils$Currency) {
        this.currency = amountUtils$Currency;
        this.nanos = j;
    }

    public static AmountUtils$Amount fromDecimal(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(j * 1000000000, amountUtils$Currency);
    }

    public static AmountUtils$Amount fromNano(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(j, amountUtils$Currency);
    }

    public static AmountUtils$Amount of(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            long j = starsAmount.amount;
            return fromNano((j * 1000000000) + ((long) starsAmount.nanos), AmountUtils$Currency.STARS);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return fromNano(starsAmount.amount, AmountUtils$Currency.TON);
        }
        return null;
    }

    public static AmountUtils$Amount ofSafe(TL_stars.StarsAmount starsAmount) {
        AmountUtils$Amount amountUtils$AmountOf = of(starsAmount);
        return amountUtils$AmountOf != null ? amountUtils$AmountOf : fromNano(0L, AmountUtils$Currency.STARS);
    }

    public final String asDecimalString() {
        BigDecimal bigDecimalDivide = new BigDecimal(this.nanos).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        return (bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros()).toPlainString();
    }

    public final double asDouble() {
        return this.nanos / 1000000000;
    }

    public final String asFormatString() {
        long j = this.nanos;
        StringBuilder sb = new StringBuilder(LocaleController.formatNumber(j / 1000000000, ','));
        long j2 = j % 1000000000;
        if (j2 == 0) {
            return sb.toString();
        }
        sb.append('.');
        String string = Long.toString(j2);
        int length = 9 - string.length();
        for (int i = 0; i < length; i++) {
            sb.append('0');
        }
        int length2 = string.length();
        while (length2 > 0 && string.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb.append((CharSequence) string, 0, length2);
        return sb.toString();
    }

    public final AmountUtils$Amount convertTo(AmountUtils$Currency amountUtils$Currency) {
        double dAsDouble;
        AmountUtils$Currency amountUtils$Currency2 = this.currency;
        if (amountUtils$Currency2 == amountUtils$Currency) {
            return this;
        }
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        AmountUtils$Currency amountUtils$Currency4 = AmountUtils$Currency.TON;
        if (amountUtils$Currency2 == amountUtils$Currency3) {
            dAsDouble = ((asDouble() / 1000.0d) * ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) / 100.0d;
        } else {
            dAsDouble = amountUtils$Currency2 == amountUtils$Currency4 ? asDouble() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get() : 0.0d;
        }
        if (amountUtils$Currency == amountUtils$Currency4) {
            return new AmountUtils$Amount((long) ((dAsDouble / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), amountUtils$Currency4).round(2);
        }
        return amountUtils$Currency == amountUtils$Currency3 ? new AmountUtils$Amount((long) (((dAsDouble * 100000.0d) / ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000)) * 1000000000), amountUtils$Currency3).round(0) : fromDecimal(0L, amountUtils$Currency);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AmountUtils$Amount) {
            return equals(this, (AmountUtils$Amount) obj);
        }
        return false;
    }

    public final String formatAsDecimalSpaced() {
        long j = this.nanos;
        long j2 = j % 1000000000;
        AmountUtils$Currency amountUtils$Currency = this.currency;
        if (j2 == 0) {
            int iOrdinal = amountUtils$Currency.ordinal();
            if (iOrdinal != 0) {
                return iOrdinal != 1 ? "" : LocaleController.formatPluralStringSpaced("TonCount", (int) (j / 1000000000));
            }
            return LocaleController.formatPluralStringSpaced("StarsCount", (int) (j / 1000000000));
        }
        int iOrdinal2 = amountUtils$Currency.ordinal();
        if (iOrdinal2 != 0) {
            return iOrdinal2 != 1 ? "" : LocaleController.formatString(R.string.TonCountX, asDecimalString());
        }
        return LocaleController.formatString(R.string.StarsCountX, asDecimalString());
    }

    public final boolean isZero() {
        return this.nanos == 0;
    }

    public final AmountUtils$Amount round(int i) {
        long j = 9 - i;
        if (j <= 0) {
            return this;
        }
        long j2 = 1;
        for (int i2 = 0; i2 < j; i2++) {
            j2 *= 10;
        }
        return fromNano((this.nanos / j2) * j2, this.currency);
    }

    public final TL_stars.StarsAmount toTl() {
        AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
        long j = this.nanos;
        AmountUtils$Currency amountUtils$Currency2 = this.currency;
        if (amountUtils$Currency2 == amountUtils$Currency) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j / 1000000000;
            tL_starsAmount.nanos = (int) (j % 1000000000);
            return tL_starsAmount;
        }
        if (amountUtils$Currency2 != AmountUtils$Currency.TON) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j;
        return tL_starsTonAmount;
    }

    public static AmountUtils$Amount fromDecimal(String str, AmountUtils$Currency amountUtils$Currency) {
        try {
            BigDecimal bigDecimalMultiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return fromNano(bigDecimalMultiply.longValue(), amountUtils$Currency);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean equals(AmountUtils$Amount amountUtils$Amount, AmountUtils$Amount amountUtils$Amount2) {
        if (amountUtils$Amount == amountUtils$Amount2) {
            return true;
        }
        return amountUtils$Amount != null && amountUtils$Amount2 != null && amountUtils$Amount.currency == amountUtils$Amount2.currency && amountUtils$Amount.nanos == amountUtils$Amount2.nanos;
    }
}
