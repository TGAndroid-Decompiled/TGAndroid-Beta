package b8;
public abstract class ec {
    public static boolean a(int i3, CharSequence charSequence) {
        if (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
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

    public static int b(char c2, int i3, int i10, CharSequence charSequence) {
        while (i3 < i10) {
            if (charSequence.charAt(i3) != c2) {
                return i3;
            }
            i3++;
        }
        return i10;
    }

    public static int c(int i3, int i10, CharSequence charSequence) {
        while (i3 < i10) {
            char charAt = charSequence.charAt(i3);
            if (charAt != '\t' && charAt != ' ') {
                return i3;
            }
            i3++;
        }
        return i10;
    }
}
