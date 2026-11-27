package defpackage;
public abstract class h0f {
    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != ' ' && charAt != '\"' && charAt != ',' && charAt != '/' && charAt != '{' && charAt != '}' && charAt != '(' && charAt != ')') {
                switch (charAt) {
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                        }
                }
            }
            return false;
        }
        return true;
    }
}
