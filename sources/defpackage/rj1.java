package defpackage;

import java.util.Arrays;
public class rj1 extends wj1 {
    public final byte a = 0;
    public final Object b;

    public rj1(String str) {
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
                return !((wj1) obj).b(c);
        }
    }

    @Override
    public final wj1 c() {
        switch (this.a) {
            case 1:
                return (wj1) this.b;
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
                    sb.append(wj1.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((wj1) obj) + ".negate()";
        }
    }

    public rj1(wj1 wj1Var) {
        this.b = wj1Var;
    }
}
