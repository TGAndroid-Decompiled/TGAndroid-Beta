package org.telegram.messenger.utils.tlutils;

public final class AmountUtils$Currency {
    public static final AmountUtils$Currency[] $VALUES;
    public static final AmountUtils$Currency STARS;
    public static final AmountUtils$Currency TON;

    static {
        AmountUtils$Currency amountUtils$Currency = new AmountUtils$Currency("STARS", 0);
        STARS = amountUtils$Currency;
        AmountUtils$Currency amountUtils$Currency2 = new AmountUtils$Currency("TON", 1);
        TON = amountUtils$Currency2;
        $VALUES = new AmountUtils$Currency[]{amountUtils$Currency, amountUtils$Currency2};
    }

    public static AmountUtils$Currency valueOf(String str) {
        return (AmountUtils$Currency) Enum.valueOf(AmountUtils$Currency.class, str);
    }

    public static AmountUtils$Currency[] values() {
        return (AmountUtils$Currency[]) $VALUES.clone();
    }
}
