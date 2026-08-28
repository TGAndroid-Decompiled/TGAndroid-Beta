package f7;
public abstract class e8 {
    public static boolean a(int i9, CharSequence charSequence) {
        if (i9 < charSequence.length()) {
            char charAt = charSequence.charAt(i9);
            switch (charAt) {
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
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
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
        return false;
    }

    public static int b(char c10, CharSequence charSequence, int i9, int i10) {
        while (i9 < i10) {
            if (charSequence.charAt(i9) != c10) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static int c(int i9, int i10, CharSequence charSequence) {
        while (i9 < i10) {
            char charAt = charSequence.charAt(i9);
            if (charAt != '\t' && charAt != ' ') {
                return i9;
            }
            i9++;
        }
        return i10;
    }
}
