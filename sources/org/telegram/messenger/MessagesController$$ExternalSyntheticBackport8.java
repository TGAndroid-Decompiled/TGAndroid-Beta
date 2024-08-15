package org.telegram.messenger;
public final class MessagesController$$ExternalSyntheticBackport8 {
    public static long m(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 != 0) {
            if (i3 < 2 || i3 > 36) {
                throw new NumberFormatException("illegal radix: ".concat(String.valueOf(i3)));
            }
            long j = i3;
            long m = MessagesController$$ExternalSyntheticBackport13.m(-1L, j);
            int i5 = (charSequence.charAt(i) != '+' || i4 <= 1) ? i : i + 1;
            long j2 = 0;
            long j3 = 0;
            while (i5 < i2) {
                int digit = Character.digit(charSequence.charAt(i5), i3);
                if (digit == -1) {
                    throw new NumberFormatException(charSequence.toString());
                }
                if (j3 < j2 || j3 > m || (j3 == m && digit > ((int) MessagesController$$ExternalSyntheticBackport14.m(-1L, j)))) {
                    throw new NumberFormatException("Too large for unsigned long: ".concat(charSequence.toString()));
                }
                j3 = (j3 * j) + digit;
                i5++;
                j2 = 0;
            }
            return j3;
        }
        throw new NumberFormatException("empty string");
    }
}
