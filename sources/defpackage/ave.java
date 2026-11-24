package defpackage;
public abstract class ave {
    public static boolean a(char c) {
        if (c != ' ' && c != '\t' && c != '\n' && c != '\r' && c != '\f') {
            return false;
        }
        return true;
    }
}
