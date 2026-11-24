package defpackage;

import java.util.Arrays;
public class zk1 extends el1 {
    public final byte a = 1;
    public final Object b;

    public zk1(String str) {
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
                return !((el1) obj).b(c);
        }
    }

    @Override
    public final el1 c() {
        switch (this.a) {
            case 1:
                return (el1) this.b;
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
                    sb.append(el1.d(c));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((el1) obj) + ".negate()";
        }
    }

    public zk1(el1 el1Var) {
        this.b = el1Var;
    }
}
