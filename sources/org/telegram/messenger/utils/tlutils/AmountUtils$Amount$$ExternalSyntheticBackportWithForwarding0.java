package org.telegram.messenger.utils.tlutils;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class AmountUtils$Amount$$ExternalSyntheticBackportWithForwarding0 {
    public static BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
