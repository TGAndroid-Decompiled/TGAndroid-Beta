package e9;

import java.util.Arrays;
public class c extends i {
    public final int f9837a = 1;
    public final Object f9838b;

    public c(i iVar) {
        iVar.getClass();
        this.f9838b = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f9837a) {
            case 0:
                return c(((Character) obj).charValue());
            default:
                return c(((Character) obj).charValue());
        }
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f9837a) {
            case 0:
                if (Arrays.binarySearch((char[]) this.f9838b, c10) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((i) this.f9838b).c(c10);
        }
    }

    @Override
    public i d() {
        switch (this.f9837a) {
            case 1:
                return (i) this.f9838b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f9837a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.f9838b) {
                    sb2.append(i.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.f9838b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f9838b = charArray;
        Arrays.sort(charArray);
    }
}
