package f9;

import java.util.Arrays;
public class c extends i {
    public final int f11505a = 1;
    public final Object f11506b;

    public c(i iVar) {
        iVar.getClass();
        this.f11506b = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f11505a) {
            case 0:
                return c(((Character) obj).charValue());
            default:
                return c(((Character) obj).charValue());
        }
    }

    @Override
    public final boolean c(char c2) {
        switch (this.f11505a) {
            case 0:
                if (Arrays.binarySearch((char[]) this.f11506b, c2) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((i) this.f11506b).c(c2);
        }
    }

    @Override
    public i d() {
        switch (this.f11505a) {
            case 1:
                return (i) this.f11506b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f11505a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c2 : (char[]) this.f11506b) {
                    sb2.append(i.a(c2));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.f11506b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f11506b = charArray;
        Arrays.sort(charArray);
    }
}
