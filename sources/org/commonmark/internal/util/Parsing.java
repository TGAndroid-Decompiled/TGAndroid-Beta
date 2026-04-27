package org.commonmark.internal.util;

public abstract class Parsing {
    public static int CODE_BLOCK_INDENT = 4;

    public static int columnsToNextTabStop(int i) {
        return 4 - (i % 4);
    }

    public static int find(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int findLineBreak(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean isBlank(CharSequence charSequence) {
        return findNonSpace(charSequence, 0) == -1;
    }

    public static boolean hasNonSpace(CharSequence charSequence) {
        int length = charSequence.length();
        return skip(' ', charSequence, 0, length) != length;
    }

    public static boolean isLetter(CharSequence charSequence, int i) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    public static boolean isSpaceOrTab(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static boolean isEscapable(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                return true;
            default:
                switch (cCharAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        return true;
                    default:
                        switch (cCharAt) {
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                                return true;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static CharSequence prepareLine(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(cCharAt);
            }
        }
        return sb != null ? sb.toString() : charSequence;
    }

    public static int skip(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipBackwards(char c, CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static int skipSpaceTab(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipSpaceTabBackwards(CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    private static int findNonSpace(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
        }
        return -1;
    }
}
