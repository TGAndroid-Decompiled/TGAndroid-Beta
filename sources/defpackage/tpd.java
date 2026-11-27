package defpackage;

import java.io.Serializable;
public final class tpd extends bqd implements Serializable {
    public static final tpd b = new tpd((byte) 0);
    public static final tpd c = new tpd((byte) 1);
    public final byte a;

    public tpd(byte b2) {
        this.a = b2;
    }

    @Override
    public final bqd a() {
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
