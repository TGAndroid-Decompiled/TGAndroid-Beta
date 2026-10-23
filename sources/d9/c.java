package d9;

import java.util.Arrays;
public class c extends i {
    public final int f7896a = 1;
    public final Object f7897b;

    public c(i iVar) {
        iVar.getClass();
        this.f7897b = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f7896a) {
            case 0:
                return c(((Character) obj).charValue());
            default:
                return c(((Character) obj).charValue());
        }
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f7896a) {
            case 0:
                if (Arrays.binarySearch((char[]) this.f7897b, c10) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((i) this.f7897b).c(c10);
        }
    }

    @Override
    public i d() {
        switch (this.f7896a) {
            case 1:
                return (i) this.f7897b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f7896a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.f7897b) {
                    sb2.append(i.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.f7897b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f7897b = charArray;
        Arrays.sort(charArray);
    }
}
