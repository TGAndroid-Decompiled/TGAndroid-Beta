package h9;

import java.io.Serializable;
public final class n1 extends q1 implements Serializable {
    public static final n1 f14019b = new n1(0);
    public static final n1 f14020c = new n1(1);
    public final int f14021a;

    public n1(int i7) {
        this.f14021a = i7;
    }

    @Override
    public final q1 a() {
        switch (this.f14021a) {
            case 0:
                return f14020c;
            default:
                return f14019b;
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14021a) {
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
        switch (this.f14021a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
