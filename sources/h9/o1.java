package h9;

import java.io.Serializable;
public final class o1 extends r1 implements Serializable {
    public static final o1 f14359b = new o1(0);
    public static final o1 f14360c = new o1(1);
    public final int f14361a;

    public o1(int i7) {
        this.f14361a = i7;
    }

    @Override
    public final r1 a() {
        switch (this.f14361a) {
            case 0:
                return f14360c;
            default:
                return f14359b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14361a) {
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
        switch (this.f14361a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
