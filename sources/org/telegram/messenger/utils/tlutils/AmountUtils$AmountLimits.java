package org.telegram.messenger.utils.tlutils;

public class AmountUtils$AmountLimits {
    private final AmountUtils$AmountLimit[] limits = new AmountUtils$AmountLimit[AmountUtils$Currency.values().length];

    public void set(AmountUtils$Amount amountUtils$Amount, AmountUtils$Amount amountUtils$Amount2) {
        AmountUtils$Currency amountUtils$Currency = amountUtils$Amount.currency;
        if (amountUtils$Currency != amountUtils$Amount2.currency) {
            return;
        }
        this.limits[amountUtils$Currency.ordinal()] = new AmountUtils$AmountLimit(amountUtils$Amount, amountUtils$Amount2);
    }

    public AmountUtils$Amount getMin(AmountUtils$Currency amountUtils$Currency) {
        AmountUtils$Amount amountUtils$Amount;
        amountUtils$Amount = this.limits[amountUtils$Currency.ordinal()].min;
        return amountUtils$Amount;
    }

    public AmountUtils$Amount getMax(AmountUtils$Currency amountUtils$Currency) {
        AmountUtils$Amount amountUtils$Amount;
        amountUtils$Amount = this.limits[amountUtils$Currency.ordinal()].max;
        return amountUtils$Amount;
    }
}
