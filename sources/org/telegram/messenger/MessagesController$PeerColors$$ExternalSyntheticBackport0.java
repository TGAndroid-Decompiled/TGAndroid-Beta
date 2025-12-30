package org.telegram.messenger;

public abstract class MessagesController$PeerColors$$ExternalSyntheticBackport0 {
    public static int m(String str, int i) throws NumberFormatException {
        if (str.length() > 1 && str.charAt(0) == '+') {
            str = str.substring(1);
        }
        long j = Long.parseLong(str, i);
        if ((4294967295L & j) == j) {
            return (int) j;
        }
        throw new NumberFormatException("Input " + str + " in base " + i + " is not in the range of an unsigned integer");
    }
}
