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

    private AmountUtils$Amount(AmountUtils$Currency amountUtils$Currency, long j) {
        this.currency = amountUtils$Currency;
        this.nanos = j;
    }

    public static boolean equals(AmountUtils$Amount amountUtils$Amount, AmountUtils$Amount amountUtils$Amount2) {
        if (amountUtils$Amount == amountUtils$Amount2) {
            return true;
        }
        return amountUtils$Amount != null && amountUtils$Amount2 != null && amountUtils$Amount.currency == amountUtils$Amount2.currency && amountUtils$Amount.nanos == amountUtils$Amount2.nanos;
    }

    public static boolean equals(TL_stars.StarsAmount starsAmount, TL_stars.StarsAmount starsAmount2) {
        return equals(of(starsAmount), of(starsAmount2));
    }

    public static AmountUtils$Amount fromDecimal(double d, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        double decimals = getDecimals(amountUtils$Currency);
        Double.isNaN(decimals);
        return new AmountUtils$Amount(amountUtils$Currency, (long) (d * decimals));
    }

    public static AmountUtils$Amount fromDecimal(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(amountUtils$Currency, j * getDecimals(amountUtils$Currency));
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

    public static AmountUtils$Amount fromNano(long j, AmountUtils$Currency amountUtils$Currency) {
        if (amountUtils$Currency == null) {
            return null;
        }
        return new AmountUtils$Amount(amountUtils$Currency, j);
    }

    private static long getDecimals(AmountUtils$Currency amountUtils$Currency) {
        return 1000000000L;
    }

    private static int getTenPow(AmountUtils$Currency amountUtils$Currency) {
        return 9;
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

    public AmountUtils$Amount applyPerMille(int i) {
        return fromNano((this.nanos * i) / 1000, this.currency);
    }

    public long asDecimal() {
        return this.nanos / getDecimals(this.currency);
    }

    public String asDecimalString() {
        return AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0.m(new BigDecimal(asNano()).divide(BigDecimal.valueOf(getDecimals(this.currency)), MathContext.UNLIMITED)).toPlainString();
    }

    public double asDouble() {
        double d = this.nanos;
        double decimals = getDecimals(this.currency);
        Double.isNaN(d);
        Double.isNaN(decimals);
        return d / decimals;
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

    public long asNano() {
        return this.nanos;
    }

    public AmountUtils$Amount convertTo(AmountUtils$Currency amountUtils$Currency) {
        double asDouble;
        AmountUtils$Currency amountUtils$Currency2 = this.currency;
        if (amountUtils$Currency2 == amountUtils$Currency) {
            return this;
        }
        AmountUtils$Currency amountUtils$Currency3 = AmountUtils$Currency.STARS;
        if (amountUtils$Currency2 == amountUtils$Currency3) {
            double asDouble2 = asDouble() / 1000.0d;
            double d = MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000;
            Double.isNaN(d);
            asDouble = (asDouble2 * d) / 100.0d;
        } else {
            asDouble = amountUtils$Currency2 == AmountUtils$Currency.TON ? asDouble() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get() : 0.0d;
        }
        if (amountUtils$Currency != amountUtils$Currency3) {
            return amountUtils$Currency == AmountUtils$Currency.TON ? fromDecimal(asDouble / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get(), amountUtils$Currency) : fromNano(0L, amountUtils$Currency);
        }
        double d2 = MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000;
        Double.isNaN(d2);
        return fromDecimal(((asDouble * 100.0d) / d2) * 1000.0d, amountUtils$Currency);
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

    public String formatAsDecimalSpaced() {
        if (isRound()) {
            int i = AmountUtils$1.$SwitchMap$org$telegram$messenger$utils$tlutils$AmountUtils$Currency[this.currency.ordinal()];
            return i != 1 ? i != 2 ? "" : LocaleController.formatPluralStringSpaced("TonCount", (int) asDecimal()) : LocaleController.formatPluralStringSpaced("StarsCount", (int) asDecimal());
        }
        int i2 = AmountUtils$1.$SwitchMap$org$telegram$messenger$utils$tlutils$AmountUtils$Currency[this.currency.ordinal()];
        return i2 != 1 ? i2 != 2 ? "" : LocaleController.formatString(R.string.TonCountX, asDecimalString()) : LocaleController.formatString(R.string.StarsCountX, asDecimalString());
    }

    public boolean isRound() {
        return this.nanos % getDecimals(this.currency) == 0;
    }

    public boolean isZero() {
        return this.nanos == 0;
    }

    public TL_stars.StarsAmount toTl() {
        AmountUtils$Currency amountUtils$Currency = this.currency;
        if (amountUtils$Currency != AmountUtils$Currency.STARS) {
            if (amountUtils$Currency != AmountUtils$Currency.TON) {
                return null;
            }
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            tL_starsTonAmount.amount = this.nanos;
            return tL_starsTonAmount;
        }
        TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
        long decimals = getDecimals(this.currency);
        long j = this.nanos;
        tL_starsAmount.amount = j / decimals;
        tL_starsAmount.nanos = (int) (j % decimals);
        return tL_starsAmount;
    }
}
