package org.telegram.messenger;

public abstract class MessagesController$$ExternalSyntheticBackport11 {
    public static long m(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i3 < 2 || i3 > 36) {
            throw new NumberFormatException("illegal radix: ".concat(String.valueOf(i3)));
        }
        long j = i3;
        long jM = MessagesController$$ExternalSyntheticBackport13.m(-1L, j);
        int i5 = (charSequence.charAt(i) != '+' || i4 <= 1) ? i : i + 1;
        long j2 = 0;
        long j3 = 0;
        while (i5 < i2) {
            int iDigit = Character.digit(charSequence.charAt(i5), i3);
            if (iDigit == -1) {
                throw new NumberFormatException(charSequence.toString());
            }
            if (j3 < j2 || j3 > jM || (j3 == jM && iDigit > ((int) MessagesController$$ExternalSyntheticBackport14.m(-1L, j)))) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(charSequence.toString()));
            }
            j3 = (j3 * j) + ((long) iDigit);
            i5++;
            j2 = 0;
        }
        return j3;
    }
}
