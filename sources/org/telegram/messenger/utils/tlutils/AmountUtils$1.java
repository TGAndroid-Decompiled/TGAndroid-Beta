package org.telegram.messenger.utils.tlutils;

public abstract class AmountUtils$1 {
    static final int[] $SwitchMap$org$telegram$messenger$utils$tlutils$AmountUtils$Currency;

    static {
        int[] iArr = new int[AmountUtils$Currency.values().length];
        $SwitchMap$org$telegram$messenger$utils$tlutils$AmountUtils$Currency = iArr;
        try {
            iArr[AmountUtils$Currency.STARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$org$telegram$messenger$utils$tlutils$AmountUtils$Currency[AmountUtils$Currency.TON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
