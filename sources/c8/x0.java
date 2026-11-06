package c8;
public abstract class x0 {
    public static boolean a(int i7, CharSequence charSequence) {
        if (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
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

    public static int b(char c10, int i7, int i10, CharSequence charSequence) {
        while (i7 < i10) {
            if (charSequence.charAt(i7) != c10) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    public static int c(int i7, int i10, CharSequence charSequence) {
        while (i7 < i10) {
            char charAt = charSequence.charAt(i7);
            if (charAt != '\t' && charAt != ' ') {
                return i7;
            }
            i7++;
        }
        return i10;
    }
}
