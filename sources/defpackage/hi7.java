package defpackage;

import java.io.Serializable;
public final class hi7 extends yq7 implements Serializable {
    public static final hi7 b = new hi7((byte) 0);
    public static final hi7 c = new hi7((byte) 1);
    public final byte a;

    public hi7(byte b2) {
        this.a = b2;
    }

    @Override
    public final yq7 a() {
        switch (this.a) {
            case 0:
                return c;
            default:
                return b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
