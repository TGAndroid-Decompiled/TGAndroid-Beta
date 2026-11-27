package defpackage;

import java.util.Arrays;
public class ak1 extends fk1 {
    public final byte a = 1;
    public final Object b;

    public ak1(String str) {
        char[] charArray = str.toString().toCharArray();
        this.b = charArray;
        Arrays.sort(charArray);
    }

    @Override
    public final boolean b(char c) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (Arrays.binarySearch((char[]) obj, c) >= 0) {
                    return true;
                }
                return false;
            default:
                return !((fk1) obj).b(c);
        }
    }

    @Override
    public final fk1 c() {
        switch (this.a) {
            case 1:
                return (fk1) this.b;
            default:
                return super.c();
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c : (char[]) obj) {
                    sb.append(fk1.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((fk1) obj) + ".negate()";
        }
    }

    public ak1(fk1 fk1Var) {
        this.b = fk1Var;
    }
}
