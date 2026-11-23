package g9;

import java.util.Arrays;
public class c extends i {
    public final int f13277a = 1;
    public final Object f13278b;

    public c(i iVar) {
        iVar.getClass();
        this.f13278b = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f13277a) {
            case 0:
                return c(((Character) obj).charValue());
            default:
                return c(((Character) obj).charValue());
        }
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13277a) {
            case 0:
                if (Arrays.binarySearch((char[]) this.f13278b, c10) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((i) this.f13278b).c(c10);
        }
    }

    @Override
    public i d() {
        switch (this.f13277a) {
            case 1:
                return (i) this.f13278b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f13277a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.f13278b) {
                    sb2.append(i.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.f13278b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f13278b = charArray;
        Arrays.sort(charArray);
    }
}
