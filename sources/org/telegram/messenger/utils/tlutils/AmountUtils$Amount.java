package org.telegram.messenger.utils.tlutils;

import java.math.BigDecimal;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

public class AmountUtils$Amount {
    public final AmountUtils$Currency currency;
    private final long nanos;

    private static long getDecimals(AmountUtils$Currency amountUtils$Currency) {
        return 1000000000L;
    }

    private static int getTenPow(AmountUtils$Currency amountUtils$Currency) {
        return 9;
    }

    private AmountUtils$Amount(AmountUtils$Currency amountUtils$Currency, long j) {
        this.currency = amountUtils$Currency;
        this.nanos = j;
    }

    public long asDecimal() {
        return this.nanos / getDecimals(this.currency);
    }

    public long asNano() {
        return this.nanos;
    }

    public double asDouble() {
        return this.nanos / getDecimals(this.currency);
    }

    public String asDecimalString() {
        return AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0.m(new BigDecimal(asNano()).divide(BigDecimal.valueOf(getDecimals(this.currency)), MathContext.UNLIMITED)).toPlainString();
    }

    public String asFormatString() {
        return asFormatString(',');
    }

    public String asFormatString(char c) {
        StringBuilder sb = new StringBuilder(LocaleController.formatNumber(asDecimal(), c));
        long decimals = this.nanos % getDecimals(this.currency);
        if (decimals == 0) {
            return sb.toString();
        }
        sb.append('.');
        String l = Long.toString(decimals);
        int tenPow = getTenPow(this.currency) - l.length();
        for (int i = 0; i < tenPow; i++) {
            sb.append('0');
        }
        int length = l.length();
        while (length > 0 && l.charAt(length - 1) == '0') {
            length--;
        }
        sb.append((CharSequence) l, 0, length);
        return sb.toString();
    }

    public boolean isZero() {
        return this.nanos == 0;
    }

    public boolean isRound() {
        return this.nanos % getDecimals(this.currency) == 0;
    }

    public String formatAsDecimalSpaced() {
        if (isRound()) {
            int ordinal = this.currency.ordinal();
            if (ordinal == 0) {
                return LocaleController.formatPluralStringSpaced("StarsCount", (int) asDecimal());
            }
            if (ordinal == 1) {
                return LocaleController.formatPluralStringSpaced("TonCount", (int) asDecimal());
            }
            return "";
        }
        int ordinal2 = this.currency.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : LocaleController.formatString(R.string.TonCountX, asDecimalString()) : LocaleController.formatString(R.string.StarsCountX, asDecimalString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AmountUtils$Amount) {
            return equals(this, (AmountUtils$Amount) obj);
        }
        return false;
    }

    public AmountUtils$Amount applyPerMille(int i) {
        return fromNano((this.nanos * i) / 1000, this.currency);
    }

    public AmountUtils$Amount convertTo(AmountUtils$Currency amountUtils$Currency) {
        double asDouble;
        AmountUtils$Currency amountUtils$Currency2 = this.currency;
        if (amountUtils$Currency2 == amountUtils$Currency) {
            return this;
        }
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency2 == amountUtils$Currency3) {
            asDouble = ((asDouble() / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) / 100.0d;
        } else {
            asDouble = amountUtils$Currency2 == AmountUtils$Currency.TON ? asDouble() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get() : 0.0d;
        }
        if (amountUtils$Currency == amountUtils$Currency3) {
            return fromDecimal(((asDouble * 100.0d) / MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) * 1000.0d, amountUtils$Currency);
        }
        if (amountUtils$Currency == AmountUtils$Currency.TON) {
            return fromDecimal(asDouble / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get(), amountUtils$Currency);
        }
        return fromNano(0L, amountUtils$Currency);
    }

    public TL_stars.StarsAmount toTl() {
        AmountUtils$Currency amountUtils$Currency = this.currency;
        if (amountUtils$Currency == AmountUtils$Currency.STARS) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            long decimals = getDecimals(this.currency);
            long j = this.nanos;
            tL_starsAmount.amount = j / decimals;
            tL_starsAmount.nanos = (int) (j % decimals);
            return tL_starsAmount;
        }
        if (amountUtils$Currency != AmountUtils$Currency.TON) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = this.nanos;
        return tL_starsTonAmount;
    }

    public static AmountUtils$Amount fromNano(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(amountUtils$Currency, j);
    }

    public static AmountUtils$Amount fromDecimal(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(amountUtils$Currency, j * getDecimals(amountUtils$Currency));
    }

    public static AmountUtils$Amount fromDecimal(double d, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(amountUtils$Currency, (long) (d * getDecimals(amountUtils$Currency)));
    }

    public static AmountUtils$Amount fromDecimal(String str, AmountUtils$Currency amountUtils$Currency) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(getDecimals(amountUtils$Currency)));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return fromNano(multiply.longValue(), amountUtils$Currency);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static AmountUtils$Amount of(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            long j = starsAmount.amount;
            AmountUtils$Currency amountUtils$Currency = AmountUtils$Currency.STARS;
            return fromNano((j * getDecimals(amountUtils$Currency)) + starsAmount.nanos, amountUtils$Currency);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return fromNano(starsAmount.amount, AmountUtils$Currency.TON);
        }
        return null;
    }

    public static AmountUtils$Amount ofSafe(TL_stars.StarsAmount starsAmount) {
        AmountUtils$Amount of = of(starsAmount);
        return of != null ? of : fromNano(0L, AmountUtils$Currency.STARS);
    }

    public static boolean equals(TL_stars.StarsAmount starsAmount, TL_stars.StarsAmount starsAmount2) {
        return equals(of(starsAmount), of(starsAmount2));
    }

    public static boolean equals(AmountUtils$Amount amountUtils$Amount, AmountUtils$Amount amountUtils$Amount2) {
        if (amountUtils$Amount == amountUtils$Amount2) {
            return true;
        }
        return amountUtils$Amount != null && amountUtils$Amount2 != null && amountUtils$Amount.currency == amountUtils$Amount2.currency && amountUtils$Amount.nanos == amountUtils$Amount2.nanos;
    }
}
