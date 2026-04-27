package org.commonmark.internal.util;

public abstract class LinkScanner {
    public static int scanLinkLabelContent(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!Parsing.isEscapable(charSequence, i2)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int scanLinkDestination(java.lang.CharSequence r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.util.LinkScanner.scanLinkDestination(java.lang.CharSequence, int):int");
    }

    public static int scanLinkTitle(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i);
        char c = '\"';
        if (cCharAt != '\"') {
            c = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int iScanLinkTitleContent = scanLinkTitleContent(charSequence, i + 1, c);
        if (iScanLinkTitleContent != -1 && iScanLinkTitleContent < charSequence.length() && charSequence.charAt(iScanLinkTitleContent) == c) {
            return iScanLinkTitleContent + 1;
        }
        return -1;
    }

    public static int scanLinkTitleContent(java.lang.CharSequence r3, int r4, char r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.util.LinkScanner.scanLinkTitleContent(java.lang.CharSequence, int, char):int");
    }

    private static int scanLinkDestinationWithBalancedParens(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 0 || cCharAt == ' ') {
                if (i3 != i) {
                    return i3;
                }
                return -1;
            }
            if (cCharAt == '\\') {
                int i4 = i3 + 1;
                if (Parsing.isEscapable(charSequence, i4)) {
                    i3 = i4;
                }
            } else if (cCharAt == '(') {
                i2++;
                if (i2 > 32) {
                    return -1;
                }
            } else if (cCharAt != ')') {
                if (Character.isISOControl(cCharAt)) {
                    if (i3 != i) {
                        return i3;
                    }
                    return -1;
                }
            } else {
                if (i2 == 0) {
                    return i3;
                }
                i2--;
            }
            i3++;
        }
        return charSequence.length();
    }
}
