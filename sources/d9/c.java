package d9;

import java.util.Arrays;
public class c extends i {
    public final int f7884a = 1;
    public final Object f7885b;

    public c(i iVar) {
        iVar.getClass();
        this.f7885b = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f7884a) {
            case 0:
                return c(((Character) obj).charValue());
            default:
                return c(((Character) obj).charValue());
        }
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f7884a) {
            case 0:
                if (Arrays.binarySearch((char[]) this.f7885b, c10) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((i) this.f7885b).c(c10);
        }
    }

    @Override
    public i d() {
        switch (this.f7884a) {
            case 1:
                return (i) this.f7885b;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f7884a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.f7885b) {
                    sb2.append(i.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((i) this.f7885b) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f7885b = charArray;
        Arrays.sort(charArray);
    }
}
